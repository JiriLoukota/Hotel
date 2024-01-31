import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Hosté
        Guest guestOne = new Guest("Adéla","Malíková", LocalDate.of(1993,3,13));
        Guest guestTwo = new Guest("Jan", "Dvořáček", LocalDate.of(1995, 5,5));
        //Pokoje
        Room roomOne = new Room(1,1,true,true, BigDecimal.valueOf(1000));
        Room roomTwo = new Room(2,1,true,true, BigDecimal.valueOf(1000));
        Room roomThree = new Room(3,3,false,true, BigDecimal.valueOf(2400));
        //Rezervace
        Booking bookingOne = new Booking(roomOne, LocalDate.of(2021,7,19),LocalDate.of(2021,7,26), true, guestOne);
        Booking bookingTwo = new Booking(roomThree, LocalDate.of(2021,9,1), LocalDate.of(2021,9,14), false, guestOne,guestTwo);
        //Výpis
        System.out.println("Hosté:");
        System.out.println(guestOne.toString());
        System.out.println(guestTwo.toString());
        System.out.println();
        System.out.println("Pokoje:");
        System.out.println(roomOne);
        System.out.println(roomTwo);
        System.out.println(roomThree);
        System.out.println();
        System.out.println("Rezervace:");
        System.out.println(bookingOne);
        System.out.println(bookingTwo);

    }
}