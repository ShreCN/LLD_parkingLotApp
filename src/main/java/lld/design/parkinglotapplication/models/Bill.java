package lld.design.parkinglotapplication.models;

import lld.design.parkinglotapplication.strategies.feeCalculationStrategy;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Bill extends BaseModel{
    private Date exitTime;
    private Ticket ticket;
    private Gate gate;
    private Operator operator;
    private double amount;
    private BillStatus billStatus;
    private lld.design.parkinglotapplication.strategies.feeCalculationStrategy feeCalculationStrategy;
    private List<Payment> payments;
}
