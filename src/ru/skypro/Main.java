package ru.skypro;


import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String lastName = "Ivanov ";
        String firstName = "Ivan ";
        String middleName = "Ivanovich";
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println("Ф.И.О сотрудника — " + (lastName + firstName + middleName));

        System.out.println("Данные Ф.И.О сотрудника для заполнения отчета — " + fullName.toUpperCase());

        String s1 = fullName.replace(" ", "; ");
        System.out.println("Данные ФИО сотрудника для административного отдела — " + s1);

        String fullName1 = "Иванов Семён Семёнович";

        String s3 = fullName1.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + s3);

    }
}
