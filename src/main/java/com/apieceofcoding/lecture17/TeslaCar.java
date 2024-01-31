package com.apieceofcoding.lecture17;

import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@ToString
public class TeslaCar extends Car {
    String model;
    int year;

    public TeslaCar(String model, int year) {
        this.model = model;
        this.year = year;
    }

    private static final Map<String, TeslaCar> carCache = new HashMap<>();

    static {
        carCache.put("modelS-2012", new TeslaCar("modelS", 2012));
        carCache.put("modelX-2015", new TeslaCar("modelX", 2015));
        carCache.put("model3-2017", new TeslaCar("model3", 2017));
        carCache.put("modelY-2020", new TeslaCar("modelY", 2020));
        carCache.put("cybertruck-2023", new TeslaCar("cybertruck", 2023));
    }

    public static Car getCachedTeslaCar(String model, int year) {
        String key = model + "-" + year;
        if (carCache.containsKey(key)) {
            return carCache.get(key);
        }
        throw new IllegalArgumentException();
    }
}
// 2012 modelS 출시
// 2015 modelX 출시
// 2017 model3 출시
// 2020 modelY 출시
// 2023 cybertruck 출시