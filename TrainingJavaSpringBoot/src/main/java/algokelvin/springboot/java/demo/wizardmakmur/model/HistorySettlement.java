package algokelvin.springboot.java.demo.wizardmakmur.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HistorySettlement {
     String id;
     String date;
     Boolean status;
     Integer idPrice;
     Integer price;
     Integer idCredit;
     Integer priceCredit;
     Integer idDebit;
     Integer priceDebit;
}
