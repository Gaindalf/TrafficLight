import java.util.Scanner;

public class ScannTheNumber {
    void scan() {
        Scanner sc = new Scanner(System.in);
        int minute = 1;
        while (minute != 0) {
            System.out.println("Введите минуту");
            System.out.println("Для выхода нажмите 0");
            minute = sc.nextInt();
            if (minute != 0 & minute <= 60) {
                System.out.println("Вы ввели число: " + minute);
                ChooseColor chooseColor = new ChooseColor();
                chooseColor.setMinute(minute);
                chooseColor.chooseColor();
            } else if (minute != 0 & minute > 60) {
                System.out.println("Вы ввели недопустимое число.");
            } else {
                System.out.println("Выход");
            }
        }
    }
}

