package vehicle_rental_system.dao;

import vehicle_rental_system.model.Rental;

public class RentalDaoImpl extends RentalDao{
    private static Rental[] rentalDb = new Rental[100];

    @Override
    public  void insertRental(Rental rental){
        rentalDb[rental.getTotalRental() - 1] =rental;
    }

    @Override
    public  Rental[] getAllRentals(){
        return rentalDb;
    }

}
