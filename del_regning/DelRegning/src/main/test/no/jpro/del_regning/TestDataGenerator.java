package no.jpro.del_regning;

import java.math.BigDecimal;

public class TestDataGenerator {
    Participant[] possibleParticipants = new Participant[] {
            new Participant("Runar", "runar@bell.as", "+4798252363"),
            new Participant("Victoria", "victoria@bell.as", "+4798252364"),
            new Participant("Amanda", "amanda@bell.as", "+4798252365"),
            new Participant("Olivia", "olivia@bell.as", "+4798252366"),
            new Participant("Mariann", "mariann@bell.as", "+4798252362"),
    };
    Bill generateBill(BigDecimal amount, BigDecimal tip, int nrOfParticipants) {
        Bill bill = new Bill();
        bill.setAmount(amount);
        bill.setTip(tip);
        bill.setTotalPayed(amount.add(tip));
        for (int i = 0; i < nrOfParticipants || i >= possibleParticipants.length; i++) {
            bill.addParticipant(possibleParticipants[i]);
        }
        return bill;
    }

    Bill generateBill(BigDecimal amount, BigDecimal tip, int nrOfParticipants, int nrOfBillItems) {
        Bill bill = generateBill(amount, tip, nrOfParticipants);
        Participant[] participants = bill.participants.toArray(new Participant[nrOfParticipants]);
        int i = 0;
        if (nrOfBillItems >= nrOfParticipants) {
            for (int count = 0; count < nrOfBillItems; count++) {
                BillItem bi = new BillItem();
                bi.consumer = participants[i];
                bi.description = "BillItem nr " + count;
                bi.amount = amount.divide(new BigDecimal(nrOfBillItems));
                i = (i < nrOfParticipants - 1 ? i + 1 : 0);
            }
        }
        return bill;
    }
}
