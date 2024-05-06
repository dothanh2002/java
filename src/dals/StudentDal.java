package dals;
import models.Student;
import java.util.ArrayList;
public class StudentDal extends Db<Student> implements IDAL<Student> {
    public static final String FILE_PATH = "C:\\Users\\DoThanh\\OneDrive\\Máy tính\\student.txt";
    public StudentDal() {
        this.setFilePath(FILE_PATH);
        synData();
    }

    @Override
    public void add(Student obj) {
        list.add(obj);
        writeData(list);
    }

    @Override
    public ArrayList<Student> getlist() {
        return null;
    }

    @Override
    public ArrayList<Student> getList() {
        return list;
    }
}


