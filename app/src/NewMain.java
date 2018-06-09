
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gray
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rn = new Random();

        int answer = rn.nextInt(10) + 1;
        System.out.println(answer);
        answer = rn.nextInt(10) + 1;
        System.out.println(answer);
    }

}
