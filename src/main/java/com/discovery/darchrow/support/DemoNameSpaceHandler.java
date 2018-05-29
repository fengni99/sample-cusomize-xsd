/**
 * Creation Date:2018年5月29日-下午3:54:36
 * 
 * Copyright 2008-2018 © 同程网 Inc. All Rights Reserved
 */
package com.discovery.darchrow.support;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * Description Of The Class<br/>
 * 
 * @author 	mdl47196
 * @version 1.0.0, 2018年5月29日-下午3:54:36
 * @since 2018年5月29日-下午3:54:36
 */
public class DemoNameSpaceHandler extends NamespaceHandlerSupport {

    @Override
    public void init() {
        registerBeanDefinitionParser("bean", new DemoBeanDefinitionParser());
    }
}

