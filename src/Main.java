//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        state(45,34);
        state(24,14);
        state(75,-64);
        state(35,-14);
        state(45,-34);

    }

    public static void state(int age, int temperature) {
        String result = choice(age, temperature);
        System.out.println("Возраст: " + age + "temperature: " + temperature ". " + "Result: " + result);
    }

    public static String choice(int age, int temperature) {
        if ((age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) ||
                (age < 20 && age >= 0 && temperature >= 0 && temperature <= 28) ||
                (age > 45 && temperature >= -10 && temperature <= 25)) {
            return ("можно идти гулять");
        } else {
            return ("Оставайтесь дома");

        }
    }
}