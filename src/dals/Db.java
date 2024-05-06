package dals;
import models.Student;
import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
public abstract class Db<k> {
    ArrayList<k>list;
    String filePath="";

    public void setFilePath(String filePath){
        this.filePath=filePath;
    }
    public void synData(){
        this.list=readData()== null?new ArrayList<>():(ArrayList<k>) readData();
    }
    public void writeData(Object object) {
        try {
            File file = new File(filePath);
            if (!file.exists() || file.isDirectory()) {
                file.createNewFile();
            }
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(this.filePath));
            objectOutputStream.writeObject(object);
            objectOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Object readData() {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(this.filePath));
            Object object = objectInputStream.readObject();
            objectInputStream.close();
            return object;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public abstract ArrayList<Student> getList();
}
