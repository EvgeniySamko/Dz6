package ru.skypro;


public class Main {
    public static void main(String[] args) {

        String lastName = "Ivanov ";
        String firstName = "Ivan ";
        String middleName = "Ivanovich";
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println("Ф.И.О сотрудника — " + (lastName + firstName + middleName));

        fullName = fullName.toUpperCase();
        System.out.println("Данные Ф.И.О сотрудника для заполнения отчета — " + fullName);

        fullName = fullName.toLowerCase();
        String s1 = fullName.replace(" ", "; ");
        String s2 = s1.replace("i", "I");
        System.out.println(s2);

        String fullName1 = "Иванов Семён Семёнович";
        String s3 = fullName1.replace("ё", "е");
        System.out.println(s3);
    }
}
