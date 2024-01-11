package bmi;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {

        BMI bmi = new BMI(1.63, 55);
        System.out.println(bmi.isUnderWeight());
        System.out.println(bmi.isOverWeight());
        System.out.println(bmi.isNormalWeight());
    }
}
