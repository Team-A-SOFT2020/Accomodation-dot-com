package dk.lsd.teamA.service;

import dk.lsd.teamA.model.Hotel;
import dk.lsd.teamA.model.Room;

import java.util.Collection;
import java.util.Date;
import java.util.List;

public interface RoomUtility {
    /**
     * @param city
     * @param date
     * @param numberOfGuests
     * @return
     */
    Collection<Room> rooms(String city, Date date, int numberOfGuests);

    /**
     * @param roomNumbers
     * @return
     */
    boolean markRoomAsReserved(List<String> roomNumbers);
}
