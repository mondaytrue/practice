import java.util.Locale;

public class Practice08 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
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
        Student s = new Student("Олена", 3, 88.5);
        System.out.println(s);
        s.setCourse(10);
        s.setGpa(150);
        System.out.println(s);
    }

    static void task2() {
        Product a = new Product("A-101", "Монітор", 6499.50, 4);
        Product b = new Product("B-202", "Клавіатура", -10, 15);
        System.out.println(a);
        System.out.println(b);
    }

    static void task3() {
        Circle c = new Circle(5);
        System.out.println(c);
        Circle bad = new Circle(-3);
        System.out.println(bad);
        c.setRadius(-1);
        System.out.println(c);
    }

    static void task4() {
        CardWallet w = new CardWallet("4149123456784589", "1234", 12500);
        System.out.println(w);
        System.out.println(w.changePin("0000", "9999"));
        System.out.println(w.changePin("1234", "9999"));
        System.out.println(w);
    }

    static void task5() {
        SensorNode n = new SensorNode("T-01", 21.4, -0.6);
        System.out.println(n);
        System.out.println(n.getCalibratedValue());
    }

    static void task6() {
        double[] t = {10.5, 12.0, 15.5, 18.0, 14.0, 11.0};
        WeatherDay d = new WeatherDay("2026-10-28", t);
        t[0] = 999;
        System.out.println(d);
        System.out.println(d.getMinTemp() + " " + d.getMaxTemp() + " " + d.getAverageTemp());
    }

    static void task7() {
        IntRange r = new IntRange(10, 2);
        System.out.println(r);
        System.out.println(r.contains(5));
        r.setRange(20, 30);
        System.out.println(r);
    }

    static void task8() {
        InvoiceItem item = new InvoiceItem("Ноутбук", 2, 25000, 10);
        System.out.println("Позиція чека: " + item);
    }

    static void task9() {
        Employee e = new Employee("Ігор", 15000);
        Developer d = new Developer("Polina", 20000, "Java");
        System.out.println(e);
        System.out.println(d);
    }

    static void task10() {
        Dog dog = new Dog("Рекс", 4, 22.5, "Лабрадор");
        Cat cat = new Cat("Мурка", 2, 4.1, true);
        System.out.println(dog);
        System.out.println(dog.fetchStick());
        System.out.println(cat);
        System.out.println(cat.purr());
    }

    static void task11() {
        PassengerCar car = new PassengerCar("Toyota", 200, 55, 5);
        CargoTruck truck = new CargoTruck("MAN", 110, 400, 12.5);
        System.out.println(car);
        System.out.println(truck);
        System.out.println(truck.getFullLoadConsumptionPer100Km());
    }

    static void task12() {
        Rectangle r = new Rectangle(3, 4);
        Box3D b = new Box3D(3, 4, 5);
        System.out.println(r);
        System.out.println(b);
        System.out.println(b.getVolume());
    }

    static void task13() {
        UniversityStudent s = new UniversityStudent("Андрій Мельник", 2005, "ST-77", "Інформатика", 2000);
        Professor p = new Professor("Марія Шевченко", 1975, "Доктор наук", 54);
        System.out.println(s + " | вік: " + s.getAge(2026));
        System.out.println(p + " | вік: " + p.getAge(2026));
    }

    static void task14() {
        System.out.println(new Smartphone("Samsung", 28999, 256, true));
        System.out.println(new Smartphone("Xiaomi", 12999, 128));
        System.out.println(new Smartphone("Nokia"));
    }

    static void task15() {
        PrintedBook pb = new PrintedBook("Кобзар", "Тарас Шевченко", 1840, 320, "Тверда");
        AudioBook ab = new AudioBook("Майстер і Маргарита", "Михайло Булгаков", 1967, 745, "Іван Іванов");
        System.out.println(pb);
        System.out.println(ab);
    }

    static void task16() {
        Gamer g = new Gamer("Noob", 120);
        ProEsportsPlayer p = new ProEsportsPlayer("s1mple", 15000, "NAVI", 1500000, 12);
        ProEsportsPlayer z = new ProEsportsPlayer("Rookie", 300, "Academy", 0, 0);
        System.out.println(g);
        System.out.println(p);
        System.out.println(p.getAveragePrizePerWin());
        System.out.println(z.getAveragePrizePerWin());
    }

    static void task17() {
        StaffMember s = new StaffMember("Тарас", 20000);
        Manager m = new Manager("Ірина", 30000, 8000);
        SalesPerson sp = new SalesPerson("Богдан", 15000, 200000, 5);
        System.out.println(s);
        System.out.println(m);
        System.out.println(sp);
    }

    static void task18() {
        StandardTransfer st = new StandardTransfer(1000);
        InternationalTransfer it = new InternationalTransfer(1000, "PL");
        System.out.println(st);
        System.out.println(it);
    }

    static void task19() {
        Ticket t = new Ticket("Concert", 800);
        StudentTicket st = new StudentTicket("Concert", 800, "KV123456");
        VipTicket vt = new VipTicket("Concert", 800, true, 500);
        System.out.println(t);
        System.out.println(st);
        System.out.println(vt);
    }

    static void task20() {
        Weapon w = new Weapon("Кинджал", 40);
        EnchantedSword s = new EnchantedSword("Меч Дракона", 70, "Вогонь", 15, 4);
        System.out.println(w);
        System.out.println(s);
    }

    static void task21() {
        Parcel p = new Parcel("UA123", 2.5);
        FragileParcel f = new FragileParcel("UA456", 3.0, true, 10000);
        System.out.println(p);
        System.out.println(f);
    }

    static void task22() {
        Appliance a = new Appliance("Generic", 2000);
        EcoHeater e = new EcoHeater("EcoWarm", 2000, true);
        EcoHeater n = new EcoHeater("EcoWarm", 2000, false);
        System.out.println(a);
        System.out.println(e);
        System.out.println(n);
    }

    static void task23() {
        Point2D p = new Point2D(3, 4);
        Point3D q = new Point3D(2, 3, 6);
        System.out.println(p + " -> " + p.distanceToOrigin());
        System.out.println(q + " -> " + q.distanceToOrigin());
    }

    static void task24() {
        Coffee c = new Coffee("Арабіка", 200, 60);
        LatteWithAddons l = new LatteWithAddons("Арабіка", 350, 70, "рослинне", 2);
        System.out.println(c);
        System.out.println(l);
    }

    static void task25() {
        AlchemistHero a = new AlchemistHero("Alchemist", 620, 25, 300);
        System.out.println(a);
        System.out.println(a.chemicalRage());
    }

    static void task26() {
        System.out.println(new ElectricCar("Tesla", 2023, 450, 4, 75.0, 530));
    }

    static void task27() {
        CashbackPlatinumCard c = new CashbackPlatinumCard("Олег Петров", 20000, 5000, 3);
        System.out.println(c.pay(2000));
        System.out.println(c.pay(6000));
        System.out.println(c);
    }

    static void task28() {
        CustomTerminal t = new CustomTerminal();
        System.out.println(t.getWelcomeBanner("admin"));
        System.out.println(t.generateAuthHash("root"));
    }

    static void task29() {
        ImmutableServerCredentials c = new ImmutableServerCredentials("db.local", 5432, "abc123");
        System.out.println(c);
        System.out.println(c.getHost() + ":" + c.getPort());
    }

    static void task30() {
        Segment1D s = new Segment1D(3);
        Square2D q = new Square2D(3);
        Cube3D c = new Cube3D(3);
        System.out.println(s);
        System.out.println(q);
        System.out.println(c);
    }

    static void task31() {
        PostgraduateStudent p = new PostgraduateStudent(1, "asp@uni.ua", "KN-51", 90.5, "Нейромережі", "проф. Коваленко");
        PostgraduateStudent q = new PostgraduateStudent(2, "asp2@uni.ua", "KN-52", 70.0, "", "проф. Мороз");
        System.out.println(p + " | допуск: " + p.canDefend());
        System.out.println(q + " | допуск: " + q.canDefend());
    }

    static void task32() {
        Medicine m = new Medicine("Вітамін C", 120, false);
        PrescriptionMedicine pm = new PrescriptionMedicine("Антибіотик", 350, false, "LIC-001");
        ControlledSubstance cs = new ControlledSubstance("Седатив", 900, false, "LIC-002", 17);
        ControlledSubstance cs2 = new ControlledSubstance("Седатив", 900, false, "LIC-002", 30);
        System.out.println(m);
        System.out.println(pm + " " + pm.canSell(true) + " " + pm.canSell(false));
        System.out.println(cs + " " + cs.canSell(true));
        System.out.println(cs2 + " " + cs2.canSell(true) + " " + cs2.canSell(false));
    }

    static void task33() {
        System.out.println(new ArithmeticProgression(2, 3));
        System.out.println(new GeometricProgression(2, 3));
        System.out.println(java.util.Arrays.toString(new GeometricProgression(1, 2).generateFirstN(8)));
    }

    static void task34() {
        int[] g = {90, 70, 80};
        double[] w = {1, 2, 3};
        System.out.println(new GradeSheet("Олена", g));
        System.out.println(new WeightedGradeSheet("Олена", g, w));
    }

    static void task35() {
        LinearFunction l = new LinearFunction(2, 1);
        QuadraticFunction q = new QuadraticFunction(1, -4, 3);
        System.out.println(l + " ; f(3)=" + l.evaluate(3));
        System.out.println(q + " ; f(3)=" + q.evaluate(3) + " ; x0=" + q.getVertexX());
    }

    static void task36() {
        double[] prices = {100, 110, 120};
        WarehouseItem w = new WarehouseItem("Мишка", 10, prices);
        DiscountedWarehouseItem d = new DiscountedWarehouseItem("Мишка", 10, prices, "Пошкоджена упаковка", 20);
        System.out.println(w);
        System.out.println(d);
    }

    static void task37() {
        CinemaHall h = new CinemaHall("Зал 1", 3, 4, 150);
        h.bookSeat(0, 0);
        h.bookSeat(1, 2);
        h.bookSeat(2, 1);
        System.out.println(h);
        VipCinemaHall v = new VipCinemaHall("VIP", 3, 4, 150, 60);
        v.bookSeat(0, 0);
        v.bookSeat(2, 1);
        v.bookSeat(2, 3);
        System.out.println(v);
    }

    static void task38() {
        TeamLead lead = new TeamLead("Максим", 50000, "Java");
        lead.addTeamMember(new Developer("Anna", 30000, "Kotlin"));
        lead.addTeamMember(new Developer("Oleh", 28000, "Java"));
        System.out.println(lead);
    }

    static void task39() {
        ShieldedPaladin p = new ShieldedPaladin("Артас", 200, 5, 50);
        System.out.println(p);
        p.takeDamage(30);
        System.out.println(p);
        p.takeDamage(60);
        System.out.println(p);
    }

    static void task40() {
        System.out.println("git status");
        System.out.println("git add src/main/java/semester1/practice08/");
        System.out.println("git commit -m \"Complete Practice 08 tasks on encapsulation, inheritance and toString\"");
        System.out.println("git push");
    }
}

