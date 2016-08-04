package com.imti.persistence.repo;

import com.imti.persistence.entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by imteyaza on 17/7/16.
 */
public interface TestEntityRepo extends JpaRepository<TestEntity, Long> {

    TestEntity findByName(String name);
}
