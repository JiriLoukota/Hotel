import java.time.LocalDate;
import java.util.List;

public class Booking {
    private Room room;
    private LocalDate firstDay;
    private LocalDate lastDay;
    private boolean workingStay;
    private List<Guest> guests;

    public Booking(Room room, LocalDate firstDay, LocalDate lastDay, boolean workingStay, List<Guest> guests) {
        this.room = room;
        this.firstDay = firstDay;
        this.lastDay = lastDay;
        this.workingStay = workingStay;
        this.guests = guests;
    }


    //region Settery a Gettery

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public LocalDate getFirstDay() {
        return firstDay;
    }

    public void setFirstDay(LocalDate firstDay) {
        this.firstDay = firstDay;
    }

    public LocalDate getLastDay() {
        return lastDay;
    }

    public void setLastDay(LocalDate lastDay) {
        this.lastDay = lastDay;
    }

    public boolean isWorkingStay() {
        return workingStay;
    }

    public void setWorkingStay(boolean workingStay) {
        this.workingStay = workingStay;
    }

    public List<Guest> getGuests() {
        return guests;
    }

    public void setGuests(List<Guest> guests) {
        this.guests = guests;
    }

    //endregion

    @Override
    public String toString() {
        StringBuilder description =new StringBuilder("Popis pobytu:pokoj číslo:" + room.getRoomNo() + ", počátek pobytu: " + firstDay.getDayOfMonth() + ". " + firstDay.getMonthValue() + ". " + firstDay.getYear() + ", konec pobytu:" + lastDay.getDayOfMonth() + ". " + lastDay.getMonthValue() + ". " + lastDay.getYear());
        if(workingStay){
            description.append(" je pracovní pobyt.");
        }else{
            description.append(" není pracovní pobyt.");
        }

        description.append(" V tomto pokoji budou ubytováni: " + guests.toString());
        return description.toString();
    }
}