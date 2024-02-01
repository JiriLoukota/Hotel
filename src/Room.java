import java.math.BigDecimal;

public class Room {
    private int roomNo;
    private int numberOfBeds;
    private boolean hasBalcony;
    private boolean hasViewToSea;
    private BigDecimal pricePerNight;

    public Room(int roomNo,int numberOfBeds, boolean hasBalcony, boolean hasViewToSea, BigDecimal pricePerNight){
        this.roomNo=roomNo;
        this.numberOfBeds=numberOfBeds;
        this.hasBalcony=hasBalcony;
        this.hasViewToSea=hasViewToSea;
        this.pricePerNight=pricePerNight;
    }


    //region Setters and Getters
    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public boolean isHasBalcony() {
        return hasBalcony;
    }

    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }

    public boolean isHasViewToSea() {
        return hasViewToSea;
    }

    public void setHasViewToSea(boolean hasViewToSea) {
        this.hasViewToSea = hasViewToSea;
    }

    public BigDecimal getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(BigDecimal pricePerNight) {
        this.pricePerNight = pricePerNight;
    }
    //endregion


    @Override
    public String toString() {
        StringBuilder descriptionOfRoom = new StringBuilder("Pokoj číslo " + roomNo + " obsahuje " + numberOfBeds + " postelí, ");
        if(hasBalcony){
            descriptionOfRoom.append("má balkon ");
        }else{
            descriptionOfRoom.append("nemá balkon ");
        }

        if(hasViewToSea){
            descriptionOfRoom.append("a má výhled na moře.");
        }else{
            descriptionOfRoom.append("a nemá výhled na moře.");
        }

        descriptionOfRoom.append(" Cena na jednu noc činí: " + pricePerNight.toString() + " Kč.");

        return String.valueOf(descriptionOfRoom);
    }
}
