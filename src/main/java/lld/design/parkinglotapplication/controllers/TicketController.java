package lld.design.parkinglotapplication.controllers;

import lld.design.parkinglotapplication.dtos.IssueTicketRequestDto;
import lld.design.parkinglotapplication.dtos.IssueTicketResponseDto;
import lld.design.parkinglotapplication.models.Ticket;
import lld.design.parkinglotapplication.services.TicketService;
import org.springframework.stereotype.Controller;

@Controller
public class TicketController {
    TicketService ticketService;
    public TicketController(TicketService ticketService){   // constructor injection
        this.ticketService = ticketService;
    }

    public IssueTicketResponseDto issueTicket(IssueTicketRequestDto issueTicketRequestDto){
        Ticket newTicket = ticketService.issueTicket(issueTicketRequestDto.getGateId(),
                issueTicketRequestDto.getVehicleNumber(),
                issueTicketRequestDto.getVehicleType(), issueTicketRequestDto.getVehicleOwnerName());

        return IssueTicketResponseDto.from(newTicket);
    }
}
