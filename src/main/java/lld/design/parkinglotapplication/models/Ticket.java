package lld.design.parkinglotapplication.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
public class Ticket extends BaseModel{
    private Date entryTime;
    private Vehicle vehicle;
    private ParkingSlot parkingSlot;
    private Gate gate;
    private Operator operator;

    private static long ticketId = 1;
    public Ticket(Gate gate, Vehicle vehicle, ParkingSlot parkingSlot){
        super(ticketId, new Date(), new Date());
        this.entryTime = new Date();
        this.vehicle = vehicle;
        this.parkingSlot = parkingSlot;
        this.gate = gate;
        this.operator = gate.getOperator();
        ticketId++;
    }
}
