package com.synapsis.mvn;


import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Project mvn-multi-module-assembly-example
 * User: wkoszut
 * Date: 06/02/14
 * Time: 16:09
 * com.synapsis.mvn
 * To change this template use File | Settings | File Templates.
 */
public class UserDAOImplTest {


    @Test
    public void testApp() {
        assertNotNull(new UserDAOImpl().getUser());
    }

}
