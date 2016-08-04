package com.imti.persistence.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;

/**
 * Created by imteyaza on 17/7/16.
 */
@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class TestEntity extends BaseEntity {
    private String name;

}
