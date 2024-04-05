import java.lang.*;

public class Main {
    public static void main(String[] args) {
        //task 1
        String firstName = "Ivanov", middleName = "Ivan", lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("Ф.И.О. сотрудника - " + fullName);
        System.out.println();
        //task 2
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета - " + fullName.toUpperCase());
        String firstName1 = "Иванов", middleName1 = "Семён", lastName1 = "Семёнович";
        System.out.println();
        //task 3
        String fullName1 = firstName1 + " " + middleName1 + " " + lastName1;
        fullName1 = fullName1.replace('ё', 'е');
        System.out.println("Ф.И.О. сотрудника - " + fullName1);
    }
}
