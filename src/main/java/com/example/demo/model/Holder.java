package com.example.demo.model;

import java.util.Objects;

public class Holder {

    private String value;
    private String decision;

    public Holder() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDecision() {
        return decision;
    }

    public void setDecision(String decision) {
        this.decision = decision;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Holder holder = (Holder) o;
        return Objects.equals(value, holder.value) && Objects.equals(decision, holder.decision);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, decision);
    }
}
