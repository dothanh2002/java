
package dals;

import models.Student;
import models.Subject;

import java.util.ArrayList;

public class SubjectDal extends Db<Subject> implements IDAL<Subject> {
    public static final String FILE_PATH = "/C:\\Users\\DoThanh\\OneDrive\\Máy tính\\Subject.txt";

    public SubjectDal() {
        this.setFilePath(FILE_PATH);
        synData();
    }

    @Override
    public void add(Subject obj) {
        list.add(obj);
        writeData(list);
    }

    @Override
    public ArrayList<Subject> getlist() {
        return null;
    }

    @Override
    public ArrayList<Student> getList() {
        return null;
    }
}


