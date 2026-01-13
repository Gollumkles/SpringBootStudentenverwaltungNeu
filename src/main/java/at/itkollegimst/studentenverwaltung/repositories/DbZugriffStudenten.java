package at.itkollegimst.studentenverwaltung.repositories;
import at.itkollegimst.studentenverwaltung.domain.student;
import at.itkollegimst.studentenverwaltung.exceptions.StudentNichtGefunden;

import java.util.List;

public interface DbZugriffStudenten
{
    student StudentSpeicher(student Student);
    List<student> alleStudenten();
    student studentMitId(Long id) throws StudentNichtGefunden;
    void studentLoeschenMitId(Long id);
}
