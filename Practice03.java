import java.util.Locale;
import java.util.Scanner;

public class Practice03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Завдання 1 ===");
        task1(scanner);
        System.out.println();

        System.out.println("=== Завдання 2 ===");
        task2(scanner);
        scanner.nextLine();
        System.out.println();

        System.out.println("=== Завдання 3 ===");
        task3(scanner);
        scanner.nextLine();
        System.out.println();

        System.out.println("=== Завдання 4 ===");
        task4(scanner);
        System.out.println();

        System.out.println("=== Завдання 5 ===");
        task5(scanner);
        scanner.nextLine();
        System.out.println();

        System.out.println("=== Завдання 6 ===");
        task6(scanner);
        scanner.nextLine();
        System.out.println();

        System.out.println("=== Завдання 7 ===");
        task7(scanner);
        scanner.nextLine();
        System.out.println();

        System.out.println("=== Завдання 8 ===");
        task8(scanner);
        scanner.nextLine();
        System.out.println();

        System.out.println("=== Завдання 9 ===");
        task9(scanner);
        scanner.nextLine();
        System.out.println();

        System.out.println("=== Завдання 10 ===");
        task10(scanner);
        scanner.nextLine();
        System.out.println();

        System.out.println("=== Завдання 11 ===");
        task11(scanner);
        scanner.nextLine();
        System.out.println();

        System.out.println("=== Завдання 12 ===");
        task12(scanner);
        scanner.nextLine();
        System.out.println();

        System.out.println("=== Завдання 13 ===");
        task13(scanner);
        scanner.nextLine();
        System.out.println();

        System.out.println("=== Завдання 14 ===");
        task14(scanner);
        scanner.nextLine();
        System.out.println();

        System.out.println("=== Завдання 15 ===");
        task15();
        System.out.println();

        System.out.println("=== Завдання 16 ===");
        task16(scanner);
        scanner.nextLine();
        System.out.println();

        System.out.println("=== Завдання 17 ===");
        task17(scanner);
        scanner.nextLine();
        System.out.println();

        System.out.println("=== Завдання 18 ===");
        task18(scanner);
        scanner.nextLine();
        System.out.println();

        System.out.println("=== Завдання 19 ===");
        task19(scanner);
        scanner.nextLine();
        System.out.println();

        System.out.println("=== Завдання 20 ===");
        task20(scanner);
        scanner.nextLine();
        System.out.println();

        System.out.println("=== Завдання 21 ===");
        task21(scanner);
        scanner.nextLine();
        System.out.println();

        System.out.println("=== Завдання 22 ===");
        task22(scanner);
        scanner.nextLine();
        System.out.println();

        System.out.println("=== Завдання 23 ===");
        task23(scanner);
        scanner.nextLine();
        System.out.println();

        System.out.println("=== Завдання 24 ===");
        task24(scanner);
        scanner.nextLine();
        System.out.println();

        System.out.println("=== Завдання 25 ===");
        task25();
        System.out.println();

        System.out.println("=== Завдання 26 ===");
        task26();
        System.out.println();

        System.out.println("=== Завдання 27 ===");
        task27();
        System.out.println();

        System.out.println("=== Завдання 28 ===");
        task28();
        System.out.println();

        System.out.println("=== Завдання 29 ===");
        task29(scanner);
        scanner.nextLine();
        System.out.println();

        System.out.println("=== Завдання 30 ===");
        task30(scanner);
        scanner.nextLine();
        System.out.println();

        System.out.println("=== Завдання 31 ===");
        task31(scanner);
        scanner.nextLine();
        System.out.println();

        System.out.println("=== Завдання 32 ===");
        task32(scanner);
        scanner.nextLine();
        System.out.println();

        System.out.println("=== Завдання 33 ===");
        task33(scanner);
        scanner.nextLine();
        System.out.println();

        System.out.println("=== Завдання 34 ===");
        task34(scanner);
        scanner.nextLine();
        System.out.println();

        System.out.println("=== Завдання 35 ===");
        task35(scanner);
        scanner.nextLine();
        System.out.println();

        System.out.println("=== Завдання 36 ===");
        task36(scanner);
        System.out.println();

        System.out.println("=== Завдання 37 ===");
        task37(scanner);
        scanner.nextLine();
        System.out.println();

        System.out.println("=== Завдання 38 ===");
        task38(scanner);
        scanner.nextLine();
        System.out.println();

        System.out.println("=== Завдання 39 ===");
        task39(scanner);
        System.out.println();

        System.out.println("=== Завдання 40 ===");
        task40(scanner);
        scanner.nextLine();
        System.out.println();

        scanner.close();
    }


    static void task1(Scanner scanner) {
        System.out.print("Введіть ім'я: ");
        String name = scanner.nextLine();
        System.out.print("Введіть прізвище: ");
        String surname = scanner.nextLine();
        System.out.print("Введіть вік: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введіть місто: ");
        String city = scanner.nextLine();

        System.out.println("=== ВХІДНІ ДАНІ ===");
        System.out.println("Ім'я: " + name);
        System.out.println("Прізвище: " + surname);
        System.out.println("Вік: " + age);
        System.out.println("Місто: " + city);
        System.out.println("-------------------");
        System.out.println("Привіт, " + name + " " + surname + " з міста " + city + "! Твій вік: " + age + " р.");
    }

    static void task2(Scanner scanner) {
        System.out.print("Введіть перше число: ");
        int a = scanner.nextInt();
        System.out.print("Введіть друге число: ");
        int b = scanner.nextInt();

        System.out.println("Сума: " + (a + b));
        System.out.println("Різниця: " + (a - b));
        System.out.println("Добуток: " + (a * b));
        System.out.println("Остача від ділення: " + (a % b));
    }

    static void task3(Scanner scanner) {
        System.out.print("Введіть суму в гривнях (UAH): ");
        double uah = scanner.nextDouble();
        System.out.print("Введіть курс USD: ");
        double rate = scanner.nextDouble();

        double usd = uah / rate;
        double rounded = Math.round(usd * 100) / 100.0;
        System.out.println("Сума до видачі: " + rounded + " USD");
    }

    static void task4(Scanner scanner) {
        System.out.print("Введіть номер квитка: ");
        int ticket = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введіть повне ім'я студента: ");
        String fullName = scanner.nextLine();
        System.out.print("Введіть спеціальність: ");
        String speciality = scanner.nextLine();

        System.out.println("Студент: " + fullName + ", квиток №" + ticket + ", спеціальність: " + speciality);
    }

    static void task5(Scanner scanner) {
        System.out.print("Ваш зріст (м): ");
        double height = scanner.nextDouble();
        System.out.print("Ваша вага (кг): ");
        double weight = scanner.nextDouble();

        double bmi = weight / (height * height);
        System.out.printf("Розрахований BMI: %.2f%n", bmi);
    }

    static void task6(Scanner scanner) {
        System.out.print("Введіть символ: ");
        char ch = scanner.next().charAt(0);
        System.out.println("Символ: " + ch + " | Код символу: " + (int) ch);
    }

    static void task7(Scanner scanner) {
        System.out.print("Катет A: ");
        double a = scanner.nextDouble();
        System.out.print("Катет B: ");
        double b = scanner.nextDouble();

        double hypotenuse = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        double perimeter = a + b + hypotenuse;
        double area = a * b / 2;

        System.out.println("Гіпотенуза: " + hypotenuse);
        System.out.println("Периметр: " + perimeter);
        System.out.println("Площа: " + area);
    }

    static void task8(Scanner scanner) {
        System.out.print("Товар: ");
        String product = scanner.nextLine();
        System.out.print("Ціна: ");
        double price = scanner.nextDouble();
        System.out.print("Кількість: ");
        int count = scanner.nextInt();

        double total = price * count;
        double vat = total * 0.2;
        System.out.println("Товар: " + product);
        System.out.println("Загальна сума: " + total + " грн (з них ПДВ 20%: " + vat + " грн)");
    }


    static void task9(Scanner scanner) {
        System.out.print("Введіть число: ");
        int n = scanner.nextInt();

        if (n > 0) {
            System.out.println("Число додатне.");
        } else if (n < 0) {
            System.out.println("Число від'ємне.");
        } else {
            System.out.println("Число дорівнює нулю.");
        }
    }

    static void task10(Scanner scanner) {
        System.out.print("Введіть число: ");
        int number = scanner.nextInt();

        if (number == 0) {
            System.out.println("Число є нулем");
        } else if (number % 2 == 0) {
            System.out.println("Число " + number + " є парним.");
        } else {
            System.out.println("Число " + number + " є непарним.");
        }
    }

    static void task11(Scanner scanner) {
        System.out.print("Введіть вік: ");
        int age = scanner.nextInt();

        if (age < 0 || age > 120) {
            System.out.println("Некоректний вік");
        } else if (age <= 12) {
            System.out.println("Дитина");
        } else if (age <= 17) {
            System.out.println("Підліток");
        } else if (age <= 64) {
            System.out.println("Дорослий");
        } else {
            System.out.println("Пенсіонер");
        }
    }

    static void task12(Scanner scanner) {
        System.out.print("Введіть бал (0-100): ");
        int score = scanner.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("Помилка: некоректний бал!");
        } else if (score >= 90) {
            System.out.println("Відмінно (A)");
        } else if (score >= 82) {
            System.out.println("Дуже добре (B)");
        } else if (score >= 74) {
            System.out.println("Добре (C)");
        } else if (score >= 64) {
            System.out.println("Задовільно (D)");
        } else if (score >= 60) {
            System.out.println("Достатньо (E)");
        } else {
            System.out.println("Незадовільно (F)");
        }
    }

    static void task13(Scanner scanner) {
        System.out.print("Введіть 3 числа: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }

        System.out.println("Максимум: " + max);
        System.out.println("Мінімум: " + min);
    }

    static void task14(Scanner scanner) {
        System.out.print("Введіть X: ");
        double x = scanner.nextDouble();
        System.out.print("Введіть Y: ");
        double y = scanner.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("Точка (" + x + "; " + y + ") — початок координат.");
        } else if (x == 0 || y == 0) {
            System.out.println("Точка (" + x + "; " + y + ") лежить на осі координат.");
        } else if (x > 0 && y > 0) {
            System.out.println("Точка (" + x + "; " + y + ") знаходиться у I чверті.");
        } else if (x < 0 && y > 0) {
            System.out.println("Точка (" + x + "; " + y + ") знаходиться у II чверті.");
        } else if (x < 0 && y < 0) {
            System.out.println("Точка (" + x + "; " + y + ") знаходиться у III чверті.");
        } else {
            System.out.println("Точка (" + x + "; " + y + ") знаходиться у IV чверті.");
        }
    }

    static void task15() {
        int x = 5;
        int y = 20;

        System.out.println("--- Варіант БЕЗ фігурних дужок ---");
        if (x > 10)
            if (y > 10)
                System.out.println("x > 10 та y > 10");
        else
            System.out.println("else (насправді належить до if (y > 10))");
        System.out.println("(без дужок нічого не виведено, бо x > 10 хибне)");

        System.out.println("--- Варіант З фігурними дужками ---");
        if (x > 10) {
            if (y > 10) {
                System.out.println("x > 10 та y > 10");
            }
        } else {
            System.out.println("x <= 10 (else належить до зовнішнього if)");
        }
    }

    static void task16(Scanner scanner) {
        System.out.print("Спожито (кВт·год): ");
        double kwh = scanner.nextDouble();

        double sum;
        if (kwh <= 100) {
            sum = kwh * 2.64;
            System.out.println("Сума до сплати: " + kwh + " * 2.64 = " + sum + " грн");
        } else {
            double extra = kwh - 100;
            sum = 100 * 2.64 + extra * 4.32;
            System.out.println("Сума до сплати: 100 * 2.64 + " + extra + " * 4.32 = " + sum + " грн");
        }
    }


    static void task17(Scanner scanner) {
        System.out.print("Введіть x: ");
        int x = scanner.nextInt();
        System.out.print("Введіть y: ");
        int y = scanner.nextInt();

        int max = (x > y) ? x : y;
        System.out.println("Більше число: " + max);
    }

    static void task18(Scanner scanner) {
        System.out.print("Введіть n: ");
        int n = scanner.nextInt();

        int abs = (n < 0) ? -n : n;
        System.out.println("|" + n + "| = " + abs);
    }

    static void task19(Scanner scanner) {
        System.out.print("Введіть число: ");
        int number = scanner.nextInt();

        String result = (number % 2 == 0) ? "Парне" : "Непарне";
        System.out.println(result);
    }

    static void task20(Scanner scanner) {
        System.out.print("Введіть бал: ");
        int score = scanner.nextInt();

        System.out.println("Результат: " + (score >= 60 ? "Зараховано" : "Незараховано"));
    }

    static void task21(Scanner scanner) {
        System.out.print("Введіть число: ");
        int n = scanner.nextInt();

        String status = (n > 0) ? "Додатне" : (n < 0) ? "Від'ємне" : "Нуль";
        System.out.println(status);
    }

    static void task22(Scanner scanner) {
        System.out.print("Сума покупки: ");
        double sum = scanner.nextDouble();

        double toPay = (sum > 1000) ? sum * 0.9 : sum * 0.98;
        System.out.println("До сплати зі знижкою: " + toPay + " грн");
    }

    static void task23(Scanner scanner) {
        System.out.print("Введіть ділене a: ");
        int a = scanner.nextInt();
        System.out.print("Введіть дільник b: ");
        int b = scanner.nextInt();

        String result = (b != 0) ? String.valueOf((double) a / b) : "Помилка: ділення на нуль неможливе!";
        System.out.println(result);
    }

    static void task24(Scanner scanner) {
        System.out.print("Кількість знайдених помилок: ");
        int count = scanner.nextInt();

        String message = (count == 1) ? "Знайдено 1 помилку" : "Знайдено " + count + " помилок";
        System.out.println(message);
    }


    static void task25() {
        int x = 10;
        int divisor = 0;

        if (divisor != 0 && (x / divisor > 1))
            System.out.println("Успішне ділення");
        else {
            System.out.println("Ділення безпечно пропущено завдяки short-circuit!");
        }
    }

    static void task26() {
        int counter1 = 0;
        int counter2 = 0;

        boolean b1 = false && (++counter1 > 0);
        boolean b2 = false & (++counter2 > 0);

        System.out.println("counter1 (&&) = " + counter1);
        System.out.println("counter2 (&)  = " + counter2);
        System.out.println("b1 = " + b1 + ", b2 = " + b2);
    }

    static void task27() {
        int number = 5;

        if (number > 0 || (10 / 0 == 0)) {
            System.out.println("Умова виконана, аварійне ділення не викликалося!");
        }
    }

    static void task28() {
        int counterA = 0;
        int counterB = 0;

        boolean test1 = true || (++counterA > 0);
        boolean test2 = true | (++counterB > 0);

        System.out.println("counterA (||) = " + counterA);
        System.out.println("counterB (|)  = " + counterB);
        System.out.println("test1 = " + test1 + ", test2 = " + test2);
    }

    static void task29(Scanner scanner) {
        System.out.print("Введіть години (0-23): ");
        int hours = scanner.nextInt();
        System.out.print("Введіть хвилини (0-59): ");
        int minutes = scanner.nextInt();

        boolean isValidTime = (hours >= 0 && hours <= 23) && (minutes >= 0 && minutes <= 59);
        if (isValidTime) {
            System.out.printf("Час: %02d:%02d%n", hours, minutes);
        } else {
            System.out.println("Помилка: некоректний час!");
        }
    }

    static void task30(Scanner scanner) {
        System.out.print("Введіть сторони a b c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        boolean exists = (a + b > c) && (a + c > b) && (b + c > a);
        System.out.println("Трикутник існує: " + exists);
    }

    static void task31(Scanner scanner) {
        System.out.print("Введіть число n: ");
        int n = scanner.nextInt();

        boolean isEvenBitwise = (n & 1) == 0;
        boolean isEvenMod = n % 2 == 0;
        System.out.println("Через (n & 1) == 0: " + isEvenBitwise);
        System.out.println("Через n % 2 == 0:   " + isEvenMod);
        System.out.println("Побітове І з числом 1 залишає лише останній біт числа: "
                + "якщо він 0 — число парне, якщо 1 — непарне. Результат n & 1 = " + (n & 1));
    }

    static void task32(Scanner scanner) {
        System.out.print("PIN-код правильний? (true/false): ");
        boolean isPinCorrect = scanner.nextBoolean();
        System.out.print("Картка активна? (true/false): ");
        boolean isCardActive = scanner.nextBoolean();
        System.out.print("Баланс: ");
        double balance = scanner.nextDouble();
        System.out.print("Сума зняття: ");
        double amount = scanner.nextDouble();
        System.out.print("Добовий ліміт перевищено? (true/false): ");
        boolean isDailyLimitExceeded = scanner.nextBoolean();

        boolean hasSufficientBalance = balance >= amount;

        if (isPinCorrect && isCardActive && hasSufficientBalance && !isDailyLimitExceeded) {
            System.out.println("Транзакцію дозволено.");
        } else {
            System.out.println("Транзакцію відхилено.");
        }
    }


    static void task33(Scanner scanner) {
        System.out.print("Введіть номер дня (1-7): ");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Понеділок");
                break;
            case 2:
                System.out.println("Вівторок");
                break;
            case 3:
                System.out.println("Середа");
                break;
            case 4:
                System.out.println("Четвер");
                break;
            case 5:
                System.out.println("П'ятниця");
                break;
            case 6:
                System.out.println("Субота");
                break;
            case 7:
                System.out.println("Неділя");
                break;
            default:
                System.out.println("Некоректний номер дня");
                break;
        }
    }

    static void task34(Scanner scanner) {
        System.out.print("Введіть номер дня (1-7): ");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Будній (робочий) день");
                break;
            case 6:
            case 7:
                System.out.println("Вихідний день");
                break;
            default:
                System.out.println("Некоректний номер дня");
                break;
        }
    }

    static void task35(Scanner scanner) {
        System.out.print("Введіть номер місяця (1-12): ");
        int month = scanner.nextInt();

        int days = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28;
            default -> 0;
        };

        if (days == 0) {
            System.out.println("Такого місяця не існує!");
        } else {
            System.out.println("Кількість днів у місяці: " + days);
        }
    }

    static void task36(Scanner scanner) {
        System.out.print("Введіть місяць: ");
        String month = scanner.nextLine().toLowerCase();

        String season = switch (month) {
            case "грудень", "січень", "лютий" -> "Зима";
            case "березень", "квітень", "травень" -> "Весна";
            case "червень", "липень", "серпень" -> "Літо";
            case "вересень", "жовтень", "листопад" -> "Осінь";
            default -> "Невідомий місяць";
        };
        System.out.println("Пора року: " + season);
    }

    static void task37(Scanner scanner) {
        System.out.print("Спосіб доставки (1 - Самовивіз, 2 - Кур'єр, 3 - Поштомат): ");
        int delivery = scanner.nextInt();
        System.out.print("Вага товару (кг): ");
        double weight = scanner.nextDouble();

        int price = switch (delivery) {
            case 1 -> 0;
            case 2 -> {
                if (weight > 5) {
                    yield 150;
                } else {
                    yield 90;
                }
            }
            case 3 -> 60;
            default -> -1;
        };

        if (price == -1) {
            System.out.println("Некоректний вибір доставки (-1 грн)");
        } else {
            System.out.println("Вартість доставки: " + price + " грн");
        }
    }

    static void task38(Scanner scanner) {
        System.out.print("Число 1: ");
        double a = scanner.nextDouble();
        System.out.print("Оберіть операцію (+, -, *, /): ");
        char op = scanner.next().charAt(0);
        System.out.print("Число 2: ");
        double b = scanner.nextDouble();

        String result = switch (op) {
            case '+' -> String.valueOf(a + b);
            case '-' -> String.valueOf(a - b);
            case '*' -> String.valueOf(a * b);
            case '/' -> {
                if (b == 0) {
                    yield "Помилка: ділення на нуль неможливе!";
                }
                yield String.valueOf(a / b);
            }
            default -> "Невідома операція!";
        };
        System.out.println("Результат: " + result);
    }

    static void task39(Scanner scanner) {
        System.out.print("Введіть команду (start, pause, stop, exit): ");
        String command = scanner.nextLine();

        System.out.println("command == \"start\" : " + (command == "start"));

        System.out.println("command.equalsIgnoreCase(\"start\") : " + command.equalsIgnoreCase("start"));

        switch (command.toLowerCase()) {
            case "start" -> System.out.println("Система успішно запущена!");
            case "pause" -> System.out.println("Система на паузі.");
            case "stop" -> System.out.println("Систему зупинено.");
            case "exit" -> System.out.println("Вихід із програми.");
            default -> System.out.println("Невідома команда!");
        }
    }

    static void task40(Scanner scanner) {
        System.out.println("================ БАНКОМАТ ================");
        System.out.print("Введіть PIN: ");
        int pin = scanner.nextInt();

        if (pin == 1234) {
            System.out.println("Авторизація успішна!");
        } else {
            System.out.println("Невірний PIN-код. Роботу завершено.");
            return;
        }

        double balance = 5000.0;
        boolean working = true;

        while (working) {
            System.out.println();
            System.out.print("Оберіть дію (1 - Баланс, 2 - Поповнення, 3 - Зняття, 4 - Вихід): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> System.out.println("Ваш баланс: " + balance + " грн");
                case 2 -> {
                    System.out.print("Введіть суму поповнення: ");
                    double deposit = scanner.nextDouble();
                    if (deposit > 0) {
                        balance = balance + deposit;
                        System.out.println("Рахунок поповнено. Баланс: " + balance + " грн");
                    } else {
                        System.out.println("Сума має бути більшою за 0!");
                    }
                }
                case 3 -> {
                    System.out.print("Введіть суму зняття: ");
                    double amount = scanner.nextDouble();
                    if (amount > 0 && amount <= balance) {
                        double commission = (amount > 1000) ? amount * 0.01 : 0;
                        if (amount + commission <= balance) {
                            balance = balance - amount - commission;
                            System.out.println("Комісія операції: " + commission + " грн");
                            System.out.println("Видано: " + amount + " грн. Залишок на рахунку: " + balance + " грн");
                        } else {
                            System.out.println("Недостатньо коштів з урахуванням комісії (" + commission + " грн)!");
                        }
                    } else {
                        System.out.println("Некоректна сума або недостатньо коштів!");
                    }
                }
                case 4 -> {
                    System.out.println("Дякуємо, що скористалися банкоматом!");
                    working = false;
                }
                default -> System.out.println("Невідома дія!");
            }
        }
        System.out.println("==========================================");
    }
}
