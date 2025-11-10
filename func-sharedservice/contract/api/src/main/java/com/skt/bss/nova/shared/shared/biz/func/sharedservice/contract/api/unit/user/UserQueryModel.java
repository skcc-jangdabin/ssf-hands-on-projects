package com.skt.bss.nova.shared.shared.biz.func.sharedservice.contract.api.unit.user;

import java.util.UUID;

import com.skt.bss.nova.base.shared.kernel.core.base.query.BaseQueryModel;

public record UserQueryModel(
    UUID id,
    String deptCd,
    String deptNm,
    String detlAddr,
    String detlOneAddr,
    String detlTwoAddr,
    String dutyCd,
    String eltrMlad,
    String filePath,
    String gndrCd,
    String hnpnTelNo,
    String inptDt,
    String inptHnfAt,
    String oposCd,
    String postNo,
    String remk500,
    String tcncGradCd,
    String userAgex,
    String userBirt,
    String userId,
    String userNm,
    String wthdrwDt
) implements BaseQueryModel<UUID>{
    @Override
    public UUID getId() {
        return id;
    }
}
