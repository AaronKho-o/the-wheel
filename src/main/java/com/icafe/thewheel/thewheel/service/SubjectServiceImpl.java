package com.icafe.thewheel.thewheel.service;

import com.icafe.thewheel.thewheel.model.Subject;
import com.icafe.thewheel.thewheel.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    public List<Subject> findAll() {
        return (List<Subject>) this.subjectRepository.findAll();
    }
}
