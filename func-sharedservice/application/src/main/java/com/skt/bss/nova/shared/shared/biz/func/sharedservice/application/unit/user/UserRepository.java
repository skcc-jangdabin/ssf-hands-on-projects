package com.skt.bss.nova.shared.shared.biz.func.sharedservice.application.unit.user;

import java.util.UUID;

import com.skt.bss.nova.base.shared.kernel.core.base.BaseRepository;
import com.skt.bss.nova.shared.shared.biz.func.sharedservice.domain.user.UserEntity;

public interface UserRepository extends BaseRepository<UserEntity, UUID> {
    
}
