package com.seopport.kisvolumerank.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class ResponseOutputDTO {
    // HTS 한글 종목명
    private String htsKorIsnm;

    // 유가증권 단축 종목코드
    private String mkscShrnIscd;

    // 데이터 순위
    private String dataRank;

    // 주식 현재가
    private String stckPrpr;

    // 전일 대비 부호
    private String prdyVrssSign;

    // 전일 대비
    private String prdyVrss;

    // 전일 대비율
    private String prdyCtrt;

    // 누적 거래량
    private String acmlVol;

    // 전일 거래량
    private String prdyVol;

    // 상장 수주
    private String lstnStcn;

    // 평균 거래량
    private String avrgVol;

    // N일전종가대비현재가대비율
    private String nBefrClprVrssPrprRate;

    // 거래량 증가율
    private String volInrt;

    // 거래량 회전율
    private String volTnrt;

    // N일 거래량 회전율
    private String ndayVolTnrt;

    // 평균 거래 대액
    private String avrgTrPbmn;

    // 거래대금회전률
    private String trPbmnTnrt;

    // N일 거래대금 회전율
    private String ndayTrPbmnTnrt;

    // 누적 거래 대금
    private String acmlTrPbmn;
}
