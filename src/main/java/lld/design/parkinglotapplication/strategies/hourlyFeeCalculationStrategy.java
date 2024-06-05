package lld.design.parkinglotapplication.strategies;

import lld.design.parkinglotapplication.models.Ticket;

import java.util.Date;

public class hourlyFeeCalculationStrategy implements feeCalculationStrategy{
    @Override
    public double calculateFee(Ticket ticket) {
        Date exitTime = new Date();
        Date entryTime = ticket.getEntryTime();

        return (exitTime.getTime() - entryTime.getTime()) * 10;
    }
}
