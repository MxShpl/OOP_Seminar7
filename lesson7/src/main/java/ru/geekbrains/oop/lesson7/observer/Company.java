package ru.geekbrains.oop.lesson7.observer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class Company {

    private Random random = new Random();


    private String name;

    private Collection<Vacancy> vacancies;

    private Publisher jobAgency;

    private int maxSalary;

    public Company(String name, Publisher jobAgency, int maxSalary){
        this.jobAgency = jobAgency;
        this.name = name;
        this.maxSalary = maxSalary;
        vacancies = new ArrayList<Vacancy>();
    }

    public void addVacancy(Vacancy vacancy){
        this.vacancies.add(vacancy);
    }

    public void needEmployee(){
        jobAgency.sendOffer(name, vacancies);
    }


}
