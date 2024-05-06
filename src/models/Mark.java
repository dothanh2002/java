package models;
import java.io.Serializable;


public class Mark implements Serializable{
    String Id;
    String studentId;
    String subjectId;
    Float mark;
    public Mark(){

    }

    public Mark(String id, String studentId, String subjectId, Float mark) {
        Id = id;
        this.studentId = studentId;
        this.subjectId = subjectId;
        this.mark = mark;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public Float getMark() {
        return mark;
    }

    public void setMark(Float mark) {
        this.mark = mark;
    }
}
