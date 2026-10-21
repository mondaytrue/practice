import java.util.Arrays;
import java.util.Scanner;

public class Practice05 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        task01(); task02(); task03(); task04(); task05();
        task06(); task07(); task08(); task09(); task10();
        task11(); task12(); task13(); task14(); task15();
        task16(); task17(); task18(); task19(); task20();
        task21(); task22(); task23(); task24(); task25();
        task26(); task27(); task28(); task29(); task30();
        task31(); task32(); task33(); task34(); task35();
        task36(); task37(); task38(); task39(); task40();
    }

    static void task01() {
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        numbers[0] = 10;
        numbers[2] = 30;
        numbers[numbers.length - 1] = 50;
        System.out.println(Arrays.toString(numbers));
    }

    static void task02() {
        String[] days = {"Понеділок", "Вівторок", "Середа", "Четвер", "П'ятниця", "Субота", "Неділя"};
        System.out.println("Кількість днів: " + days.length);
        System.out.println("Перший: " + days[0] + ", останній: " + days[days.length - 1]);
        days[5] = "Вихідний (Сб)";
        days[6] = "Вихідний (Нд)";
        System.out.println(Arrays.toString(days));
    }

    static void task03() {
        double[] prices = {120.50, 45.00, 890.99, 15.30, 420.00};
        System.out.println(Arrays.toString(prices));
        prices[2] = prices[2] * 0.8;
        System.out.println(Arrays.toString(prices));
    }

    static void task04() {
        System.out.print("Введіть N (> 0): ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void task05() {
        int[] arr = {4, 8, 15, 16, 23, 42};
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i > 0) System.out.print(", ");
        }
        System.out.println();
    }

    static void task06() {
        int[] powers = new int[10];
        powers[0] = 1;
        for (int i = 1; i < powers.length; i++) {
            powers[i] = powers[i - 1] * 2;
        }
        System.out.println(Arrays.toString(powers));
    }

    static void task07() {
        int[] original = {3, 7, 1, 9, 4};
        int[] copy = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }
        copy[0] = 999;
        System.out.println("original: " + Arrays.toString(original));
        System.out.println("copy:     " + Arrays.toString(copy));
    }
    static void task08() {
        int[] grades = {95, 84, 70, 99, 65, 88, 92};
        int sum = 0;
        for (int g : grades) {
            sum += g;
        }
        double avg = (double) sum / grades.length;
        System.out.println("Сума: " + sum + ", Середній бал: " + avg);
    }

    static void task09() {
        int[] temps = {18, 21, 15, 24, 13, 27, 20};
        int min = temps[0], max = temps[0];
        int minIdx = 0, maxIdx = 0;
        for (int i = 1; i < temps.length; i++) {
            if (temps[i] < min) { min = temps[i]; minIdx = i; }
            if (temps[i] > max) { max = temps[i]; maxIdx = i; }
        }
        System.out.println("Мінімум: " + min + " (день " + (minIdx + 1) + ", індекс " + minIdx + ")");
        System.out.println("Максимум: " + max + " (день " + (maxIdx + 1) + ", індекс " + maxIdx + ")");
    }

    static void task10() {
        int[] data = {12, -5, 0, 43, -19, 0, -2, 8, 0, 15};
        int pos = 0, neg = 0, zero = 0;
        for (int x : data) {
            if (x > 0) pos++;
            else if (x < 0) neg++;
            else zero++;
        }
        System.out.println("Додатних: " + pos + ", від'ємних: " + neg + ", нульових: " + zero);
    }

    static void task11() {
        int[] arr = {7, 12, 3, 18, 25, 4, 9, 30, 11, 6};
        int evenCount = 0, oddSum = 0;
        for (int x : arr) {
            if (x % 2 == 0) evenCount++;
            else oddSum += x;
        }
        System.out.println("Масив: " + Arrays.toString(arr));
        System.out.println("Парних: " + evenCount + ", сума непарних: " + oddSum);
    }

    static void task12() {
        int[] students = {1042, 2031, 3055, 4018, 5099};
        System.out.print("Введіть номер залікової: ");
        int target = scanner.nextInt();
        int found = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i] == target) {
                found = i;
                break;
            }
        }
        if (found != -1) {
            System.out.println("Знайдено на позиції " + found);
        } else {
            System.out.println("Студента з таким номером не знайдено");
        }
    }

    static void task13() {
        int[] rolls = {3, 6, 2, 6, 1, 4, 6, 5, 2, 6};
        System.out.print("Введіть число від 1 до 6: ");
        int value = scanner.nextInt();
        int count = 0;
        for (int r : rolls) {
            if (r == value) count++;
        }
        System.out.println("Число " + value + " випало " + count + " раз(и)");
    }

    static void task14() {
        int[] salaries = {18000, 25000, 32000, 15000, 41000, 29000};
        long sum = 0;
        for (int s : salaries) sum += s;
        double avg = (double) sum / salaries.length;
        System.out.println("Середня зарплата: " + avg);
        System.out.print("Вище середньої: ");
        for (int s : salaries) {
            if (s > avg) System.out.print(s + " ");
        }
        System.out.println();
    }

    static void task15() {
        double[] prices = {42.5, 41.8, 44.1, 40.9, 43.6, 45.0};
        double min = prices[0], max = prices[0];
        for (double p : prices) {
            if (p < min) min = p;
            if (p > max) max = p;
        }
        System.out.printf("Розмах: %.2f%n", max - min);
    }

    static void task16() {
        String[] cities = {"Київ", "Львів", "Харків", "Одеса", "Дніпро"};
        for (String city : cities) {
            System.out.println("Ласкаво просимо до міста " + city + "!");
        }
    }

    static void task17() {
        double[] salaries = {20000.0, 25000.0, 18000.0, 30000.0};
        for (int i = 0; i < salaries.length; i++) {
            salaries[i] *= 1.10;
        }
        System.out.println(Arrays.toString(salaries));
    }

    static void task18() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void task19() {
        int[] base = {2, 4, 6, 8, 10};
        int[] squares = new int[base.length];
        for (int i = 0; i < base.length; i++) {
            squares[i] = base[i] * base[i];
        }
        System.out.println("base:    " + Arrays.toString(base));
        System.out.println("squares: " + Arrays.toString(squares));
    }

    static void task20() {
        int[] arr = {3, 8, 8, 15, 21, 40};
        boolean isSorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
        System.out.println(Arrays.toString(arr) + " відсортований: " + isSorted);
    }

    static void task21() {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6, 7};
        int[] c = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[a.length + i] = b[i];
        }
        System.out.println(Arrays.toString(c));
    }

    static void task22() {
        int[] test = {45, 12, 89, 3, 27};
        System.out.println(Arrays.toString(test));
        Arrays.sort(test);
        System.out.println(Arrays.toString(test));
        Arrays.fill(test, -1);
        System.out.println(Arrays.toString(test));
    }

    static void task23() {
        int[][] table = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int row = 0; row < table.length; row++) {
            for (int col = 0; col < table[row].length; col++) {
                System.out.print(table[row][col] + "\t");
            }
            System.out.println();
        }
    }

    static void task24() {
        int[][] matrix = {
                {10, 20, 30, 40},
                {50, 60, 70, 80}
        };
        int rows = matrix.length;
        int cols = matrix[0].length;
        System.out.println("Рядків: " + rows + ", стовпчиків: " + cols);
        System.out.println("Лівий верхній: " + matrix[0][0]);
        System.out.println("Правий верхній: " + matrix[0][cols - 1]);
        System.out.println("Лівий нижній: " + matrix[rows - 1][0]);
        System.out.println("Правий нижній: " + matrix[rows - 1][cols - 1]);
    }

    static void task25() {
        int[][] grid = new int[3][4];
        int counter = 1;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                grid[row][col] = counter++;
            }
        }
        for (int[] row : grid) {
            for (int v : row) System.out.print(v + "\t");
            System.out.println();
        }
    }

    static void task26() {
        int[][] randomGrid = new int[4][3];
        for (int row = 0; row < randomGrid.length; row++) {
            for (int col = 0; col < randomGrid[row].length; col++) {
                randomGrid[row][col] = (int) (Math.random() * 90) + 10;
            }
        }
        System.out.println(Arrays.deepToString(randomGrid));
        for (int row = 0; row < randomGrid.length; row++) {
            for (int col = 0; col < randomGrid[row].length; col++) {
                System.out.print(randomGrid[row][col] + "\t");
            }
            System.out.println();
        }
    }

    static void task27() {
        int[][] multTable = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                multTable[i][j] = (i + 1) * (j + 1);
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.printf("%4d", multTable[i][j]);
            }
            System.out.println();
        }
    }

    static void task28() {
        int[][] identity = new int[5][5];
        for (int row = 0; row < identity.length; row++) {
            for (int col = 0; col < identity[row].length; col++) {
                identity[row][col] = (row == col) ? 1 : 0;
            }
        }
        for (int[] row : identity) {
            for (int v : row) System.out.print(v + " ");
            System.out.println();
        }
    }

    static void task29() {
        int[][] m = new int[4][4];
        for (int[] row : m) Arrays.fill(row, 1);
        for (int col = 0; col < m[1].length; col++) {
            m[1][col] = 0;
        }
        for (int row = 0; row < m.length; row++) {
            m[row][2] = 7;
        }
        for (int[] row : m) {
            for (int v : row) System.out.print(v + " ");
            System.out.println();
        }
    }

    static void task30() {
        int[][] m = {
                {4, 8, 15},
                {16, 23, 42},
                {7, 1, 9}
        };
        int sum = 0, count = 0;
        for (int row = 0; row < m.length; row++) {
            for (int col = 0; col < m[row].length; col++) {
                sum += m[row][col];
                count++;
            }
        }
        double avg = (double) sum / count;
        System.out.println("Сума: " + sum + ", елементів: " + count + ", середнє: " + avg);
    }

    static void task31() {
        int[][] m = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        int[] rowSums = new int[m.length];
        for (int row = 0; row < m.length; row++) {
            for (int col = 0; col < m[row].length; col++) {
                rowSums[row] += m[row][col];
            }
            System.out.println("Рядок " + row + ": сума = " + rowSums[row]);
        }
    }

    static void task32() {
        int[][] m = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int cols = m[0].length;
        int[] colSums = new int[cols];
        for (int col = 0; col < cols; col++) {
            for (int row = 0; row < m.length; row++) {
                colSums[col] += m[row][col];
            }
        }
        for (int[] row : m) {
            for (int v : row) System.out.print(v + "\t");
            System.out.println();
        }
        System.out.println("---------------------");
        for (int s : colSums) System.out.print(s + "\t");
        System.out.println();
    }

    static void task33() {
        int[][] m = {
                {-5, 12, 3, -8},
                {7, 40, -1, 0},
                {22, -30, 18, 9}
        };
        int max = m[0][0], maxRow = 0, maxCol = 0;
        for (int row = 0; row < m.length; row++) {
            for (int col = 0; col < m[row].length; col++) {
                if (m[row][col] > max) {
                    max = m[row][col];
                    maxRow = row;
                    maxCol = col;
                }
            }
        }
        System.out.println("Максимум: " + max + " у комірці [" + maxRow + ", " + maxCol + "]");
    }

    static void task34() {
        int[][] m = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int main = 0, anti = 0;
        for (int row = 0; row < m.length; row++) {
            for (int col = 0; col < m[row].length; col++) {
                if (row == col) main += m[row][col];
                if (row + col == m.length - 1) anti += m[row][col];
            }
        }
        System.out.println("Головна діагональ: " + main + ", побічна: " + anti);
        if (main > anti) System.out.println("Головна більша");
        else if (main < anti) System.out.println("Побічна більша");
        else System.out.println("Суми рівні");
    }

    static void task35() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] transposed = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        System.out.println("Початкова\tТранспонована");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) System.out.print(matrix[i][j] + " ");
            System.out.print("\t\t");
            for (int j = 0; j < 3; j++) System.out.print(transposed[i][j] + " ");
            System.out.println();
        }
    }

    static void task36() {
        int[][] ladder = new int[4][];
        for (int i = 0; i < ladder.length; i++) {
            ladder[i] = new int[i + 1];
            Arrays.fill(ladder[i], i);
        }
        for (int[] row : ladder) {
            for (int v : row) System.out.print(v + " ");
            System.out.println();
        }
    }

    static void task37() {
        String[] dayNames = {"Понеділок", "Вівторок", "Середа", "Четвер", "П'ятниця"};
        String[][] weekSchedule = new String[5][];
        weekSchedule[0] = new String[]{"Вища математика", "Основи програмування", "Фізика"};
        weekSchedule[1] = new String[]{"Англійська мова", "Історія України"};
        weekSchedule[2] = new String[]{"Основи програмування", "Основи програмування", "Бази даних", "Фізвиховання"};
        weekSchedule[3] = new String[]{"Дискретна математика"};
        weekSchedule[4] = new String[]{"Філософія", "Основи алгоритмізації", "Практикум"};
        for (int i = 0; i < weekSchedule.length; i++) {
            System.out.println(dayNames[i] + " (пар: " + weekSchedule[i].length + "):");
            for (int j = 0; j < weekSchedule[i].length; j++) {
                System.out.println("  " + (j + 1) + ". " + weekSchedule[i][j]);
            }
        }
    }

    static void task38() {
        int[][] pascal = new int[5][];
        for (int i = 0; i < pascal.length; i++) {
            pascal[i] = new int[i + 1];
            pascal[i][0] = 1;
            pascal[i][i] = 1;
            for (int j = 1; j < i; j++) {
                pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
            }
        }
        for (int[] row : pascal) {
            for (int v : row) System.out.print(v + " ");
            System.out.println();
        }
    }

    static void task39() {
        int[][][] cube = new int[3][3][3];
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                for (int z = 0; z < 3; z++) {
                    cube[x][y][z] = x + y + z;
                }
            }
        }
        for (int x = 0; x < 3; x++) {
            System.out.println("--- Шар " + x + " ---");
            for (int y = 0; y < 3; y++) {
                for (int z = 0; z < 3; z++) {
                    System.out.print(cube[x][y][z] + " ");
                }
                System.out.println();
            }
        }
    }

    static void task40() {
        String[] cities = {"Київ", "Львів", "Одеса"};
        double[][][] weather = {
                {{12, 5}, {14, 6}, {11, 4}, {9, 3}, {13, 5}, {15, 7}, {16, 8}},
                {{10, 3}, {11, 4}, {9, 1}, {8, 0}, {12, 4}, {13, 5}, {14, 6}},
                {{15, 9}, {16, 10}, {14, 8}, {13, 7}, {17, 11}, {18, 12}, {19, 12}}
        };

        for (int c = 0; c < weather.length; c++) {
            double sum = 0;
            for (int d = 0; d < weather[c].length; d++) {
                sum += weather[c][d][0];
            }
            System.out.printf("%s: середня денна температура %.1f°C%n", cities[c], sum / weather[c].length);
        }

        double coldest = weather[0][0][1];
        int coldCity = 0, coldDay = 0;
        for (int c = 0; c < weather.length; c++) {
            for (int d = 0; d < weather[c].length; d++) {
                if (weather[c][d][1] < coldest) {
                    coldest = weather[c][d][1];
                    coldCity = c;
                    coldDay = d;
                }
            }
        }
        System.out.println("Найхолодніша ніч: " + coldest + "°C (" + cities[coldCity] + ", день " + (coldDay + 1) + ")");
    }
}
