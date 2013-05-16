package no.bs.sb;

import java.util.LinkedList;

public class Bill {
    Long id;
    String name;
    String description;
    Participant payer;

    LinkedList<BillItem> items;
}
