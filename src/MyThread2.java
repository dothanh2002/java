public class MyThread2 implements Runnable{
    public void run(){
        for (int i =0; i<100;i++){
            System.out.println(Thread.currentThread().getName()+i);
            try {
               Thread.sleep(1000);
            }catch (InterruptedException e){
                throw  new RuntimeException(e);
    }
}
    }
}