import com.pokutuna.*;

public class HelloWorld {
    public static void main(String[] args) {
        FizzBuzz p =  new FizzBuzz();

        for (int i = 0; i < 100; i++) {
            try {
                p.output();
            } catch(Exception e) {
                System.out.println("ぽくつな数");
            }
        }
    }
}
