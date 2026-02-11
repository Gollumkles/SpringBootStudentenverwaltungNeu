package at.itkollegimst.studentenverwaltung.service;

import at.itkollegimst.studentenverwaltung.domain.Student;
import at.itkollegimst.studentenverwaltung.exceptions.StudentNichtGefunden;

import java.util.List;

public interface StudentenService {

    List<Student> alleStudenten();

    Student studentEinfuegen(Student Student);

    Student studentMitId(Long id) throws StudentNichtGefunden;

    List<Student> alleStudentenMitPlz(String plz);

    void studentLoeschenMitId(Long id);
}
