package at.itkollegimst.studentenverwaltung.repositories;

import at.itkollegimst.studentenverwaltung.domain.student;
import at.itkollegimst.studentenverwaltung.exceptions.StudentNichtGefunden;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class DbZugriffStudentenJPA implements DbZugriffStudenten  {

    private  StudentJPARepo studentJPARepo;

    public DbZugriffStudentenJPA(StudentJPARepo studentJPARepo) {
        this.studentJPARepo = studentJPARepo;
    }

    @Override
    public student StudentSpeicher(student Student) {
        return this.studentJPARepo.save(Student);
    }

    @Override
    public List<student> alleStudenten() {

        return this.studentJPARepo.findAll();
    }

    @Override
    public student alleStudentenAusDemOrt(String plz) {
        return this.studentJPARepo.findAllByPlz(plz);
    }

    @Override
    public student studentMitId(Long id) throws StudentNichtGefunden {
        Optional<student> optStudent = this.studentJPARepo.findById(id);
        if(optStudent.isPresent()) {
            return optStudent.get();
        }else  {
            throw new StudentNichtGefunden("Student mit der ID" + id + " nicht gefunden");
        }
    }

    @Override
    public void studentLoeschenMitId(Long id) {
        this.studentJPARepo.deleteById(id);
    }
}
