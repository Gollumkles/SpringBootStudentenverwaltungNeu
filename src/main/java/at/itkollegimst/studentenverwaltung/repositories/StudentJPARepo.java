package at.itkollegimst.studentenverwaltung.repositories;

import at.itkollegimst.studentenverwaltung.domain.student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentJPARepo extends JpaRepository<student,Long> {

}
