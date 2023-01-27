package com.icafe.thewheel.thewheel.controller;

import com.icafe.thewheel.thewheel.model.Expert;
import com.icafe.thewheel.thewheel.model.Subject;
import com.icafe.thewheel.thewheel.service.ExpertServiceImpl;
import com.icafe.thewheel.thewheel.service.QuestionServiceImpl;
import com.icafe.thewheel.thewheel.service.SubjectServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {

    private ExpertServiceImpl expertService;
    private QuestionServiceImpl questionService;
    private SubjectServiceImpl subjectService;

    @Autowired
    public void setExpertService(ExpertServiceImpl expertService) {
        this.expertService = expertService;
    }

    @Autowired
    public void setQuestionService(QuestionServiceImpl questionService) {
        this.questionService = questionService;
    }

    @Autowired
    public void setSubjectService(SubjectServiceImpl subjectService) {
        this.subjectService = subjectService;
    }

    @GetMapping("/")
    public String setUp(Model model) {

        for (Subject subject: subjectService.findAll()) {
            model.addAttribute(subject.getSubjectName(), subject);
        }

//        for (Expert expert: expertService.findAll()) {
//            model.addAttribute(expert.getExpertSubject(), expert);
//        }
        return "index";
    }
}
