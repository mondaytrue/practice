import java.util.Arrays;
import java.util.Locale;

public class Practice09 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        ImmutableGeoPoint kyiv = new ImmutableGeoPoint(50.45, 30.52);
        ImmutableGeoPoint moved = kyiv.shift(45, 200);
        System.out.println(kyiv + " -> " + moved);

        double[] raw = {1.5, 2.5, 3.5};
        LabMeasurement lab = new LabMeasurement("Тест", raw);
        raw[0] = 999;
        lab.getSamples()[1] = 888;
        System.out.println("Зовнішній: " + Arrays.toString(raw) + " | Внутрішній: " + Arrays.toString(lab.getSamples()));

        CryptoVault vault = new CryptoVault("bc1qxyz", "alpha beta gamma", 1.5);
        System.out.println("Відправка при заблокованому: " + vault.sendBtc(0.5, "bc1dest"));
        System.out.println("Unlock (хибна фраза): " + vault.unlock("wrong"));
        System.out.println("Unlock (вірна фраза): " + vault.unlock("alpha beta gamma"));
        System.out.println("Відправка 0.5: " + vault.sendBtc(0.5, "bc1dest"));
        System.out.println("Відправка 5.0: " + vault.sendBtc(5.0, "bc1dest"));
        System.out.println(vault);

        ClosedInterval a = new ClosedInterval(10, 2);
        ClosedInterval b = new ClosedInterval(5, 20);
        System.out.println(a + "\n" + b + "\nПеретин: " + a.overlaps(b));
        a.resize(30, 25);
        System.out.println("Після resize: " + a + " | перетин з b: " + a.overlaps(b));

        RgbColor red = new RgbColor(300, 0, -5);
        RgbColor blue = new RgbColor(0, 0, 255);
        System.out.println(red + " | інверсія: " + red.invert() + " | мікс: " + red.mixWith(blue));

        HighSecuritySafe safe = new HighSecuritySafe(1234, 1000);
        System.out.println("Покласти 500 (pin ок): " + safe.putCash(1234, 500));
        System.out.println("Взяти 100 (хибний pin): " + safe.takeCash(1111, 100));
        System.out.println("Взяти 100 (хибний pin): " + safe.takeCash(2222, 100));
        System.out.println("Взяти 100 (хибний pin): " + safe.takeCash(3333, 100));
        System.out.println("Взяти 100 (вірний pin, але сейф заблоковано): " + safe.takeCash(1234, 100));
        System.out.println(safe);

        double[] coeffs = {1, -3, 0, 2};
        EncapsulatedPolynomial poly = new EncapsulatedPolynomial(coeffs);
        coeffs[0] = 100;
        System.out.println(poly + " | степінь: " + poly.getDegree() + " | P(2) = " + poly.evaluate(2));

        String[] allergies = {"Пеніцилін", "Горіхи"};
        MedicalRecord med = new MedicalRecord("P-001", "Іваненко Іван", 2, true, allergies);
        allergies[0] = "ЗЛАМАНО";
        System.out.println(med);
        System.out.println("Алергія на горіхи: " + med.hasAllergyTo("горіхи"));

        CompositeCircle circle = new CompositeCircle(0, 0, 5);
        System.out.println(circle + " | точка (3;4): " + circle.containsPoint(new Point2D(3, 4))
                + " | точка (6;0): " + circle.containsPoint(new Point2D(6, 0)));

        Automobile car = new Automobile("Tesla-like", "Бензин", 2000);
        car.accelerate(30);
        car.startEngine();
        car.accelerate(40);
        System.out.println(car);

        SmartDevice phone = new SmartDevice(5000, 6.7, 90);
        phone.watchVideo(60);
        System.out.println(phone);
        phone.watchVideo(2000);
        System.out.println(phone);

        Point2D s = new Point2D(0, 0);
        Point2D e = new Point2D(6, 8);
        LineSegment seg = new LineSegment(s, e);
        s.translate(100, 100);
        System.out.println(seg + " | довжина: " + seg.getLength() + " | середина: " + seg.getMidpoint());

        BankAccount family = new BankAccount("UA12345", 1000);
        PlasticCard card1 = new PlasticCard("4000-1111", "12/29", family);
        PlasticCard card2 = new PlasticCard("4000-2222", "01/30", family);
        System.out.println("Картка 1 платить 300: " + card1.payAtTerminal(300));
        System.out.println("Картка 2 платить 500: " + card2.payAtTerminal(500));
        card2.block();
        System.out.println("Картка 2 (заблокована) платить 10: " + card2.payAtTerminal(10));
        System.out.println(family);

        HeroCharacter hero = new HeroCharacter("Артас", 20);
        System.out.println("Без зброї: " + hero.attack());
        hero.equip(new WeaponItem("Меч", 15, 20));
        System.out.println("Удар 1: " + hero.attack() + " | Удар 2: " + hero.attack() + " | Удар 3: " + hero.attack());
        System.out.println(hero);

        ParcelOrder order = new ParcelOrder("ORD-1", 2.5, new DeliveryAddress("Київ", "Хрещатик", 5));
        System.out.println(order.changeDestination(new DeliveryAddress("Львів", "Городоцька", 12)));
        order.markAsShipped();
        System.out.println(order.changeDestination(new DeliveryAddress("Одеса", "Дерибасівська", 1)));
        System.out.println(order);

        ClimateController climate = new ClimateController(22.0, 18.0, 2.0);
        climate.regulate();
        System.out.println(climate);
        climate.getSensor().setCurrentTemp(22.5);
        climate.regulate();
        System.out.println(climate);

        Polyline line = new Polyline(10);
        line.addVertex(0, 0);
        line.addVertex(3, 0);
        line.addVertex(3, 4);
        System.out.printf("Довжина: %.2f | Замкнений периметр: %.2f%n", line.getTotalLength(), line.getClosedPerimeter());

        ShoppingOrder cart = new ShoppingOrder(10);
        cart.addItem("Хліб", 25.0, 2);
        cart.addItem("Молоко", 40.5, 1);
        cart.addItem("хліб", 25.0, 1);
        System.out.println(cart);

        Bookshelf shelf = new Bookshelf("Фантастика", 3);
        shelf.putBook(new BookItem("Дюна", "Герберт", 700));
        shelf.putBook(new BookItem("Соляріс", "Лем", 250));
        shelf.putBook(new BookItem("1984", "Орвелл", 330));
        System.out.println("Ще одна книга: " + shelf.putBook(new BookItem("Зайва", "Хтось", 1)));
        System.out.println("Найдовша: " + shelf.findLongestBook() + " | Сторінок: " + shelf.getTotalPagesOnShelf());

        Playlist pl = new Playlist("Ранок", 5);
        pl.addTrack(new AudioTrack("Intro", "Band A", 185));
        pl.addTrack(new AudioTrack("Run", "Band B", 242));
        System.out.println(pl);

        DataCenterCluster cluster = new DataCenterCluster("Frankfurt", 3);
        cluster.addNode(new ServerNode("10.0.0.1", 64, true));
        cluster.addNode(new ServerNode("10.0.0.2", 128, true));
        cluster.addNode(new ServerNode("10.0.0.3", 256, false));
        System.out.println("Контейнер 60 ГБ: " + cluster.deployContainer(60));
        System.out.println("Контейнер 100 ГБ: " + cluster.deployContainer(100));
        System.out.println("Контейнер 100 ГБ: " + cluster.deployContainer(100));
        System.out.println(cluster);

        UniversityCourse course = new UniversityCourse("Java", 3);
        course.addModule(new CourseModule("ООП", 30, 30, 40));
        course.addModule(new CourseModule("Колекції", 30, 30, 30));
        course.addModule(new CourseModule("Потоки", 30, 30, 30));
        System.out.printf("Кредити ЄКТС: %.1f | Сума балів = 100: %b%n", course.getEctsCredits(), course.isScoreTotal100());

        PassengerTrain train = new PassengerTrain("Київ — Львів", 3);
        train.attachCarriage(new TrainCarriage(1, "Купе", 36));
        train.attachCarriage(new TrainCarriage(2, "Інтерсіті", 60));
        System.out.println("Вільних місць: " + train.getTotalFreeSeats());
        System.out.println("Бронь 10 місць у вагоні 1: " + train.bookTicketsInCarriage(1, 10));
        System.out.println("Бронь 50 місць у вагоні 1: " + train.bookTicketsInCarriage(1, 50));
        System.out.println("Вільних місць: " + train.getTotalFreeSeats());

        EquationSystem system = new EquationSystem(2);
        system.addEquation(new LinearEquation(1, 1, 5));
        system.addEquation(new LinearEquation(1, -1, 1));
        System.out.println("(3; 2): " + system.checkSolution(3, 2) + " | (1; 4): " + system.checkSolution(1, 4));

        AbstractShape c = new CircleShape("Червоний", 2);
        AbstractShape r = new RectangleShape("Синій", 3, 4);
        System.out.println(c + "\n" + r);

        AbstractPowerPlant solar = new SolarPowerPlant("Сонячна-1", 100, 0.6);
        AbstractPowerPlant wind = new WindPowerPlant("Вітрова-1", 80, 10);
        AbstractPowerPlant calmWind = new WindPowerPlant("Вітрова-2", 80, 1);
        System.out.printf("%s: %.1f МВт, прибуток/доба %.0f%n", solar.getStationName(), solar.generateMegawatts(), solar.calculateDailyProfit(50));
        System.out.printf("%s: %.1f МВт, прибуток/доба %.0f%n", wind.getStationName(), wind.generateMegawatts(), wind.calculateDailyProfit(50));
        System.out.printf("%s: %.1f МВт (штиль)%n", calmWind.getStationName(), calmWind.generateMegawatts());

        AbstractEmployee e1 = new SalariedEmployee(1, "Олена", 50000, 5000);
        AbstractEmployee e2 = new HourlyContractor(2, "Максим", 180, 300);
        System.out.printf("%s: брутто %.2f, нетто %.2f%n", e1.getName(), e1.calculateGrossSalary(), e1.calculateNetSalary());
        System.out.printf("%s: брутто %.2f, нетто %.2f%n", e2.getName(), e2.calculateGrossSalary(), e2.calculateNetSalary());

        AbstractSequence harm = new HarmonicSequence();
        AbstractSequence sq = new SquareNumbersSequence();
        System.out.printf("%s: сума 10 = %.6f%n", harm.getTitle(), harm.sumFirstN(10));
        System.out.printf("%s: сума 10 = %.1f%n", sq.getTitle(), sq.sumFirstN(10));

        AbstractTransaction t1 = new DomesticTransfer("TX-1", 100);
        AbstractTransaction t2 = new DomesticTransfer("TX-2", 10000);
        AbstractTransaction t3 = new CryptoTransfer("TX-3", 500, 12.5);
        System.out.println(t1 + "\n" + t2 + "\n" + t3);

        Solid3D steelSphere = new Sphere3D("Сталь", 7850, 0.5);
        Solid3D goldCylinder = new Cylinder3D("Золото", 19320, 0.1, 0.3);
        System.out.println(steelSphere + "\n" + goldCylinder);

        PressureSensor pressure = new PressureSensor("Котельня", 1.0, 5.0, 1.1);
        pressure.updateRawReading(4.0);
        RadiationSensor rad = new RadiationSensor("Лабораторія", 0.0, 0.3);
        rad.updateRawReading(0.9);
        System.out.println(pressure + "\n" + rad);

        AbstractCompressor zip = new ZipCompressor();
        AbstractCompressor lzma = new UltraLzmaCompressor();
        System.out.printf("%s: %d -> %d, стиснення %.1f%%%n", zip.getAlgorithmName(), 10000, zip.estimateCompressedSize(10000), zip.getCompressionRatio(10000));
        System.out.printf("%s: %d -> %d, стиснення %.1f%%%n", lzma.getAlgorithmName(), 10000, lzma.estimateCompressedSize(10000), lzma.getCompressionRatio(10000));

        DesktopPC pc = new DesktopPC(650, 4);
        pc.addPart(new ProcessorPart("Ryzen 7", 12000, 8, 105));
        pc.addPart(new VideoCardPart("RTX 4070", 25000, 12, 200));
        System.out.println("Споживання: " + pc.getTotalPowerWatts() + " Вт | стабільна: " + pc.isStable());
        pc.addPart(new VideoCardPart("RTX 4090", 80000, 24, 450));
        System.out.println("Споживання: " + pc.getTotalPowerWatts() + " Вт | стабільна: " + pc.isStable());

        Spacecraft ship = new Spacecraft("Explorer", 5.0, 4);
        ship.addThruster(new ChemicalThruster("C-1", 80, 3.5));
        ship.addThruster(new IonThruster("I-1", 0.5, 0.02));
        System.out.printf("Тяга: %.2f кН | Прискорення: %.3f м/с² | Витрата палива: %.2f%n",
                ship.getTotalThrustKn(), ship.getInitialAcceleration(), ship.getTotalFuelBurnRate());

        LandPlot plot = new LandPlot(1000, 5);
        System.out.println("Будинок 20x20 (400): " + plot.addStructure(new RectangleShape("Сірий", 20, 20)));
        System.out.println("Клумба r=7 (~154): " + plot.addStructure(new CircleShape("Зелений", 7)));
        System.out.println("Гараж 10x10 (100): " + plot.addStructure(new RectangleShape("Білий", 10, 10)));
        System.out.printf("Вільний газон: %.2f м²%n", plot.getFreeGreenArea());

        InvestmentPortfolio pf = new InvestmentPortfolio("Інвестор", 5);
        pf.addAsset(new GovernmentBond("UA-BOND", 100000, 0.155));
        pf.addAsset(new DividendStock("AAPL", 50000, 0.08, 0.02, 0.18));
        System.out.printf("Вартість: %.2f | Річний прибуток: %.2f%n", pf.getTotalInvested(), pf.getExpectedAnnualReturn());

        RaidParty party = new RaidParty("Легіон", 5);
        party.addMember(new TankWarrior("Грім", 500, 80));
        party.addMember(new ArcaneMage("Мерлін", 200, 90, 3.0));
        System.out.println("Сила загону: " + party.getTotalCombatPower());
        System.out.println("Готові до підземелля 500: " + party.isReadyForRaid(500));
        System.out.println("Готові до підземелля 5000: " + party.isReadyForRaid(5000));

        SmartLab lab2 = new SmartLab(3);
        PressureSensor ps = new PressureSensor("Реактор", 1.0, 5.0, 1.0);
        ps.updateRawReading(3.0);
        lab2.addSensor(ps);
        lab2.runDiagnostics();
        ps.updateRawReading(9.0);
        lab2.runDiagnostics();

        double[] signal = {0.5, 1.0, -2.0, 3.0};
        SignalProcessor proc = new SignalProcessor(3);
        proc.addFilter(new AmplifierFilter(2.0));
        proc.addFilter(new ClippingFilter(3.0));
        System.out.println("Вхід: " + Arrays.toString(signal) + " -> Вихід: " + Arrays.toString(proc.process(signal)));

        System.out.println("git status");
        System.out.println("git add src/main/java/semester1/practice09/");
        System.out.println("git commit -m \"feat(practice09): complete 40 tasks on encapsulation, composition and abstract classes\"");
        System.out.println("git push origin main");
    }

    static class ImmutableGeoPoint {
        private final double latitude;
        private final double longitude;

        public ImmutableGeoPoint(double latitude, double longitude) {
            this.latitude = Math.max(-90.0, Math.min(90.0, latitude));
            this.longitude = Math.max(-180.0, Math.min(180.0, longitude));
        }

        public double getLatitude() {
            return latitude;
        }

        public double getLongitude() {
            return longitude;
        }

        public ImmutableGeoPoint shift(double dLat, double dLon) {
            return new ImmutableGeoPoint(latitude + dLat, longitude + dLon);
        }

        @Override
        public String toString() {
            return String.format("GeoPoint(%.4f; %.4f)", latitude, longitude);
        }
    }

    static class LabMeasurement {
        private final String experimentName;
        private final double[] samples;

        public LabMeasurement(String experimentName, double[] samples) {
            this.experimentName = experimentName;
            this.samples = (samples == null) ? new double[0] : Arrays.copyOf(samples, samples.length);
        }

        public double[] getSamples() {
            return Arrays.copyOf(samples, samples.length);
        }

        @Override
        public String toString() {
            return experimentName + Arrays.toString(samples);
        }
    }

    static class CryptoVault {
        private final String walletAddress;
        private final String secretRecoveryPhrase;
        private double btcBalance;
        private boolean locked;

        public CryptoVault(String walletAddress, String secretRecoveryPhrase, double initialBalance) {
            this.walletAddress = walletAddress;
            this.secretRecoveryPhrase = secretRecoveryPhrase;
            this.btcBalance = Math.max(0, initialBalance);
            this.locked = true;
        }

        public boolean unlock(String phrase) {
            if (phrase != null && phrase.equals(secretRecoveryPhrase)) {
                locked = false;
                return true;
            }
            return false;
        }

        public void lock() {
            locked = true;
        }

        public boolean sendBtc(double amount, String destination) {
            if (locked || amount <= 0 || btcBalance < amount || destination == null || destination.isBlank()) {
                return false;
            }
            btcBalance -= amount;
            return true;
        }

        @Override
        public String toString() {
            return String.format("CryptoVault{address='%s', %s, balance=%.4f BTC}",
                    walletAddress, locked ? "ЗАБЛОКОВАНО" : "розблоковано", btcBalance);
        }
    }

    static class ClosedInterval {
        private double start;
        private double end;

        public ClosedInterval(double start, double end) {
            resize(start, end);
        }

        public void resize(double newStart, double newEnd) {
            if (newStart > newEnd) {
                this.start = newEnd;
                this.end = newStart;
            } else {
                this.start = newStart;
                this.end = newEnd;
            }
        }

        public double getLength() {
            return end - start;
        }

        public double getMidpoint() {
            return (start + end) / 2.0;
        }

        public boolean overlaps(ClosedInterval other) {
            return start <= other.end && other.start <= end;
        }

        @Override
        public String toString() {
            return String.format("[%.2f; %.2f] (центр: %.2f, довжина: %.2f)", start, end, getMidpoint(), getLength());
        }
    }

    static class RgbColor {
        private final int red;
        private final int green;
        private final int blue;

        public RgbColor(int red, int green, int blue) {
            this.red = clamp(red);
            this.green = clamp(green);
            this.blue = clamp(blue);
        }

        private static int clamp(int val) {
            return Math.max(0, Math.min(255, val));
        }

        public String toHex() {
            return String.format("#%02X%02X%02X", red, green, blue);
        }

        public RgbColor invert() {
            return new RgbColor(255 - red, 255 - green, 255 - blue);
        }

        public RgbColor mixWith(RgbColor other) {
            return new RgbColor((red + other.red) / 2, (green + other.green) / 2, (blue + other.blue) / 2);
        }

        @Override
        public String toString() {
            return String.format("RGB(%d, %d, %d) %s", red, green, blue, toHex());
        }
    }

    static class HighSecuritySafe {
        private final int pinCode;
        private double storedCash;
        private int failedAttempts;
        private boolean permanentlyBlocked;

        public HighSecuritySafe(int pinCode, double storedCash) {
            this.pinCode = pinCode;
            this.storedCash = Math.max(0, storedCash);
        }

        private boolean checkAccess(int enteredPin) {
            if (permanentlyBlocked) {
                return false;
            }
            if (enteredPin != pinCode) {
                failedAttempts++;
                if (failedAttempts >= 3) {
                    permanentlyBlocked = true;
                }
                return false;
            }
            failedAttempts = 0;
            return true;
        }

        public boolean putCash(int pin, double amount) {
            if (!checkAccess(pin) || amount <= 0) {
                return false;
            }
            storedCash += amount;
            return true;
        }

        public boolean takeCash(int pin, double amount) {
            if (!checkAccess(pin) || amount <= 0 || amount > storedCash) {
                return false;
            }
            storedCash -= amount;
            return true;
        }

        @Override
        public String toString() {
            return String.format("HighSecuritySafe{cash=%.2f, failedAttempts=%d, blocked=%b}",
                    storedCash, failedAttempts, permanentlyBlocked);
        }
    }

    static class EncapsulatedPolynomial {
        private final double[] coeffs;

        public EncapsulatedPolynomial(double[] coeffs) {
            this.coeffs = (coeffs == null || coeffs.length == 0)
                    ? new double[]{0} : Arrays.copyOf(coeffs, coeffs.length);
        }

        public int getDegree() {
            for (int i = coeffs.length - 1; i > 0; i--) {
                if (coeffs[i] != 0) {
                    return i;
                }
            }
            return 0;
        }

        public double getCoefficient(int power) {
            if (power < 0 || power >= coeffs.length) {
                return 0;
            }
            return coeffs[power];
        }

        public double evaluate(double x) {
            double result = 0;
            for (int i = coeffs.length - 1; i >= 0; i--) {
                result = result * x + coeffs[i];
            }
            return result;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder("P(x) = ");
            boolean first = true;
            for (int i = coeffs.length - 1; i >= 0; i--) {
                double c = coeffs[i];
                if (c == 0) {
                    continue;
                }
                if (!first) {
                    sb.append(c > 0 ? " + " : " - ");
                } else if (c < 0) {
                    sb.append("-");
                }
                sb.append(Math.abs(c));
                if (i == 1) {
                    sb.append("x");
                } else if (i > 1) {
                    sb.append("x^").append(i);
                }
                first = false;
            }
            if (first) {
                sb.append("0");
            }
            return sb.toString();
        }
    }

    static class MedicalRecord {
        private final String patientId;
        private String fullName;
        private int bloodGroup;
        private boolean rhPositive;
        private final String[] allergies;

        public MedicalRecord(String patientId, String fullName, int bloodGroup, boolean rhPositive, String[] allergies) {
            this.patientId = patientId;
            this.fullName = fullName;
            this.bloodGroup = Math.max(1, Math.min(4, bloodGroup));
            this.rhPositive = rhPositive;
            this.allergies = (allergies == null) ? new String[0] : Arrays.copyOf(allergies, allergies.length);
        }

        public String[] getAllergies() {
            return Arrays.copyOf(allergies, allergies.length);
        }

        public boolean hasAllergyTo(String substance) {
            for (int i = 0; i < allergies.length; i++) {
                if (allergies[i].equalsIgnoreCase(substance)) {
                    return true;
                }
            }
            return false;
        }

        private String bloodGroupText() {
            if (bloodGroup == 1) {
                return "I (O)";
            } else if (bloodGroup == 2) {
                return "II (A)";
            } else if (bloodGroup == 3) {
                return "III (B)";
            }
            return "IV (AB)";
        }

        @Override
        public String toString() {
            return String.format("MedicalRecord{id='%s', %s, кров: %s Rh%s, алергії: %s}",
                    patientId, fullName, bloodGroupText(), rhPositive ? "+" : "-", Arrays.toString(allergies));
        }
    }

    static class Point2D {
        private double x;
        private double y;

        public Point2D(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        public void translate(double dx, double dy) {
            x += dx;
            y += dy;
        }

        public double distanceTo(Point2D other) {
            double dx = x - other.x;
            double dy = y - other.y;
            return Math.sqrt(dx * dx + dy * dy);
        }

        @Override
        public String toString() {
            return String.format("(%.2f; %.2f)", x, y);
        }
    }

    static class CompositeCircle {
        private double radius;
        private final Point2D center;

        public CompositeCircle(double centerX, double centerY, double radius) {
            this.center = new Point2D(centerX, centerY);
            this.radius = (radius > 0) ? radius : 1.0;
        }

        public boolean containsPoint(Point2D p) {
            return center.distanceTo(p) <= radius;
        }

        @Override
        public String toString() {
            return "CompositeCircle{center=" + center + ", r=" + radius + "}";
        }
    }

    static class Engine {
        private final String fuelType;
        private final int volumeCc;
        private int rpm;
        private boolean started;

        public Engine(String fuelType, int volumeCc) {
            this.fuelType = fuelType;
            this.volumeCc = volumeCc;
        }

        public void start() {
            started = true;
            rpm = 800;
        }

        public void stop() {
            started = false;
            rpm = 0;
        }

        public void setRpm(int rpm) {
            if (started) {
                this.rpm = Math.max(800, Math.min(7000, rpm));
            }
        }

        public boolean isStarted() {
            return started;
        }

        @Override
        public String toString() {
            return String.format("Engine{%s, %d cc, rpm=%d, started=%b}", fuelType, volumeCc, rpm, started);
        }
    }

    static class Automobile {
        private final String model;
        private double speed;
        private final Engine engine;

        public Automobile(String model, String fuelType, int volumeCc) {
            this.model = model;
            this.engine = new Engine(fuelType, volumeCc);
        }

        public void startEngine() {
            engine.start();
        }

        public void accelerate(double deltaSpeed) {
            if (!engine.isStarted()) {
                System.out.println(model + ": двигун не заведений, розгін неможливий!");
                return;
            }
            speed += Math.max(0, deltaSpeed);
            engine.setRpm(800 + (int) (speed * 40));
        }

        @Override
        public String toString() {
            return String.format("Automobile{model='%s', speed=%.1f, %s}", model, speed, engine);
        }
    }

    static class Battery {
        private final int capacityMah;
        private int chargePercent;

        public Battery(int capacityMah, int chargePercent) {
            this.capacityMah = capacityMah;
            this.chargePercent = Math.max(0, Math.min(100, chargePercent));
        }

        public void drain(int percent) {
            chargePercent = Math.max(0, chargePercent - Math.max(0, percent));
        }

        public void charge(int percent) {
            chargePercent = Math.min(100, chargePercent + Math.max(0, percent));
        }

        public int getChargePercent() {
            return chargePercent;
        }

        @Override
        public String toString() {
            return String.format("Battery{%d mAh, %d%%}", capacityMah, chargePercent);
        }
    }

    static class Display {
        private final double diagonalInches;
        private int brightnessPercent;

        public Display(double diagonalInches, int brightnessPercent) {
            this.diagonalInches = diagonalInches;
            this.brightnessPercent = Math.max(10, Math.min(100, brightnessPercent));
        }

        public int getBrightnessPercent() {
            return brightnessPercent;
        }

        @Override
        public String toString() {
            return String.format("Display{%.1f\", %d%%}", diagonalInches, brightnessPercent);
        }
    }

    static class SmartDevice {
        private final Battery battery;
        private final Display display;
        private boolean on = true;

        public SmartDevice(int capacityMah, double diagonalInches, int brightnessPercent) {
            this.battery = new Battery(capacityMah, 100);
            this.display = new Display(diagonalInches, brightnessPercent);
        }

        public void watchVideo(int minutes) {
            if (!on || minutes <= 0) {
                return;
            }
            int perTenMinutes = (display.getBrightnessPercent() > 70) ? 2 : 1;
            battery.drain((minutes / 10) * perTenMinutes);
            if (battery.getChargePercent() == 0) {
                on = false;
            }
        }

        @Override
        public String toString() {
            return String.format("SmartDevice{%s, %s, %s}", battery, display, on ? "увімкнено" : "ВИМКНЕНО");
        }
    }

    static class LineSegment {
        private final Point2D start;
        private final Point2D end;

        public LineSegment(Point2D start, Point2D end) {

            this.start = new Point2D(start.getX(), start.getY());
            this.end = new Point2D(end.getX(), end.getY());
        }

        public double getLength() {
            return start.distanceTo(end);
        }

        public Point2D getMidpoint() {
            return new Point2D((start.getX() + end.getX()) / 2, (start.getY() + end.getY()) / 2);
        }

        @Override
        public String toString() {
            return "LineSegment{" + start + " -> " + end + "}";
        }
    }

    static class BankAccount {
        private final String iban;
        private double balance;

        public BankAccount(String iban, double balance) {
            this.iban = iban;
            this.balance = Math.max(0, balance);
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

        @Override
        public String toString() {
            return String.format("BankAccount{%s, balance=%.2f}", iban, balance);
        }
    }

    static class PlasticCard {
        private final String cardNumber;
        private final String expiryDate;
        private boolean blocked;
        private final BankAccount linkedAccount;

        public PlasticCard(String cardNumber, String expiryDate, BankAccount linkedAccount) {
            this.cardNumber = cardNumber;
            this.expiryDate = expiryDate;
            this.linkedAccount = linkedAccount;
        }

        public void block() {
            blocked = true;
        }

        public boolean payAtTerminal(double amount) {
            if (blocked) {
                return false;
            }
            return linkedAccount.withdraw(amount);
        }
    }

    static class WeaponItem {
        private final String name;
        private final int bonusDamage;
        private int durability;

        public WeaponItem(String name, int bonusDamage, int durability) {
            this.name = name;
            this.bonusDamage = Math.max(0, bonusDamage);
            this.durability = Math.max(0, Math.min(100, durability));
        }

        public int useWeapon() {
            if (durability == 0) {
                return 0;
            }
            durability = Math.max(0, durability - 10);
            return bonusDamage;
        }

        @Override
        public String toString() {
            return String.format("%s(+%d, міцність %d)", name, bonusDamage, durability);
        }
    }

    static class HeroCharacter {
        private final String nickname;
        private int baseStrength;
        private WeaponItem equippedWeapon;

        public HeroCharacter(String nickname, int baseStrength) {
            this.nickname = nickname;
            this.baseStrength = Math.max(1, baseStrength);
        }

        public void equip(WeaponItem newWeapon) {
            this.equippedWeapon = newWeapon;
        }

        public void unequip() {
            this.equippedWeapon = null;
        }

        public int attack() {
            int bonus = (equippedWeapon != null) ? equippedWeapon.useWeapon() : 0;
            return baseStrength + bonus;
        }

        @Override
        public String toString() {
            return "Hero{" + nickname + ", сила=" + baseStrength + ", зброя=" + (equippedWeapon == null ? "немає" : equippedWeapon) + "}";
        }
    }

    static class DeliveryAddress {
        private final String city;
        private final String street;
        private final int postOfficeNumber;

        public DeliveryAddress(String city, String street, int postOfficeNumber) {
            this.city = (city == null || city.isBlank()) ? "Невідомо" : city;
            this.street = (street == null || street.isBlank()) ? "Невідомо" : street;
            this.postOfficeNumber = Math.max(1, postOfficeNumber);
        }

        @Override
        public String toString() {
            return city + ", " + street + ", відділення №" + postOfficeNumber;
        }
    }

    static class ParcelOrder {
        private final String orderId;
        private double weightKg;
        private DeliveryAddress destination;
        private boolean shipped;

        public ParcelOrder(String orderId, double weightKg, DeliveryAddress destination) {
            this.orderId = orderId;
            this.weightKg = Math.max(0.1, weightKg);
            this.destination = destination;
        }

        public boolean changeDestination(DeliveryAddress newAddress) {
            if (shipped || newAddress == null) {
                return false;
            }
            this.destination = newAddress;
            return true;
        }

        public void markAsShipped() {
            shipped = true;
        }

        @Override
        public String toString() {
            return String.format("ParcelOrder{%s, %.1f кг, %s, %s}", orderId, weightKg, destination, shipped ? "відправлено" : "очікує");
        }
    }

    static class TemperatureSensor {
        private double currentTemp;

        public TemperatureSensor(double currentTemp) {
            this.currentTemp = currentTemp;
        }

        public double getCurrentTemp() {
            return currentTemp;
        }

        public void setCurrentTemp(double currentTemp) {
            this.currentTemp = currentTemp;
        }
    }

    static class HeatingUnit {
        private boolean heatingOn;
        private final double powerKw;

        public HeatingUnit(double powerKw) {
            this.powerKw = powerKw;
        }

        public void turnOn() {
            heatingOn = true;
        }

        public void turnOff() {
            heatingOn = false;
        }

        public boolean isHeatingOn() {
            return heatingOn;
        }

        @Override
        public String toString() {
            return "HeatingUnit{" + powerKw + " кВт, " + (heatingOn ? "ON" : "OFF") + "}";
        }
    }

    static class ClimateController {
        private final TemperatureSensor sensor;
        private final HeatingUnit heater;
        private final double targetTemp;

        public ClimateController(double targetTemp, double startTemp, double heaterPowerKw) {
            this.targetTemp = targetTemp;
            this.sensor = new TemperatureSensor(startTemp);
            this.heater = new HeatingUnit(heaterPowerKw);
        }

        public TemperatureSensor getSensor() {
            return sensor;
        }

        public void regulate() {
            double t = sensor.getCurrentTemp();
            if (t < targetTemp - 0.5) {
                heater.turnOn();
            } else if (t >= targetTemp) {
                heater.turnOff();
            }
        }

        @Override
        public String toString() {
            return String.format("ClimateController{target=%.1f, current=%.1f, %s}", targetTemp, sensor.getCurrentTemp(), heater);
        }
    }

    static class Polyline {
        private final Point2D[] vertices;
        private int count;

        public Polyline(int capacity) {
            this.vertices = new Point2D[Math.max(2, capacity)];
        }

        public void addVertex(double x, double y) {
            if (count < vertices.length) {
                vertices[count++] = new Point2D(x, y);
            }
        }

        public double getTotalLength() {
            double sum = 0;
            for (int i = 0; i + 1 < count; i++) {
                sum += vertices[i].distanceTo(vertices[i + 1]);
            }
            return sum;
        }

        public double getClosedPerimeter() {
            if (count < 3) {
                return getTotalLength();
            }
            return getTotalLength() + vertices[count - 1].distanceTo(vertices[0]);
        }
    }

    static class OrderItem {
        private final String productName;
        private final double unitPrice;
        private int quantity;

        public OrderItem(String productName, double unitPrice, int quantity) {
            this.productName = productName;
            this.unitPrice = Math.max(0, unitPrice);
            this.quantity = Math.max(1, quantity);
        }

        public String getProductName() {
            return productName;
        }

        public void addQuantity(int extra) {
            if (extra > 0) {
                quantity += extra;
            }
        }

        public double getItemTotal() {
            return unitPrice * quantity;
        }

        @Override
        public String toString() {
            return String.format("%-10s %6.2f x %d = %8.2f", productName, unitPrice, quantity, getItemTotal());
        }
    }

    static class ShoppingOrder {
        private final OrderItem[] items;
        private int itemCount;

        public ShoppingOrder(int capacity) {
            this.items = new OrderItem[Math.max(1, capacity)];
        }

        public void addItem(String name, double price, int qty) {
            for (int i = 0; i < itemCount; i++) {
                if (items[i].getProductName().equalsIgnoreCase(name)) {
                    items[i].addQuantity(qty);
                    return;
                }
            }
            if (itemCount < items.length) {
                items[itemCount++] = new OrderItem(name, price, qty);
            }
        }

        public double calculateGrandTotal() {
            double sum = 0;
            for (int i = 0; i < itemCount; i++) {
                sum += items[i].getItemTotal();
            }
            return sum;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder("----- ЧЕК -----\n");
            for (int i = 0; i < itemCount; i++) {
                sb.append(items[i]).append("\n");
            }
            sb.append(String.format("РАЗОМ: %.2f грн", calculateGrandTotal()));
            return sb.toString();
        }
    }

    static class BookItem {
        private final String title;
        private final String author;
        private final int pages;

        public BookItem(String title, String author, int pages) {
            this.title = title;
            this.author = author;
            this.pages = Math.max(1, pages);
        }

        public int getPages() {
            return pages;
        }

        @Override
        public String toString() {
            return String.format("'%s' (%s, %d стор.)", title, author, pages);
        }
    }

    static class Bookshelf {
        private final String genre;
        private final BookItem[] books;
        private int bookCount;

        public Bookshelf(String genre, int capacity) {
            this.genre = genre;
            this.books = new BookItem[Math.max(1, capacity)];
        }

        public boolean putBook(BookItem book) {
            if (book == null || bookCount >= books.length) {
                return false;
            }
            books[bookCount++] = book;
            return true;
        }

        public BookItem findLongestBook() {
            if (bookCount == 0) {
                return null;
            }
            BookItem best = books[0];
            for (int i = 1; i < bookCount; i++) {
                if (books[i].getPages() > best.getPages()) {
                    best = books[i];
                }
            }
            return best;
        }

        public int getTotalPagesOnShelf() {
            int sum = 0;
            for (int i = 0; i < bookCount; i++) {
                sum += books[i].getPages();
            }
            return sum;
        }
    }

    static class AudioTrack {
        private final String title;
        private final String artist;
        private final int durationSeconds;

        public AudioTrack(String title, String artist, int durationSeconds) {
            this.title = title;
            this.artist = artist;
            this.durationSeconds = Math.max(1, durationSeconds);
        }

        public int getDurationSeconds() {
            return durationSeconds;
        }

        public String getFormattedDuration() {
            return String.format("%02d:%02d", durationSeconds / 60, durationSeconds % 60);
        }

        @Override
        public String toString() {
            return String.format("%s — %s [%s]", artist, title, getFormattedDuration());
        }
    }

    static class Playlist {
        private String name;
        private final AudioTrack[] tracks;
        private int trackCount;

        public Playlist(String name, int capacity) {
            this.name = name;
            this.tracks = new AudioTrack[Math.max(1, capacity)];
        }

        public boolean addTrack(AudioTrack track) {
            if (track == null || trackCount >= tracks.length) {
                return false;
            }
            tracks[trackCount++] = track;
            return true;
        }

        public int getTotalDurationSeconds() {
            int sum = 0;
            for (int i = 0; i < trackCount; i++) {
                sum += tracks[i].getDurationSeconds();
            }
            return sum;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder("Плейлист '" + name + "':\n");
            for (int i = 0; i < trackCount; i++) {
                sb.append("  ").append(i + 1).append(". ").append(tracks[i]).append("\n");
            }
            int total = getTotalDurationSeconds();
            sb.append("Загальна тривалість: ").append(total / 60).append(" хв ").append(total % 60).append(" сек");
            return sb.toString();
        }
    }

    static class ServerNode {
        private final String ipAddress;
        private final int totalRamGb;
        private int usedRamGb;
        private final boolean online;

        public ServerNode(String ipAddress, int totalRamGb, boolean online) {
            this.ipAddress = ipAddress;
            this.totalRamGb = Math.max(1, totalRamGb);
            this.online = online;
        }

        public int getFreeRamGb() {
            return totalRamGb - usedRamGb;
        }

        public boolean isOnline() {
            return online;
        }

        public boolean allocate(int gb) {
            if (!online || gb <= 0 || gb > getFreeRamGb()) {
                return false;
            }
            usedRamGb += gb;
            return true;
        }

        @Override
        public String toString() {
            return String.format("%s [%d/%d ГБ, %s]", ipAddress, usedRamGb, totalRamGb, online ? "online" : "offline");
        }
    }

    static class DataCenterCluster {
        private final String clusterLocation;
        private final ServerNode[] nodes;
        private int nodeCount;

        public DataCenterCluster(String clusterLocation, int capacity) {
            this.clusterLocation = clusterLocation;
            this.nodes = new ServerNode[Math.max(1, capacity)];
        }

        public boolean addNode(ServerNode node) {
            if (node == null || nodeCount >= nodes.length) {
                return false;
            }
            nodes[nodeCount++] = node;
            return true;
        }

        public boolean deployContainer(int requiredRamGb) {
            for (int i = 0; i < nodeCount; i++) {
                if (nodes[i].isOnline() && nodes[i].getFreeRamGb() >= requiredRamGb) {
                    return nodes[i].allocate(requiredRamGb);
                }
            }
            return false;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder("Кластер " + clusterLocation + ":\n");
            for (int i = 0; i < nodeCount; i++) {
                sb.append("  ").append(nodes[i]).append("\n");
            }
            return sb.toString().trim();
        }
    }

    static class CourseModule {
        private final String topic;
        private final int lectureHours;
        private final int practiceHours;
        private final double maxScore;

        public CourseModule(String topic, int lectureHours, int practiceHours, double maxScore) {
            this.topic = topic;
            this.lectureHours = Math.max(0, lectureHours);
            this.practiceHours = Math.max(0, practiceHours);
            this.maxScore = Math.max(0, maxScore);
        }

        public int getTotalHours() {
            return lectureHours + practiceHours;
        }

        public double getMaxScore() {
            return maxScore;
        }
    }

    static class UniversityCourse {
        private final String courseTitle;
        private final CourseModule[] modules;
        private int moduleCount;

        public UniversityCourse(String courseTitle, int capacity) {
            this.courseTitle = courseTitle;
            this.modules = new CourseModule[Math.max(1, capacity)];
        }

        public boolean addModule(CourseModule module) {
            if (module == null || moduleCount >= modules.length) {
                return false;
            }
            modules[moduleCount++] = module;
            return true;
        }

        public double getEctsCredits() {
            int hours = 0;
            for (int i = 0; i < moduleCount; i++) {
                hours += modules[i].getTotalHours();
            }
            return hours / 30.0;
        }

        public boolean isScoreTotal100() {
            double sum = 0;
            for (int i = 0; i < moduleCount; i++) {
                sum += modules[i].getMaxScore();
            }
            return Math.abs(sum - 100.0) < 1e-9;
        }
    }

    static class TrainCarriage {
        private final int carriageNumber;
        private final String type;
        private final int totalSeats;
        private int occupiedSeats;

        public TrainCarriage(int carriageNumber, String type, int totalSeats) {
            this.carriageNumber = carriageNumber;
            this.type = type;
            this.totalSeats = Math.max(1, totalSeats);
        }

        public int getCarriageNumber() {
            return carriageNumber;
        }

        public int getFreeSeats() {
            return totalSeats - occupiedSeats;
        }

        public boolean book(int seats) {
            if (seats <= 0 || seats > getFreeSeats()) {
                return false;
            }
            occupiedSeats += seats;
            return true;
        }
    }

    static class PassengerTrain {
        private final String route;
        private final TrainCarriage[] carriages;
        private int carriageCount;

        public PassengerTrain(String route, int capacity) {
            this.route = route;
            this.carriages = new TrainCarriage[Math.max(1, capacity)];
        }

        public boolean attachCarriage(TrainCarriage c) {
            if (c == null || carriageCount >= carriages.length) {
                return false;
            }
            carriages[carriageCount++] = c;
            return true;
        }

        public int getTotalFreeSeats() {
            int sum = 0;
            for (int i = 0; i < carriageCount; i++) {
                sum += carriages[i].getFreeSeats();
            }
            return sum;
        }

        public boolean bookTicketsInCarriage(int carriageNumber, int seatsToBook) {
            for (int i = 0; i < carriageCount; i++) {
                if (carriages[i].getCarriageNumber() == carriageNumber) {
                    return carriages[i].book(seatsToBook);
                }
            }
            return false;
        }
    }

    static class LinearEquation {
        private final double a;
        private final double b;
        private final double c;

        public LinearEquation(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public boolean isSatisfiedBy(double x, double y) {
            return Math.abs(a * x + b * y - c) < 1e-6;
        }
    }

    static class EquationSystem {
        private final LinearEquation[] equations;
        private int count;

        public EquationSystem(int capacity) {
            this.equations = new LinearEquation[Math.max(1, capacity)];
        }

        public boolean addEquation(LinearEquation eq) {
            if (eq == null || count >= equations.length) {
                return false;
            }
            equations[count++] = eq;
            return true;
        }

        public boolean checkSolution(double x, double y) {
            for (int i = 0; i < count; i++) {
                if (!equations[i].isSatisfiedBy(x, y)) {
                    return false;
                }
            }
            return count > 0;
        }
    }

    static abstract class AbstractShape {
        private final String color;

        public AbstractShape(String color) {
            this.color = (color == null || color.isBlank()) ? "Білий" : color;
        }

        public String getColor() {
            return color;
        }

        public abstract double getArea();

        public abstract double getPerimeter();

        @Override
        public String toString() {
            return String.format("%s[color='%s', S=%.2f, P=%.2f]", getClass().getSimpleName(), color, getArea(), getPerimeter());
        }
    }

    static class CircleShape extends AbstractShape {
        private final double radius;

        public CircleShape(String color, double radius) {
            super(color);
            this.radius = (radius > 0) ? radius : 1.0;
        }

        @Override
        public double getArea() {
            return Math.PI * radius * radius;
        }

        @Override
        public double getPerimeter() {
            return 2 * Math.PI * radius;
        }
    }

    static class RectangleShape extends AbstractShape {
        private final double width;
        private final double height;

        public RectangleShape(String color, double width, double height) {
            super(color);
            this.width = (width > 0) ? width : 1.0;
            this.height = (height > 0) ? height : 1.0;
        }

        @Override
        public double getArea() {
            return width * height;
        }

        @Override
        public double getPerimeter() {
            return 2 * (width + height);
        }
    }

    static abstract class AbstractPowerPlant {
        private final String stationName;
        protected double baseCapacityMw;

        public AbstractPowerPlant(String stationName, double baseCapacityMw) {
            this.stationName = stationName;
            this.baseCapacityMw = Math.max(0, baseCapacityMw);
        }

        public String getStationName() {
            return stationName;
        }

        public abstract double generateMegawatts();

        public double calculateDailyProfit(double tariffPerMwh) {
            return generateMegawatts() * 24 * tariffPerMwh;
        }
    }

    static class SolarPowerPlant extends AbstractPowerPlant {
        private final double sunIntensityFactor;

        public SolarPowerPlant(String name, double baseCapacityMw, double sunIntensityFactor) {
            super(name, baseCapacityMw);
            this.sunIntensityFactor = Math.max(0.0, Math.min(1.0, sunIntensityFactor));
        }

        @Override
        public double generateMegawatts() {
            return baseCapacityMw * sunIntensityFactor;
        }
    }

    static class WindPowerPlant extends AbstractPowerPlant {
        private final double windSpeedMs;

        public WindPowerPlant(String name, double baseCapacityMw, double windSpeedMs) {
            super(name, baseCapacityMw);
            this.windSpeedMs = windSpeedMs;
        }

        @Override
        public double generateMegawatts() {
            if (windSpeedMs < 3 || windSpeedMs > 25) {
                return 0;
            }
            return baseCapacityMw * Math.min(1.0, windSpeedMs / 12.0);
        }
    }

    static abstract class AbstractEmployee {
        private final int id;
        private final String name;
        protected double taxRate = 0.195;

        public AbstractEmployee(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public abstract double calculateGrossSalary();

        public final double calculateNetSalary() {
            return calculateGrossSalary() * (1.0 - taxRate);
        }
    }

    static class SalariedEmployee extends AbstractEmployee {
        private final double monthlySalary;
        private final double bonus;

        public SalariedEmployee(int id, String name, double monthlySalary, double bonus) {
            super(id, name);
            this.monthlySalary = Math.max(0, monthlySalary);
            this.bonus = Math.max(0, bonus);
        }

        @Override
        public double calculateGrossSalary() {
            return monthlySalary + bonus;
        }
    }

    static class HourlyContractor extends AbstractEmployee {
        private final int hoursWorked;
        private final double hourlyRate;

        public HourlyContractor(int id, String name, int hoursWorked, double hourlyRate) {
            super(id, name);
            this.hoursWorked = Math.max(0, hoursWorked);
            this.hourlyRate = Math.max(0, hourlyRate);
        }

        @Override
        public double calculateGrossSalary() {
            if (hoursWorked <= 160) {
                return hoursWorked * hourlyRate;
            }
            return 160 * hourlyRate + (hoursWorked - 160) * hourlyRate * 1.5;
        }
    }

    static abstract class AbstractSequence {
        private final String title;

        public AbstractSequence(String title) {
            this.title = title;
        }

        public String getTitle() {
            return title;
        }

        public abstract double getTerm(int index);

        public double sumFirstN(int n) {
            double sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += getTerm(i);
            }
            return sum;
        }
    }

    static class HarmonicSequence extends AbstractSequence {
        public HarmonicSequence() {
            super("Гармонічна 1/n");
        }

        @Override
        public double getTerm(int index) {
            return 1.0 / index;
        }
    }

    static class SquareNumbersSequence extends AbstractSequence {
        public SquareNumbersSequence() {
            super("Квадрати n^2");
        }

        @Override
        public double getTerm(int index) {
            return (double) index * index;
        }
    }

    static abstract class AbstractTransaction {
        private final String txId;
        protected final double amount;

        public AbstractTransaction(String txId, double amount) {
            this.txId = txId;
            this.amount = Math.max(0, amount);
        }

        public abstract double calculateCommission();

        public final double getTotalDebit() {
            return amount + calculateCommission();
        }

        @Override
        public String toString() {
            return String.format("%s[%s: сума=%.2f, комісія=%.2f, списання=%.2f]",
                    getClass().getSimpleName(), txId, amount, calculateCommission(), getTotalDebit());
        }
    }

    static class DomesticTransfer extends AbstractTransaction {
        public DomesticTransfer(String txId, double amount) {
            super(txId, amount);
        }

        @Override
        public double calculateCommission() {
            return Math.max(5.0, amount * 0.005);
        }
    }

    static class CryptoTransfer extends AbstractTransaction {
        private final double networkGasFee;

        public CryptoTransfer(String txId, double amount, double networkGasFee) {
            super(txId, amount);
            this.networkGasFee = Math.max(0, networkGasFee);
        }

        @Override
        public double calculateCommission() {
            return networkGasFee;
        }
    }

    static abstract class Solid3D {
        private final String materialName;
        private final double densityKgPerM3;

        public Solid3D(String materialName, double densityKgPerM3) {
            this.materialName = materialName;
            this.densityKgPerM3 = Math.max(0, densityKgPerM3);
        }

        public abstract double getVolume();

        public abstract double getSurfaceArea();

        public final double getMassKg() {
            return densityKgPerM3 * getVolume();
        }

        @Override
        public String toString() {
            return String.format("%s[%s: V=%.4f м³, S=%.4f м², маса=%.2f кг]",
                    getClass().getSimpleName(), materialName, getVolume(), getSurfaceArea(), getMassKg());
        }
    }

    static class Sphere3D extends Solid3D {
        private final double radius;

        public Sphere3D(String material, double density, double radius) {
            super(material, density);
            this.radius = (radius > 0) ? radius : 1.0;
        }

        @Override
        public double getVolume() {
            return 4.0 / 3.0 * Math.PI * radius * radius * radius;
        }

        @Override
        public double getSurfaceArea() {
            return 4 * Math.PI * radius * radius;
        }
    }

    static class Cylinder3D extends Solid3D {
        private final double radius;
        private final double height;

        public Cylinder3D(String material, double density, double radius, double height) {
            super(material, density);
            this.radius = (radius > 0) ? radius : 1.0;
            this.height = (height > 0) ? height : 1.0;
        }

        @Override
        public double getVolume() {
            return Math.PI * radius * radius * height;
        }

        @Override
        public double getSurfaceArea() {
            return 2 * Math.PI * radius * (radius + height);
        }
    }

    static abstract class AbstractSensor {
        private final String location;
        private final double minSafe;
        private final double maxSafe;

        public AbstractSensor(String location, double minSafe, double maxSafe) {
            this.location = location;
            this.minSafe = Math.min(minSafe, maxSafe);
            this.maxSafe = Math.max(minSafe, maxSafe);
        }

        public String getLocation() {
            return location;
        }

        public abstract double readValue();

        public abstract String getUnit();

        public final boolean isAlarmTriggered() {
            double v = readValue();
            return v < minSafe || v > maxSafe;
        }

        @Override
        public String toString() {
            return String.format("%s[%s: %.2f %s, тривога=%b]",
                    getClass().getSimpleName(), location, readValue(), getUnit(), isAlarmTriggered());
        }
    }

    static class PressureSensor extends AbstractSensor {
        private double rawReading;
        private final double calibration;

        public PressureSensor(String location, double minSafe, double maxSafe, double calibration) {
            super(location, minSafe, maxSafe);
            this.calibration = calibration;
        }

        public void updateRawReading(double raw) {
            this.rawReading = raw;
        }

        @Override
        public double readValue() {
            return rawReading * calibration;
        }

        @Override
        public String getUnit() {
            return "бар";
        }
    }

    static class RadiationSensor extends AbstractSensor {
        private double rawReading;

        public RadiationSensor(String location, double minSafe, double maxSafe) {
            super(location, minSafe, maxSafe);
        }

        public void updateRawReading(double raw) {
            this.rawReading = raw;
        }

        @Override
        public double readValue() {
            return rawReading;
        }

        @Override
        public String getUnit() {
            return "мкЗв/год";
        }
    }

    static abstract class AbstractCompressor {
        private final String algorithmName;

        public AbstractCompressor(String algorithmName) {
            this.algorithmName = algorithmName;
        }

        public String getAlgorithmName() {
            return algorithmName;
        }

        public abstract int estimateCompressedSize(int originalSizeBytes);

        public double getCompressionRatio(int originalSizeBytes) {
            if (originalSizeBytes <= 0) {
                return 0;
            }
            return (1.0 - (double) estimateCompressedSize(originalSizeBytes) / originalSizeBytes) * 100.0;
        }
    }

    static class ZipCompressor extends AbstractCompressor {
        public ZipCompressor() {
            super("ZIP");
        }

        @Override
        public int estimateCompressedSize(int originalSizeBytes) {
            return (int) (originalSizeBytes * 0.55);
        }
    }

    static class UltraLzmaCompressor extends AbstractCompressor {
        public UltraLzmaCompressor() {
            super("Ultra LZMA");
        }

        @Override
        public int estimateCompressedSize(int originalSizeBytes) {
            return (int) (originalSizeBytes * 0.30) + 128;
        }
    }

    static abstract class AbstractPcPart {
        private final String model;
        private final double priceUah;

        public AbstractPcPart(String model, double priceUah) {
            this.model = model;
            this.priceUah = Math.max(0, priceUah);
        }

        public String getModel() {
            return model;
        }

        public double getPriceUah() {
            return priceUah;
        }

        public abstract int getPowerConsumptionWatts();
    }

    static class ProcessorPart extends AbstractPcPart {
        private final int cores;
        private final int watts;

        public ProcessorPart(String model, double price, int cores, int watts) {
            super(model, price);
            this.cores = cores;
            this.watts = Math.max(0, watts);
        }

        @Override
        public int getPowerConsumptionWatts() {
            return watts;
        }
    }

    static class VideoCardPart extends AbstractPcPart {
        private final int vramGb;
        private final int watts;

        public VideoCardPart(String model, double price, int vramGb, int watts) {
            super(model, price);
            this.vramGb = vramGb;
            this.watts = Math.max(0, watts);
        }

        @Override
        public int getPowerConsumptionWatts() {
            return watts;
        }
    }

    static class DesktopPC {
        private final int psuMaxWatts;
        private final AbstractPcPart[] parts;
        private int count;

        public DesktopPC(int psuMaxWatts, int capacity) {
            this.psuMaxWatts = Math.max(1, psuMaxWatts);
            this.parts = new AbstractPcPart[Math.max(1, capacity)];
        }

        public boolean addPart(AbstractPcPart part) {
            if (part == null || count >= parts.length) {
                return false;
            }
            parts[count++] = part;
            return true;
        }

        public int getTotalPowerWatts() {
            int sum = 0;
            for (int i = 0; i < count; i++) {
                sum += parts[i].getPowerConsumptionWatts();
            }
            return sum;
        }

        public boolean isStable() {
            return getTotalPowerWatts() * 1.2 <= psuMaxWatts;
        }
    }

    static abstract class AbstractThruster {
        private final String thrusterId;

        public AbstractThruster(String thrusterId) {
            this.thrusterId = thrusterId;
        }

        public String getThrusterId() {
            return thrusterId;
        }

        public abstract double getThrustKn();

        public abstract double getFuelBurnRate();
    }

    static class ChemicalThruster extends AbstractThruster {
        private final double thrustKn;
        private final double burnRate;

        public ChemicalThruster(String id, double thrustKn, double burnRate) {
            super(id);
            this.thrustKn = Math.max(0, thrustKn);
            this.burnRate = Math.max(0, burnRate);
        }

        @Override
        public double getThrustKn() {
            return thrustKn;
        }

        @Override
        public double getFuelBurnRate() {
            return burnRate;
        }
    }

    static class IonThruster extends AbstractThruster {
        private final double thrustKn;
        private final double burnRate;

        public IonThruster(String id, double thrustKn, double burnRate) {
            super(id);
            this.thrustKn = Math.max(0, thrustKn);
            this.burnRate = Math.max(0, burnRate);
        }

        @Override
        public double getThrustKn() {
            return thrustKn;
        }

        @Override
        public double getFuelBurnRate() {
            return burnRate;
        }
    }

    static class Spacecraft {
        private final String shipName;
        private final double dryMassTons;
        private final AbstractThruster[] thrusters;
        private int count;

        public Spacecraft(String shipName, double dryMassTons, int capacity) {
            this.shipName = shipName;
            this.dryMassTons = (dryMassTons > 0) ? dryMassTons : 1.0;
            this.thrusters = new AbstractThruster[Math.max(1, capacity)];
        }

        public boolean addThruster(AbstractThruster t) {
            if (t == null || count >= thrusters.length) {
                return false;
            }
            thrusters[count++] = t;
            return true;
        }

        public double getTotalThrustKn() {
            double sum = 0;
            for (int i = 0; i < count; i++) {
                sum += thrusters[i].getThrustKn();
            }
            return sum;
        }

        public double getTotalFuelBurnRate() {
            double sum = 0;
            for (int i = 0; i < count; i++) {
                sum += thrusters[i].getFuelBurnRate();
            }
            return sum;
        }

        public double getInitialAcceleration() {
            return getTotalThrustKn() / dryMassTons;
        }
    }

    static class LandPlot {
        private final double totalPlotAreaM2;
        private final AbstractShape[] structures;
        private int count;

        public LandPlot(double totalPlotAreaM2, int capacity) {
            this.totalPlotAreaM2 = Math.max(1, totalPlotAreaM2);
            this.structures = new AbstractShape[Math.max(1, capacity)];
        }

        private double getBuiltArea() {
            double sum = 0;
            for (int i = 0; i < count; i++) {
                sum += structures[i].getArea();
            }
            return sum;
        }

        public boolean addStructure(AbstractShape s) {
            if (s == null || count >= structures.length) {
                return false;
            }
            if (getBuiltArea() + s.getArea() > totalPlotAreaM2 * 0.6) {
                return false;
            }
            structures[count++] = s;
            return true;
        }

        public double getFreeGreenArea() {
            return totalPlotAreaM2 - getBuiltArea();
        }
    }

    static abstract class AbstractAsset {
        private final String ticker;
        protected double investedAmount;

        public AbstractAsset(String ticker, double investedAmount) {
            this.ticker = ticker;
            this.investedAmount = Math.max(0, investedAmount);
        }

        public String getTicker() {
            return ticker;
        }

        public double getInvestedAmount() {
            return investedAmount;
        }

        public abstract double calculateAnnualReturn();
    }

    static class GovernmentBond extends AbstractAsset {
        private final double couponRate;

        public GovernmentBond(String ticker, double investedAmount, double couponRate) {
            super(ticker, investedAmount);
            this.couponRate = Math.max(0, couponRate);
        }

        @Override
        public double calculateAnnualReturn() {
            return investedAmount * couponRate;
        }
    }

    static class DividendStock extends AbstractAsset {
        private final double expectedGrowth;
        private final double dividendYield;
        private final double taxRate;

        public DividendStock(String ticker, double investedAmount, double expectedGrowth,
                             double dividendYield, double taxRate) {
            super(ticker, investedAmount);
            this.expectedGrowth = expectedGrowth;
            this.dividendYield = Math.max(0, dividendYield);
            this.taxRate = Math.max(0, Math.min(1, taxRate));
        }

        @Override
        public double calculateAnnualReturn() {
            double growth = investedAmount * expectedGrowth;
            double dividends = investedAmount * dividendYield * (1.0 - taxRate);
            return growth + dividends;
        }
    }

    static class InvestmentPortfolio {
        private final String investorName;
        private final AbstractAsset[] assets;
        private int count;

        public InvestmentPortfolio(String investorName, int capacity) {
            this.investorName = investorName;
            this.assets = new AbstractAsset[Math.max(1, capacity)];
        }

        public boolean addAsset(AbstractAsset asset) {
            if (asset == null || count >= assets.length) {
                return false;
            }
            assets[count++] = asset;
            return true;
        }

        public double getTotalInvested() {
            double sum = 0;
            for (int i = 0; i < count; i++) {
                sum += assets[i].getInvestedAmount();
            }
            return sum;
        }

        public double getExpectedAnnualReturn() {
            double sum = 0;
            for (int i = 0; i < count; i++) {
                sum += assets[i].calculateAnnualReturn();
            }
            return sum;
        }
    }

    static abstract class AbstractHeroUnit {
        private final String name;
        protected int hp;

        public AbstractHeroUnit(String name, int hp) {
            this.name = name;
            this.hp = Math.max(1, hp);
        }

        public String getName() {
            return name;
        }

        public abstract int getCombatPower();

        public abstract String getRole();
    }

    static class TankWarrior extends AbstractHeroUnit {
        private final int armor;

        public TankWarrior(String name, int hp, int armor) {
            super(name, hp);
            this.armor = Math.max(0, armor);
        }

        @Override
        public int getCombatPower() {
            return hp / 2 + armor * 3;
        }

        @Override
        public String getRole() {
            return "Tank";
        }
    }

    static class ArcaneMage extends AbstractHeroUnit {
        private final int intelligence;
        private final double spellPower;

        public ArcaneMage(String name, int hp, int intelligence, double spellPower) {
            super(name, hp);
            this.intelligence = Math.max(0, intelligence);
            this.spellPower = Math.max(0, spellPower);
        }

        @Override
        public int getCombatPower() {
            return (int) (intelligence * spellPower);
        }

        @Override
        public String getRole() {
            return "Mage";
        }
    }

    static class RaidParty {
        private final String guildName;
        private final AbstractHeroUnit[] members;
        private int memberCount;

        public RaidParty(String guildName, int capacity) {
            this.guildName = guildName;
            this.members = new AbstractHeroUnit[Math.max(1, capacity)];
        }

        public boolean addMember(AbstractHeroUnit hero) {
            if (hero == null || memberCount >= members.length) {
                return false;
            }
            members[memberCount++] = hero;
            return true;
        }

        public int getTotalCombatPower() {
            int sum = 0;
            for (int i = 0; i < memberCount; i++) {
                sum += members[i].getCombatPower();
            }
            return sum;
        }

        public boolean isReadyForRaid(int dungeonDifficulty) {
            boolean hasTank = false;
            for (int i = 0; i < memberCount; i++) {
                if (members[i].getRole().equals("Tank")) {
                    hasTank = true;
                }
            }
            return hasTank && getTotalCombatPower() > dungeonDifficulty;
        }
    }

    static class EmergencySiren {
        private boolean sounding;

        public void activate() {
            sounding = true;
        }

        public void deactivate() {
            sounding = false;
        }

        public boolean isSounding() {
            return sounding;
        }
    }

    static class SmartLab {
        private final EmergencySiren siren = new EmergencySiren();
        private final AbstractSensor[] sensors;
        private int count;

        public SmartLab(int capacity) {
            this.sensors = new AbstractSensor[Math.max(1, capacity)];
        }

        public boolean addSensor(AbstractSensor sensor) {
            if (sensor == null || count >= sensors.length) {
                return false;
            }
            sensors[count++] = sensor;
            return true;
        }

        public void runDiagnostics() {
            boolean alarm = false;
            for (int i = 0; i < count; i++) {
                if (sensors[i].isAlarmTriggered()) {
                    alarm = true;
                    System.out.println("ТРИВОГА: " + sensors[i]);
                }
            }
            if (alarm) {
                siren.activate();
            } else {
                siren.deactivate();
            }
            System.out.println("Діагностика завершена. Сирена: " + (siren.isSounding() ? "ВМИКНЕНА" : "вимкнена"));
        }
    }

    static abstract class AbstractFilter {
        private final String filterName;

        public AbstractFilter(String filterName) {
            this.filterName = filterName;
        }

        public String getFilterName() {
            return filterName;
        }

        public abstract double processSample(double x);
    }

    static class AmplifierFilter extends AbstractFilter {
        private final double gain;

        public AmplifierFilter(double gain) {
            super("Amplifier");
            this.gain = gain;
        }

        @Override
        public double processSample(double x) {
            return x * gain;
        }
    }

    static class ClippingFilter extends AbstractFilter {
        private final double threshold;

        public ClippingFilter(double threshold) {
            super("Clipping");
            this.threshold = Math.abs(threshold);
        }

        @Override
        public double processSample(double x) {
            return Math.max(-threshold, Math.min(threshold, x));
        }
    }

    static class SignalProcessor {
        private final AbstractFilter[] pipeline;
        private int count;

        public SignalProcessor(int capacity) {
            this.pipeline = new AbstractFilter[Math.max(1, capacity)];
        }

        public boolean addFilter(AbstractFilter filter) {
            if (filter == null || count >= pipeline.length) {
                return false;
            }
            pipeline[count++] = filter;
            return true;
        }

        public double[] process(double[] signal) {
            if (signal == null) {
                return new double[0];
            }
            double[] result = Arrays.copyOf(signal, signal.length);
            for (int f = 0; f < count; f++) {
                for (int i = 0; i < result.length; i++) {
                    result[i] = pipeline[f].processSample(result[i]);
                }
            }
            return result;
        }
    }
}
