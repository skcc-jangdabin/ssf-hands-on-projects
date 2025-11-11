package com.skt.bss.nova.education.education.handson.func.partyservice.application.unit.user;

import java.util.UUID;

import com.skt.bss.nova.base.shared.kernel.core.base.BaseRepository;
import com.skt.bss.nova.education.education.biz.func.partyservice.domain.user.UserEntity;

public interface UserRepository extends BaseRepository<UserEntity, UUID> {
    
}
