package dk.lsd.teamA.dto;

import dk.lsd.teamA.model.RoomType;

public class RoomDTO {

    /**
     * Indicates information about the Hotel
     */
    private HotelDTO hotelDTO;
    /**
     * Indicates the room number
     */
    private String roomNumber;
    /**
     * Indicates the room type through an Enum
     */
    private Enum<RoomType> roomType;


}
