package dk.lsd.teamA.dto;

import java.util.List;

public class BookingDTO {


    /**
     * Supplied by guest for booking
     */
    private String passportNumber;
    /**
     * Contains information about each booked room
     */
    private List<RoomBookingDTO> roomBookings;
    /**
     * Is marked true when guest are ariving late
     */
    private boolean lateArrival;
    /**
     * Indicates the number of guests
     */
    private int numberOfGuests;


}
