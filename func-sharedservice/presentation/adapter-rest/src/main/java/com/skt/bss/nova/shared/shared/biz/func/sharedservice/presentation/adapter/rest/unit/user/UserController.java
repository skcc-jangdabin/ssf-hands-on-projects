package com.skt.bss.nova.shared.shared.biz.func.sharedservice.presentation.adapter.rest.unit.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skt.bss.nova.base.shared.kernel.core.annotation.BaseRest;
import com.skt.bss.nova.shared.shared.biz.func.sharedservice.contract.api.unit.user.UserCommandModel;
import com.skt.bss.nova.shared.shared.biz.func.sharedservice.contract.api.unit.user.UserQueryModel;
import com.skt.bss.nova.shared.shared.biz.func.sharedservice.contract.api.unit.user.UserService;
import com.skt.bss.nova.shared.shared.biz.func.sharedservice.presentation.adapter.rest.UriPath;

@RestController
@RequestMapping(UriPath.USERS)
public class UserController {
  
    @BaseRest(path = UriPath.USERS, queryModel = UserQueryModel.class, commandModel = UserCommandModel.class)
    public final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

}
