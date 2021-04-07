package algokelvin.springboot.java.demo.wizardmakmur.endpoint;

import algokelvin.springboot.java.demo.wizardmakmur.model.HistorySettlement;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class GetHistorySettlement {
    @GetMapping(value = "/tsm/historysettlement", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<HistorySettlement> responseMessage() {

        ArrayList<HistorySettlement> historySettlements = new ArrayList<>();
        historySettlements.add(new HistorySettlement("STTL0009", "20/08/20 21:34", true, 59, 25000, 30, 12000, 29, 13000));
        historySettlements.add(new HistorySettlement("STTL0009", "20/08/20 21:34", true, 59, 25000, 30, 12000, 29, 13000));
        historySettlements.add(new HistorySettlement("STTL0009", "19/08/20 21:34", true, 59, 25000, 30, 12000, 29, 13000));
        historySettlements.add(new HistorySettlement("STTL0009", "19/08/20 21:34", true, 59, 25000, 30, 12000, 29, 13000));
        historySettlements.add(new HistorySettlement("STTL0009", "18/08/20 21:34", true, 59, 25000, 30, 12000, 29, 13000));

        return new ResponseEntity(historySettlements, HttpStatus.OK);
    }
}
