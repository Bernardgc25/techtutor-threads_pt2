import com.java.multithread.LoaderThread;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int fnum, lnum; 
      
        System.out.print("Enter first number:");
        fnum = sc.nextInt(); 

        System.out.print("Enter last number:");
        lnum = sc.nextInt();

        System.out.print("\033[H\033[2J");  
	    System.out.flush();

        /* 
        System.out.print("Before method execution");
        System.out.println("Milliseconds: "+ System.currentTimeMillis());
        */

        LoaderThread demoThread = new LoaderThread(fnum, lnum);
    
        Thread th1 = new Thread(demoThread);
        Thread th2 = new Thread(demoThread);
        th1.start();

        try {
            th1.join(1500);
        } catch (Exception e){
            System.out.println(e);
            } 
            th2.start();

        /* 
        System.out.print("After method execution");
        System.out.println("Milliseconds: "+ System.currentTimeMillis());
        */
    }
}
