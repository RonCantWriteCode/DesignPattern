package cn.roncantwritecode.designpattern.dataaccessobjectpattern;

import java.util.List;

/**
 * @author Ron Wu
 */
public interface StudentDao {
    public List<Student> getAllStudents();
    public Student getStudent(int rollNo);
    public void updateStudent(Student student);
    public void deleteStudent(Student student);
}