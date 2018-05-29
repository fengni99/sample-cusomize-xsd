/**
 * Creation Date:2018年5月29日-下午3:53:58
 * 
 * Copyright 2008-2018 © 同程网 Inc. All Rights Reserved
 */
package com.discovery.darchrow.support;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.w3c.dom.Element;

import com.discovery.darchrow.bean.DemoBean;

/**
 * Description Of The Class<br/>
 * 
 * @author 	mdl47196
 * @version 1.0.0, 2018年5月29日-下午3:53:58
 * @since 2018年5月29日-下午3:53:58
 */
public class DemoBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

    protected Class<?> getBeanClass(final Element element) {
        return DemoBean.class;
    }

    protected void doParse(final Element element, final BeanDefinitionBuilder bean) {
        bean.addPropertyValue("name",element.getAttribute("name"));
        bean.addPropertyValue("address",element.getAttribute("address"));
    }
}
