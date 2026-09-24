import java.io.*;
import java.util.Scanner;
class Payment implements Runnable {

    public void run() {

        for (int i = 1; i <= 5; i++) {
            System.out.println("Payment Processing...");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        System.out.println("Payment Completed.");
    }
}

public class PaymentGateway {
    public static void main(String[] args) {

        Payment payment = new Payment();

        Thread t = new Thread(payment);

        t.start();
    }
}
