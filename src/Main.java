import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Dawn");
        System.out.println(whenGoWalk(24, 35));

        System.out.println("Noon");
        System.out.println(whenGoWalk(30, 14));

        System.out.println("Sunset");
        System.out.println(whenGoWalk(28, 16));

        System.out.println("Twilight");
        System.out.println(whenGoWalk(31, 27));

        System.out.println("Night");
        System.out.println(whenGoWalk(15, 26));

        System.out.println("------------");

        System.out.println("Dawn");
        System.out.println(randomWalk(35));

        System.out.println("Noon");
        System.out.println(randomWalk( 14));

        System.out.println("Sunset");
        System.out.println(randomWalk( 16));

        System.out.println("Twilight");
        System.out.println(randomWalk(27));

        System.out.println("Night");
        System.out.println(randomWalk(26));
    }
    public static String whenGoWalk(int ageMen, int temperature) {
        if (ageMen > 20 && ageMen < 45 && temperature > -20 && temperature < 30) {
            return "Go for a walk";
        } else if (ageMen < 20 && temperature > 0 && temperature < 28) {
            return "Go for a walk";
        } else if (ageMen > 45 && temperature > -10 && temperature < 25) {
            return "Go for a walk";
        } else {
            return "Stay at home";
        }
    }
    public static String randomWalk(int temperature) {
        Random random = new Random();
        int randomaiser = random.nextInt(41) + 2;
        if (randomaiser > 20 && randomaiser < 45 && temperature > -20 && temperature < 30) {
            return "Go for a walk";
        } else if (randomaiser < 20 && temperature > 0 && temperature < 28) {
            return "Go for a walk";
        } else if (randomaiser > 45 && temperature > -10 && temperature < 25) {
            return "Go for a walk";
        } else {
            return "Stay at home";
        }
    }
}