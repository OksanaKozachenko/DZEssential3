package Task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введіть ключ : ");
        Scanner in = new Scanner(System.in);
        String key = in.nextLine();


        switch (key) {
            case "":
                DocumentWorker def = new DocumentWorker();
                def.openDocument();
                def.editDocument();
                def.saveDocument();
                break;
            case "1":
                DocumentWorker pro = new ProDocumentWorker();

                pro.openDocument();
                pro.editDocument();
                pro.saveDocument();
                break;
            case "2":
                DocumentWorker exp = new ExpertDocumentWorker();
                exp.openDocument();
                exp.editDocument();
                exp.saveDocument();
                break;

        }
    }
}


//В теле метода main() реализуйте возможность приема от пользователя номера ключа доступа pro и exp.
// сли пользователь не вводит ключ, он может пользоваться только бесплатной версией
// (создается экземпляр базового класса), если пользователь ввел номера ключа доступа pro и exp,
// то должен создаться экземпляр соответствующей версии класса, приведенный к базовому – DocumentWorker.