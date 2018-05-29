/**
 * Creation Date:2018年5月29日-下午3:59:32
 * 
 * Copyright 2008-2018 © 同程网 Inc. All Rights Reserved
 */
package com.discovery.darchrow;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.discovery.darchrow.bean.DemoBean;

/**
 * Description Of The Class<br/>
 * 
 * @author mdl47196
 * @version 1.0.0, 2018年5月29日-下午3:59:32
 * @since 2018年5月29日-下午3:59:32
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring/spring.xml" })
public class DemoTest {
    
    @Resource
    private DemoBean demoBean;
    
    @Test
    public void test() {
        System.out.println(demoBean.getName() + "-" + demoBean.getAddress());
    }
    
}
