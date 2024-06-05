package lld.design.parkinglotapplication.strategies;

import lld.design.parkinglotapplication.models.Ticket;

public interface feeCalculationStrategy {
    public double calculateFee(Ticket ticket);
}
