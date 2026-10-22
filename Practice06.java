public class Practice06 {
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
    }

    static void task1() {
        Task1 s1 = new Task1();
        s1.name = "Денис";
        s1.age = 19;
        s1.gpa = 4.75;
        System.out.println("Завдання 1: " + s1.name + ", " + s1.age + ", " + s1.gpa);
    }

    static void task2() {
        Task2 car1 = new Task2();
        Task2 car2 = new Task2();
        car1.brand = "Toyota";
        car1.model = "Camry";
        car1.year = 2021;
        car1.speed = 180;
        car2.brand = "BMW";
        car2.model = "M5";
        car2.year = 2023;
        car2.speed = 250;
        System.out.println("Завдання 2: " + car1.brand + " " + car1.model + " " + car1.year + " " + car1.speed);
        System.out.println(car2.brand + " " + car2.model + " " + car2.year + " " + car2.speed);
        if (car1.year > car2.year) {
            System.out.println("Новіший: " + car1.brand);
        } else if (car2.year > car1.year) {
            System.out.println("Новіший: " + car2.brand);
        } else {
            System.out.println("Однаковий рік випуску");
        }
    }

    static void task3() {
        Task3 emptyBook = new Task3();
        System.out.println("Завдання 3: " + emptyBook.title + ", " + emptyBook.author + ", " + emptyBook.pages + ", " + emptyBook.isRead);
    }

    static void task4() {
        Task4 rectangle = new Task4();
        double area;
        double perimeter;
        rectangle.width = 7.5;
        rectangle.height = 4.0;
        area = rectangle.width * rectangle.height;
        perimeter = 2 * (rectangle.width + rectangle.height);
        System.out.println("Завдання 4: площа = " + area + ", периметр = " + perimeter);
    }

    static void task5() {
        Task5 product = new Task5();
        double total;
        product.name = "Монітор";
        product.price = 6500.0;
        product.quantity = 8;
        total = product.price * product.quantity;
        System.out.println("Завдання 5: " + product.name + ", вартість партії: " + total + " грн");
    }

    static void task6() {
        Task6 phone = new Task6();
        phone.model = "Phone";
        phone.batteryLevel = 100;
        phone.isTurnedOn = true;
        phone.batteryLevel -= 35;
        if (phone.batteryLevel <= 0) {
            phone.isTurnedOn = false;
        }
        System.out.println("Завдання 6: " + phone.model + ", заряд: " + phone.batteryLevel + "%, увімкнено: " + phone.isTurnedOn);
    }

    static void task7() {
        Task7 a = new Task7();
        Task7 b = new Task7();
        double d;
        a.x = 0;
        a.y = 0;
        b.x = 3;
        b.y = 4;
        d = Math.sqrt(Math.pow(b.x - a.x, 2) + Math.pow(b.y - a.y, 2));
        System.out.println("Завдання 7: відстань = " + d);
    }

    static void task8() {
        Task1 first = new Task1();
        Task1 second;
        first.name = "Іван";
        second = first;
        second.name = "Петро";
        System.out.println("Завдання 8: " + first.name);
    }

    static void task9() {
        Task9 greeter = new Task9();
        System.out.println("Завдання 9:");
        greeter.sayHello();
        greeter.sayHelloTo("Олена");
    }

    static void task10() {
        Task10 cat = new Task10();
        Task10 dog = new Task10();
        cat.species = "Кіт";
        cat.name = "Мурка";
        dog.species = "Собака";
        dog.name = "Рекс";
        System.out.println("Завдання 10:");
        cat.makeSound();
        cat.printInfo();
        dog.makeSound();
        dog.printInfo();
    }

    static void task11() {
        Task11 counter = new Task11();
        System.out.println("Завдання 11:");
        counter.increment();
        counter.increment();
        counter.increment();
        counter.decrement();
        counter.printCount();
        counter.reset();
        counter.printCount();
    }

    static void task12() {
        Task12 light = new Task12();
        System.out.println("Завдання 12:");
        light.changeColor("Червоний");
        light.showSignal();
        light.changeColor("Жовтий");
        light.showSignal();
        light.changeColor("Зелений");
        light.showSignal();
    }

    static void task13() {
        Task13 player = new Task13();
        player.nickname = "Hero";
        System.out.println("Завдання 13:");
        player.takeDamage(40);
        System.out.println("Здоров'я: " + player.health);
        player.heal(20);
        System.out.println("Здоров'я: " + player.health);
        player.heal(100);
        System.out.println("Здоров'я: " + player.health);
        player.takeDamage(150);
        System.out.println("Здоров'я: " + player.health);
    }

    static void task14() {
        Task14 lamp = new Task14();
        System.out.println("Завдання 14:");
        lamp.turnOn();
        lamp.status();
        lamp.toggle();
        lamp.status();
        lamp.toggle();
        lamp.status();
        lamp.turnOff();
        lamp.status();
    }

    static void task15() {
        Task15 stopwatch = new Task15();
        System.out.println("Завдання 15:");
        stopwatch.tick();
        stopwatch.addSeconds(124);
        stopwatch.displayTime();
    }

    static void task16() {
        Task16 printer = new Task16();
        printer.model = "HP LaserJet";
        printer.paperCount = 10;
        System.out.println("Завдання 16:");
        printer.printDocument("Звіт", 6);
        printer.printDocument("Реферат", 6);
    }

    static void task17() {
        Task17 calc = new Task17();
        int sum = calc.add(10, 5);
        int difference = calc.subtract(10, 5);
        int product = calc.multiply(10, 5);
        double quotient = calc.divide(10, 4);
        double zeroDivision = calc.divide(10, 0);
        System.out.println("Завдання 17: " + sum + ", " + difference + ", " + product + ", " + quotient + ", " + zeroDivision);
    }

    static void task18() {
        Task18 circle = new Task18();
        circle.radius = 5.0;
        System.out.println("Завдання 18: площа = " + circle.getArea() + ", довжина кола = " + circle.getCircumference());
    }

    static void task19() {
        Task19 converter = new Task19();
        double f = converter.celsiusToFahrenheit(25);
        double c = converter.fahrenheitToCelsius(f);
        System.out.println("Завдання 19: 25°C = " + f + "°F, назад = " + c + "°C");
    }

    static void task20() {
        Task20 checker = new Task20();
        System.out.println("Завдання 20:");
        System.out.println(7 + ": парне=" + checker.isEven(7) + ", додатне=" + checker.isPositive(7) + ", просте=" + checker.isPrime(7));
        System.out.println(12 + ": парне=" + checker.isEven(12) + ", додатне=" + checker.isPositive(12) + ", просте=" + checker.isPrime(12));
        System.out.println(-5 + ": парне=" + checker.isEven(-5) + ", додатне=" + checker.isPositive(-5) + ", просте=" + checker.isPrime(-5));
    }

    static void task21() {
        Task21 exchange = new Task21();
        double usd;
        exchange.usdRate = 41.5;
        usd = exchange.toUSD(10000);
        System.out.println("Завдання 21: 10000 грн = " + Math.round(usd * 100) / 100.0 + " USD");
    }

    static void task22() {
        Task22 employee = new Task22();
        employee.name = "Андрій";
        employee.baseSalary = 30000;
        employee.bonusPercentage = 15;
        System.out.println("Завдання 22: " + employee.name + ", зарплата: " + employee.calculateTotalSalary() + " грн, податок: " + employee.calculateTax() + " грн");
    }

    static void task23() {
        Task23 formatter = new Task23();
        System.out.println("Завдання 23: " + formatter.formatTitle("програмування") + ", голосних: " + formatter.countVowels("програмування"));
    }

    static void task24() {
        Task24 triangle = new Task24();
        triangle.a = 3;
        triangle.b = 4;
        triangle.c = 5;
        System.out.println("Завдання 24: валідний=" + triangle.isValid() + ", периметр=" + triangle.getPerimeter() + ", площа=" + triangle.getArea());
    }

    static void task25() {
        Task25 vault = new Task25();
        System.out.println("Завдання 25: " + vault.verifyCode("hacked") + ", " + vault.verifyCode("Pass123"));
    }

    static void task26() {
        Task26 account = new Task26();
        account.setCredentials("admin", "1111");
        System.out.println("Завдання 26: " + account.login("admin", "1111"));
        account.changePassword("0000", "2222");
        account.changePassword("1111", "2222");
        System.out.println(account.login("admin", "2222"));
    }

    static void task27() {
        Task27 account = new Task27("UA001");
        account.deposit(1000);
        account.deposit(-50);
        System.out.println("Завдання 27: " + account.withdraw(1500) + ", баланс: " + account.getBalance());
        System.out.println(account.withdraw(400) + ", баланс: " + account.getBalance());
    }

    static void task28() {
        Task28 thermometer = new Task28();
        System.out.println("Завдання 28:");
        thermometer.setTemperature(22.5);
        System.out.println(thermometer.getTemperature());
        thermometer.setTemperature(-300);
        System.out.println(thermometer.getTemperature());
    }

    static void task29() {
        Task29 speedometer = new Task29();
        System.out.println("Завдання 29:");
        speedometer.accelerate(200);
        System.out.println(speedometer.getSpeed());
        speedometer.accelerate(100);
        System.out.println(speedometer.getSpeed());
        speedometer.brake(100);
        System.out.println(speedometer.getSpeed());
        speedometer.brake(500);
        System.out.println(speedometer.getSpeed());
    }

    static void task30() {
        Task30 person1 = new Task30();
        Task30 person2 = new Task30();
        person1.setName("Олег");
        person1.setAge(25);
        person2.setName("Ірина");
        person2.setAge(150);
        System.out.println("Завдання 30:");
        person1.printSummary();
        person2.printSummary();
    }

    static void task31() {
        Task31 card = new Task31("Марія");
        System.out.println("Завдання 31:");
        card.addPurchase(3000);
        card.printCardInfo();
        card.addPurchase(4000);
        card.printCardInfo();
        card.addPurchase(5000);
        card.printCardInfo();
    }

    static void task32() {
        Task32 lock = new Task32();
        System.out.println("Завдання 32:");
        lock.enterPin(1111);
        lock.enterPin(2222);
        lock.enterPin(3333);
        lock.enterPin(1234);
    }

    static void task33() {
        Task33 book = new Task33();
        int[] grades = {85, 92, 78, 96, 65};
        book.setData("Денис", grades);
        System.out.println("Завдання 33: " + book.getStudentName() + ", середній=" + book.getAverage() + ", макс=" + book.getHighestGrade() + ", мін=" + book.getLowestGrade());
    }

    static void task34() {
        Task34 stats = new Task34();
        int[] numbers = {4, 7, 12, 3, 8, 15, 22, 9, 10, 1};
        stats.setNumbers(numbers);
        System.out.println("Завдання 34: парних=" + stats.countEvens() + ", непарних=" + stats.countOdds() + ", сума=" + stats.calculateSum());
    }

    static void task35() {
        Task35 cart = new Task35();
        cart.addItem(120.0);
        cart.addItem(80.5);
        cart.addItem(45.0);
        System.out.println("Завдання 35:");
        cart.printReceipt();
        cart.applyDiscount(15);
        cart.printReceipt();
    }

    static void task36() {
        Task36 tracker = new Task36();
        double[] temps = {18.5, 21.0, 23.4, 19.8, 25.1, 24.0, 17.2};
        tracker.setTemps(temps);
        System.out.println("Завдання 36: днів вище 20: " + tracker.countDaysAbove(20));
        tracker.printWeeklyReport();
    }

    static void task37() {
        Task37 searcher = new Task37();
        int[] data = {5, 10, 15, 20, 25};
        searcher.setData(data);
        System.out.println("Завдання 37: " + searcher.contains(15) + ", " + searcher.findIndex(15));
        System.out.println(searcher.contains(99) + ", " + searcher.findIndex(99));
    }

    static void task38() {
        Task38 vector = new Task38();
        vector.setCoords(2, 3, 6);
        System.out.println("Завдання 38: довжина = " + vector.getMagnitude());
        vector.multiplyByScalar(2);
        vector.printVector();
    }

    static void task39() {
        Task39 matrix = new Task39();
        int[][] grid = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        matrix.setGrid(grid);
        System.out.println("Завдання 39:");
        matrix.printMatrix();
        System.out.println("Сума: " + matrix.getTotalSum());
        System.out.println("Сума рядка 1: " + matrix.getRowSum(1));
    }

    static void task40() {
        Task40 diagonals = new Task40();
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        diagonals.setMatrix(matrix);
        System.out.println("Завдання 40: головна=" + diagonals.getMainDiagonalSum() + ", побічна=" + diagonals.getAntiDiagonalSum() + ", симетричні=" + diagonals.isDiagonalSymmetric());
    }

    static class Task1 {
        public String name;
        public int age;
        public double gpa;
    }

    static class Task2 {
        public String brand;
        public String model;
        public int year;
        public int speed;
    }

    static class Task3 {
        public String title;
        public String author;
        public int pages;
        public boolean isRead;
    }

    static class Task4 {
        public double width;
        public double height;
    }

    static class Task5 {
        public String name;
        public double price;
        public int quantity;
    }

    static class Task6 {
        public String model;
        public int batteryLevel;
        public boolean isTurnedOn;
    }

    static class Task7 {
        public double x;
        public double y;
    }

    static class Task9 {
        public void sayHello() {
            System.out.println("Привіт усім!");
        }

        public void sayHelloTo(String name) {
            System.out.println("Привіт, " + name + "! Раді тебе бачити.");
        }
    }

    static class Task10 {
        public String species;
        public String name;

        public void makeSound() {
            System.out.println(name + " видає звук!");
        }

        public void printInfo() {
            System.out.println("Вид: " + species + ", кличка: " + name);
        }
    }

    static class Task11 {
        public int count;

        public void increment() {
            count++;
        }

        public void decrement() {
            count--;
        }

        public void reset() {
            count = 0;
        }

        public void printCount() {
            System.out.println("Лічильник: " + count);
        }
    }

    static class Task12 {
        public String currentColor;

        public void changeColor(String newColor) {
            currentColor = newColor;
        }

        public void showSignal() {
            if (currentColor.equals("Червоний")) {
                System.out.println("Стій!");
            } else if (currentColor.equals("Жовтий")) {
                System.out.println("Увага!");
            } else if (currentColor.equals("Зелений")) {
                System.out.println("Їдь!");
            }
        }
    }

    static class Task13 {
        public String nickname;
        public int health = 100;

        public void takeDamage(int damage) {
            health -= damage;
            if (health < 0) {
                health = 0;
                System.out.println(nickname + " загинув!");
            }
        }

        public void heal(int amount) {
            health += amount;
            if (health > 100) {
                health = 100;
            }
        }
    }

    static class Task14 {
        public boolean isOn;

        public void turnOn() {
            isOn = true;
        }

        public void turnOff() {
            isOn = false;
        }

        public void toggle() {
            isOn = !isOn;
        }

        public void status() {
            if (isOn) {
                System.out.println("Лампа світить");
            } else {
                System.out.println("Лампа вимкнена");
            }
        }
    }

    static class Task15 {
        public int seconds;

        public void tick() {
            seconds++;
        }

        public void addSeconds(int s) {
            seconds += s;
        }

        public void displayTime() {
            int minutes = seconds / 60;
            int secs = seconds % 60;
            String result = "";
            if (minutes < 10) {
                result += "0";
            }
            result += minutes + ":";
            if (secs < 10) {
                result += "0";
            }
            result += secs;
            System.out.println(result);
        }
    }

    static class Task16 {
        public String model;
        public int paperCount;

        public void printDocument(String title, int pages) {
            if (paperCount >= pages) {
                paperCount -= pages;
                System.out.println("Документ \"" + title + "\" надруковано (" + pages + " стор.)");
            } else {
                System.out.println("Помилка: Недостатньо паперу в принтері " + model + "!");
            }
        }
    }

    static class Task17 {
        public int add(int a, int b) {
            return a + b;
        }

        public int subtract(int a, int b) {
            return a - b;
        }

        public int multiply(int a, int b) {
            return a * b;
        }

        public double divide(int a, int b) {
            if (b == 0) {
                System.out.println("Помилка: ділення на нуль");
                return 0.0;
            }
            return (double) a / b;
        }
    }

    static class Task18 {
        public double radius;

        public double getArea() {
            return Math.PI * radius * radius;
        }

        public double getCircumference() {
            return 2 * Math.PI * radius;
        }
    }

    static class Task19 {
        public double celsiusToFahrenheit(double c) {
            return c * 1.8 + 32;
        }

        public double fahrenheitToCelsius(double f) {
            return (f - 32) / 1.8;
        }
    }

    static class Task20 {
        public boolean isEven(int n) {
            return n % 2 == 0;
        }

        public boolean isPositive(int n) {
            return n > 0;
        }

        public boolean isPrime(int n) {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    static class Task21 {
        public double usdRate;

        public double toUSD(double uah) {
            return uah / usdRate;
        }

        public double toUAH(double usd) {
            return usd * usdRate;
        }
    }

    static class Task22 {
        public String name;
        public double baseSalary;
        public double bonusPercentage;

        public double calculateTotalSalary() {
            return baseSalary * (1 + bonusPercentage / 100);
        }

        public double calculateTax() {
            return calculateTotalSalary() * 0.195;
        }
    }

    static class Task23 {
        public String formatTitle(String text) {
            return "*** " + text.toUpperCase() + " ***";
        }

        public int countVowels(String text) {
            String vowels = "аоуеиіяюєїaeiou";
            String lower = text.toLowerCase();
            int result = 0;
            for (int i = 0; i < lower.length(); i++) {
                if (vowels.indexOf(lower.charAt(i)) >= 0) {
                    result++;
                }
            }
            return result;
        }
    }

    static class Task24 {
        public double a;
        public double b;
        public double c;

        public boolean isValid() {
            return a + b > c && a + c > b && b + c > a;
        }

        public double getPerimeter() {
            return a + b + c;
        }

        public double getArea() {
            double p;
            if (!isValid()) {
                return 0.0;
            }
            p = getPerimeter() / 2;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
    }

    static class Task25 {
        private String secretCode = "Pass123";

        public boolean verifyCode(String attempt) {
            return secretCode.equals(attempt);
        }
    }

    static class Task26 {
        private String username;
        private String password;

        public void setCredentials(String u, String p) {
            username = u;
            password = p;
        }

        public boolean login(String enteredUser, String enteredPass) {
            return username.equals(enteredUser) && password.equals(enteredPass);
        }

        public void changePassword(String oldPass, String newPass) {
            if (password.equals(oldPass)) {
                password = newPass;
                System.out.println("Пароль змінено");
            } else {
                System.out.println("Помилка: старий пароль невірний");
            }
        }
    }

    static class Task27 {
        private String accountNumber;
        private double balance;

        public Task27(String accountNumber) {
            this.accountNumber = accountNumber;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
            }
        }

        public boolean withdraw(double amount) {
            if (amount > balance) {
                return false;
            }
            balance -= amount;
            return true;
        }

        public double getBalance() {
            return balance;
        }
    }

    static class Task28 {
        private double temperature;

        public void setTemperature(double t) {
            if (t < -273.15) {
                System.out.println("Помилка: температура нижча за абсолютний нуль");
            } else {
                temperature = t;
            }
        }

        public double getTemperature() {
            return temperature;
        }
    }

    static class Task29 {
        private int speed = 0;

        public void accelerate(int delta) {
            speed += delta;
            if (speed > 240) {
                speed = 240;
            }
        }

        public void brake(int delta) {
            speed -= delta;
            if (speed < 0) {
                speed = 0;
            }
        }

        public int getSpeed() {
            return speed;
        }
    }

    static class Task30 {
        private String name;
        private int age;

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            if (age >= 0 && age <= 120) {
                this.age = age;
            } else {
                System.out.println("Помилка: некоректний вік " + age);
            }
        }

        public void printSummary() {
            System.out.println("Ім'я: " + name + ", вік: " + age);
        }
    }

    static class Task31 {
        private String ownerName;
        private double totalSpent;
        private int discountPercent = 1;

        public Task31(String ownerName) {
            this.ownerName = ownerName;
        }

        public void addPurchase(double cost) {
            totalSpent += cost;
            if (totalSpent >= 10000) {
                discountPercent = 10;
            } else if (totalSpent >= 5000) {
                discountPercent = 5;
            } else {
                discountPercent = 1;
            }
        }

        public void printCardInfo() {
            System.out.println("Власник: " + ownerName + ", витрачено: " + totalSpent + " грн, знижка: " + discountPercent + "%");
        }
    }

    static class Task32 {
        private int pinCode = 1234;
        private boolean isLocked = true;
        private int failedAttempts = 0;

        public void enterPin(int enteredPin) {
            if (failedAttempts >= 3) {
                System.out.println("СИСТЕМА ЗАБЛОКОВАНА! Викличте охорону.");
            } else if (enteredPin == pinCode) {
                isLocked = false;
                failedAttempts = 0;
                System.out.println("Замок відчинено");
            } else {
                failedAttempts++;
                System.out.println("Невірний PIN. Спроб: " + failedAttempts);
            }
        }
    }

    static class Task33 {
        private String studentName;
        private int[] grades;

        public void setData(String name, int[] g) {
            studentName = name;
            grades = g;
        }

        public double getAverage() {
            int sum = 0;
            if (grades == null || grades.length == 0) {
                return 0.0;
            }
            for (int grade : grades) {
                sum += grade;
            }
            return (double) sum / grades.length;
        }

        public int getHighestGrade() {
            int max = grades[0];
            for (int grade : grades) {
                if (grade > max) {
                    max = grade;
                }
            }
            return max;
        }

        public int getLowestGrade() {
            int min = grades[0];
            for (int grade : grades) {
                if (grade < min) {
                    min = grade;
                }
            }
            return min;
        }

        public String getStudentName() {
            return studentName;
        }
    }

    static class Task34 {
        private int[] numbers;

        public void setNumbers(int[] nums) {
            numbers = nums;
        }

        public int countEvens() {
            int result = 0;
            for (int n : numbers) {
                if (n % 2 == 0) {
                    result++;
                }
            }
            return result;
        }

        public int countOdds() {
            int result = 0;
            for (int n : numbers) {
                if (n % 2 != 0) {
                    result++;
                }
            }
            return result;
        }

        public int calculateSum() {
            int sum = 0;
            for (int n : numbers) {
                sum += n;
            }
            return sum;
        }
    }

    static class Task35 {
        private double[] itemPrices = new double[10];
        private int count;

        public void addItem(double price) {
            if (count < itemPrices.length) {
                itemPrices[count] = price;
                count++;
            } else {
                System.out.println("Кошик заповнений");
            }
        }

        public double getTotalCost() {
            double sum = 0;
            for (int i = 0; i < count; i++) {
                sum += itemPrices[i];
            }
            return sum;
        }

        public void applyDiscount(double percent) {
            for (int i = 0; i < count; i++) {
                itemPrices[i] = itemPrices[i] * (1 - percent / 100);
            }
        }

        public void printReceipt() {
            for (int i = 0; i < count; i++) {
                System.out.println((i + 1) + ". " + itemPrices[i] + " грн");
            }
            System.out.println("Разом: " + getTotalCost() + " грн");
        }
    }

    static class Task36 {
        private double[] dailyTemps = new double[7];

        public void setTemps(double[] temps) {
            dailyTemps = temps;
        }

        public int countDaysAbove(double threshold) {
            int result = 0;
            for (double t : dailyTemps) {
                if (t > threshold) {
                    result++;
                }
            }
            return result;
        }

        public void printWeeklyReport() {
            int hottest = 0;
            for (int i = 0; i < dailyTemps.length; i++) {
                System.out.println("День " + (i + 1) + ": " + dailyTemps[i]);
                if (dailyTemps[i] > dailyTemps[hottest]) {
                    hottest = i;
                }
            }
            System.out.println("Найтепліший день: " + (hottest + 1) + " (" + dailyTemps[hottest] + ")");
        }
    }

    static class Task37 {
        private int[] data;

        public void setData(int[] data) {
            this.data = data;
        }

        public boolean contains(int target) {
            return findIndex(target) != -1;
        }

        public int findIndex(int target) {
            for (int i = 0; i < data.length; i++) {
                if (data[i] == target) {
                    return i;
                }
            }
            return -1;
        }
    }

    static class Task38 {
        private double[] coords = new double[3];

        public void setCoords(double x, double y, double z) {
            coords[0] = x;
            coords[1] = y;
            coords[2] = z;
        }

        public double getMagnitude() {
            return Math.sqrt(coords[0] * coords[0] + coords[1] * coords[1] + coords[2] * coords[2]);
        }

        public void multiplyByScalar(double scalar) {
            for (int i = 0; i < coords.length; i++) {
                coords[i] *= scalar;
            }
        }

        public void printVector() {
            System.out.println("(" + coords[0] + ", " + coords[1] + ", " + coords[2] + ")");
        }
    }

    static class Task39 {
        private int[][] grid;

        public void setGrid(int[][] grid) {
            this.grid = grid;
        }

        public void printMatrix() {
            for (int i = 0; i < grid.length; i++) {
                String line = "";
                for (int j = 0; j < grid[i].length; j++) {
                    line += grid[i][j] + "\t";
                }
                System.out.println(line);
            }
        }

        public int getTotalSum() {
            int sum = 0;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    sum += grid[i][j];
                }
            }
            return sum;
        }

        public int getRowSum(int rowIndex) {
            int sum = 0;
            for (int j = 0; j < grid[rowIndex].length; j++) {
                sum += grid[rowIndex][j];
            }
            return sum;
        }
    }

    static class Task40 {
        private int[][] matrix;

        public void setMatrix(int[][] matrix) {
            this.matrix = matrix;
        }

        public int getMainDiagonalSum() {
            int sum = 0;
            for (int i = 0; i < matrix.length; i++) {
                sum += matrix[i][i];
            }
            return sum;
        }

        public int getAntiDiagonalSum() {
            int sum = 0;
            for (int i = 0; i < matrix.length; i++) {
                sum += matrix[i][matrix.length - 1 - i];
            }
            return sum;
        }

        public boolean isDiagonalSymmetric() {
            return getMainDiagonalSum() == getAntiDiagonalSum();
        }
    }
}
