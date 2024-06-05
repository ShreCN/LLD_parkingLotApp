package lld.design.parkinglotapplication.dtos;

import lld.design.parkinglotapplication.models.ParkingSlot;
import lld.design.parkinglotapplication.models.Ticket;
import lld.design.parkinglotapplication.models.Vehicle;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
public class IssueTicketResponseDto {
    private Date entryTime;
    private Vehicle vehicle;
    private ParkingSlot parkingSlot;
    private ResponseType responseStatus;
    private String failureMessage;
    public static IssueTicketResponseDto from(Ticket newTicket) {
        if(newTicket == null){
            return new IssueTicketResponseDto(newTicket.getEntryTime(),
                        newTicket.getVehicle(),
                        newTicket.getParkingSlot(),
                        ResponseType.FAILURE,
                        "Failed to Generate Ticket" );
        }else {
            return new IssueTicketResponseDto(newTicket.getEntryTime(),
                            newTicket.getVehicle(),
                            newTicket.getParkingSlot(),
                            ResponseType.SUCCESS,
                            "Ticket generated" );
        }
    }
}
