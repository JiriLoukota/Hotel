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
    public int getNumberOfWorkingBookings(){
        int numberOfWorkingBookings = 0;
        for (Booking booking : bookings) {
            if (booking.isWorkingStay()) {
                numberOfWorkingBookings++;
            }
        }
        return numberOfWorkingBookings;
    }
    public double getAverageGuests(){
        double averageGuests=0;
        for(Booking booking : bookings){
            averageGuests += Double.valueOf(booking.getNumberOfGuests());
        }
        averageGuests = averageGuests/bookings.size();
        return averageGuests;
    }

}
