package vehicle_rental_system.model;

import vehicleregistrationsystem.model.Vehicle;

public class Rental {
    public static final int MAX_RENTAL_COUNT = 1000;
    private int rentalId;
    private Customer customer;
    private Vehicle vehicle;
    private int rentalDays;
    private double totalPrice;
    private static int intTotalRental = 0;

    public Rental(Customer customer, Vehicle vehicle, int rentalDays) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.rentalDays = rentalDays;
        intTotalRental++;
        this.rentalId = intTotalRental;
    }

    public static int getTotalRental() {
        return intTotalRental;
    }

    @Override
    public String toString() {
        return "Rental{" +
                "rentalId=" + rentalId +
                ", customer=" + customer +
                ", vehicle=" + vehicle +
                ", rentalDays=" + rentalDays +
                ", totalPrice=" + totalPrice +
                '}';
    }


}
