package td1;

class MyThread extends Thread{ 
    public MyThread (String s){ 
        super(s); 
        }
    public void run(){ 
    System.out.println("Helllo, I am "+ getName());
    }
}