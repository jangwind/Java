package org.wind.service;

import org.junit.Test;
import org.wind.util.SpringUtils;

/**
 * Created by wind on 2015/12/31.
 */
public class TestService {

    private SpringUtils util = new SpringUtils();

    @Test
    public void test(){
        util.getBean("bean");
    }
}
