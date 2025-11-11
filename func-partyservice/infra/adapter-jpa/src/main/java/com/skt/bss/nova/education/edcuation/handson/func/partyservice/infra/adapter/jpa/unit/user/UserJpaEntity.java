package com.skt.bss.nova.education.edcuation.handson.func.partyservice.infra.adapter.jpa.unit.user;

import java.util.UUID;

import com.skt.bss.nova.base.shared.framework.data.BaseJpaEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name = "userdetail")
public class UserJpaEntity extends BaseJpaEntity {
    
    //조직 코드
    @Column(name = "dept_cd")
    private String deptCd;

    // 조직 이름
    @Column(name = "dept_nm")
    private String deptNm;

    // 상세 주소 (예 : "경기 광명시 범안로996번길 6 (하안동) 티아모IT타워 1403호")
    @Column(name = "detl_addr")
    private String detlAddr;

    // 상세주소 1 (예 : "경기 광명시 범안로996번길 6 (하안동)")
    @Column(name = "detl_one_addr")
    private String detlOneAddr;

    // 상세주소 2 (예 : "티아모IT타워 1403호")
    @Column(name = "detl_two_addr")
    private String detlTwoAddr;

    // 직무 코드
    @Column(name = "duty_cd")
    private String dutyCd;

    // 이메일 주소
    @Column(name = "eltr_mlad")
    private String eltrMlad;

    // 파일 경로
    @Column(name = "file_path")
    private String filePath;

    // 성별 코드
    @Column(name = "gndr_cd")
    private String gndrCd;

    // 휴대폰 번호
    @Column(name = "hnpn_tel_no")
    private String hnpnTelNo;

    // 투입 일시 (예: 20240801)
    @Column(name = "inpt_dt")
    private String inptDt;

    // 투입 여부
    @Column(name = "inpt_hnf_at")
    private String inptHnfAt;

    // 직위
    @Column(name = "opos_cd")
    private String oposCd;

    // 우편 번호
    @Column(name = "post_no")
    private String postNo;

    // 특이 사항
    @Column(name = "remk500")
    private String remk500;

    // 기술자 등급 코드
    @Column(name = "tcnc_grad_cd")
    private String tcncGradCd;

    // 나이
    @Column(name = "user_agex")
    private String userAgex;

    // 생년월일 (예: 19900101)
    @Column(name = "user_birt")
    private String userBirt;

    // 이름
    @Column(name = "user_nm")
    private String userNm;

    // 철수 일시 (예: 20260130)
    @Column(name = "wthdrw_dt")
    private String wthdrwDt;

    // 아이디 (예: demo)
    @Column(name = "user_id")
    private String userId;


    
    @Builder
    public UserJpaEntity(UUID id, String deptCd, String deptNm, String detlAddr, String detlOneAddr, String detlTwoAddr,
            String dutyCd, String eltrMlad, String filePath, String gndrCd, String hnpnTelNo, String inptDt,
            String inptHnfAt, String oposCd, String postNo, String remk500, String tcncGradCd, String userAgex,
            String userBirt, String userNm, String wthdrwDt, String userId) {
        setId(id);
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

    @Getter
    @AllArgsConstructor
    public static enum Department {
        PM("100","PM"),
        BM("101","사업관리팀"),
        QC("102", "품질관리팀"),
        INFRA("103","인프라/표준화팀"),
        UI_UX("105","UI/UX팀"),
        DEV_1("110","개발1팀"),
        DEV_2("111","개발2팀"),
        DEV_3("112","개발3팀");

        private final String code;
        private final String name;

    }

    @Getter
    @AllArgsConstructor
    public static enum Gender {
        MAN("M","남성"),
        WOMAN("W","여성");

        private final String code;
        private final String name;

    }

    @Getter
    @AllArgsConstructor
    public static enum Duty {
        PM("01","PM"),
        BM("02", "사업관리"),
        TL("03", "팀장"),
        ARCHI("04", "아키텍처"),
        PLANNER("05", "기획자"),
        DEVELOPER("06", "개발자"),
        PUBLISHER("07", "퍼블리셔"),
        DESIGNER("08", "디자이너");
        
        private final String code;
        private final String name;

    }

    @Getter
    @AllArgsConstructor
    public enum Position {

        SM("01", "상무"),
        IS("02", "이사"),
        BJ("03", "부장"),
        CJ("04", "차장"),
        GJ("05", "과장"),
        DR("06", "대리"),
        SW("07", "사원");

        private final String code;
        private final String name;
    }
    
}
