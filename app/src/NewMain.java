
import java.util.Random;

public class NewMain {

    public static void main(String[] args) {
        Random rn = new Random();

        int answer = rn.nextInt(10) + 1;
        System.out.println(answer);
        answer = rn.nextInt(10) + 1;
        System.out.println(answer);
    }

}
