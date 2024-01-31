import java.time.LocalDate;

public class Guest {
    private String firstName;
    private String surname;
    private LocalDate birthday;

    public Guest(String firstName, String surname, LocalDate birthday) {
        this.firstName = firstName;
        this.surname = surname;
        this.birthday = birthday;
    }

    //region Setters and Getters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
    //endregion

    @Override
    public String toString() {
        return firstName +" "+ surname +", datum narození: "+ birthday.getDayOfMonth() + ". " + birthday.getMonthValue() + ". " + birthday.getYear();
    }
}
