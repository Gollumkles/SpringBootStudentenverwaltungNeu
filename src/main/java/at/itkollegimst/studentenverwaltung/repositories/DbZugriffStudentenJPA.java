package at.itkollegimst.studentenverwaltung.repositories;

import at.itkollegimst.studentenverwaltung.domain.student;
import at.itkollegimst.studentenverwaltung.exceptions.StudentNichtGefunden;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DbZugriffStudentenJPA implements DbZugriffStudenten  {

    private  StudentJPARepo studentJPARepo;

    public DbZugriffStudentenJPA(StudentJPARepo studentJPARepo) {
        this.studentJPARepo = studentJPARepo;
    }

    @Override
    public student StudentSpeicher(student Student) {
        return null;
    }

    @Override
    public List<student> alleStudenten() {
        return List.of();
    }

    @Override
    public student studentMitId(Long id) throws StudentNichtGefunden {
        return null;
    }

    @Override
    public void studentLoeschenMitId(Long id) {

    }
}
