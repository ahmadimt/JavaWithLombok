package com.imti.service.base;

import com.imti.persistence.entity.TestEntity;

/**
 * Created by imteyaza on 17/7/16.
 */
public interface TestService {

    TestEntity getTestByName(String name);
}
