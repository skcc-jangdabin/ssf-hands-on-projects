package com.skt.bss.nova.shared.shared.biz.func.sharedservice.application.unit.user;

import org.springframework.stereotype.Component;

import com.skt.bss.nova.base.shared.framework.core.BaseDomainFactory;
import com.skt.bss.nova.shared.shared.biz.func.sharedservice.domain.user.UserEntity;

@Component
public class UserDomainFactory extends BaseDomainFactory<UserEntity> {
    
    protected UserDomainFactory() {
        super(UserEntity.class);
    }

}
