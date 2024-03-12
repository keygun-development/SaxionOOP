package nl.saxion.opp.week4.exercise0;

public class Main {
    public static void main(String[] args) {
        House house = new House("Kerkstraat 1", "1234AB", "Enschede", 150, "John Doe", true, 250000);
        Office office = new Office("Kerkstraat 2", "1234AC", "Enschede", 200, "Saxion", 100);
        System.out.println(house);
        System.out.println(office);
    }
}
