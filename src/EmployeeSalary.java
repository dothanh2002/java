public class EmployeeSalary extends  Thread {
    Employee employee;
    public  EmployeeSalary(Employee employee){
        this.employee= employee;
    }
    public  void run(){
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
