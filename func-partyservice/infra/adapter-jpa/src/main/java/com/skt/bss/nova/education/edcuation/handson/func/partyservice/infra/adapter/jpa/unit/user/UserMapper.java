package com.skt.bss.nova.education.edcuation.handson.func.partyservice.infra.adapter.jpa.unit.user;

import org.mapstruct.Mapper;

import com.skt.bss.nova.base.shared.kernel.mapper.EntityMapper;
import com.skt.bss.nova.education.education.biz.func.partyservice.domain.user.UserEntity;

@Mapper(componentModel = "spring")
public interface UserMapper extends EntityMapper<UserEntity, UserJpaEntity> {
    
}
