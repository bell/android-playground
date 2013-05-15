package no.bs.sb;

import java.util.Date;
import java.util.LinkedList;

public class Event {
    Long id;
    private String name;
    private String description;
    private Date startOfPeriod;
    private Date endOfPeriod;

    private LinkedList<Bill> bills;
    private LinkedList<Participant> participants;
}
