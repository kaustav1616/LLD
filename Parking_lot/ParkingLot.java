import java.util.List;

class ParkingLot
{
    List<Floor> floors;
    List<Gate> gates;
    List<Person> attendants;
    List<Person> admins;
    List<ParkingReceipt> receipts;
    List<Payment> payments;
    List<Park> parkHistory;
    Address address;

    public void changeAttendant(Gate g, Person outgoing, Person incoming);

    public void activateGate(Gate g);

    public void deActivateGate(Gate g);

    public void addParkingFloor();
}