package org.example.inheritance;

import java.util.List;

public class Aggregation {

    private String name;
    private List<String> names;
    private String address;
    public Aggregation() {
        this.address = "blah blah blah";
    }
    public Aggregation (Aggregation aggregation) {
        this.aggregation = aggregation;
    }
}
