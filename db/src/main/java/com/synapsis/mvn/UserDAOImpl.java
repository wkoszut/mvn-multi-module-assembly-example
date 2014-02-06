package com.synapsis.mvn;

import com.synapsis.mvn.domain.User;

/**
 * Project mvn-multi-module-assembly-example
 * User: wkoszut
 * Date: 06/02/14
 * Time: 15:30
 * com.synapsis.mvn
 * To change this template use File | Settings | File Templates.
 */
public class UserDAOImpl implements UserDAO {
    public User getUser() {
        return new User(1l, "test");  //To change body of implemented methods use File | Settings | File Templates.
    }
}
