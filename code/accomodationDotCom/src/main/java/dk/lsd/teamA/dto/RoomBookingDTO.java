package dk.lsd.teamA.dto;

import java.util.Date;
import java.util.List;

public class RoomBookingDTO {

    /**
     * Indicates the arrival date for a room
     */
    private Date arrivalDate;
    /**
     * Indicates the departure date for a room
     */
    private Date departureDate;
    /**
     * indicates the rooms booked
     */
    private List<RoomDTO> rooms;
}
