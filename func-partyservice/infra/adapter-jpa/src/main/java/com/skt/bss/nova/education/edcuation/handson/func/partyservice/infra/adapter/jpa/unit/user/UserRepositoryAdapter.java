package com.skt.bss.nova.education.edcuation.handson.func.partyservice.infra.adapter.jpa.unit.user;

import java.util.UUID;

import com.skt.bss.nova.education.education.handson.func.partyservice.application.unit.user.UserRepository;
import org.springframework.stereotype.Repository;

import com.skt.bss.nova.base.shared.framework.core.BaseRepositorySupport;
import com.skt.bss.nova.education.education.biz.func.partyservice.domain.user.UserEntity;

@Repository
public class UserRepositoryAdapter extends BaseRepositorySupport<UserEntity, UserJpaEntity, UUID> implements UserRepository {

    private final UserJpaEntityRepository jpaRepository;
    private final UserMapper entityMapper;

    public UserRepositoryAdapter(final UserJpaEntityRepository repository, final UserMapper mapper) {
        super(repository, repository, mapper, QUserJpaEntity.userJpaEntity);
        this.jpaRepository = repository;
        this.entityMapper = mapper;
    }
        
}
