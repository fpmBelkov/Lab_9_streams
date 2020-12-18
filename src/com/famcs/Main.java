package com.famcs;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        ArrayList<Company> comps = new ArrayList<>();
        comps.add(new Company("Google",1998,127498));
        comps.add(new Company("Yandex",1997,8854));
        comps.add(new Company("McKinsey",1926,27000));
        comps.add(new Company("Yahoo!",1995,8500));

        List<Company> filterComps = comps.stream().filter(item -> item.getStaff() > 0 && item.getStaff() < 25000).
                collect(Collectors.toList());
        System.out.println("filter by staff:\n" + filterComps);

        List<String> compNames = comps.stream().map(Company::getName).collect(Collectors.toList());
        System.out.println("names:\n" + compNames);

        Map<String,Integer> compYear = comps.stream().collect(Collectors.toMap(Company::getName,Company::getFoundation_year));
        System.out.println("toMap" + compYear);

        System.out.println(comps.stream().map(Company::getStaff).reduce(Integer::sum).toString());
        System.out.println(comps.stream().filter(i -> Objects.equals(i.getName(),"Google")).findFirst());

        Map<Integer,List<Company>> mapComp = comps.stream().collect(Collectors.groupingBy(Company::getStaff));

        System.out.println(mapComp);


    }
}
