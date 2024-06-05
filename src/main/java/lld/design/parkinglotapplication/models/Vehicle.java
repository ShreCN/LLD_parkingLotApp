package lld.design.parkinglotapplication.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Vehicle extends BaseModel{
    private String number;
    private VehicleType vehicleType;
    private String ownerName;

}
