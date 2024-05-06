public class Demo {
    public static void main(String[] args) {
        MyThread myThread= new MyThread("t1");
                myThread.start();
                try{
                    myThread.join();
                }catch (InterruptedException e){
                    throw new RuntimeException(e);
                }



        MyThread myThread1=new MyThread("t2");
        myThread1.start();
    }
}