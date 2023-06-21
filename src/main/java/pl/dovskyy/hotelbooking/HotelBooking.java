package pl.dovskyy.hotelbooking;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class HotelBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String hotelName;
    private double pricePerNight;
    private int numberOfNights;


    public HotelBooking() {
    }

    public HotelBooking(String hotelName, double pricePerNight, int numberOfNights) {
        this.hotelName = hotelName;
        this.pricePerNight = pricePerNight;
        this.numberOfNights = numberOfNights;
    }

}
