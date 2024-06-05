package lld.design.parkinglotapplication.models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Gate extends BaseModel{
    private GateType gateType;
    private GateStatus gateStatus;
    private Operator operator;

    public Gate(GateType gateType, GateStatus gateStatus, Operator operator){
        this.gateType = gateType;
        this.gateStatus = gateStatus;
        this.operator = operator;
    }

}