class Student {
    private String name;
    private int course;
    private double gpa;

    public Student(String name, int course, double gpa) {
        this.name = name;
        setCourse(course);
        setGpa(gpa);
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getCourse() { return course; }
    public void setCourse(int course) { this.course = (course >= 1 && course <= 6) ? course : 1; }
    public double getGpa() { return gpa; }
    public void setGpa(double gpa) { this.gpa = (gpa >= 0.0 && gpa <= 100.0) ? gpa : 60.0; }

    @Override
    public String toString() {
        return "Student{name='" + name + "', course=" + course + ", gpa=" + gpa + "}";
    }
}

class Product {
    private String sku;
    private String title;
    private double price;
    private int stock;

    public Product(String sku, String title, double price, int stock) {
        this.sku = sku;
        this.title = title;
        setPrice(price);
        setStock(stock);
    }

    public String getSku() { return sku; }
    public String getTitle() { return title; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price >= 0.0 ? price : 0.0; }
    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock >= 0 ? stock : 0; }

    public double getTotalCost() { return price * stock; }

    @Override
    public String toString() {
        return String.format("[SKU: %s] %s | Ціна: %.2f грн | Залишок: %d шт. | Разом: %.2f грн", sku, title, price, stock, getTotalCost());
    }
}

class Circle {
    private double radius;

    public Circle(double radius) { setRadius(radius); }

    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius > 0 ? radius : 1.0; }

    public double getArea() { return Math.PI * radius * radius; }
    public double getCircumference() { return 2 * Math.PI * radius; }

    @Override
    public String toString() {
        return String.format("Circle[r=%.2f, S=%.2f, C=%.2f]", radius, getArea(), getCircumference());
    }
}

