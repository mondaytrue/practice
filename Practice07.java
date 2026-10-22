public class Practice07 {
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
        Task1 first = new Task1();
        Task1 second = new Task1("Кобзар", "Тарас Шевченко", 1840, 350.0);
        System.out.println("Завдання 1:");
        first.printInfo();
        second.printInfo();
    }

    static void task2() {
        Task2 valid = new Task2("Олена", 20, 4.8);
        Task2 invalid = new Task2("Максим", 5, 7.5);
        System.out.println("Завдання 2:");
        valid.printStudent();
        invalid.printStudent();
    }

    static void task3() {
        Task3 account = new Task3("UA001", "Іван", 1000);
        System.out.println("Завдання 3:");
        account.deposit(500);
        account.printAccount();
        System.out.println(account.withdraw(5000));
        System.out.println(account.withdraw(700));
        account.printAccount();
    }

    static void task4() {
        Task4 origin = new Task4();
        Task4 point = new Task4(3, 4);
        System.out.println("Завдання 4:");
        origin.printPoint();
        point.printPoint();
        System.out.println(point.distanceToOrigin());
        System.out.println(origin.distanceTo(6, 8));
    }

    static void task5() {
        Task5 product = new Task5("Ноутбук", 25000, 4, "Електроніка");
        System.out.println("Завдання 5:");
        product.printProduct();
        System.out.println(product.getTotalValue());
        product.applyDiscount(20);
        product.printProduct();
        System.out.println(product.getTotalValue());
    }

    static void task6() {
        Task6 time = new Task6(23, 59, 58);
        System.out.println("Завдання 6:");
        System.out.println(time.toUniversalString() + " | " + time.toStandardString());
        time.tick();
        System.out.println(time.toUniversalString() + " | " + time.toStandardString());
        time.tick();
        System.out.println(time.toUniversalString() + " | " + time.toStandardString());
    }

    static void task7() {
        Task7 unit = new Task7();
        Task7 square = new Task7(5);
        Task7 rectangle = new Task7(4, 6);
        System.out.println("Завдання 7:");
        System.out.println(unit.getArea() + " " + unit.getPerimeter() + " " + unit.isSquare());
        System.out.println(square.getArea() + " " + square.getPerimeter() + " " + square.isSquare());
        System.out.println(rectangle.getArea() + " " + rectangle.getPerimeter() + " " + rectangle.isSquare());
    }

    static void task8() {
        Task8 employee = new Task8(1, "Петренко Андрій", "Програміст", 40000);
        System.out.println("Завдання 8:");
        employee.printBadge();
        employee.raiseSalary(15);
        employee.printBadge();
        System.out.println(employee.getAnnualSalary());
    }

    static void task9() {
        Task9 full = new Task9("admin", "admin@mail.com", "ADMIN", true);
        Task9 two = new Task9("alex", "alex@mail.com");
        Task9 one = new Task9("olena");
        Task9 none = new Task9();
        System.out.println("Завдання 9:");
        full.printProfile();
        two.printProfile();
        one.printProfile();
        none.printProfile();
    }

    static void task10() {
        Task10 fraction = new Task10(6, -8);
        Task10 whole = new Task10(5);
        Task10 empty = new Task10();
        System.out.println("Завдання 10:");
        fraction.print();
        System.out.println(fraction.toDouble());
        whole.print();
        empty.print();
    }

    static void task11() {
        Task11 car = new Task11("Toyota", "Camry", 2024);
        System.out.println("Завдання 11:");
        car.drive(10);
        car.startEngine();
        car.drive(150);
        car.stopEngine();
        car.printCar();
        new Task11().printCar();
    }

    static void task12() {
        Task12 full = new Task12(80, 3000, true);
        Task12 brightnessOnly = new Task12(120);
        Task12 empty = new Task12();
        System.out.println("Завдання 12:");
        full.printStatus();
        brightnessOnly.printStatus();
        empty.printStatus();
    }

    static void task13() {
        String sql = new Task13("users").select("id, name, email").where("age >= 18").build();
        String simple = new Task13("orders").build();
        System.out.println("Завдання 13:");
        System.out.println(sql);
        System.out.println(simple);
    }

    static void task14() {
        Task14 full = new Task14("Лате", "Large", 2, true);
        Task14 withSize = new Task14("Капучино", "Small");
        Task14 basic = new Task14("Еспресо");
        System.out.println("Завдання 14:");
        full.printReceipt();
        withSize.printReceipt();
        basic.printReceipt();
    }

    static void task15() {
        Task15 cube = new Task15(3, "Картон");
        Task15 copy = new Task15(cube);
        System.out.println("Завдання 15:");
        cube.printBox();
        copy.printBox();
        System.out.println(cube.getVolume() + " " + copy.getVolume());
        System.out.println(cube.getSurfaceArea());
        System.out.println(cube == copy);
    }

    static void task16() {
        Task16 ticket = new Task16("T-100", "Олег Коваль", "PS101", "Київ", "Львів");
        System.out.println("Завдання 16:");
        ticket.printBoardingPass();
        ticket.assignSeat("12A");
        ticket.printBoardingPass();
    }

    static void task17() {
        Task17 math = new Task17();
        System.out.println("Завдання 17:");
        System.out.println(math.add(2, 3));
        System.out.println(math.add(2.5, 3.5));
        System.out.println(math.add(1, 2, 3));
        System.out.println(math.add("Hello", "World"));
        System.out.println(math.multiply(4, 5));
        System.out.println(math.multiply(1.5, 4.0));
        System.out.println(math.multiply("ab", 3));
    }

    static void task18() {
        Task18 printer = new Task18();
        String[] lines = {"перший", "другий", "третій"};
        System.out.println("Завдання 18:");
        printer.print("Привіт");
        printer.print(123);
        printer.print(3.14159, 2);
        printer.print(lines);
        printer.print("великі літери", true);
    }

    static void task19() {
        Task19 calculator = new Task19();
        System.out.println("Завдання 19:");
        System.out.println(calculator.calculateArea(4.0));
        System.out.println(calculator.calculateArea(3.0, 5.0));
        System.out.println(calculator.calculateArea(2.0, true));
        System.out.println(calculator.calculateArea(3.0, 4.0, 5.0));
        System.out.println(calculator.calculateArea(4.0, 6.0, 3.0, true));
    }

    static void task20() {
        Task20 logger = new Task20();
        System.out.println("Завдання 20:");
        logger.log("Програму запущено");
        logger.log("WARN", "Мало пам'яті");
        logger.log("ERROR", 404, "Файл не знайдено");
        logger.log("TIME", "Подія з часом", true);
    }

    static void task21() {
        Task21 searcher = new Task21();
        int[] numbers = {5, 8, 5, 12, 7};
        String[] words = {"java", "Python", "Kotlin"};
        System.out.println("Завдання 21:");
        System.out.println(searcher.find(numbers, 5));
        System.out.println(searcher.find(numbers, 5, 1));
        System.out.println(searcher.find(numbers, 99));
        System.out.println(searcher.find(words, "python"));
        System.out.println(searcher.find(words, "python", true));
    }

    static void task22() {
        Task22 date = new Task22(15, 3, 2024);
        System.out.println("Завдання 22:");
        date.printDate();
        date.add(20);
        date.printDate();
        date.add(0, 3);
        date.printDate();
        date.add(1, 1, 1);
        date.printDate();
    }

    static void task23() {
        Task23 calculator = new Task23();
        System.out.println("Завдання 23:");
        System.out.println(calculator.calculate(30000.0));
        System.out.println(calculator.calculate(30000.0, 5000.0));
        System.out.println(calculator.calculate(30000.0, 10.0, true));
        System.out.println(calculator.calculate(30000.0, 10, 250.0));
    }

    static void task24() {
        Task24 filter = new Task24();
        int[] data = {12, 5, 8, 19, 24, 3, 16};
        int[] above = filter.filter(data, 10);
        int[] range = filter.filter(data, 5, 16);
        int[] evens = filter.filter(data, true);
        int[] odds = filter.filter(data, false);
        System.out.println("Завдання 24:");
        for (int n : above) {
            System.out.print(n + " ");
        }
        System.out.println();
        for (int n : range) {
            System.out.print(n + " ");
        }
        System.out.println();
        for (int n : evens) {
            System.out.print(n + " ");
        }
        System.out.println();
        for (int n : odds) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    static void task25() {
        Task25 first = new Task25("alex", "alex@mail.com");
        Task25 second = new Task25("olena", "olena@mail.com");
        Task25 third = new Task25("max", "max@mail.com");
        System.out.println("Завдання 25:");
        System.out.println(first.getId() + " " + second.getId() + " " + third.getId());
        System.out.println(Task25.getNextAvailableId());
        Task25.resetIdSequence(5000);
        System.out.println(new Task25("ira", "ira@mail.com").getId());
    }

    static void task26() {
        System.out.println("Завдання 26:");
        for (int i = 1; i <= 6; i++) {
            if (Task26.connect()) {
                System.out.println("Користувач " + i + " підключений");
            } else {
                System.out.println("Користувач " + i + ": відмова, ліміт вичерпано");
            }
        }
        Task26.printServerStatus();
        Task26.disconnect();
        Task26.printServerStatus();
    }

    static void task27() {
        System.out.println("Завдання 27:");
        System.out.println(Task27.factorial(10));
        System.out.println(Task27.power(2, 10));
        System.out.println(Task27.power(2, -2));
        System.out.println(Task27.gcd(48, 18));
        System.out.println(Task27.clamp(150, 0, 100));
        System.out.println(Task27.PI + " " + Task27.E);
    }

    static void task28() {
        System.out.println("Завдання 28:");
        System.out.println(Task28.uahToUsd(4150));
        System.out.println(Task28.usdToUah(100));
        System.out.println(Task28.eurToUah(100));
        Task28.updateRates(40.0, 44.0);
        System.out.println(Task28.uahToUsd(4000));
        System.out.println(Task28.usdToUah(100));
        System.out.println(Task28.eurToUah(100));
    }

    static void task29() {
        Task29 car1 = new Task29("VIN001", 1000);
        Task29 car2 = new Task29("VIN002", 2500);
        Task29 car3 = new Task29("VIN003", 0);
        System.out.println("Завдання 29:");
        car1.addTrip(120);
        car2.addTrip(300);
        car3.addTrip(80);
        System.out.println(car1.getCurrentMileage() + " " + car2.getCurrentMileage() + " " + car3.getCurrentMileage());
        Task29.printFleetSummary();
    }

    static void task30() {
        System.out.println("Завдання 30:");
        System.out.println(Task30.isPalindrome("А роза упала на лапу Азора"));
        System.out.println(Task30.isPalindrome("Java"));
        System.out.println(Task30.reverse("Привіт"));
        System.out.println(Task30.countVowels("програмування"));
        System.out.println(Task30.maskCardNumber("1234 5678 9012 3456"));
    }

    static void task31() {
        Task31 s1 = Task31.createSession("Alex");
        Task31 s2 = Task31.createSession("Olena");
        Task31 s3 = Task31.createSession("Max");
        Task31 s4 = Task31.createSession("Ira");
        System.out.println("Завдання 31:");
        System.out.println(s1.getSessionToken() + " " + s2.getSessionToken() + " " + s3.getSessionToken());
        System.out.println(s4);
        s1.terminate();
        s4 = Task31.createSession("Ira");
        System.out.println(s4.getSessionToken());
    }

    static void task32() {
        System.out.println("Завдання 32:");
        System.out.println(Task32.restEnergy(0.001));
        System.out.println(Task32.freeFallDistance(5));
        System.out.println(Task32.kineticEnergy(2, 10));
    }

    static void task33() {
        Task33 segment = new Task33(0, 0, 6, 8);
        System.out.println("Завдання 33:");
        segment.printSegment();
        System.out.println(segment.getLength());
        System.out.println(segment.getMidPoint());
    }

    static void task34() {
        Task34 ivan = new Task34("UA01", "Іван", 10000);
        Task34 maria = new Task34("UA02", "Марія", 2000);
        System.out.println("Завдання 34:");
        System.out.println(ivan.transferTo(maria, 3500));
        System.out.println(ivan.transferTo(ivan, 100));
        ivan.printAccount();
        maria.printAccount();
    }

    static void task35() {
        Task35Engine engine = new Task35Engine("ENG-1", 280);
        Task35 car = new Task35("BMW", "M3", engine);
        System.out.println("Завдання 35:");
        car.printSpecs();
        car.startCar();
        car.printSpecs();
        car.turnOff();
        car.printSpecs();
    }

    static void task36() {
        Task36Processor cpu = new Task36Processor("Ryzen 7", 4.5, 12000);
        Task36Memory ram16 = new Task36Memory(16, 3200, 2500);
        Task36Memory ram32 = new Task36Memory(32, 3600, 4800);
        Task36 computer = new Task36("Game PC", cpu, ram16, 3000);
        System.out.println("Завдання 36:");
        computer.printSpecs();
        System.out.println(computer.calculateTotalPrice());
        computer.upgradeMemory(ram32);
        computer.printSpecs();
        System.out.println(computer.calculateTotalPrice());
    }

    static void task37() {
        Task37 knight = new Task37("Лицар", 100, 25, 10);
        Task37 orc = new Task37("Орк", 120, 20, 5);
        System.out.println("Завдання 37:");
        while (knight.isAlive() && orc.isAlive()) {
            knight.attack(orc);
            if (orc.isAlive()) {
                orc.attack(knight);
            }
        }
        if (knight.isAlive()) {
            System.out.println("Переможець: " + knight.getName());
        } else {
            System.out.println("Переможець: " + orc.getName());
        }
    }

    static void task38() {
        Task38Customer rich = new Task38Customer("Андрій", 50000);
        Task38Customer poor = new Task38Customer("Олена", 1000);
        Task38Product phone = new Task38Product(1, "Смартфон", 20000);
        Task38Product headphones = new Task38Product(2, "Навушники", 3000);
        Task38 order1 = new Task38(rich, 5);
        Task38 order2 = new Task38(poor, 5);
        System.out.println("Завдання 38:");
        order1.addProduct(phone);
        order1.addProduct(headphones);
        System.out.println(order1.checkout());
        order2.addProduct(phone);
        System.out.println(order2.checkout());
    }

    static void task39() {
        Task39 a = new Task39(1, 0, 0);
        Task39 b = new Task39(0, 1, 0);
        Task39 copyOfA = new Task39(1, 0, 0);
        System.out.println("Завдання 39:");
        System.out.println(a.add(b));
        System.out.println(a.dotProduct(b));
        System.out.println(a.crossProduct(b));
        System.out.println(a.isOrthogonalTo(b));
        System.out.println(a.isEqualTo(copyOfA) + " " + (a == copyOfA));
        System.out.println(new Task39());
    }

    static void task40() {
        Task40 library = new Task40(5);
        System.out.println("Завдання 40:");
        library.addBook(new Task40BookItem("111", "Кобзар", "Тарас Шевченко"));
        library.addBook(new Task40BookItem("222", "Лісова пісня", "Леся Українка"));
        library.addBook(new Task40BookItem("333", "Intermezzo", "Михайло Коцюбинський"));
        library.printCatalog();
        System.out.println(library.borrowBook("Кобзар"));
        library.printCatalog();
        System.out.println(library.borrowBook("Кобзар"));
        System.out.println(library.borrowBook("Немає такої"));
    }

    static class Task1 {
        private String title;
        private String author;
        private int year;
        private double price;

        public Task1() {
            this.title = "Невідомо";
            this.author = "Невідомий";
            this.year = 2000;
            this.price = 0.0;
        }

        public Task1(String title, String author, int year, double price) {
            this.title = title;
            this.author = author;
            if (year < 0 || price < 0.0) {
                this.year = 2000;
                this.price = 0.0;
            } else {
                this.year = year;
                this.price = price;
            }
        }

        public void printInfo() {
            System.out.println("\"" + title + "\", " + author + ", " + year + " р., " + price + " грн");
        }
    }

    static class Task2 {
        private String name;
        private int age;
        private double gpa;

        public Task2(String name, int age, double gpa) {
            this.name = name;
            if (age < 15 || age > 80) {
                this.age = 18;
            } else {
                this.age = age;
            }
            if (gpa < 0.0 || gpa > 5.0) {
                this.gpa = 0.0;
            } else {
                this.gpa = gpa;
            }
        }

        public boolean isHonorStudent() {
            return gpa >= 4.5;
        }

        public void printStudent() {
            String status = "Звичайний студент";
            if (isHonorStudent()) {
                status = "Відмінник";
            }
            System.out.println(name + ", вік: " + age + ", середній бал: " + gpa + " (" + status + ")");
        }
    }

    static class Task3 {
        private String accountNumber;
        private String ownerName;
        private double balance;

        public Task3(String accountNumber, String ownerName, double initialBalance) {
            this.accountNumber = accountNumber;
            this.ownerName = ownerName;
            if (initialBalance < 0) {
                this.balance = 0.0;
            } else {
                this.balance = initialBalance;
            }
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
            }
        }

        public boolean withdraw(double amount) {
            if (amount <= 0 || amount > balance) {
                return false;
            }
            balance -= amount;
            return true;
        }

        public void printAccount() {
            System.out.println("Рахунок " + accountNumber + ", власник: " + ownerName + ", баланс: " + balance + " грн");
        }
    }

    static class Task4 {
        private double x;
        private double y;

        public Task4() {
            this.x = 0.0;
            this.y = 0.0;
        }

        public Task4(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double distanceToOrigin() {
            return Math.sqrt(x * x + y * y);
        }

        public double distanceTo(double targetX, double targetY) {
            return Math.sqrt(Math.pow(targetX - x, 2) + Math.pow(targetY - y, 2));
        }

        public void printPoint() {
            System.out.println("Point(" + x + "; " + y + ")");
        }
    }

    static class Task5 {
        private String name;
        private double price;
        private int quantity;
        private String category;

        public Task5(String name, double price, int quantity, String category) {
            this.name = name;
            if (price < 0) {
                this.price = 0.0;
            } else {
                this.price = price;
            }
            if (quantity < 0) {
                this.quantity = 0;
            } else {
                this.quantity = quantity;
            }
            this.category = category;
        }

        public double getTotalValue() {
            return price * quantity;
        }

        public void applyDiscount(double percent) {
            if (percent >= 0 && percent <= 100) {
                price = price * (1 - percent / 100);
            }
        }

        public void printProduct() {
            System.out.println("Товар: " + name + " | Категорія: " + category + " | Ціна: " + price + " грн | Кількість: " + quantity);
        }
    }

    static class Task6 {
        private int hours;
        private int minutes;
        private int seconds;

        public Task6(int hours, int minutes, int seconds) {
            if (hours < 0 || hours > 23) {
                this.hours = 0;
            } else {
                this.hours = hours;
            }
            if (minutes < 0 || minutes > 59) {
                this.minutes = 0;
            } else {
                this.minutes = minutes;
            }
            if (seconds < 0 || seconds > 59) {
                this.seconds = 0;
            } else {
                this.seconds = seconds;
            }
        }

        private String twoDigits(int value) {
            if (value < 10) {
                return "0" + value;
            }
            return "" + value;
        }

        public void tick() {
            seconds++;
            if (seconds == 60) {
                seconds = 0;
                minutes++;
                if (minutes == 60) {
                    minutes = 0;
                    hours++;
                    if (hours == 24) {
                        hours = 0;
                    }
                }
            }
        }

        public String toUniversalString() {
            return twoDigits(hours) + ":" + twoDigits(minutes) + ":" + twoDigits(seconds);
        }

        public String toStandardString() {
            int h = hours % 12;
            String period = "AM";
            if (h == 0) {
                h = 12;
            }
            if (hours >= 12) {
                period = "PM";
            }
            return h + ":" + twoDigits(minutes) + ":" + twoDigits(seconds) + " " + period;
        }
    }

    static class Task7 {
        private double width;
        private double height;

        public Task7() {
            this.width = 1.0;
            this.height = 1.0;
        }

        public Task7(double size) {
            this.width = size;
            this.height = size;
        }

        public Task7(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public double getArea() {
            return width * height;
        }

        public double getPerimeter() {
            return 2 * (width + height);
        }

        public boolean isSquare() {
            return width == height;
        }
    }

    static class Task8 {
        private int id;
        private String fullName;
        private String position;
        private double monthlySalary;

        public Task8(int id, String fullName, String position, double monthlySalary) {
            this.id = id;
            this.fullName = fullName;
            this.position = position;
            this.monthlySalary = monthlySalary;
        }

        public void raiseSalary(double percent) {
            monthlySalary = monthlySalary * (1 + percent / 100);
        }

        public double getAnnualSalary() {
            return 12 * monthlySalary;
        }

        public void printBadge() {
            System.out.println("[" + id + "] " + fullName + " - " + position + ", ставка: " + monthlySalary + " грн/міс");
        }
    }

    static class Task9 {
        private String login;
        private String email;
        private String role;
        private boolean isActive;

        public Task9(String login, String email, String role, boolean isActive) {
            this.login = login;
            this.email = email;
            this.role = role;
            this.isActive = isActive;
        }

        public Task9(String login, String email) {
            this(login, email, "USER", true);
        }

        public Task9(String login) {
            this(login, login + "@domain.com");
        }

        public Task9() {
            this("guest");
        }

        public void printProfile() {
            System.out.println(login + " | " + email + " | " + role + " | активний: " + isActive);
        }
    }

    static class Task10 {
        private int numerator;
        private int denominator;

        public Task10(int numerator, int denominator) {
            int a;
            int b;
            int temp;
            if (denominator == 0) {
                System.out.println("Помилка: знаменник не може дорівнювати нулю");
                denominator = 1;
            }
            if (denominator < 0) {
                numerator = -numerator;
                denominator = -denominator;
            }
            a = Math.abs(numerator);
            b = denominator;
            while (b != 0) {
                temp = a % b;
                a = b;
                b = temp;
            }
            this.numerator = numerator / a;
            this.denominator = denominator / a;
        }

        public Task10(int wholeNumber) {
            this(wholeNumber, 1);
        }

        public Task10() {
            this(0, 1);
        }

        public void print() {
            if (denominator == 1) {
                System.out.println(numerator);
            } else {
                System.out.println(numerator + "/" + denominator);
            }
        }

        public double toDouble() {
            return (double) numerator / denominator;
        }
    }

    static class Task11 {
        private String brand;
        private String model;
        private int year;
        private double mileage;
        private boolean engineStarted;

        public Task11(String brand, String model, int year, double mileage) {
            this.brand = brand;
            this.model = model;
            this.year = year;
            this.mileage = mileage;
        }

        public Task11(String brand, String model, int year) {
            this(brand, model, year, 0.0);
        }

        public Task11() {
            this("Unknown", "Standard", 2024);
        }

        public void startEngine() {
            engineStarted = true;
        }

        public void stopEngine() {
            engineStarted = false;
        }

        public void drive(double distance) {
            if (engineStarted) {
                mileage += distance;
            } else {
                System.out.println("Спершу заведіть двигун!");
            }
        }

        public void printCar() {
            System.out.println(brand + " " + model + " (" + year + "), пробіг: " + mileage + " км");
        }
    }

    static class Task12 {
        private int brightness;
        private int colorTemp;
        private boolean isOn;

        public Task12(int brightness, int colorTemp, boolean isOn) {
            if (brightness < 0) {
                this.brightness = 0;
            } else if (brightness > 100) {
                this.brightness = 100;
            } else {
                this.brightness = brightness;
            }
            if (colorTemp < 2700) {
                this.colorTemp = 2700;
            } else if (colorTemp > 6500) {
                this.colorTemp = 6500;
            } else {
                this.colorTemp = colorTemp;
            }
            this.isOn = isOn;
        }

        public Task12(int brightness) {
            this(brightness, 4000, true);
        }

        public Task12() {
            this(50);
        }

        public void printStatus() {
            System.out.println("Яскравість: " + brightness + "%, температура: " + colorTemp + " K, увімкнена: " + isOn);
        }
    }

    static class Task13 {
        private String table;
        private String fields = "*";
        private String whereClause = "";

        public Task13(String table) {
            this.table = table;
        }

        public Task13 select(String fields) {
            this.fields = fields;
            return this;
        }

        public Task13 where(String condition) {
            this.whereClause = condition;
            return this;
        }

        public String build() {
            String result = "SELECT " + fields + " FROM " + table;
            if (!whereClause.isEmpty()) {
                result += " WHERE " + whereClause;
            }
            return result + ";";
        }
    }

    static class Task14 {
        private String type;
        private String size;
        private int sugarCount;
        private boolean withSyrup;
        private double finalPrice;

        public Task14(String type, String size, int sugarCount, boolean withSyrup) {
            this.type = type;
            this.size = size;
            this.sugarCount = sugarCount;
            this.withSyrup = withSyrup;
            this.finalPrice = calculatePrice();
        }

        public Task14(String type, String size) {
            this(type, size, 0, false);
        }

        public Task14(String type) {
            this(type, "Medium");
        }

        private double calculatePrice() {
            double price = 0;
            double coefficient = 1.0;
            if (type.equals("Еспресо")) {
                price = 40;
            } else if (type.equals("Капучино")) {
                price = 55;
            } else if (type.equals("Лате")) {
                price = 60;
            }
            if (size.equals("Medium")) {
                coefficient = 1.3;
            } else if (size.equals("Large")) {
                coefficient = 1.6;
            }
            price = price * coefficient;
            if (withSyrup) {
                price += 15;
            }
            return price;
        }

        public void printReceipt() {
            System.out.println(type + ", " + size + ", цукор: " + sugarCount + ", сироп: " + withSyrup + " - " + finalPrice + " грн");
        }
    }

    static class Task15 {
        private double width;
        private double height;
        private double depth;
        private String material;

        public Task15(double width, double height, double depth, String material) {
            this.width = width;
            this.height = height;
            this.depth = depth;
            this.material = material;
        }

        public Task15(double size, String material) {
            this(size, size, size, material);
        }

        public Task15(Task15 other) {
            this(other.width, other.height, other.depth, other.material);
        }

        public double getVolume() {
            return width * height * depth;
        }

        public double getSurfaceArea() {
            return 2 * (width * height + width * depth + height * depth);
        }

        public void printBox() {
            System.out.println("Коробка " + width + "x" + height + "x" + depth + ", матеріал: " + material);
        }
    }

    static class Task16 {
        private String ticketNumber;
        private String passengerName;
        private String flightNumber;
        private String departureCity;
        private String arrivalCity;
        private String seatNumber;
        private boolean hasBaggage;

        public Task16(String ticketNumber, String passengerName, String flightNumber, String departureCity, String arrivalCity, String seatNumber, boolean hasBaggage) {
            this.ticketNumber = ticketNumber;
            this.passengerName = passengerName;
            this.flightNumber = flightNumber;
            this.departureCity = departureCity;
            this.arrivalCity = arrivalCity;
            this.seatNumber = seatNumber;
            this.hasBaggage = hasBaggage;
        }

        public Task16(String ticketNumber, String passengerName, String flightNumber, String departureCity, String arrivalCity) {
            this(ticketNumber, passengerName, flightNumber, departureCity, arrivalCity, "UNASSIGNED", false);
        }

        public void assignSeat(String seat) {
            this.seatNumber = seat;
        }

        public void printBoardingPass() {
            System.out.println("Квиток " + ticketNumber + " | " + passengerName + " | рейс " + flightNumber + " | " + departureCity + " - " + arrivalCity + " | місце: " + seatNumber + " | багаж: " + hasBaggage);
        }
    }

    static class Task17 {
        public int add(int a, int b) {
            return a + b;
        }

        public double add(double a, double b) {
            return a + b;
        }

        public int add(int a, int b, int c) {
            return a + b + c;
        }

        public String add(String a, String b) {
            return a + " " + b;
        }

        public int multiply(int a, int b) {
            return a * b;
        }

        public double multiply(double a, double b) {
            return a * b;
        }

        public String multiply(String text, int times) {
            String result = "";
            for (int i = 0; i < times; i++) {
                result += text;
            }
            return result;
        }
    }

    static class Task18 {
        public void print(String message) {
            System.out.println(message);
        }

        public void print(int number) {
            System.out.println("[INT]: " + number);
        }

        public void print(double number, int decimals) {
            System.out.println(String.format("%." + decimals + "f", number));
        }

        public void print(String[] lines) {
            for (int i = 0; i < lines.length; i++) {
                System.out.println((i + 1) + ". " + lines[i]);
            }
        }

        public void print(String message, boolean uppercase) {
            if (uppercase) {
                System.out.println(message.toUpperCase());
            } else {
                System.out.println(message);
            }
        }
    }

    static class Task19 {
        public double calculateArea(double side) {
            return side * side;
        }

        public double calculateArea(double width, double height) {
            return width * height;
        }

        public double calculateArea(double radius, boolean isCircle) {
            return Math.PI * radius * radius;
        }

        public double calculateArea(double a, double b, double c) {
            double p = (a + b + c) / 2;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }

        public double calculateArea(double base1, double base2, double height, boolean isTrapezoid) {
            return (base1 + base2) / 2 * height;
        }
    }

    static class Task20 {
        public void log(String message) {
            System.out.println("[INFO] " + message);
        }

        public void log(String level, String message) {
            System.out.println("[" + level + "] " + message);
        }

        public void log(String level, int errorCode, String message) {
            System.out.println("[" + level + "] (Code: " + errorCode + "): " + message);
        }

        public void log(String tag, String message, boolean timestamp) {
            if (timestamp) {
                System.out.println("[" + tag + "] " + message + " (" + System.currentTimeMillis() + ")");
            } else {
                System.out.println("[" + tag + "] " + message);
            }
        }
    }

    static class Task21 {
        public int find(int[] arr, int target) {
            return find(arr, target, 0);
        }

        public int find(int[] arr, int target, int startIndex) {
            for (int i = startIndex; i < arr.length; i++) {
                if (arr[i] == target) {
                    return i;
                }
            }
            return -1;
        }

        public int find(String[] arr, String target) {
            return find(arr, target, false);
        }

        public int find(String[] arr, String target, boolean ignoreCase) {
            for (int i = 0; i < arr.length; i++) {
                if (ignoreCase) {
                    if (arr[i].equalsIgnoreCase(target)) {
                        return i;
                    }
                } else if (arr[i].equals(target)) {
                    return i;
                }
            }
            return -1;
        }
    }

    static class Task22 {
        private int day;
        private int month;
        private int year;

        public Task22(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }

        public void add(int days) {
            add(days, 0, 0);
        }

        public void add(int days, int months) {
            add(days, months, 0);
        }

        public void add(int days, int months, int years) {
            day += days;
            while (day > 30) {
                day -= 30;
                month++;
            }
            month += months;
            while (month > 12) {
                month -= 12;
                year++;
            }
            year += years;
        }

        public void printDate() {
            System.out.println(day + "." + month + "." + year);
        }
    }

    static class Task23 {
        public double calculate(double baseRate) {
            return baseRate;
        }

        public double calculate(double baseRate, double fixedBonus) {
            return baseRate + fixedBonus;
        }

        public double calculate(double baseRate, double bonusPercent, boolean isTaxDeducted) {
            double total = baseRate * (1 + bonusPercent / 100);
            if (isTaxDeducted) {
                total = total * (1 - 0.195);
            }
            return total;
        }

        public double calculate(double baseRate, int overtimeHours, double overtimeHourlyRate) {
            return baseRate + overtimeHours * overtimeHourlyRate;
        }
    }

    static class Task24 {
        public int[] filter(int[] arr, int threshold) {
            int count = 0;
            int index = 0;
            int[] result;
            for (int n : arr) {
                if (n > threshold) {
                    count++;
                }
            }
            result = new int[count];
            for (int n : arr) {
                if (n > threshold) {
                    result[index] = n;
                    index++;
                }
            }
            return result;
        }

        public int[] filter(int[] arr, int min, int max) {
            int count = 0;
            int index = 0;
            int[] result;
            for (int n : arr) {
                if (n >= min && n <= max) {
                    count++;
                }
            }
            result = new int[count];
            for (int n : arr) {
                if (n >= min && n <= max) {
                    result[index] = n;
                    index++;
                }
            }
            return result;
        }

        public int[] filter(int[] arr, boolean keepEvens) {
            int count = 0;
            int index = 0;
            int[] result;
            for (int n : arr) {
                if ((n % 2 == 0) == keepEvens) {
                    count++;
                }
            }
            result = new int[count];
            for (int n : arr) {
                if ((n % 2 == 0) == keepEvens) {
                    result[index] = n;
                    index++;
                }
            }
            return result;
        }
    }

    static class Task25 {
        private static int nextId = 1001;

        private int id;
        private String username;
        private String email;

        public Task25(String username, String email) {
            this.id = nextId++;
            this.username = username;
            this.email = email;
        }

        public static int getNextAvailableId() {
            return nextId;
        }

        public static void resetIdSequence(int startId) {
            nextId = startId;
        }

        public int getId() {
            return id;
        }

        public String getUsername() {
            return username;
        }

        public String getEmail() {
            return email;
        }
    }

    static class Task26 {
        public static final String SERVER_NAME = "AlphaEnterprise";
        public static final int MAX_CONNECTIONS = 5;

        private static int activeConnections = 0;

        public static boolean connect() {
            if (activeConnections < MAX_CONNECTIONS) {
                activeConnections++;
                return true;
            }
            return false;
        }

        public static void disconnect() {
            if (activeConnections > 0) {
                activeConnections--;
            }
        }

        public static void printServerStatus() {
            System.out.println(SERVER_NAME + ": підключень " + activeConnections + ", вільних слотів " + (MAX_CONNECTIONS - activeConnections));
        }
    }

    static class Task27 {
        public static final double PI = 3.1415926535;
        public static final double E = 2.7182818284;

        private Task27() {
        }

        public static long factorial(int n) {
            long result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        }

        public static double power(double base, int exp) {
            double result = 1.0;
            int count = Math.abs(exp);
            for (int i = 0; i < count; i++) {
                result *= base;
            }
            if (exp < 0) {
                return 1 / result;
            }
            return result;
        }

        public static int gcd(int a, int b) {
            int temp;
            while (b != 0) {
                temp = a % b;
                a = b;
                b = temp;
            }
            return Math.abs(a);
        }

        public static int clamp(int val, int min, int max) {
            if (val < min) {
                return min;
            }
            if (val > max) {
                return max;
            }
            return val;
        }
    }

    static class Task28 {
        private static double usdToUahRate = 41.5;
        private static double eurToUahRate = 45.2;

        public static void updateRates(double newUsd, double newEur) {
            if (newUsd > 0 && newEur > 0) {
                usdToUahRate = newUsd;
                eurToUahRate = newEur;
            }
        }

        public static double uahToUsd(double uah) {
            return uah / usdToUahRate;
        }

        public static double usdToUah(double usd) {
            return usd * usdToUahRate;
        }

        public static double eurToUah(double eur) {
            return eur * eurToUahRate;
        }
    }

    static class Task29 {
        private static int totalCars = 0;
        private static double totalCompanyMileage = 0.0;

        private String vinCode;
        private double currentMileage;

        public Task29(String vinCode, double initialMileage) {
            this.vinCode = vinCode;
            this.currentMileage = initialMileage;
            totalCars++;
            totalCompanyMileage += initialMileage;
        }

        public void addTrip(double km) {
            this.currentMileage += km;
            totalCompanyMileage += km;
        }

        public static void printFleetSummary() {
            System.out.println("Авто в парку: " + totalCars + ", загальний пробіг: " + totalCompanyMileage + " км");
        }

        public String getVinCode() {
            return vinCode;
        }

        public double getCurrentMileage() {
            return currentMileage;
        }
    }

    static class Task30 {
        private Task30() {
        }

        public static boolean isPalindrome(String s) {
            String clean = "";
            String lower = s.toLowerCase();
            for (int i = 0; i < lower.length(); i++) {
                if (lower.charAt(i) != ' ') {
                    clean += lower.charAt(i);
                }
            }
            return clean.equals(reverse(clean));
        }

        public static String reverse(String s) {
            String result = "";
            for (int i = s.length() - 1; i >= 0; i--) {
                result += s.charAt(i);
            }
            return result;
        }

        public static int countVowels(String s) {
            String vowels = "аоуеиіяюєїaeiou";
            String lower = s.toLowerCase();
            int count = 0;
            for (int i = 0; i < lower.length(); i++) {
                if (vowels.indexOf(lower.charAt(i)) >= 0) {
                    count++;
                }
            }
            return count;
        }

        public static String maskCardNumber(String cardNumber) {
            String digits = "";
            String result = "";
            for (int i = 0; i < cardNumber.length(); i++) {
                if (cardNumber.charAt(i) != ' ') {
                    digits += cardNumber.charAt(i);
                }
            }
            for (int i = 0; i < digits.length(); i++) {
                if (i > 0 && i % 4 == 0) {
                    result += " ";
                }
                if (i < digits.length() - 4) {
                    result += "*";
                } else {
                    result += digits.charAt(i);
                }
            }
            return result;
        }
    }

    static class Task31 {
        public static final int MAX_SESSIONS = 3;

        private static int activeSessionsCount = 0;
        private static int tokenCounter = 1;

        private String sessionToken;
        private String hostPlayer;
        private boolean isActive;

        private Task31(String host) {
            this.sessionToken = "SES-" + tokenCounter++;
            this.hostPlayer = host;
            this.isActive = true;
        }

        public static Task31 createSession(String host) {
            if (activeSessionsCount >= MAX_SESSIONS) {
                System.out.println("Помилка: усі сервера перевантажені!");
                return null;
            }
            activeSessionsCount++;
            return new Task31(host);
        }

        public void terminate() {
            if (isActive) {
                isActive = false;
                activeSessionsCount--;
            }
        }

        public String getSessionToken() {
            return sessionToken;
        }

        public String getHostPlayer() {
            return hostPlayer;
        }
    }

    static class Task32 {
        public static final double G = 9.80665;
        public static final double SPEED_OF_LIGHT = 299792458.0;

        private Task32() {
        }

        public static double freeFallDistance(double seconds) {
            return G * seconds * seconds / 2;
        }

        public static double kineticEnergy(double massKg, double velocityMs) {
            return massKg * velocityMs * velocityMs / 2;
        }

        public static double restEnergy(double massKg) {
            return massKg * SPEED_OF_LIGHT * SPEED_OF_LIGHT;
        }
    }

    static class Task33Point {
        private double x;
        private double y;

        public Task33Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        @Override
        public String toString() {
            return "Point(" + x + "; " + y + ")";
        }
    }

    static class Task33 {
        private Task33Point start;
        private Task33Point end;

        public Task33(Task33Point start, Task33Point end) {
            this.start = start;
            this.end = end;
        }

        public Task33(double x1, double y1, double x2, double y2) {
            this(new Task33Point(x1, y1), new Task33Point(x2, y2));
        }

        public double getLength() {
            return Math.sqrt(Math.pow(end.getX() - start.getX(), 2) + Math.pow(end.getY() - start.getY(), 2));
        }

        public Task33Point getMidPoint() {
            return new Task33Point((start.getX() + end.getX()) / 2, (start.getY() + end.getY()) / 2);
        }

        public void printSegment() {
            System.out.println(start + " -> " + end);
        }
    }

    static class Task34 {
        private String iban;
        private String owner;
        private double balance;

        public Task34(String iban, String owner, double balance) {
            this.iban = iban;
            this.owner = owner;
            this.balance = balance;
        }

        public boolean transferTo(Task34 recipient, double amount) {
            if (recipient == null || recipient == this) {
                return false;
            }
            if (amount <= 0 || this.balance < amount) {
                return false;
            }
            this.balance -= amount;
            recipient.balance += amount;
            return true;
        }

        public void printAccount() {
            System.out.println(iban + " | " + owner + " | " + balance + " грн");
        }
    }

    static class Task35Engine {
        private String serialNumber;
        private int horsePower;
        private boolean isRunning;

        public Task35Engine(String serialNumber, int horsePower) {
            this.serialNumber = serialNumber;
            this.horsePower = horsePower;
        }

        public void start() {
            isRunning = true;
        }

        public void stop() {
            isRunning = false;
        }

        public boolean isRunning() {
            return isRunning;
        }

        public int getHorsePower() {
            return horsePower;
        }

        public String getSerialNumber() {
            return serialNumber;
        }
    }

    static class Task35 {
        private String brand;
        private String model;
        private Task35Engine engine;

        public Task35(String brand, String model, Task35Engine engine) {
            this.brand = brand;
            this.model = model;
            this.engine = engine;
        }

        public void startCar() {
            this.engine.start();
            System.out.println(brand + " готовий до руху!");
        }

        public void turnOff() {
            this.engine.stop();
            System.out.println(brand + " вимкнено");
        }

        public void printSpecs() {
            System.out.println(brand + " " + model + ", двигун: " + engine.getHorsePower() + " к.с., запущений: " + engine.isRunning());
        }
    }

    static class Task36Processor {
        private String model;
        private double frequencyGHz;
        private double price;

        public Task36Processor(String model, double frequencyGHz, double price) {
            this.model = model;
            this.frequencyGHz = frequencyGHz;
            this.price = price;
        }

        public String getModel() {
            return model;
        }

        public double getFrequencyGHz() {
            return frequencyGHz;
        }

        public double getPrice() {
            return price;
        }
    }

    static class Task36Memory {
        private int sizeGB;
        private int frequencyMHz;
        private double price;

        public Task36Memory(int sizeGB, int frequencyMHz, double price) {
            this.sizeGB = sizeGB;
            this.frequencyMHz = frequencyMHz;
            this.price = price;
        }

        public int getSizeGB() {
            return sizeGB;
        }

        public int getFrequencyMHz() {
            return frequencyMHz;
        }

        public double getPrice() {
            return price;
        }
    }

    static class Task36 {
        private String title;
        private Task36Processor cpu;
        private Task36Memory ram;
        private double casePrice;

        public Task36(String title, Task36Processor cpu, Task36Memory ram, double casePrice) {
            this.title = title;
            this.cpu = cpu;
            this.ram = ram;
            this.casePrice = casePrice;
        }

        public double calculateTotalPrice() {
            return cpu.getPrice() + ram.getPrice() + casePrice;
        }

        public void upgradeMemory(Task36Memory newRam) {
            this.ram = newRam;
            System.out.println("Оперативну пам'ять оновлено до " + newRam.getSizeGB() + " GB");
        }

        public void printSpecs() {
            System.out.println(title + ": " + cpu.getModel() + " " + cpu.getFrequencyGHz() + " GHz, " + ram.getSizeGB() + " GB " + ram.getFrequencyMHz() + " MHz");
        }
    }

    static class Task37 {
        private String name;
        private int health;
        private int attackPower;
        private int defense;

        public Task37(String name, int health, int attackPower, int defense) {
            this.name = name;
            this.health = health;
            this.attackPower = attackPower;
            this.defense = defense;
        }

        public void attack(Task37 target) {
            int damage = this.attackPower - target.defense;
            if (damage <= 0) {
                damage = 1;
            }
            target.health -= damage;
            if (target.health < 0) {
                target.health = 0;
            }
            System.out.println(this.name + " б'є " + target.name + " на " + damage + ". У " + target.name + " залишилось " + target.health + " HP");
        }

        public boolean isAlive() {
            return this.health > 0;
        }

        public String getName() {
            return name;
        }
    }

    static class Task38Product {
        private int id;
        private String title;
        private double price;

        public Task38Product(int id, String title, double price) {
            this.id = id;
            this.title = title;
            this.price = price;
        }

        public int getId() {
            return id;
        }

        public String getTitle() {
            return title;
        }

        public double getPrice() {
            return price;
        }
    }

    static class Task38Customer {
        private String name;
        private double walletBalance;

        public Task38Customer(String name, double walletBalance) {
            this.name = name;
            this.walletBalance = walletBalance;
        }

        public boolean pay(double amount) {
            if (amount > walletBalance) {
                return false;
            }
            walletBalance -= amount;
            return true;
        }

        public String getName() {
            return name;
        }

        public double getWalletBalance() {
            return walletBalance;
        }
    }

    static class Task38 {
        private Task38Customer customer;
        private Task38Product[] items;
        private int itemCount;

        public Task38(Task38Customer customer, int maxItems) {
            this.customer = customer;
            this.items = new Task38Product[maxItems];
        }

        public void addProduct(Task38Product p) {
            if (itemCount < items.length) {
                items[itemCount] = p;
                itemCount++;
            } else {
                System.out.println("Замовлення заповнене");
            }
        }

        public double calculateTotal() {
            double total = 0;
            for (int i = 0; i < itemCount; i++) {
                total += items[i].getPrice();
            }
            return total;
        }

        public boolean checkout() {
            double total = calculateTotal();
            if (this.customer.pay(total)) {
                System.out.println("Чек для " + customer.getName() + ":");
                for (int i = 0; i < itemCount; i++) {
                    System.out.println(items[i].getTitle() + " - " + items[i].getPrice() + " грн");
                }
                System.out.println("Разом: " + total + " грн, залишок: " + customer.getWalletBalance() + " грн");
                return true;
            }
            System.out.println(customer.getName() + ": недостатньо коштів, потрібно " + total + " грн");
            return false;
        }
    }

    static class Task39 {
        private double x;
        private double y;
        private double z;

        public Task39(double x, double y, double z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public Task39() {
            this(0, 0, 0);
        }

        public Task39 add(Task39 other) {
            return new Task39(this.x + other.x, this.y + other.y, this.z + other.z);
        }

        public double dotProduct(Task39 other) {
            return this.x * other.x + this.y * other.y + this.z * other.z;
        }

        public Task39 crossProduct(Task39 other) {
            return new Task39(this.y * other.z - this.z * other.y, this.z * other.x - this.x * other.z, this.x * other.y - this.y * other.x);
        }

        public boolean isOrthogonalTo(Task39 other) {
            return dotProduct(other) == 0;
        }

        public boolean isEqualTo(Task39 other) {
            return this.x == other.x && this.y == other.y && this.z == other.z;
        }

        @Override
        public String toString() {
            return "(" + x + ", " + y + ", " + z + ")";
        }
    }

    static class Task40BookItem {
        private String isbn;
        private String title;
        private String author;
        private boolean isAvailable;

        public Task40BookItem(String isbn, String title, String author) {
            this.isbn = isbn;
            this.title = title;
            this.author = author;
            this.isAvailable = true;
        }

        public void borrowBook() {
            isAvailable = false;
        }

        public void returnBook() {
            isAvailable = true;
        }

        public boolean isAvailable() {
            return isAvailable;
        }

        public String getTitle() {
            return title;
        }

        public void printBook() {
            String status = "видана";
            if (isAvailable) {
                status = "доступна";
            }
            System.out.println(isbn + " | " + title + " | " + author + " | " + status);
        }
    }

    static class Task40 {
        private Task40BookItem[] books;
        private int size;

        public Task40(int capacity) {
            this.books = new Task40BookItem[capacity];
        }

        public void addBook(Task40BookItem book) {
            if (size < books.length) {
                books[size] = book;
                size++;
            } else {
                System.out.println("Фонд заповнений");
            }
        }

        public Task40BookItem findBookByTitle(String title) {
            for (int i = 0; i < size; i++) {
                if (books[i].getTitle().equals(title)) {
                    return books[i];
                }
            }
            return null;
        }

        public boolean borrowBook(String title) {
            Task40BookItem book = findBookByTitle(title);
            if (book == null || !book.isAvailable()) {
                return false;
            }
            book.borrowBook();
            return true;
        }

        public void printCatalog() {
            for (int i = 0; i < size; i++) {
                books[i].printBook();
            }
        }
    }
}
