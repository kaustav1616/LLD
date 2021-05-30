import java.util.List;
import java.util.Map;

public class Floor 
{
    List<Slot> slots;
    Map<Slot, Boolean> emptySlots;
    
    public List<Slot> getEmptySlots();

    public void parkCar(Slot slot, Vehicle vehicle);

    public void addParkingSlots(VehicleType slotType, int position);
}