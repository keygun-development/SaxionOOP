package nl.saxion.oop.week2;

import nl.saxion.oop.week2.model.Bag;
import nl.saxion.oop.week2.model.Passenger;

public class TestApplication {

	public static void main(String[] args) {
		new TestApplication().run();
	}

	private void run() {
        /*
         Good weather tests
         - Test situation 1: Be able to lock doors
         - Test situation 2: Be able to unlock doors
         - Test situation 3: Be able to board a passenger
         - Test situation 4: Be able to depart if the doors are locked
         */
		s1TestLockDoors();
		s2TestUnlockDoors();
		s3TestBoardPassengerWhenRoomAvailableAndDoorsUnlocked();
		s4TestDepartIfDoorsAreLocked();

        /*
         Bad weather tests:
         - Test situation 5: Not be able to board a passenger if doors are closed
         - Test situation 6: Not be able to board a passenger if there is no more room
         - Test situation 7: Not be able to board a passenger if the weight of the plane is exceeded
         - Test situation 8: Not be able to depart if the doors are unlocked
         */
		s5TestBoardPassengerFailsWhenDoorsAreLocked();
		s6TestBoardPassengerFailsWhenNoRoomAvailable();
		s7TestBoardPassengerFailsWhenWeightExceeded();
		s7aTestBoardMultiplePassengersFailsWhenWeightExceeded();
		s7bTestBoardMultiplePassengersFailsWhenWeightExceeded();
		s7cTestBoardMultiplePassengersSucceedsWhenTotalWeightOk();
		s8TestDepartFailsIfDoorsAreUnlocked();
	}

	private void s1TestLockDoors() {
		Airplane plane = new Airplane(5);
		if (!plane.hasLockedDoors()) {
			plane.lockDoors();
			if (plane.hasLockedDoors()) {
				System.out.println("Test s1TestLockDoors ok");
			} else {
				System.err.println("Test s1TestLockDoors failed");
			}
		} else {
			System.err.println("Test s1TestLockDoors failed");
		}
	}

	private void s2TestUnlockDoors() {
		Airplane plane = new Airplane(5);
		plane.lockDoors(); // Already tested in R1
		plane.unlockDoors();
		if (!plane.hasLockedDoors()) {
			System.out.println("Test s2TestUnlockDoors ok");
		} else {
			System.err.println("Test s2TestUnlockDoors failed");
		}
	}

	private void s3TestBoardPassengerWhenRoomAvailableAndDoorsUnlocked() {
		Airplane plane = new Airplane(1);
		Passenger john = new Passenger("John", "Doe");
		try {
			plane.boardPassenger(john);
			System.out.println("Test s3TestBoardPassengerWhenRoomAvailable ok");
		} catch (IllegalStateException e) {
			System.err.println("Test s3TestBoardPassengerWhenRoomAvailable failed");
		}
	}

	private void s4TestDepartIfDoorsAreLocked() {
		Airplane plane = new Airplane(5);
		plane.lockDoors();
		try {
			plane.depart();
			System.out.println("Test s4TestDepartIfDoorsAreLocked ok");
		} catch (IllegalStateException e) {
			System.err.println("Test s4TestDepartIfDoorsAreLocked failed");
		}
	}

	private void s5TestBoardPassengerFailsWhenDoorsAreLocked() {
		Airplane plane = new Airplane(5);
		Passenger john = new Passenger("John", "Doe");
		plane.lockDoors();
		try {
			plane.boardPassenger(john);
			System.err.println("Test s5TestBoardPassengerFailsWhenDoorsAreLocked failed");
		} catch (IllegalStateException e) {
			System.out.println("Test s5TestBoardPassengerFailsWhenDoorsAreLocked ok");
		}
	}

	private void s6TestBoardPassengerFailsWhenNoRoomAvailable() {
		Airplane plane = new Airplane(1);
		Passenger john1 = new Passenger("John", "Doe");
		Passenger john2 = new Passenger("Johnny", "Doe");
		try {
			plane.boardPassenger(john1);
			try {
				plane.boardPassenger(john2);
				System.err.println("Test s6TestBoardPassengerFailsWhenNoRoomAvailable failed");
			} catch (IllegalStateException e) {
				System.out.println("Test s6TestBoardPassengerFailsWhenNoRoomAvailable ok");
			}
		} catch (IllegalStateException e) {
			System.err.println("Test s6TestBoardPassengerFailsWhenNoRoomAvailable failed");
		}
	}

