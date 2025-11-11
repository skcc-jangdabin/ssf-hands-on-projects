package com.skt.bss.nova.education.education.handson.func.partyservice.application.unit.user;

import com.skt.bss.nova.edcuation.education.handson.func.partyservice.contract.api.unit.user.UserResult;
import org.mapstruct.Mapper;

import com.skt.bss.nova.base.shared.framework.core.GlobalMapperConfig;
import com.skt.bss.nova.base.shared.kernel.mapper.ResultMapper;

import com.skt.bss.nova.education.education.biz.func.partyservice.domain.user.User;

@Mapper(config = GlobalMapperConfig.class)
public interface UserResultMapper extends ResultMapper<User, UserResult>{

    
}
