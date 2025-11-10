package com.skt.bss.nova.shared.shared.biz.func.sharedservice.domain.user;

import java.util.UUID;

import com.skt.bss.nova.base.shared.kernel.core.AggregateRoot;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserEntity implements AggregateRoot<UserEntity, UUID>{

    private UUID id;
    private String deptCd;
    private String deptNm;
    private String detlAddr;
    private String detlOneAddr;
    private String detlTwoAddr;
    private String dutyCd;
    private String eltrMlad;
    private String filePath;
    private String gndrCd;
    private String hnpnTelNo;
    private String inptDt;
    private String inptHnfAt;
    private String oposCd;
    private String postNo;
    private String remk500;
    private String tcncGradCd;
    private String userAgex;
    private String userBirt;
    private String userNm;
    private String wthdrwDt;
    private String userId;

    @Builder
    public UserEntity(
        UUID id, String deptCd, String deptNm, String detlAddr, String detlOneAddr, String detlTwoAddr,
        String dutyCd, String eltrMlad, String filePath, String gndrCd, String hnpnTelNo,
        String inptDt, String inptHnfAt, String oposCd, String postNo, String remk500,
        String tcncGradCd, String userAgex, String userBirt, String userNm, String wthdrwDt, String userId
    ) {
        this.id = id;
        this.deptCd = deptCd;
        this.deptNm = deptNm;
        this.detlAddr = detlAddr;
        this.detlOneAddr = detlOneAddr;
        this.detlTwoAddr = detlTwoAddr;
        this.dutyCd = dutyCd;
        this.eltrMlad = eltrMlad;
        this.filePath = filePath;
        this.gndrCd = gndrCd;
        this.hnpnTelNo = hnpnTelNo;
        this.inptDt = inptDt;
        this.inptHnfAt = inptHnfAt;
        this.oposCd = oposCd;
        this.postNo = postNo;
        this.remk500 = remk500;
        this.tcncGradCd = tcncGradCd;
        this.userAgex = userAgex;
        this.userBirt = userBirt;
        this.userNm = userNm;
        this.wthdrwDt = wthdrwDt;
        this.userId = userId;
    }

}