class CardWallet {
    private String cardNumber;
    private String pinCode;
    private double balance;

    public CardWallet(String cardNumber, String pinCode, double balance) {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
        this.balance = Math.max(0.0, balance);
    }

    public double getBalance() { return balance; }

    public boolean changePin(String oldPin, String newPin) {
        if (pinCode.equals(oldPin) && newPin != null && newPin.length() == 4) {
            pinCode = newPin;
            return true;
        }
        return false;
    }

    private String masked() {
        String last4 = cardNumber.substring(cardNumber.length() - 4);
        return "**** **** **** " + last4;
    }

    @Override
    public String toString() {
        return String.format("CardWallet{card='%s', balance=%.2f UAH}", masked(), balance);
    }
}

class SensorNode {
    private String sensorId;
    protected double calibrationOffset;
    private double rawValue;

    public SensorNode(String sensorId, double rawValue, double calibrationOffset) {
        this.sensorId = sensorId;
        this.rawValue = rawValue;
        this.calibrationOffset = calibrationOffset;
    }

    public String getSensorId() { return sensorId; }

    public double getCalibratedValue() { return rawValue + calibrationOffset; }

    @Override
    public String toString() {
        return String.format("SensorNode{id='%s', raw=%.2f, calibrated=%.2f}", sensorId, rawValue, getCalibratedValue());
    }
}

class WeatherDay {
    private String date;
    private double[] hourlyTemps;

    public WeatherDay(String date, double[] hourlyTemps) {
        this.date = date;
        this.hourlyTemps = new double[hourlyTemps.length];
        for (int i = 0; i < hourlyTemps.length; i++) {
            this.hourlyTemps[i] = hourlyTemps[i];
        }
    }

    public double getMinTemp() {
        double min = hourlyTemps[0];
        for (double t : hourlyTemps) {
            if (t < min) min = t;
        }
        return min;
    }

    public double getMaxTemp() {
        double max = hourlyTemps[0];
        for (double t : hourlyTemps) {
            if (t > max) max = t;
        }
        return max;
    }

    public double getAverageTemp() {
        double sum = 0;
        for (double t : hourlyTemps) {
            sum += t;
        }
        return sum / hourlyTemps.length;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < hourlyTemps.length; i++) {
            if (i > 0) sb.append(", ");
            sb.append(hourlyTemps[i]);
        }
        sb.append("]");
        return String.format("WeatherDay{date=%s, temps=%s, avg=%.2f}", date, sb, getAverageTemp());
    }
}

class IntRange {
    private int min;
    private int max;

    public IntRange(int min, int max) { setRange(min, max); }

    public void setRange(int min, int max) {
        if (min > max) {
            int tmp = min;
            min = max;
            max = tmp;
        }
        this.min = min;
        this.max = max;
    }

    public boolean contains(int value) { return value >= min && value <= max; }
    public int getLength() { return max - min; }

    @Override
    public String toString() {
        return "[" + min + " .. " + max + "] (довжина: " + getLength() + ")";
    }
}

class InvoiceItem {
    private String description;
    private int quantity;
    private double unitPrice;
    private double discountPercent;

    public InvoiceItem(String description, int quantity, double unitPrice, double discountPercent) {
        this.description = description;
        this.quantity = Math.max(1, quantity);
        this.unitPrice = Math.max(0.0, unitPrice);
        this.discountPercent = (discountPercent >= 0 && discountPercent <= 50) ? discountPercent : 0.0;
    }

    public double getFinalAmount() {
        return quantity * unitPrice * (1 - discountPercent / 100.0);
    }

    @Override
    public String toString() {
        return String.format("%s x%d по %.2f грн, знижка %.1f%% = %.2f грн", description, quantity, unitPrice, discountPercent, getFinalAmount());
    }
}

class Employee {
    private String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() { return name; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + "}";
    }
}

class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String toString() {
        return String.format("Developer{%s, language='%s'}", super.toString(), programmingLanguage);
    }
}

class Animal {
    private String name;
    private int age;
    private double weight;

    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() { return name; }

    @Override
    public String toString() {
        return "Animal{name='" + name + "', age=" + age + ", weight=" + weight + "}";
    }
}

class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, double weight, String breed) {
        super(name, age, weight);
        this.breed = breed;
    }

    public String fetchStick() { return getName() + " приносить палицю!"; }

    @Override
    public String toString() {
        return "Dog{" + super.toString() + ", breed='" + breed + "'}";
    }
}

class Cat extends Animal {
    private boolean isIndoor;

    public Cat(String name, int age, double weight, boolean isIndoor) {
        super(name, age, weight);
        this.isIndoor = isIndoor;
    }

    public String purr() { return getName() + ": мур-мур"; }

    @Override
    public String toString() {
        return "Cat{" + super.toString() + ", indoor=" + isIndoor + "}";
    }
}

class Vehicle {
    protected String brand;
    protected int maxSpeed;
    protected double fuelTankCapacity;

    public Vehicle(String brand, int maxSpeed, double fuelTankCapacity) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.fuelTankCapacity = fuelTankCapacity;
    }

    @Override
    public String toString() {
        return "Vehicle{brand='" + brand + "', maxSpeed=" + maxSpeed + ", tank=" + fuelTankCapacity + "}";
    }
}

class PassengerCar extends Vehicle {
    private int passengerSeats;

    public PassengerCar(String brand, int maxSpeed, double fuelTankCapacity, int passengerSeats) {
        super(brand, maxSpeed, fuelTankCapacity);
        this.passengerSeats = passengerSeats;
    }

    @Override
    public String toString() {
        return "PassengerCar{" + super.toString() + ", seats=" + passengerSeats + "}";
    }
}

class CargoTruck extends Vehicle {
    private double maxLoadTons;

    public CargoTruck(String brand, int maxSpeed, double fuelTankCapacity, double maxLoadTons) {
        super(brand, maxSpeed, fuelTankCapacity);
        this.maxLoadTons = maxLoadTons;
    }

    public double getFullLoadConsumptionPer100Km() {
        return 20.0 + maxLoadTons * 1.8;
    }

    @Override
    public String toString() {
        return "CargoTruck{" + super.toString() + ", maxLoadTons=" + maxLoadTons + "}";
    }
}

class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() { return width; }
    public double getHeight() { return height; }
    public double getArea() { return width * height; }

    @Override
    public String toString() {
        return "Rectangle{" + width + "x" + height + ", area=" + getArea() + "}";
    }
}

