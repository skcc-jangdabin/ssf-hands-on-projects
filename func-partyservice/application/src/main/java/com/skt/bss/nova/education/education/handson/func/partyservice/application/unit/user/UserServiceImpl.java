package com.skt.bss.nova.education.education.handson.func.partyservice.application.unit.user;

import java.util.UUID;

import com.skt.bss.nova.edcuation.education.handson.func.partyservice.contract.api.unit.user.UserResult;
import com.skt.bss.nova.edcuation.education.handson.func.partyservice.contract.api.unit.user.UserService;
import com.skt.bss.nova.education.education.biz.func.partyservice.domain.user.User;
import org.springframework.stereotype.Service;

import com.skt.bss.nova.base.shared.framework.core.BaseServiceSupport;

/// 템플릿화 되있는 건 자동으로 생성 됨
/// 데이터 모델 그대로 도메인 모델 연결
/// 컨트랙트를 어떻게 정의하냐만 정하면 기본은 다 만들어짐 -> 이를 바탕으로 추가적인 것만 코딩하면 됨
@Service
public class UserServiceImpl extends BaseServiceSupport<User, UUID, UserResult> implements UserService {
    
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
