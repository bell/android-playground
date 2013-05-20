package no.jpro.del_regning;

import java.math.BigDecimal;
import java.util.LinkedList;

public class Bill {
    Long id;
    String name;
    String description;

    LinkedList<Participant> payers;
    LinkedList<Participant> participants = new LinkedList<Participant>();

    LinkedList<BillItem> items;

    /** Should be the sum on the bill - not necessarily the sum of all registered Items. If item sum does
     * not match - give user a friendly warning */
    BigDecimal amount;
    /** any possible tip - should also be possible to set a percentage - and total amount will be calculated */
    BigDecimal tip;
    /** the sum of amount and tip */
    BigDecimal totalPayed;

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPayers(LinkedList<Participant> payers) {
        this.payers = payers;
    }

    public void setItems(LinkedList<BillItem> items) {
        this.items = items;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setTip(BigDecimal tip) {
        this.tip = tip;
    }

    public void setTotalPayed(BigDecimal totalPayed) {
        this.totalPayed = totalPayed;
    }

    public void addParticipant(Participant possibleParticipant) {
        participants.add(possibleParticipant);
    }
}
