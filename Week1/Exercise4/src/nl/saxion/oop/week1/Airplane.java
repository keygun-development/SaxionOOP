package nl.saxion.oop.week1;

public class Airplane {
    private boolean lockedDoors;
    private boolean passengersLoaded;
    private boolean luggageLoaded;

    public Airplane() {
        lockedDoors = false;
        passengersLoaded = false;
        luggageLoaded = false;
    }

    public boolean depart() {
        return this.lockedDoors && this.passengersLoaded && this.luggageLoaded;
    }

    public void lockDoors() {
        this.lockedDoors = true;
    }

    public void unlockDoors() {
        this.lockedDoors = false;
    }

    public boolean hasLockedDoors() {
        return this.lockedDoors;
    }

    public boolean loadLuggage() {
        return this.luggageLoaded = !hasLockedDoors();
    }

    public boolean loadPassengers() {
        return this.passengersLoaded = !hasLockedDoors();
    }
}
