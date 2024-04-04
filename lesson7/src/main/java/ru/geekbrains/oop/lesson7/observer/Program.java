package ru.geekbrains.oop.lesson7.observer;

public class Program {

    /**
     * TODO: Доработать приложение, которое разрабатывалось на семинаре,
     *  поработать с шаблоном проектирования Observer,
     *  добавить новый тип соискателя.
     *  Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  Только после этого вы можете усложнить ваше приложение (при желании), например,
     *  добавить тип вакансии (enum),
     *  учитывать тип вакансии при отправке предложения соискателю.
     *  *** воспользоваться методом removeObserver для удаления соискателя после получения работы
     * @param args
     */
    public static void main(String[] args) {

        Publisher publisher = new JobAgency();
        Company google = new Company("Google", publisher, 120000);
        Company yandex = new Company("Yandex", publisher, 95000);
        Company geekBrains = new Company("GeekBrains", publisher, 98000);
        //Ваканссии для гугл
        Vacancy vacancy1 = new Vacancy("Devoloper",120000);
        Vacancy vacancy2 = new Vacancy("Tester",50000);
        Vacancy vacancy3 = new Vacancy("Cleaner",25000);
        google.addVacancy(vacancy1);
        google.addVacancy(vacancy2);
        google.addVacancy(vacancy3);
        //Вакансии для яндекса
        Vacancy vacancy4 = new Vacancy("Devoloper",100000);
        Vacancy vacancy5 = new Vacancy("Tester",70000);
        Vacancy vacancy6 = new Vacancy("Cleaner",28000);
        yandex.addVacancy(vacancy4);
        yandex.addVacancy(vacancy5);
        yandex.addVacancy(vacancy6);
        //Вакансии для гикбрейнс
        Vacancy vacancy7 = new Vacancy("Devoloper",90000);
        Vacancy vacancy8 = new Vacancy("Teacher",70000);
        Vacancy vacancy9 = new Vacancy("Assistant",28000);
        geekBrains.addVacancy(vacancy7);
        geekBrains.addVacancy(vacancy8);
        geekBrains.addVacancy(vacancy9);



        Student student = new Student("Student #1","Assistant",25000);
        OrdinaryWorker ordinaryWorker = new OrdinaryWorker("OrdinaryWorker #1","Teacher",60000);
        Master master1 = new Master("Master #1","Tester",60000);
        Master master2 = new Master("Master #2","Devoloper",110000);


        publisher.registerObserver(student);
        publisher.registerObserver(ordinaryWorker);
        publisher.registerObserver(master1);
        publisher.registerObserver(master2);


            google.needEmployee();
            yandex.needEmployee();
            geekBrains.needEmployee();


    }

}
