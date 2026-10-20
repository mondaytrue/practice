import java.util.Scanner;

public class Practice04 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
        task12();
        task13();
        task14();
        task15();
        task16();
        task17();
        task18();
        task19();
        task20();
        task21();
        task22();
        task23();
        task24();
        task25();
        task26();
        task27();
        task28();
        task29();
        task30();
        task31();
        task32();
        task33();
        task34();
        task35();
        task36();
        task37();
        task38();
        task39();
        task40();

        scanner.close();
    }

    static void task1() {
        for (int i = 0; i < 7; i++) {
            System.out.println("Java - надійна та кросплатформна мова!");
        }
    }

    static void task2() {
        System.out.print("Введіть текст: ");
        String text = scanner.next();
        System.out.print("Введіть N: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("[" + i + "] " + text);
        }
    }

    static void task3() {
        int balance = 0;
        for (int month = 1; month <= 12; month++) {
            balance += 500;
            System.out.println("Місяць " + month + ": " + balance + " грн");
        }
    }

    static void task4() {
        System.out.print("Введіть курс євро: ");
        double rate = scanner.nextDouble();
        for (int euro = 10; euro <= 100; euro += 10) {
            System.out.println(euro + " EUR = " + (euro * rate) + " UAH");
        }
    }

    static void task5() {
        System.out.print("Введіть ширину W: ");
        int w = scanner.nextInt();
        for (int i = 0; i < w; i++) {
            System.out.print("=");
        }
        System.out.println();
    }

    static void task6() {
        int i = 10;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }
        System.out.println("Поїхали! Ракета запущена!");
    }

    static void task7() {
        int sum = 0;
        System.out.print("Введіть число (0 - кінець): ");
        int number = scanner.nextInt();
        while (number != 0) {
            sum += number;
            System.out.print("Введіть число (0 - кінець): ");
            number = scanner.nextInt();
        }
        System.out.println("Сума: " + sum);
    }

    static void task8() {
        System.out.print("Введіть M: ");
        int m = scanner.nextInt();
        long power = 1;
        while (power <= m) {
            System.out.print(power + " ");
            power *= 2;
        }
        System.out.println();
    }

    static void task9() {
        System.out.print("Введіть N: ");
        int n = scanner.nextInt();
        int count = 0;
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
            count++;
        }
        System.out.println("Кількість цифр: " + count);
        System.out.println("Сума цифр: " + sum);
    }

    static void task10() {
        System.out.print("Введіть число: ");
        int n = scanner.nextInt();
        int reversed = 0;
        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        System.out.println("Реверс: " + reversed);
    }

    static void task11() {
        System.out.print("Введіть S: ");
        double s = scanner.nextDouble();
        System.out.print("Введіть P: ");
        double p = scanner.nextDouble();
        double capital = s;
        int years = 0;
        while (capital < 2 * s) {
            capital += capital * p / 100;
            years++;
        }
        System.out.println("Років: " + years);
    }

    static void task12() {
        System.out.print("Введіть N: ");
        int n = scanner.nextInt();
        int d = 2;
        while (n % d != 0) {
            d++;
        }
        System.out.println("Найменший дільник: " + d);
    }

    static void task13() {
        int secret = (int) (Math.random() * 100) + 1;
        int attempts = 0;
        int guess = 0;
        while (guess != secret) {
            System.out.print("Ваша здогадка: ");
            guess = scanner.nextInt();
            attempts++;
            if (guess < secret) {
                System.out.println("Більше!");
            } else if (guess > secret) {
                System.out.println("Менше!");
            }
        }
        System.out.println("Спроб: " + attempts);
    }

    static void task14() {
        int choice;
        do {
            System.out.println("1. Розпочати нову гру");
            System.out.println("2. Завантажити збереження");
            System.out.println("3. Налаштування");
            System.out.println("0. Вихід");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Нова гра");
                    break;
                case 2:
                    System.out.println("Завантаження збереження");
                    break;
                case 3:
                    System.out.println("Налаштування");
                    break;
                case 0:
                    System.out.println("Вихід");
                    break;
                default:
                    System.out.println("Невірний вибір");
            }
        } while (choice != 0);
    }

    static void task15() {
        int age;
        do {
            System.out.print("Введіть вік: ");
            age = scanner.nextInt();
        } while (age < 1 || age > 120);
        System.out.println("Вік підтверджено: " + age);
    }

    static void task16() {
        int attempts = 0;
        boolean access = false;
        do {
            System.out.print("Введіть PIN: ");
            int pin = scanner.nextInt();
            attempts++;
            if (pin == 6767) {
                access = true;
            }
        } while (!access && attempts < 3);
        if (access) {
            System.out.println("Доступ надано");
        } else {
            System.out.println("Карту заблоковано!");
        }
    }

    static void task17() {
        char answer;
        do {
            System.out.print("Введіть два числа: ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println("Сума: " + (a + b));
            System.out.println("Бажаєте продовжити? (y/n)");
            answer = scanner.next().charAt(0);
        } while (answer == 'y');
    }

    static void task18() {
        int attempts = 0;
        int d1;
        int d2;
        do {
            d1 = (int) (Math.random() * 6) + 1;
            d2 = (int) (Math.random() * 6) + 1;
            attempts++;
            System.out.println("Кидок " + attempts + ": " + d1 + " " + d2);
        } while (d1 != d2);
        System.out.println("Кількість спроб: " + attempts);
    }

    static void task19() {
        System.out.print("Введіть чисельник: ");
        int a = scanner.nextInt();
        int b;
        do {
            System.out.print("Введіть знаменник: ");
            b = scanner.nextInt();
        } while (b == 0);
        System.out.println("Результат: " + (double) a / b);
    }

    static void task20() {
        int sum = 0;
        int count = 0;
        int score;
        do {
            System.out.print("Введіть бал: ");
            score = scanner.nextInt();
            if (score > 100) {
                System.out.println("Некоректний бал");
            } else if (score >= 0) {
                sum += score;
                count++;
            }
        } while (score >= 0);
        if (count > 0) {
            System.out.println("Середній бал: " + (double) sum / count);
        }
    }

    static void task21() {
        System.out.print("Введіть A і B: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    static void task22() {
        System.out.print("Введіть N: ");
        int n = scanner.nextInt();
        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        System.out.println(n + "! = " + factorial);
    }

    static void task23() {
        System.out.println("Число\t| Квадрат\t| Куб");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "\t| " + (i * i) + "\t\t| " + (i * i * i));
        }
    }

    static void task24() {
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void task25() {
        for (int i = 100; i <= 200; i++) {
            if (i % 13 == 0 && i % 7 == 0) {
                System.out.println(i);
                break;
            }
        }
    }

    static void task26() {
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.println(c + " " + (int) c);
        }
    }

    static void task27() {
        System.out.print("Введіть N: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                sum += i;
            } else {
                sum -= i;
            }
        }
        System.out.println("S = " + sum);
    }

    static void task28() {
        System.out.print("Введіть a1, d, n: ");
        int a1 = scanner.nextInt();
        int d = scanner.nextInt();
        int n = scanner.nextInt();
        int sum = 0;
        int current = a1;
        for (int i = 1; i <= n; i++) {
            System.out.print(current + " ");
            sum += current;
            current += d;
        }
        System.out.println();
        System.out.println("Сума: " + sum);
    }

    static void task29() {
        byte b = 125;
        for (int i = 1; i <= 6; i++) {
            b = (byte) (b + 1);
            System.out.println(b);
        }
        System.out.println("Максимум byte = 127, після нього значення переходить на -128 (переповнення).");
    }

    static void task30() {
        System.out.print("Скільки чисел? ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += scanner.nextInt();
        }
        double withoutCast = (double) sum / n;
        double withCast = (double) sum / n;
        System.out.println("Без приведення: " + withoutCast);
        System.out.println("З приведенням: " + withCast);
    }

    static void task31() {
        System.out.print("Введіть слово: ");
        String word = scanner.next();
        String result = "";
        for (char ch : word.toCharArray()) {
            result += (char) (ch + 1);
        }
        System.out.println(result);
    }

    static void task32() {
        double[] prices = {19.99, 45.50, 12.10, 99.95, 3.40};
        int hryvnias = 0;
        int kopecks = 0;
        for (double price : prices) {
            int whole = (int) price;
            hryvnias += whole;
            kopecks += (int) Math.round((price - whole) * 100);
        }
        System.out.println("Сума цілих гривень: " + hryvnias);
        System.out.println("Сума копійок: " + kopecks);
    }

    static void task33() {
        for (int i = 1; i <= 50; i++) {
            int percent = (int) (((double) i / 50) * 100);
            System.out.println("Завантажено: " + percent + "%");
        }
    }

    static void task34() {
        long bigNumber = 3_000_000_000L;
        System.out.println((int) bigNumber);
    }

    static void task35() {
        for (double d = 0.0; d <= 1.0; d += 0.1) {
            System.out.println(d);
        }
        for (int i = 0; i <= 10; i++) {
            double val = i / 10.0;
            System.out.println(val);
        }
    }

    static void task36() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print((i * j) + "\t");
            }
            System.out.println();
        }
    }

    static void task37() {
        System.out.print("Введіть H і W: ");
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= w; j++) {
                if (i == 1 || i == h || j == 1 || j == w) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void task38() {
        System.out.print("Введіть N: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void task39() {
        System.out.print("Введіть N: ");
        int n = scanner.nextInt();
        for (int num = 2; num <= n; num++) {
            boolean isPrime = true;
            for (int d = 2; d < num; d++) {
                if (num % d == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    static void task40() {
        System.out.print("Введіть N: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("# ");
                } else {
                    System.out.print("_ ");
                }
            }
        }
    }
}
