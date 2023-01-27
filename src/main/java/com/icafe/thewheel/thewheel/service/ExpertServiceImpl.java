package com.icafe.thewheel.thewheel.service;

import com.icafe.thewheel.thewheel.model.Expert;
import com.icafe.thewheel.thewheel.repository.ExpertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpertServiceImpl implements ExpertService {

    @Autowired
    private ExpertRepository expertRepository;

    @Override
    public List<Expert> findAll() {
        return (List<Expert>) expertRepository.findAll();
    }
}
