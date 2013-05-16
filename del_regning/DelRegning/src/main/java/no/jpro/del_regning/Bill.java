package no.jpro.del_regning;

import java.util.LinkedList;

public class Bill {
    Long id;
    String name;
    String description;
    Participant payer;

    LinkedList<BillItem> items;
}
