package com.skt.bss.nova.education.edcuation.handson.func.partyservice.infra.adapter.jpa.unit.user;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface UserJpaEntityRepository extends JpaRepository<UserJpaEntity, UUID>, QuerydslPredicateExecutor<UserJpaEntity>  {
    
}
