import javax.sound.midi.Soundbank;

public class MyThread extends Thread{
    String name;
    public  MyThread(String name){
        super(name);
        this.name=name;
    }
    public  void  run() {
for (int i =0; i<100;i++){
    System.out.println(this.name +i);
    try {
        sleep(1000);
    }catch (InterruptedException e){
        throw  new RuntimeException(e);
    }

}

    }

}
