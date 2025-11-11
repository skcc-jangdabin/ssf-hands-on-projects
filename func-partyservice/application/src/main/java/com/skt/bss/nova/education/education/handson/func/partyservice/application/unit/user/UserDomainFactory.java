package com.skt.bss.nova.education.education.handson.func.partyservice.application.unit.user;

import org.springframework.stereotype.Component;

import com.skt.bss.nova.base.shared.framework.core.BaseDomainFactory;
import com.skt.bss.nova.education.education.biz.func.partyservice.domain.user.UserEntity;

@Component
public class UserDomainFactory extends BaseDomainFactory<UserEntity> {
    
    protected UserDomainFactory() {
        super(UserEntity.class);
    }

}