	private void s7TestBoardPassengerFailsWhenWeightExceeded() {
		int nrPassengers = 2;
		int maxWeightPerPassenger = 25;
		Airplane plane = new Airplane(nrPassengers);
		Passenger john = new Passenger("John", "Doe");
		Bag bag = new Bag((maxWeightPerPassenger * nrPassengers) + 1);
		john.addLuggage(bag);
		try {
			plane.boardPassenger(john);
			System.err.println("Test s7TestBoardPassengerFailsWhenWeightExceeded failed");
		} catch (IllegalStateException e) {
			System.out.println("Test s7TestBoardPassengerFailsWhenWeightExceeded ok");
		}
	}

	private void s7aTestBoardMultiplePassengersFailsWhenWeightExceeded() {
		int nrPassengers = 2;
		int maxWeightPerPassenger = 25;
		Airplane plane = new Airplane(nrPassengers);
		Passenger heavy = new Passenger("John", "Candy");
		Bag bag = new Bag(maxWeightPerPassenger + 1);
		heavy.addLuggage(bag);
		// Overweight passenger boards first.
		plane.boardPassenger(heavy);
		Passenger john = new Passenger("John", "Doe");
		bag = new Bag(maxWeightPerPassenger);
		john.addLuggage(bag);
		// John at weight is no longer allowed.
		try {
			plane.boardPassenger(john);
			System.err.println("Test s7aTestBoardMultiplePassengersFailsWhenWeightExceeded failed");
		} catch (IllegalStateException e) {
			System.out.println("Test s7aTestBoardMultiplePassengersFailsWhenWeightExceeded ok");
		}
	}

	private void s7bTestBoardMultiplePassengersFailsWhenWeightExceeded() {
		int nrPassengers = 2;
		int maxWeightPerPassenger = 25;
		Airplane plane = new Airplane(nrPassengers);
		Passenger john = new Passenger("John", "Doe");
		Bag bag = new Bag(maxWeightPerPassenger);
		john.addLuggage(bag);
		// Normal passenger boards ok.
		plane.boardPassenger(john);
		Passenger heavy = new Passenger("John", "Candy");
		bag = new Bag(maxWeightPerPassenger + 1);
		heavy.addLuggage(bag);
		try {
			// Heavy passenger is not allowed.
			plane.boardPassenger(heavy);
			System.err.println("Test s7bTestBoardMultiplePassengersFailsWhenWeightExceeded failed");
		} catch (IllegalStateException e) {
			System.out.println("Test s7bTestBoardMultiplePassengersFailsWhenWeightExceeded ok");
		}
	}

	private void s7cTestBoardMultiplePassengersSucceedsWhenTotalWeightOk() {
		int nrPassengers = 2;
		int maxWeightPerPassenger = 25;
		Airplane plane = new Airplane(nrPassengers);
		Passenger john = new Passenger("John", "Doe");
		Bag bag = new Bag(maxWeightPerPassenger - 1);
		john.addLuggage(bag);
		// Normal passenger boards ok.
		plane.boardPassenger(john);
		Passenger heavy = new Passenger("John", "Candy");
		bag = new Bag(maxWeightPerPassenger + 1);
		heavy.addLuggage(bag);
		try {
			// Heavy passenger is not allowed.
			plane.boardPassenger(heavy);
			System.out.println("Test s7cTestBoardMultiplePassengersSucceedsWhenTotalWeightOk ok");
		} catch (IllegalStateException e) {
			System.err.println("Test s7cTestBoardMultiplePassengersSucceedsWhenTotalWeightOk failed");
		}
	}

	private void s8TestDepartFailsIfDoorsAreUnlocked() {
		// Why this test??? It should always fail since the doors are unlocked.
		Airplane plane = new Airplane(0);
		try {
			plane.depart();
			System.err.println("Test s8TestDepartFailsIfDoorsAreUnlocked failed");
		} catch (IllegalStateException e) {
			System.out.println("Test s8TestDepartFailsIfDoorsAreUnlocked ok");
		}
	}
}
