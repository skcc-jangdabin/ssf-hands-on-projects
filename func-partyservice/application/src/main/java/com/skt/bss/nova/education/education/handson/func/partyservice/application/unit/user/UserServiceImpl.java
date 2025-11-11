package com.skt.bss.nova.education.education.handson.func.partyservice.application.unit.user;

import java.util.UUID;

import com.skt.bss.nova.edcuation.education.handson.func.partyservice.contract.api.unit.user.UserResult;
import com.skt.bss.nova.edcuation.education.handson.func.partyservice.contract.api.unit.user.UserService;
import com.skt.bss.nova.education.education.biz.func.partyservice.domain.user.UserEntity;
import org.springframework.stereotype.Service;

import com.skt.bss.nova.base.shared.framework.core.BaseServiceSupport;

@Service
public class UserServiceImpl extends BaseServiceSupport<UserEntity, UUID, UserResult> implements UserService {
    
    private final UserDomainFactory domainFactory;
    private final UserRepository repository;
    private final UserResultMapper resultMapper;

    public UserServiceImpl(UserDomainFactory domainFactory, UserRepository repository, UserResultMapper resultMapper) {
        super(domainFactory, repository, resultMapper);
        this.domainFactory = domainFactory;
        this.repository = repository;
        this.resultMapper = resultMapper;
    }

}
