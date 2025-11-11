package com.skt.bss.nova.education.education.handszon.func.partyservice.presentation.adapter.rest.unit.user;

import com.skt.bss.nova.edcuation.education.handson.func.partyservice.contract.api.unit.user.UserCommandModel;
import com.skt.bss.nova.edcuation.education.handson.func.partyservice.contract.api.unit.user.UserQueryModel;
import com.skt.bss.nova.edcuation.education.handson.func.partyservice.contract.api.unit.user.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skt.bss.nova.base.shared.kernel.core.annotation.BaseRest;
import com.skt.bss.nova.education.education.handszon.func.partyservice.presentation.adapter.rest.UriPath;

@RestController
@RequestMapping(UriPath.USERS)
public class UserController {
  
    @BaseRest(path = UriPath.USERS, queryModel = UserQueryModel.class, commandModel = UserCommandModel.class)
    public final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

}
