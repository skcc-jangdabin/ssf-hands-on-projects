package com.skt.bss.nova.edcuation.education.handson.func.partyservice.contract.api.unit.user;

import java.util.UUID;

import com.skt.bss.nova.base.shared.kernel.core.base.command.BaseCommandModel;


public record UserCommandModel(
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
) implements BaseCommandModel{
    
}
