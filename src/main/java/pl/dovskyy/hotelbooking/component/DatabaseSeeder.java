package pl.dovskyy.hotelbooking.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.dovskyy.hotelbooking.repository.BookingRepository;


//This class implements the CommandLineRunner. The CommandLineRunners start to execute after the beans and application context is created.
//(after the spring boot app starts up)
//in this case I will populate the database with some basic data about our hotel bookings
@Component
public class DatabaseSeeder implements CommandLineRunner {
    private BookingRepository bookingRepository;

    @Autowired
    public DatabaseSeeder(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    @Override
    public void run(String... args) throws Exception {
//        List<HotelBooking> bookings = new ArrayList<>();
//        bookings.add(new HotelBooking("Marriot", 200.50, 3));
//        bookings.add(new HotelBooking("Brda", 150.50, 2));
//        bookings.add(new HotelBooking("Atlantis", 340, 5));
//        bookings.add(new HotelBooking("MGM Grand", 440, 2));
//
//        bookingRepository.saveAll(bookings);
    }
}
