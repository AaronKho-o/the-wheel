package com.icafe.thewheel.thewheel;

import com.icafe.thewheel.thewheel.model.Expert;
import com.icafe.thewheel.thewheel.model.Question;
import com.icafe.thewheel.thewheel.model.Subject;
import com.icafe.thewheel.thewheel.repository.ExpertRepository;
import com.icafe.thewheel.thewheel.repository.QuestionRepository;
import com.icafe.thewheel.thewheel.repository.SubjectRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.expression.spel.ast.QualifiedIdentifier;

import java.awt.desktop.QuitEvent;
import java.util.List;

@SpringBootApplication
public class TheWheelApplication {

	public static void main(String[] args) {
		SpringApplication.run(TheWheelApplication.class, args);
	}

	@Bean
	public CommandLineRunner temp(ExpertRepository expertRepository, QuestionRepository questionRepository, SubjectRepository subjectRepository) {
		return (args) -> {

			Expert serena = new Expert("Serena", "Mathematics", "Normal");
			Expert kai = new Expert("Kai", "English", "Normal");
			Expert sam = new Expert("Sam", "Veganism", "Normal");
			Expert grant = new Expert("Grant", "Running", "Normal");
			Expert aaron = new Expert("Aaron", "Books", "Normal");
			Expert ian = new Expert("Ian", "Psychology", "Normal");
			Expert david = new Expert("David", "Management", "Normal");
			Expert chloe = new Expert("Chloe", "Football", "Normal");

			expertRepository.save(serena);
			expertRepository.save(kai);
			expertRepository.save(sam);
			expertRepository.save(grant);
			expertRepository.save(aaron);
			expertRepository.save(ian);
			expertRepository.save(david);
			expertRepository.save(chloe);

			Subject mathematics = new Subject("Mathematics", "notCompleted");
			Subject english = new Subject("English", "notCompleted");
			Subject veganism = new Subject("Veganism", "notCompleted");
			Subject running = new Subject("Running", "notCompleted");
			Subject books = new Subject("Books", "notCompleted");
			Subject psychology = new Subject("Psychology", "notCompleted");
			Subject management = new Subject("Management", "notCompleted");
			Subject football = new Subject("Football", "notCompleted");

			subjectRepository.save(mathematics);
			subjectRepository.save(english);
			subjectRepository.save(veganism);
			subjectRepository.save(running);
			subjectRepository.save(books);
			subjectRepository.save(psychology);
			subjectRepository.save(management);
			subjectRepository.save(football);

			Question question1 = new Question(mathematics, "What is the value of pi up to 5 decimal places?", "3.14154","3.14159","3.14157","3.14158", "option2", serena, "Unanswered");
			Question question2 = new Question(mathematics, "What function is continuous everywhere but differentiable nowhere", "Weierstrass function", "Mathieu functions", "Elliptic functions","Chebyshev polynomials", "option1", serena, "Unanswered");
			Question question3 = new Question(english, "What is a word beginning with T?", "Tea", "Key", "Gee", "Qi", "option1", kai, "Unanswered");
			Question question4 = new Question(english, "What is the only definite article in English?", "a", "the", "that", "there", "option2", kai, "Unanswered");
			Question question5 = new Question(veganism, "Which is a non-vegan ingredient?", "Banana", "Vegan Cheese", "Potatoes", "Eggs", "option4", sam, "Unanswered");
			Question question6 = new Question(veganism, "Which is a vegan ingredient?", "Butter", "Cheese", "Bread", "Meat", "option3", sam, "Unanswered");
			Question question7 = new Question(running, "How long does it take Grant to run 10km?", "40mins", "42mins", "45mins", "50mins", "option3", grant, "Unanswered");
			Question question8 = new Question(running, "What is the pace of a 5km run in 20min?", "8km/h", "10km/h", "12km/h", "15km/h", "option4", grant, "Unanswered");
			Question question9 = new Question(books, "What was the best-selling book in 2020?", "Bible", "Quran", "Torah", "Pentateuch", "option1", aaron, "Unanswered");
			Question question10 = new Question(books, "Who is the main character of the Bible?", "Jesus", "Moses", "David", "Goliath", "option1", aaron, "Unanswered");
			Question question11 = new Question(psychology, "Does working equal health?", "Yes", "No", "Maybe", "I don't know", "option2", ian, "Unanswered");
			Question question12 = new Question(psychology, "What is the key to happiness?", "Health", "Wealth", "Work", "Jesus", "option4", ian, "Unanswered");
			Question question13 = new Question(management, "How do you spell management?", "managememt", "managemen", "manegement", "management", "option4", david, "Unanswered");
			Question question14 = new Question(management, "Should we go over the budget for our work dinner?", "Yes", "No", "It depends", "We don't have a budget", "option2", david, "Unanswered");
			Question question15 = new Question(football, "Who is the best footballer in the world", "Diego Maradone", "Cristiano Ronaldo", "Lionel Messi", "Zinedine Zidane", "option3", chloe, "Unanswered");
			Question question16 = new Question(football, "Which country won the 2022 world cup?", "Argentina", "Netherlands", "France", "Germany", "option1", chloe, "Unanswered");

			questionRepository.save(question1);
			questionRepository.save(question2);
			questionRepository.save(question3);
			questionRepository.save(question4);
			questionRepository.save(question5);
			questionRepository.save(question6);
			questionRepository.save(question7);
			questionRepository.save(question8);
			questionRepository.save(question9);
			questionRepository.save(question10);
			questionRepository.save(question11);
			questionRepository.save(question12);
			questionRepository.save(question13);
			questionRepository.save(question14);
			questionRepository.save(question15);
			questionRepository.save(question16);

			serena.addQuestion(question1);
			serena.addQuestion(question2);
			kai.addQuestion(question3);
			kai.addQuestion(question4);
			sam.addQuestion(question5);
			sam.addQuestion(question6);
			grant.addQuestion(question7);
			grant.addQuestion(question8);
			aaron.addQuestion(question9);
			aaron.addQuestion(question10);
			ian.addQuestion(question11);
			ian.addQuestion(question12);
			david.addQuestion(question13);
			david.addQuestion(question14);
			chloe.addQuestion(question15);
			chloe.addQuestion(question16);

		};

	}

}
