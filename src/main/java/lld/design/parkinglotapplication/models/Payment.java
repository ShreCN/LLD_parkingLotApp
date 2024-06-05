package lld.design.parkinglotapplication.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Payment extends BaseModel{
    private PaymentModes paymentMode;
    private double amount;
    private Date time;
    private PaymentStatus paymentStatus;
    private Long refNumber;
}
