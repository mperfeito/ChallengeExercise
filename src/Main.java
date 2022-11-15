public class Main {
    public static void main(String[] args) {

        info();
        System.out.println((3));
        System.out.println(multiplieBoxDigits());
        System.out.println(chartAnalyser());
    }

    public static void info() {

        int id = 8765543;
        String name = "Mariana";

        System.out.println(id);
        System.out.println(name);

    }

    public static int rentCar(int days) {

        int cost = days * 35;
        if (days >= 7) {
            return cost - 40;
        } else if (days >= 3) {
            return cost - 10;
        }
        return cost;
    }

    public static int multiplieBoxDigits(){

        int[] digits = {1,4,8};
        int result = 1;
        for (int digit : digits) {
            result = result * digit;
        }
        return result;
    }

    public static double chartAnalyser() {

        String[] chart = {"-", "-", "~", "-", "-", "-", "-", "~", "~", "-", "-", "~", "~"};
        int count = 0;
        float length = chart.length;
        for (int i = 0; i < chart.length; i++) {
            if (chart[i].equals("-") && chart[i + 1].equals("~")) {
                count = count + 1;
            }
        }
      return Math.floor((count/length) * 100);
    }
}
