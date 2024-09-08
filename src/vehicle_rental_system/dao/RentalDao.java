package vehicle_rental_system.dao;

import vehicle_rental_system.model.Rental;

public class RentalDao {
    private static Rental[] rentalDb = new Rental[100];

    public static void insertRental(Rental rental){
        rentalDb[rental.getIntTotalRental() - 1] =rental;
    }
}
