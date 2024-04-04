package ru.geekbrains.oop.lesson7.observer;

import java.util.ArrayList;
import java.util.Collection;

public class JobAgency implements Publisher {

    private Collection<Observer> observers = new ArrayList<>();

    public void sendOffer(String companyName, Collection<Vacancy> vacancies){
        for (Observer observer : observers){
            for (Vacancy vacancy : vacancies){
                if(observer.getVacancy().equals(vacancy.getVacancyName())){
                    observer.receiveOffer(companyName, vacancy);

                }

            }


        }
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

}
