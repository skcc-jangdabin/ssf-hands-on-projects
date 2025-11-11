package com.skt.bss.nova.education.education.handson.func.partyservice.application.unit.user;

import org.springframework.stereotype.Component;

import com.skt.bss.nova.base.shared.framework.core.BaseDomainFactory;
import com.skt.bss.nova.education.education.biz.func.partyservice.domain.user.User;

@Component
public class UserDomainFactory extends BaseDomainFactory<User> {
    
    protected UserDomainFactory() {
        super(User.class);
    }

}
