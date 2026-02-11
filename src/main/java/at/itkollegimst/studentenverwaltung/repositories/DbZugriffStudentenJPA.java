package at.itkollegimst.studentenverwaltung.repositories;

import at.itkollegimst.studentenverwaltung.domain.Student;
import at.itkollegimst.studentenverwaltung.exceptions.StudentNichtGefunden;
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
    public Student StudentSpeicher(Student Student) {
        return this.studentJPARepo.save(Student);
    }

    @Override
    public List<Student> alleStudenten() {

        return this.studentJPARepo.findAll();
    }

    @Override
    public Student alleStudentenAusDemOrt(String plz) {
        return this.studentJPARepo.findAllByPlz(plz);
    }

    @Override
    public Student studentMitId(Long id) throws StudentNichtGefunden {
        Optional<Student> optStudent = this.studentJPARepo.findById(id);
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
