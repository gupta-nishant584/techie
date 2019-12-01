package in.co.myleadingskills.springioc;

public class Airtel implements Sim {
    public void call() {
        System.out.println("Calling from airtel sim");
    }

    public void internet() {
        System.out.println("Using internet from airtel sim");
    }
}
