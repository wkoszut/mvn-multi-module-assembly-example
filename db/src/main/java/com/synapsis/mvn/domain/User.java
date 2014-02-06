package com.synapsis.mvn.domain;

/**
 * Project mvn-multi-module-assembly-example
 * User: wkoszut
 * Date: 06/02/14
 * Time: 15:18
 * com.synapsis.mvn.domain
 * To change this template use File | Settings | File Templates.
 */
public class User {

    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }
}