class Box3D extends Rectangle {
    private double depth;

    public Box3D(double width, double height, double depth) {
        super(width, height);
        this.depth = depth;
    }

    public double getVolume() { return super.getArea() * depth; }

    @Override
    public String toString() {
        return "Box3D{" + super.toString() + ", depth=" + depth + ", volume=" + getVolume() + "}";
    }
}

class Person {
    private String fullName;
    private int birthYear;

    public Person(String fullName, int birthYear) {
        this.fullName = fullName;
        this.birthYear = birthYear;
    }

    public int getAge(int currentYear) { return currentYear - birthYear; }

    @Override
    public String toString() {
        return "Person{name='" + fullName + "', birthYear=" + birthYear + "}";
    }
}

class UniversityStudent extends Person {
    private String studentId;
    private String major;
    private int scholarship;

    public UniversityStudent(String fullName, int birthYear, String studentId, String major, int scholarship) {
        super(fullName, birthYear);
        this.studentId = studentId;
        this.major = major;
        this.scholarship = scholarship;
    }

    @Override
    public String toString() {
        return "UniversityStudent{" + super.toString() + ", id='" + studentId + "', major='" + major + "', scholarship=" + scholarship + "}";
    }
}

class Professor extends Person {
    private String academicTitle;
    private int publicationsCount;

    public Professor(String fullName, int birthYear, String academicTitle, int publicationsCount) {
        super(fullName, birthYear);
        this.academicTitle = academicTitle;
        this.publicationsCount = publicationsCount;
    }

    @Override
    public String toString() {
        return "Professor{" + super.toString() + ", title='" + academicTitle + "', publications=" + publicationsCount + "}";
    }
}

class Gadget {
    private String brand;
    private double price;

    public Gadget(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Gadget{brand='" + brand + "', price=" + price + "}";
    }
}

class Smartphone extends Gadget {
    private int memoryGb;
    private boolean has5G;

    public Smartphone(String brand, double price, int memoryGb, boolean has5G) {
        super(brand, price);
        this.memoryGb = memoryGb;
        this.has5G = has5G;
    }

    public Smartphone(String brand, double price, int memoryGb) {
        this(brand, price, memoryGb, true);
    }

    public Smartphone(String brand) {
        this(brand, 9999.0, 128, false);
    }

    @Override
    public String toString() {
        return "Smartphone{" + super.toString() + ", memory=" + memoryGb + "GB, 5G=" + has5G + "}";
    }
}

class Publication {
    private String title;
    private String author;
    private int releaseYear;

    public Publication(String title, String author, int releaseYear) {
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "Publication{title='" + title + "', author='" + author + "', year=" + releaseYear + "}";
    }
}

class PrintedBook extends Publication {
    private int pageCount;
    private String coverType;

    public PrintedBook(String title, String author, int releaseYear, int pageCount, String coverType) {
        super(title, author, releaseYear);
        this.pageCount = pageCount;
        this.coverType = coverType;
    }

    @Override
    public String toString() {
        return "PrintedBook{" + super.toString() + ", pages=" + pageCount + ", cover='" + coverType + "'}";
    }
}

class AudioBook extends Publication {
    private int durationMinutes;
    private String narrator;

    public AudioBook(String title, String author, int releaseYear, int durationMinutes, String narrator) {
        super(title, author, releaseYear);
        this.durationMinutes = durationMinutes;
        this.narrator = narrator;
    }

    public String formatDuration() {
        return (durationMinutes / 60) + " год " + (durationMinutes % 60) + " хв";
    }

    @Override
    public String toString() {
        return "AudioBook{" + super.toString() + ", duration=" + formatDuration() + ", narrator='" + narrator + "'}";
    }
}

class Gamer {
    private String nickname;
    private int hoursPlayed;

    public Gamer(String nickname, int hoursPlayed) {
        this.nickname = nickname;
        this.hoursPlayed = hoursPlayed;
    }

    @Override
    public String toString() {
        return "Gamer{nickname='" + nickname + "', hours=" + hoursPlayed + "}";
    }
}

class ProEsportsPlayer extends Gamer {
    private String teamName;
    private double prizeMoneyUSD;
    private int tournamentsWon;

    public ProEsportsPlayer(String nickname, int hoursPlayed, String teamName, double prizeMoneyUSD, int tournamentsWon) {
        super(nickname, hoursPlayed);
        this.teamName = teamName;
        this.prizeMoneyUSD = prizeMoneyUSD;
        this.tournamentsWon = tournamentsWon;
    }

    public double getAveragePrizePerWin() {
        return tournamentsWon == 0 ? 0.0 : prizeMoneyUSD / tournamentsWon;
    }

    @Override
    public String toString() {
        return String.format("ProEsportsPlayer{%s, team='%s', prize=%.2f USD, wins=%d}", super.toString(), teamName, prizeMoneyUSD, tournamentsWon);
    }
}

class StaffMember {
    private String name;
    private double baseSalary;

    public StaffMember(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() { return baseSalary; }
    public double calculateMonthlyPay() { return baseSalary; }

    @Override
    public String toString() {
        return String.format("StaffMember{name='%s', base=%.2f, pay=%.2f}", name, baseSalary, calculateMonthlyPay());
    }
}

class Manager extends StaffMember {
    private double teamBonus;

    public Manager(String name, double baseSalary, double teamBonus) {
        super(name, baseSalary);
        this.teamBonus = teamBonus;
    }

    @Override
    public double calculateMonthlyPay() { return super.calculateMonthlyPay() + teamBonus; }

    @Override
    public String toString() {
        return "Manager{" + super.toString() + ", teamBonus=" + teamBonus + "}";
    }
}

class SalesPerson extends StaffMember {
    private double salesVolume;
    private double commissionRate;

    public SalesPerson(String name, double baseSalary, double salesVolume, double commissionRate) {
        super(name, baseSalary);
        this.salesVolume = salesVolume;
        this.commissionRate = commissionRate;
    }

    @Override
    public double calculateMonthlyPay() {
        return super.calculateMonthlyPay() + salesVolume * (commissionRate / 100.0);
    }

    @Override
    public String toString() {
        return "SalesPerson{" + super.toString() + ", sales=" + salesVolume + ", rate=" + commissionRate + "%}";
    }
}

class StandardTransfer {
    protected double amount;

    public StandardTransfer(double amount) { this.amount = amount; }

