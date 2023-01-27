package com.icafe.thewheel.thewheel.repository;

import com.icafe.thewheel.thewheel.model.Expert;
import org.springframework.data.repository.CrudRepository;

public interface ExpertRepository extends CrudRepository<Expert, Integer> {

    Expert findByExpertName(String expertName);

}
