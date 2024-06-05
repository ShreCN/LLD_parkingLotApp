package lld.design.parkinglotapplication.services;

import lld.design.parkinglotapplication.exceptions.InvalidInputException;
import lld.design.parkinglotapplication.models.*;
import lld.design.parkinglotapplication.repositorys.GateRepository;
import lld.design.parkinglotapplication.repositorys.ParkingSlotRepository;
import lld.design.parkinglotapplication.repositorys.TicketRepository;
import org.springframework.stereotype.Service;

@Service
public class TicketService {
    GateRepository gateRepository = new GateRepository(); // ideally TicketService has to interact with GateService to create GateRepository Object
    ParkingSlotRepository parkingSlotRepository= new ParkingSlotRepository(); // ideally TicketService has to interact with ParkingSlotService to create GateRepository Object
    TicketRepository ticketRepository = new TicketRepository();
    public Ticket issueTicket(Long gateId, String vehicleNumber, VehicleType vehicleType, String vehicleOwnerName) {

        //create Vehicle instance
        Vehicle newVehicle = new Vehicle(vehicleNumber, vehicleType, vehicleOwnerName);

        // check if the Gate exists
        Gate gate = gateRepository.getGateById(gateId);
        if (gate == null) new InvalidInputException("Invalid Gate Id");

        // check if the ParkingSlot is available
        ParkingSlot parkingSlot = parkingSlotRepository.getParkingSlotById(1L); // hardcoded for the sake of simplicity
        if (parkingSlot == null) new InvalidInputException("Invalid Parking slot number");

        // create Ticket object and return
        Ticket newTicket = new Ticket(gate, newVehicle, parkingSlot);
        ticketRepository.saveTicket(newTicket);
        return newTicket;
    }
}
