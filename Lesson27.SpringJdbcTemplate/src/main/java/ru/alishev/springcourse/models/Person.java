package ru.alishev.springcourse.models;

import javax.validation.constraints.*;
import java.util.Date;

/**
 * @author Neil Alishev
 */
public class Person {
    private int personId;

    @NotEmpty(message = "Name should not be empty")
    @Size(min = 2, max = 30, message = "Name should be between 2 and 30 characters")
    private String fio;

    @Min(value = 0, message = "Age should be greater than 0")
    @Min(value = 1900,message = "Min year 1900")
    @Max(value = 2022, message = "Max year 2022")
    private int dateOfBirthday;

    public Person() {

    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(int dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    public Person(int personId, String fio, int dateOfBirthday) {
        this.personId = personId;
        this.fio = fio;
        this.dateOfBirthday = dateOfBirthday;
    }
}
