import java.util.Scanner;
import java.util.Random;

public class TossACoin {
    private int a;
    private int b;

    Scanner input = new Scanner(System.in);
    Random random = new Random();
    private int upperbound = 2;

    public TossACoin() {
        setA(random.nextInt(upperbound));
        System.out.println("Zgadnij co wypadlo \n1 - reszka \n0 - orzel");
        setB(input.nextInt());

    }

    public void askJaskier() {
        if (a == b) {
            System.out.println("Zgadles ! To " + coin());
        } else {
            System.out.println("Zaraza...");
        }
    }

    String coin() {
        if (a == 1) {
            return "reszka";
        } else return "orzel";
    }


    public void setA(int a) {
        this.a = a;
    }


    public void setB(int b) {
        this.b = b;
    }
}
