package com.imti.service.impl;

import com.imti.persistence.entity.TestEntity;
import com.imti.persistence.repo.TestEntityRepo;
import com.imti.service.base.TestService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by imteyaza on 17/7/16.
 */
@Log4j2
@Service
public class TestServiceImpl implements TestService {

    private final TestEntityRepo testEntityRepo;

    @Autowired
    public TestServiceImpl(TestEntityRepo testEntityRepo) {
        this.testEntityRepo = testEntityRepo;
    }

    @Override
    public TestEntity getTestByName(String name) {

        log.info("Getting Test Entity Info");

        return null;
    }
}
