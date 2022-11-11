import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class HotelManagement {
    List<Guest> guestList = new LinkedList<>();

    public void addGuest(Guest guest) {
        guestList.add(guest);
    }

    public void deleteGuest(String id) {
        guestList.remove(guestList.stream().filter(g -> g.getId().contains(id)).toList());
    }

    public void showGuestList() {
        guestList.forEach(g -> {
            System.out.println(g.toString());
        });
    }
}