    public double getFee() { return amount * 0.01; }
    public double getTotalWithFee() { return amount + getFee(); }

    @Override
    public String toString() {
        return String.format("StandardTransfer{amount=%.2f, fee=%.2f, total=%.2f}", amount, getFee(), getTotalWithFee());
    }
}

class InternationalTransfer extends StandardTransfer {
    private String countryCode;

    public InternationalTransfer(double amount, String countryCode) {
        super(amount);
        this.countryCode = countryCode;
    }

    @Override
    public double getFee() { return super.getFee() * 2 + 15.0; }

    @Override
    public String toString() {
        return "InternationalTransfer{" + super.toString() + ", country='" + countryCode + "'}";
    }
}

class Ticket {
    private String eventName;
    private double basePrice;

    public Ticket(String eventName, double basePrice) {
        this.eventName = eventName;
        this.basePrice = basePrice;
    }

    public double getFinalPrice() { return basePrice; }

    @Override
    public String toString() {
        return String.format("Ticket{event='%s', base=%.2f, final=%.2f}", eventName, basePrice, getFinalPrice());
    }
}

class StudentTicket extends Ticket {
    private String studentCardNumber;

    public StudentTicket(String eventName, double basePrice, String studentCardNumber) {
        super(eventName, basePrice);
        this.studentCardNumber = studentCardNumber;
    }

    @Override
    public double getFinalPrice() { return super.getFinalPrice() * 0.5; }

    @Override
    public String toString() {
        return "StudentTicket{" + super.toString() + ", card='" + studentCardNumber + "'}";
    }
}

class VipTicket extends Ticket {
    private boolean includesBackstage;
    private double loungeFee;

    public VipTicket(String eventName, double basePrice, boolean includesBackstage, double loungeFee) {
        super(eventName, basePrice);
        this.includesBackstage = includesBackstage;
        this.loungeFee = loungeFee;
    }

    @Override
    public double getFinalPrice() { return super.getFinalPrice() + loungeFee; }

    @Override
    public String toString() {
        return "VipTicket{" + super.toString() + ", backstage=" + includesBackstage + ", lounge=" + loungeFee + "}";
    }
}

class Weapon {
    private String title;
    private int baseDamage;

    public Weapon(String title, int baseDamage) {
        this.title = title;
        this.baseDamage = baseDamage;
    }

    public int getBaseDamage() { return baseDamage; }
    public int calculateDamage() { return baseDamage; }

    @Override
    public String toString() {
        return "Weapon{title='" + title + "', damage=" + calculateDamage() + "}";
    }
}

class EnchantedSword extends Weapon {
    private String element;
    private int magicPower;
    private int enchantmentLevel;

    public EnchantedSword(String title, int baseDamage, String element, int magicPower, int enchantmentLevel) {
        super(title, baseDamage);
        this.element = element;
        this.magicPower = magicPower;
        this.enchantmentLevel = enchantmentLevel;
    }

    @Override
    public int calculateDamage() { return super.calculateDamage() + magicPower * enchantmentLevel; }

    @Override
    public String toString() {
        return "EnchantedSword{" + super.toString() + ", element='" + element + "', physical=" + getBaseDamage()
                + ", magic=" + (magicPower * enchantmentLevel) + ", total=" + calculateDamage() + "}";
    }
}

class Parcel {
    private String trackingCode;
    private double weightKg;

    public Parcel(String trackingCode, double weightKg) {
        this.trackingCode = trackingCode;
        this.weightKg = weightKg;
    }

    public double calculateShippingCost() { return 50.0 + weightKg * 12.0; }

    @Override
    public String toString() {
        return String.format("Parcel{code='%s', weight=%.2f кг, cost=%.2f грн}", trackingCode, weightKg, calculateShippingCost());
    }
}

class FragileParcel extends Parcel {
    private boolean requiresWoodenBox;
    private double insuranceValue;

    public FragileParcel(String trackingCode, double weightKg, boolean requiresWoodenBox, double insuranceValue) {
        super(trackingCode, weightKg);
        this.requiresWoodenBox = requiresWoodenBox;
        this.insuranceValue = insuranceValue;
    }

    @Override
    public double calculateShippingCost() {
        double cost = super.calculateShippingCost() + insuranceValue * 0.015;
        if (requiresWoodenBox) {
            cost += 120.0;
        }
        return cost;
    }

    @Override
    public String toString() {
        return "FragileParcel{" + super.toString() + ", box=" + requiresWoodenBox + ", insurance=" + insuranceValue + "}";
    }
}

class Appliance {
    private String model;
    private double powerWatts;

    public Appliance(String model, double powerWatts) {
        this.model = model;
        this.powerWatts = powerWatts;
    }

    public double getDailyConsumptionKWh(int hours) { return (powerWatts * hours) / 1000.0; }

    @Override
    public String toString() {
        return String.format("Appliance{model='%s', power=%.0f Вт, 8h=%.2f кВт·год}", model, powerWatts, getDailyConsumptionKWh(8));
    }
}

class EcoHeater extends Appliance {
    private boolean ecoModeActive;

    public EcoHeater(String model, double powerWatts, boolean ecoModeActive) {
        super(model, powerWatts);
        this.ecoModeActive = ecoModeActive;
    }

    @Override
    public double getDailyConsumptionKWh(int hours) {
        double base = super.getDailyConsumptionKWh(hours);
        return ecoModeActive ? base * 0.75 : base;
    }

    @Override
    public String toString() {
        return "EcoHeater{" + super.toString() + ", eco=" + ecoModeActive + "}";
    }
}

class Point2D {
    private double x;
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }
    public double getY() { return y; }

    public double distanceToOrigin() { return Math.sqrt(x * x + y * y); }

    @Override
    public String toString() { return "(" + x + "; " + y + ")"; }
}

class Point3D extends Point2D {
    private double z;

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public double distanceToOrigin() {
        return Math.sqrt(Math.pow(super.distanceToOrigin(), 2) + z * z);
    }

    @Override
    public String toString() { return "(" + getX() + "; " + getY() + "; " + z + ")"; }
}

class Coffee {
    private String roastType;
    private int volumeMl;
    private double basePrice;

    public Coffee(String roastType, int volumeMl, double basePrice) {
        this.roastType = roastType;
        this.volumeMl = volumeMl;
        this.basePrice = basePrice;
    }

    public int getVolumeMl() { return volumeMl; }
    public double calculatePrice() { return basePrice; }
    public double calculateCalories() { return volumeMl * 0.02; }

