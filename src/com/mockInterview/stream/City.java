package com.mockInterview.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class City {
    String name;
    int population;

    public City(String name, int population){
        this.name = name;
        this.population = population;
    }

    public static void main(String[] args){
        List<City> lists = new ArrayList<>();
        lists.add(new City("NY", 13214));
        lists.add(new City("DC", 2144135));
        lists.add(new City("NJ", 643345));
        lists.add(new City("CA", 77435));
        lists.add(new City("VA", 52525));

        List<City> sortedCity = lists.stream()
                .sorted((a, b) -> a.population - b.population)
                .toList();
        // .toList() is immutable
        //sortedCity.add(new City("AA", 3525));


        List<City> sortedCity2 = lists.stream()
                .sorted((a, b) -> a.population - b.population)
                .collect(Collectors.toList());
        // .collect(Collectors.toList()) is mutable
        sortedCity2.add(new City("AA", 52525));

        lists.stream().forEach(city -> System.out.println(city.name));

        int maxPo = lists.stream()
                .mapToInt(a -> a.population)
                .max()
                .getAsInt();
        System.out.println(maxPo);

        double avgPo = lists.stream()
                .mapToInt(a -> a.population)
                .average()
                .orElse(0.0);

        System.out.println(avgPo);

    }

}
