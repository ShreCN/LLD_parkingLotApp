package lld.design.parkinglotapplication.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ParkingSlot extends BaseModel{
    private VehicleType vehicleType;
    private SlotStatus slotStatus;
    private Long slotNumber;
    private ParkingFloor floor;
}
