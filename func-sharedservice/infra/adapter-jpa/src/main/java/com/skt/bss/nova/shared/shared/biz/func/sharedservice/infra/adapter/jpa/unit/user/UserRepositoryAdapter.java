package com.skt.bss.nova.shared.shared.biz.func.sharedservice.infra.adapter.jpa.unit.user;

import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.skt.bss.nova.base.shared.framework.core.BaseRepositorySupport;
import com.skt.bss.nova.shared.shared.biz.func.sharedservice.application.unit.user.UserRepository;
import com.skt.bss.nova.shared.shared.biz.func.sharedservice.domain.user.UserEntity;

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
