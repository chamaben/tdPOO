package td1;

public class TestThreadMany{
    public static void main (String arg[]){ 
    
    int n = Integer.parseInt(arg[0]);
    MyThread[] t;
    t = new MyThread[n] ;
    for (int i = 0 ; i<n ; i++){
        t[i] = new MyThread ("Thread #" + i);
     t[i].start();
    } 
    }
}