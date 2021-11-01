package td1;

import java.util.Timer;
import java.util.TimerTask;
import java.awt.Toolkit;
/*** Schedule a task that executes once every second.*/
public class AnnoyingBeep {
    Toolkit toolkit;
    Timer timer;
    //test

    public AnnoyingBeep() {
        toolkit = Toolkit.getDefaultToolkit();
        timer = new Timer();
        timer.scheduleAtFixedRate(new RemindTask(),
        3000,        //initial delay
        1*1000);  //subsequent rate}
    }

    class RemindTask extends TimerTask {
        int numWarningBeeps = 3;
        int count = 0;
        long time = System.currentTimeMillis();
        /*String time2 = Long.toString(time);
        String scheduledExecutionTime2 = Long.toString(scheduledExecutionTime());
        System.out.println(time2);
        System.out.println(scheduledExecutionTime2);*/
    public void run(){

        if (numWarningBeeps >0){ /*Soit on fait un compteur*/
             long time = System.currentTimeMillis();
            if (time - scheduledExecutionTime() > 5) {
            return; }
            /*Not too late*/
            toolkit.beep();
            System.out.println("Beep!");
            numWarningBeeps--;
            count++;
        } 
        else{
                /*Too late*/
                toolkit.beep(); 
                System.out.println("Time's up!");
                // timer.cancel(); //Not necessary because we call 
                System.exit(0);   //Stops the AWT thread (and everything else)
        }
    }
    }

    public static void main(String args[]) {
     System.out.println("About to schedule task.");
        new AnnoyingBeep();
     System.out.println("Task scheduled.");
    }
}