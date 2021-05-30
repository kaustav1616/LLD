import java.util.List;

public class Gate 
{
    int gateNo;
    Person attendant;
    List<Floor> floors;

    public Slot findEmptySlot(Vehicle vehicle);

    public ParkingReceipt parkCar(Slot slot, Vehicle vehicle);

    public void processPayment(ParkingReceipt parkingReceipt, Vehicle vehicle);
}