    @Override
    public String toString() {
        return String.format("Coffee{roast='%s', %d мл, ціна=%.2f грн, %.1f ккал}", roastType, volumeMl, calculatePrice(), calculateCalories());
    }
}

class LatteWithAddons extends Coffee {
    private String milkType;
    private int syrupPumps;

    public LatteWithAddons(String roastType, int volumeMl, double basePrice, String milkType, int syrupPumps) {
        super(roastType, volumeMl, basePrice);
        this.milkType = milkType;
        this.syrupPumps = syrupPumps;
    }

    @Override
    public double calculatePrice() {
        double price = super.calculatePrice() + 12.0 * syrupPumps;
        if (milkType.equals("рослинне")) {
            price += 20.0;
        }
        return price;
    }

    @Override
    public double calculateCalories() {
        double milkCal = milkType.equals("рослинне") ? getVolumeMl() * 0.25 : getVolumeMl() * 0.4;
        return super.calculateCalories() + milkCal + syrupPumps * 20.0;
    }

    @Override
    public String toString() {
        return "LatteWithAddons{" + super.toString() + ", milk='" + milkType + "', syrup=" + syrupPumps + "}";
    }
}

class DotaHero {
    private String name;
    private String primaryAttribute;
    private int baseHp;

    public DotaHero(String name, String primaryAttribute, int baseHp) {
        this.name = name;
        this.primaryAttribute = primaryAttribute;
        this.baseHp = baseHp;
    }

    public String getName() { return name; }
    public int getMaxHp() { return baseHp; }

    @Override
    public String toString() {
        return "DotaHero{name='" + name + "', attribute='" + primaryAttribute + "', maxHp=" + getMaxHp() + "}";
    }
}

class StrengthHero extends DotaHero {
    private int strength;

    public StrengthHero(String name, int baseHp, int strength) {
        super(name, "Strength", baseHp);
        this.strength = strength;
    }

    @Override
    public int getMaxHp() { return super.getMaxHp() + strength * 22; }

    @Override
    public String toString() {
        return "StrengthHero{" + super.toString() + ", strength=" + strength + "}";
    }
}

class AlchemistHero extends StrengthHero {
    private int greevilsGreedBonusGold;

    public AlchemistHero(String name, int baseHp, int strength, int greevilsGreedBonusGold) {
        super(name, baseHp, strength);
        this.greevilsGreedBonusGold = greevilsGreedBonusGold;
    }

    public String chemicalRage() {
        return getName() + " активує Chemical Rage! HP: " + getMaxHp();
    }

    @Override
    public String toString() {
        return "AlchemistHero{" + super.toString() + ", bonusGold=" + greevilsGreedBonusGold + "}";
    }
}

class BaseVehicle {
    private String brand;
    private int year;

    public BaseVehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    @Override
    public String toString() {
        return "BaseVehicle{brand='" + brand + "', year=" + year + "}";
    }
}

class MotorCar extends BaseVehicle {
    private int horsePower;
    private int doorsCount;

    public MotorCar(String brand, int year, int horsePower, int doorsCount) {
        super(brand, year);
        this.horsePower = horsePower;
        this.doorsCount = doorsCount;
    }

    @Override
    public String toString() {
        return "MotorCar{" + super.toString() + ", hp=" + horsePower + ", doors=" + doorsCount + "}";
    }
}

class ElectricCar extends MotorCar {
    private double batteryCapacityKWh;
    private int rangeKm;

    public ElectricCar(String brand, int year, int horsePower, int doorsCount, double batteryCapacityKWh, int rangeKm) {
        super(brand, year, horsePower, doorsCount);
        this.batteryCapacityKWh = batteryCapacityKWh;
        this.rangeKm = rangeKm;
    }

    @Override
    public String toString() {
        return "ElectricCar{" + super.toString() + ", battery=" + batteryCapacityKWh + " kWh, range=" + rangeKm + " km}";
    }
}

class PaymentCard {
    private String cardHolder;
    protected double balance;

    public PaymentCard(String cardHolder, double balance) {
        this.cardHolder = cardHolder;
        this.balance = balance;
    }

    public boolean pay(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("PaymentCard{holder='%s', balance=%.2f}", cardHolder, balance);
    }
}

class DebitCard extends PaymentCard {
    private double dailyLimit;

    public DebitCard(String cardHolder, double balance, double dailyLimit) {
        super(cardHolder, balance);
        this.dailyLimit = dailyLimit;
    }

    @Override
    public boolean pay(double amount) {
        if (amount > dailyLimit) {
            return false;
        }
        return super.pay(amount);
    }

    @Override
    public String toString() {
        return "DebitCard{" + super.toString() + String.format(", dailyLimit=%.2f}", dailyLimit);
    }
}

class CashbackPlatinumCard extends DebitCard {
    private double cashbackPercent;
    private double accumulatedCashback;

    public CashbackPlatinumCard(String cardHolder, double balance, double dailyLimit, double cashbackPercent) {
        super(cardHolder, balance, dailyLimit);
        this.cashbackPercent = cashbackPercent;
    }

    @Override
    public boolean pay(double amount) {
        boolean ok = super.pay(amount);
        if (ok) {
            accumulatedCashback += amount * cashbackPercent / 100.0;
        }
        return ok;
    }

    @Override
    public String toString() {
        return "CashbackPlatinumCard{" + super.toString() + String.format(", cashback=%.2f%%, accumulated=%.2f}", cashbackPercent, accumulatedCashback);
    }
}

class SecurityTerminal {
    public final String generateAuthHash(String user) {
        return "AUTH-SHA-" + user.toUpperCase();
    }

    public String getWelcomeBanner(String user) {
        return "Welcome, " + user;
    }
}

class CustomTerminal extends SecurityTerminal {
    @Override
    public String getWelcomeBanner(String user) {
        return "*** CUSTOM TERMINAL *** " + super.getWelcomeBanner(user) + " [" + generateAuthHash(user) + "]";
    }
}

final class ImmutableServerCredentials {
    private final String host;
    private final int port;
    private final String apiKey;

    public ImmutableServerCredentials(String host, int port, String apiKey) {
        this.host = host;
        this.port = port;
        this.apiKey = apiKey;
    }

    public String getHost() { return host; }
    public int getPort() { return port; }
    public String getApiKey() { return apiKey; }

