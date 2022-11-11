public class Guest {
    private int dayStay;
    private Room room;
    private String id;
    private String name;

    public Guest(int dayStay, Room room, String id, String name) {
        this.dayStay = dayStay;
        this.room = room;
        this.id = id;
        this.name = name;
    }

    public int getDayStay() {
        return dayStay;
    }

    public void setDayStay(int dayStay) {
        this.dayStay = dayStay;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "dayStay=" + dayStay +
                ", room=" + room +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
