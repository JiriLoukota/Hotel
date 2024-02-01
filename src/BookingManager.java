import java.util.List;

public class BookingManager {
    private List<Booking> bookings;

    public List<Booking> getBookings() {
        return bookings;
    }
    public Booking getBooking(int index){
        return bookings.get(index);
    }
    public void addBooking(Booking newBooking){
        bookings.addLast(newBooking);
    }
    public void clearBookings(){
        bookings.clear();
    }

}
