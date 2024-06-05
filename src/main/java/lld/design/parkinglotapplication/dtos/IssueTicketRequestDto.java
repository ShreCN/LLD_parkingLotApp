package lld.design.parkinglotapplication.dtos;

import lld.design.parkinglotapplication.models.Ticket;
import lld.design.parkinglotapplication.models.VehicleType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IssueTicketRequestDto {
    private String vehicleNumber;
    private String vehicleOwnerName;
    private VehicleType vehicleType;
    private Long gateId;

}