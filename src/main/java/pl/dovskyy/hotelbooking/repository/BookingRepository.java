package pl.dovskyy.hotelbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.dovskyy.hotelbooking.model.HotelBooking;

import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<HotelBooking, Long> {

    List<HotelBooking> findByPricePerNightLessThanEqual(double price);

}
