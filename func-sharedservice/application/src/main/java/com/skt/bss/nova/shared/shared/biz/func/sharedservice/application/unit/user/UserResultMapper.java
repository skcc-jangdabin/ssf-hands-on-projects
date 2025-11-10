package com.skt.bss.nova.shared.shared.biz.func.sharedservice.application.unit.user;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.skt.bss.nova.base.shared.framework.core.GlobalMapperConfig;
import com.skt.bss.nova.base.shared.kernel.mapper.ResultMapper;
import com.skt.bss.nova.shared.shared.biz.func.sharedservice.contract.api.unit.user.UserResult;
import com.skt.bss.nova.shared.shared.biz.func.sharedservice.domain.user.UserEntity;

@Mapper(config = GlobalMapperConfig.class)
public interface UserResultMapper extends ResultMapper<UserEntity, UserResult>{


}
