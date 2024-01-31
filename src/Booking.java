import java.time.LocalDate;

public class Booking {
    private Room room;
    private LocalDate firstDay;
    private LocalDate lastDay;
    private boolean workingStay;
    private Guest guestOne;
    private Guest guestTwo;

    public Booking(Room room, LocalDate firstDay, LocalDate lastDay, boolean workingStay, Guest guestOne) {
        this.room = room;
        this.firstDay = firstDay;
        this.lastDay = lastDay;
        this.workingStay = workingStay;
        this.guestOne = guestOne;
        this.guestTwo = new Guest("","",null);
    }

    public Booking(Room room, LocalDate firstDay, LocalDate lastDay, boolean workingStay, Guest guestOne, Guest guestTwo) {
        this.room = room;
        this.firstDay = firstDay;
        this.lastDay = lastDay;
        this.workingStay = workingStay;
        this.guestOne = guestOne;
        this.guestTwo = guestTwo;
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

    //endregion

    @Override
    public String toString() {
        StringBuilder description =new StringBuilder("Popis pobytu:pokoj číslo:" + room.getRoomNo() + ", počátek pobytu: " + firstDay.getDayOfMonth() + ". " + firstDay.getMonthValue() + ". " + firstDay.getYear() + ", konec pobytu:" + lastDay.getDayOfMonth() + ". " + lastDay.getMonthValue() + ". " + lastDay.getYear());
        if(workingStay){
            description.append(" je pracovní pobyt.");
        }else{
            description.append(" není pracovní pobyt.");
        }

        description.append(" V tomto pokoji budou ubytováni: " + guestOne.getFirstName() + " " + guestOne.getSurname() +" " + guestTwo.getFirstName() +" "+ guestTwo.getSurname());

        return description.toString();
    }
}
