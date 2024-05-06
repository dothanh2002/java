public class Human {
    public   synchronized void  wakeup(){
        System.out.println("Human wakes up");
        try {
            wait();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public synchronized void working(){
        System.out.println("Human is working");
    }

    public  synchronized void breakfast(){
        System.out.println("Human is having breakfast ");
    }


}
