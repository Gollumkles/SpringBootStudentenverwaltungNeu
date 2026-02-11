package at.itkollegimst.studentenverwaltung;

import at.itkollegimst.studentenverwaltung.domain.Student;
import at.itkollegimst.studentenverwaltung.repositories.StudentJPARepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class StudentenverwaltungApplication implements ApplicationRunner {

	@Autowired
	StudentJPARepo studentJPARepo;

	public static void main(String[] args) {
		SpringApplication.run(StudentenverwaltungApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		this.studentJPARepo.save(new Student("Julian", "6845"));
		this.studentJPARepo.save(new Student("dullu", "6845"));
		this.studentJPARepo.save(new Student("nef", "6845"));
		this.studentJPARepo.save(new Student("def", "6845"));
		this.studentJPARepo.save(new Student("deftest", "6845"));

	}
}
