package ru.geekbrains.oop.lesson7.observer;

public class Student implements Observer{

    private String name;
    private int salary;
    private String vacancy;


    public Student(String name, String vacancy, int salary){
        this.name = name;
        this.vacancy = vacancy;
        this.salary = salary;
    }

    @Override
    public String getVacancy() {
        return vacancy;
    }

    @Override
    public void receiveOffer(String nameCompany, Vacancy vacancy) {
        if (this.salary <= vacancy.getSalary()){
            System.out.printf("Специалист %s: Мне нужна эта работа! (компания: %s; вакансия: %s; заработная плата: %d)\n",
                    name, nameCompany,vacancy.getVacancyName(), vacancy.getSalary());

            this.salary = vacancy.getSalary();

        }
        else {
            System.out.printf("Специалист %s: Я найду работу получше! (компания: %s; вакансия: %s; заработная плата: %d)\n",
                    name, nameCompany,vacancy.getVacancyName(), vacancy.getSalary());
        }
    }
}
