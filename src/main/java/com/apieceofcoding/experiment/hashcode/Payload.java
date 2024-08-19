package com.apieceofcoding.experiment.hashcode;

import java.util.Objects;

public class Payload {
    Long id;
    String name;

    public Payload(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Payload payload)) return false;
        return Objects.equals(id, payload.id) && Objects.equals(name, payload.name);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name);
//    }
}
