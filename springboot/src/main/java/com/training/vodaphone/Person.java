package com.training.vodaphone;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

import com.training.vodaphone.validation.ValidateStart;

@XmlRootElement
public class Person {

    @NotEmpty
    @Size(min = 2, max = 30, message = "İsim 2 ile 30 arasında olmalı")
    private String name;
    @ValidateStart(baslangic = "yay", message = "surname yay ile başlamalı")
    @NotEmpty
    @Size(min = 3, max = 40, message = "Soyİsim 3 ile 40 arasında olmalı")
    private String surname;
    @Max(value = 120, message = "Yaş max 120 olabilir")
    @Min(value = 18, message = "18 yaş altı olmaz")
    private int    age;

    public String getName() {
        return this.name;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(final String surnameParam) {
        this.surname = surnameParam;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(final int ageParam) {
        this.age = ageParam;
    }

    @Override
    public String toString() {
        return "Person [name=" + this.name + ", surname=" + this.surname + ", age=" + this.age + "]";
    }


}
