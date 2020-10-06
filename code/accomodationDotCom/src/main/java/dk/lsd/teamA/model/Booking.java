package dk.lsd.teamA.model;

import java.util.Collection;

public class Booking {
    private int id;
    private Collection<RoomBooking> roomBookings;
    private boolean lateArival;
    private int numberOfGuests;

    public Booking(int id, Collection<RoomBooking> roomBookings, boolean lateArival, int numberOfGuests) {
        this.id = id;
        this.roomBookings = roomBookings;
        this.lateArival = lateArival;
        this.numberOfGuests = numberOfGuests;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Collection<RoomBooking> getRoomBookings() {
        return roomBookings;
    }

    public void setRoomBookings(Collection<RoomBooking> roomBookings) {
        this.roomBookings = roomBookings;
    }

    public boolean isLateArival() {
        return lateArival;
    }

    public void setLateArival(boolean lateArival) {
        this.lateArival = lateArival;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }
}
