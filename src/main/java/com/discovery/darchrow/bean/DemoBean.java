/**
 * Creation Date:2018年5月29日-下午3:53:08
 * 
 * Copyright 2008-2018 © 同程网 Inc. All Rights Reserved
 */
package com.discovery.darchrow.bean;

import org.springframework.stereotype.Component;

/**
 * Description Of The Class<br/>
 * 
 * @author 	mdl47196
 * @version 1.0.0, 2018年5月29日-下午3:53:08
 * @since 2018年5月29日-下午3:53:08
 */
@Component
public class DemoBean {
    
    private String name;

    private String address;

    public DemoBean() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

