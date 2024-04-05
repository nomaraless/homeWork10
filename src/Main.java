import java.util.Arrays;
import java.util.Scanner;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        //task 1
        Scanner sc = new Scanner(System.in);
        String[] firsName = new String[10], middleName = new String[10], lastName = new String[10];
        String[] fullName = new String[10];
        middleName[0] = "Ivan";
        firsName[0] = "Ivanov";
        lastName[0] = "Ivanovich";
        middleName[1] ="Семён";
        firsName[1] = "Семёнов";
        lastName[1] = "Семёнович";
        for (int i = 0; i < middleName.length; i++) {
            fullName[i] = firsName[i] + ' ' + middleName[i] + ' ' + lastName[i];
        }
        String str = new String(Arrays.toString(fullName));
        str = str.replace('ё','е');
        str = str.replace("[", "");
        String delimiter = ", ";
        String[] fullNameArray = str.split(delimiter);
        //task 1
        System.out.println("Введите номер сотрудника");
        int i = sc.nextInt();
        i-=1;
        System.out.println("Ф.И.О. сотрудника - " + fullNameArray[i]);
        System.out.println();
        //task 2
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета - " + fullNameArray[i].toUpperCase());
        //task 3





    }

    }