    @Override
    public String toString() {
        return "ImmutableServerCredentials{host='" + host + "', port=" + port + ", apiKey='***SECRET***'}";
    }
}

class Segment1D {
    protected double length;

    public Segment1D(double length) { this.length = length; }

    @Override
    public String toString() { return "Segment1D{length=" + length + "}"; }
}

class Square2D extends Segment1D {
    public Square2D(double side) { super(side); }

    public double getPerimeter() { return 4 * length; }
    public double getArea() { return length * length; }

    @Override
    public String toString() {
        return "Square2D{" + super.toString() + ", perimeter=" + getPerimeter() + ", faceArea=" + (length * length) + "}";
    }
}

class Cube3D extends Square2D {
    public Cube3D(double side) { super(side); }

    @Override
    public double getArea() { return 6 * super.getArea(); }

    public double getVolume() { return length * length * length; }

    @Override
    public String toString() {
        return "Cube3D{" + super.toString() + ", surfaceArea=" + getArea() + ", volume=" + getVolume() + "}";
    }
}

class User {
    private int id;
    private String email;

    public User(int id, String email) {
        this.id = id;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{id=" + id + ", email='" + email + "'}";
    }
}

class StudentUser extends User {
    private String groupCode;
    private double gpa;

    public StudentUser(int id, String email, String groupCode, double gpa) {
        super(id, email);
        this.groupCode = groupCode;
        this.gpa = gpa;
    }

    public double getGpa() { return gpa; }

    @Override
    public String toString() {
        return "StudentUser{" + super.toString() + ", group='" + groupCode + "', gpa=" + gpa + "}";
    }
}

class PostgraduateStudent extends StudentUser {
    private String thesisTopic;
    private String supervisorName;

    public PostgraduateStudent(int id, String email, String groupCode, double gpa, String thesisTopic, String supervisorName) {
        super(id, email, groupCode, gpa);
        this.thesisTopic = thesisTopic;
        this.supervisorName = supervisorName;
    }

    public boolean canDefend() {
        return getGpa() >= 85.0 && thesisTopic != null && !thesisTopic.isBlank();
    }

    @Override
    public String toString() {
        return "PostgraduateStudent{" + super.toString() + ", thesis='" + thesisTopic + "', supervisor='" + supervisorName + "'}";
    }
}

class Medicine {
    private String name;
    private double price;
    private boolean isExpired;

    public Medicine(String name, double price, boolean isExpired) {
        this.name = name;
        this.price = price;
        this.isExpired = isExpired;
    }

    public boolean isExpired() { return isExpired; }

    @Override
    public String toString() {
        return "Medicine{name='" + name + "', price=" + price + ", expired=" + isExpired + "}";
    }
}

class PrescriptionMedicine extends Medicine {
    private String doctorLicense;

    public PrescriptionMedicine(String name, double price, boolean isExpired, String doctorLicense) {
        super(name, price, isExpired);
        this.doctorLicense = doctorLicense;
    }

    public boolean canSell(boolean hasPrescription) {
        return !isExpired() && hasPrescription;
    }

    @Override
    public String toString() {
        return "PrescriptionMedicine{" + super.toString() + ", license='" + doctorLicense + "'}";
    }
}

class ControlledSubstance extends PrescriptionMedicine {
    private int patientAge;

    public ControlledSubstance(String name, double price, boolean isExpired, String doctorLicense, int patientAge) {
        super(name, price, isExpired, doctorLicense);
        this.patientAge = patientAge;
    }

    @Override
    public boolean canSell(boolean hasPrescription) {
        return super.canSell(hasPrescription) && patientAge >= 18;
    }

    @Override
    public String toString() {
        return "ControlledSubstance{" + super.toString() + ", patientAge=" + patientAge + "}";
    }
}

class Progression {
    protected double firstTerm;
    protected double step;

    public Progression(double firstTerm, double step) {
        this.firstTerm = firstTerm;
        this.step = step;
    }

    public double getTerm(int n) { return firstTerm; }

    public double[] generateFirstN(int n) {
        double[] result = new double[n];
        for (int i = 1; i <= n; i++) {
            result[i - 1] = getTerm(i);
        }
        return result;
    }

    protected String firstFive() {
        return java.util.Arrays.toString(generateFirstN(5));
    }

    @Override
    public String toString() {
        return "Progression{first=" + firstTerm + ", step=" + step + "}";
    }
}

class ArithmeticProgression extends Progression {
    public ArithmeticProgression(double firstTerm, double d) { super(firstTerm, d); }

    @Override
    public double getTerm(int n) { return firstTerm + (n - 1) * step; }

    @Override
    public String toString() {
        return "ArithmeticProgression{an = " + firstTerm + " + (n-1)*" + step + ", first5=" + firstFive() + "}";
    }
}

class GeometricProgression extends Progression {
    public GeometricProgression(double firstTerm, double q) { super(firstTerm, q); }

    @Override
    public double getTerm(int n) { return firstTerm * Math.pow(step, n - 1); }

    @Override
    public String toString() {
        return "GeometricProgression{bn = " + firstTerm + " * " + step + "^(n-1), first5=" + firstFive() + "}";
    }
}

class GradeSheet {
    private String studentName;
    protected int[] grades;

    public GradeSheet(String studentName, int[] grades) {
        this.studentName = studentName;
        this.grades = new int[grades.length];
        for (int i = 0; i < grades.length; i++) {
            this.grades[i] = grades[i];
        }
    }

    public String getStudentName() { return studentName; }

    public double calculateScore() {
        double sum = 0;
        for (int g : grades) {
            sum += g;
        }
        return sum / grades.length;
    }

    @Override
    public String toString() {
        return String.format("GradeSheet{student='%s', grades=%s, score=%.2f}", studentName, java.util.Arrays.toString(grades), calculateScore());
    }
}

class WeightedGradeSheet extends GradeSheet {
    private double[] weights;

    public WeightedGradeSheet(String studentName, int[] grades, double[] weights) {
        super(studentName, grades);
        this.weights = new double[weights.length];
        for (int i = 0; i < weights.length; i++) {
            this.weights[i] = weights[i];
        }
    }

    @Override
    public double calculateScore() {
        double sum = 0;
        double wSum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i] * weights[i];
            wSum += weights[i];
        }
        return wSum == 0 ? 0.0 : sum / wSum;
    }

    @Override
    public String toString() {
        return String.format("WeightedGradeSheet{%s, weights=%s, weightedScore=%.2f}", super.toString(), java.util.Arrays.toString(weights), calculateScore());
    }
}

