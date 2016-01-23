package org.xxz.validation.bean;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

public class User implements java.io.Serializable {

    private static final long serialVersionUID = 7832481883641839616L;

    @NotEmpty
    private String name;

    @Range(min = 1, max = 150)
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " [name=" + name + ", age=" + age + "]";
    }

}
