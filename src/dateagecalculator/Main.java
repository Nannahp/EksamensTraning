package dateagecalculator;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        DateAgeCalculator calculator = new DateAgeCalculator(26);
        System.out.println(calculator.calcValidDateAge(19));
        System.out.println(calculator.calcValidDateAge(24));
    }
}