class LinearFunction {
    protected double k;
    protected double b;

    public LinearFunction(double k, double b) {
        this.k = k;
        this.b = b;
    }

    public double evaluate(double x) { return k * x + b; }

    @Override
    public String toString() { return "f(x) = " + k + "x + " + b; }
}

class QuadraticFunction extends LinearFunction {
    private double a;

    public QuadraticFunction(double a, double k, double b) {
        super(k, b);
        this.a = a;
    }

    @Override
    public double evaluate(double x) { return a * x * x + super.evaluate(x); }

    public double getVertexX() { return -k / (2 * a); }

    @Override
    public String toString() { return "f(x) = " + a + "x^2 + " + k + "x + " + b; }
}

class WarehouseItem {
    private String name;
    private int quantity;
    private double[] priceHistory;

    public WarehouseItem(String name, int quantity, double[] priceHistory) {
        this.name = name;
        this.quantity = quantity;
        this.priceHistory = new double[priceHistory.length];
        for (int i = 0; i < priceHistory.length; i++) {
            this.priceHistory[i] = priceHistory[i];
        }
    }

    public int getQuantity() { return quantity; }

    public double getAveragePurchasePrice() {
        double sum = 0;
        for (double p : priceHistory) {
            sum += p;
        }
        return priceHistory.length == 0 ? 0.0 : sum / priceHistory.length;
    }

    @Override
    public String toString() {
        return String.format("WarehouseItem{name='%s', qty=%d, avgPrice=%.2f}", name, quantity, getAveragePurchasePrice());
    }
}

class DiscountedWarehouseItem extends WarehouseItem {
    private String markdownReason;
    private double discountPercent;

    public DiscountedWarehouseItem(String name, int quantity, double[] priceHistory, String markdownReason, double discountPercent) {
        super(name, quantity, priceHistory);
        this.markdownReason = markdownReason;
        this.discountPercent = discountPercent;
    }

    public double getClearanceValue() {
        return getAveragePurchasePrice() * (1 - discountPercent / 100.0) * getQuantity();
    }

    @Override
    public String toString() {
        return String.format("DiscountedWarehouseItem{%s, reason='%s', discount=%.1f%%, clearanceValue=%.2f}", super.toString(), markdownReason, discountPercent, getClearanceValue());
    }
}

class CinemaHall {
    private String hallName;
    protected boolean[][] seats;
    protected double baseTicketPrice;

    public CinemaHall(String hallName, int rows, int cols, double baseTicketPrice) {
        this.hallName = hallName;
        this.seats = new boolean[rows][cols];
        this.baseTicketPrice = baseTicketPrice;
    }

    public boolean bookSeat(int row, int col) {
        if (row < 0 || row >= seats.length || col < 0 || col >= seats[0].length || seats[row][col]) {
            return false;
        }
        seats[row][col] = true;
        return true;
    }

    public int getOccupiedCount() {
        int count = 0;
        for (boolean[] row : seats) {
            for (boolean s : row) {
                if (s) count++;
            }
        }
        return count;
    }

    public double calculateRevenue() { return getOccupiedCount() * baseTicketPrice; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName()).append(" '").append(hallName).append("'\n");
        for (boolean[] row : seats) {
            for (boolean s : row) {
                sb.append(s ? "[X]" : "[O]");
            }
            sb.append("\n");
        }
        sb.append(String.format("Зайнято: %d, виручка: %.2f грн", getOccupiedCount(), calculateRevenue()));
        return sb.toString();
    }
}

class VipCinemaHall extends CinemaHall {
    private double complimentaryBarCost;

    public VipCinemaHall(String hallName, int rows, int cols, double baseTicketPrice, double complimentaryBarCost) {
        super(hallName, rows, cols, baseTicketPrice);
        this.complimentaryBarCost = complimentaryBarCost;
    }

    @Override
    public double calculateRevenue() {
        double revenue = super.calculateRevenue();
        boolean[] last = seats[seats.length - 1];
        for (boolean s : last) {
            if (s) revenue += complimentaryBarCost;
        }
        return revenue;
    }
}

class TeamLead extends Developer {
    private Developer[] teamMembers = new Developer[10];
    private int memberCount = 0;

    public TeamLead(String name, double salary, String programmingLanguage) {
        super(name, salary, programmingLanguage);
    }

    public void addTeamMember(Developer dev) {
        if (memberCount < teamMembers.length) {
            teamMembers[memberCount++] = dev;
        }
    }

    public double getTotalTeamBudget() {
        double total = salary;
        for (int i = 0; i < memberCount; i++) {
            total += teamMembers[i].getSalary();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TeamLead{").append(super.toString()).append(String.format(", totalBudget=%.2f", getTotalTeamBudget())).append("}\n");
        for (int i = 0; i < memberCount; i++) {
            sb.append("  ").append(i + 1).append(". ").append(teamMembers[i]).append("\n");
        }
        return sb.toString().stripTrailing();
    }
}

class CharacterUnit {
    private String name;
    protected int hp;
    protected int maxHp;
    protected int armor;

    public CharacterUnit(String name, int maxHp, int armor) {
        this.name = name;
        this.maxHp = maxHp;
        this.hp = maxHp;
        this.armor = armor;
    }

    public void takeDamage(int rawDamage) {
        hp = Math.max(0, hp - Math.max(1, rawDamage - armor));
    }

    protected String healthBar() {
        int filled = (int) Math.round(10.0 * hp / maxHp);
        return "[" + "█".repeat(filled) + "░".repeat(10 - filled) + "]";
    }

    @Override
    public String toString() {
        return "CharacterUnit{name='" + name + "', HP=" + healthBar() + " " + hp + "/" + maxHp + ", armor=" + armor + "}";
    }
}

class ShieldedPaladin extends CharacterUnit {
    private int shieldPoints;

    public ShieldedPaladin(String name, int maxHp, int armor, int shieldPoints) {
        super(name, maxHp, armor);
        this.shieldPoints = shieldPoints;
    }

    @Override
    public void takeDamage(int rawDamage) {
        if (shieldPoints >= rawDamage) {
            shieldPoints -= rawDamage;
            return;
        }
        int remaining = rawDamage - shieldPoints;
        shieldPoints = 0;
        super.takeDamage(remaining);
    }

    @Override
    public String toString() {
        return "ShieldedPaladin{" + super.toString() + ", shield=" + shieldPoints + "}";
    }
}
