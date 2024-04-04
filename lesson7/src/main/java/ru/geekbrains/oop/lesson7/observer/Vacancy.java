package ru.geekbrains.oop.lesson7.observer;

public class Vacancy {
    private String vacancyName;
    private int salary;

    public Vacancy(String vacancy, int salary){
        this.vacancyName = vacancy;
        this.salary = salary;
    }

    public String getVacancyName() {
        return vacancyName;
    }

    public int getSalary() {
        return salary;
    }
}
