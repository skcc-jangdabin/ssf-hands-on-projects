package com.skt.bss.nova.education.education.biz.func.partyservice.domain.user;

import java.util.UUID;

import com.skt.bss.nova.base.shared.kernel.core.AggregateRoot;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserEntity implements AggregateRoot<UserEntity, UUID>{

    // 현재는 VO 도출이 안되어있음 -> 실제로는 VO를 도출하여 재활용 (ex: depth) -> 이후 다양한 케이스를 교육
    // aggregateroot를 식별해주는 수준을 DDD로 보고있음
    // JpaEntity와의 차이가 되는 부분
    private UUID id;
    
    private String deptCd;
    private String deptNm;

    // VO ex: Address
    private String detlAddr;
    private String detlOneAddr;
    private String detlTwoAddr;
    private String oposCd;

    private String dutyCd;
    private String eltrMlad;
    private String filePath;
    private String gndrCd;
    private String hnpnTelNo;
    private String inptDt;
    private String inptHnfAt;
    private String postNo;
    private String remk500;
    private String tcncGradCd;
    // VO ex: UserInfo
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
