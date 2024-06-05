package lld.design.parkinglotapplication.repositorys;

import lld.design.parkinglotapplication.models.Ticket;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
@Repository
@Getter
@Setter
public class TicketRepository {

    HashMap<Long, Ticket> ticketHashMap = new HashMap<>();

    public void saveTicket(Ticket newTicket) {
        ticketHashMap.put(newTicket.getId(), newTicket);
    }
}
