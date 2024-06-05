package lld.design.parkinglotapplication.repositorys;

import lld.design.parkinglotapplication.models.Gate;
import lld.design.parkinglotapplication.models.GateStatus;
import lld.design.parkinglotapplication.models.GateType;
import lld.design.parkinglotapplication.models.Operator;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
@Repository
public class GateRepository {
    // In memory Database
    HashMap<Long, Gate> gateHashMap = new HashMap<>();
    Operator operator = new Operator("Nikhil");
    Gate entryGate = new Gate(GateType.Entry, GateStatus.OPEN, operator);
    Gate exitGate = new Gate(GateType.Exit, GateStatus.OPEN, operator);

    public Gate getGateById(Long gateId){
        gateHashMap.put(1L, entryGate);
        gateHashMap.put(2L, exitGate);
        return gateHashMap.get(gateId);
    }




}
