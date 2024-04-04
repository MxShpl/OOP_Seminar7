package ru.geekbrains.oop.lesson7.observer;

import java.util.Collection;

public interface Publisher {

    void sendOffer(String companyName, Collection<Vacancy> vacancies);

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);


}
