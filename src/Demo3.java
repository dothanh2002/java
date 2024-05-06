public class Demo3 {
    public static void main(String[] args) {
        Human human = new Human();
        Thread t1 =new Thread(new Runnable() {
            @Override
            public void run() {
                human.wakeup();

                human.working();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                human.breakfast();
            }
        });
        t1.start();
        t2.start();
    }
}
