package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите номер одного из предложенных" +
                "языков программирования:\n" +
                "1.Java\n" +
                "2.Ruby\n" +
                "3.Delphi");

        System.out.print("Ввод: ");
        String choice = in.nextLine();

        Compilator compilator = null;

        switch (choice){
            case "1":
                System.out.println("Выбран язык Джава");
                compilator = new JavaCompilator();
                break;
            case "2":
                System.out.println("Выбран язык Руби");
                compilator = new RubyCompilator();
                break;
            case "3":
                System.out.println("Выбран язык Делфи");
                compilator = new DelphiCompilator();
                break;
            default:
                System.out.println("Неверная команда!");
        }

        compilator.start("text.txt");
        System.out.println("КОМПИЛЯЦИЯ ВЫПОЛНЕНА");

    }
}
