public class Demo2 {
    public static void main(String[] args) {
        Employee employee = new Employee("John", 1000);
        Thread t1= new Thread(new Runnable() {
            @Override
            public void run() {
                employee.printDetail();
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }

            }
        });
        t1.setPriority(Thread.MAX_PRIORITY);

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                employee.updateSalary(2000);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
    }
}
