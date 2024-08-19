package com.apieceofcoding.experiment.hashcode;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Payload payload1 = new Payload(1L, "a");
        Payload payload2 = new Payload(1L, "a");
        System.out.println(payload1.equals(payload2)); // true
        System.out.println("payload1 hashCode: " + payload1.hashCode()); // 622488023
        System.out.println("payload2 hashCode: " + payload2.hashCode()); // 414493378

        Map<Payload, Integer> payloads = new HashMap<>();
        payloads.put(payload1, 1);
        Integer result = payloads.get(payload2);
        System.out.println(result); // null
    }
}
