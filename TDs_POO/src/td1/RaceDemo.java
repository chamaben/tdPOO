package td1;

public class RaceDemo {
    private final static int NUMRUNNERS = 2;
    public static void main(String[] args) {

        /*PoliteRunner[] runners = new PoliteRunner[NUMRUNNERS];
        for(int i = 0; i < NUMRUNNERS; i++) {
            System.out.println(i);
            runners[i] = new PoliteRunner(i);
            runners[i].setPriority(2);
            }
        for(int i = 0; i < NUMRUNNERS; i++)runners[i].start();*/

        SelfishRunner[] runners = new SelfishRunner[NUMRUNNERS];
        for(int i = 0; i < NUMRUNNERS; i++) {
            System.out.println(i);
            runners[i] = new SelfishRunner(i);
            runners[i].setPriority(2);
            }
        for(int i = 0; i < NUMRUNNERS; i++)runners[i].start();
    }
}