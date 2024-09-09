package vehicle_rental_system.dao;

import vehicle_rental_system.model.Rental;

public abstract class RentalDao {
    public abstract void insertRental(Rental rental);
    public abstract Rental[] getAllRentals();
}
