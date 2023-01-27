package com.icafe.thewheel.thewheel.repository;

import com.icafe.thewheel.thewheel.model.Expert;
import com.icafe.thewheel.thewheel.model.Question;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface QuestionRepository extends CrudRepository<Question, Integer> {

    List<Question> findByQuestionExpert(Expert questionExpert);

}
