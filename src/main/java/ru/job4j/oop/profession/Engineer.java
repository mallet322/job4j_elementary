package ru.job4j.oop.profession;

public class Engineer extends Profession {

    private final String company;

    public Engineer(String name,
                    String surname,
                    String education,
                    String birthday,
                    String company) {
        super(name, surname, education, birthday);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

}
