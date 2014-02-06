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

    private Long mId;

    private String mName;

    public User(final Long id, final String test) {
        //To change body of created methods use File | Settings | File Templates.
    }

    public Long getmId() {
        return mId;
    }

    public void setmId(final Long mId) {
        this.mId = mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(final String mName) {
        this.mName = mName;
    }
}
