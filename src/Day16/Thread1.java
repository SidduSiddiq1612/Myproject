package Day16;
class MyTask extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("-" +i);
        }
    }
}
class myclass{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("-" +i);
        }
    }
}
public class Thread1{
    public static void main(String[] args) {
        MyTask t1=new MyTask();
        MyTask t2=new MyTask();
        t1.start();
        t2.start();
        myclass m1=new myclass();
        myclass m2=new myclass();
        m1.run();
        m2.run();
    }
}











