package com.skt.bss.nova.shared.shared.biz.func.sharedservice.application.unit.user;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.skt.bss.nova.base.shared.framework.core.BaseServiceSupport;
import com.skt.bss.nova.shared.shared.biz.func.sharedservice.contract.api.unit.user.UserResult;
import com.skt.bss.nova.shared.shared.biz.func.sharedservice.contract.api.unit.user.UserService;
import com.skt.bss.nova.shared.shared.biz.func.sharedservice.domain.user.UserEntity;

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
