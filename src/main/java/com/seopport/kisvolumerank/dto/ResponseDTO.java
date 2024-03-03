package com.seopport.kisvolumerank.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Getter
@NoArgsConstructor
@ToString
public class ResponseDTO {

    // 성공 실패 여부
    private String rtCd;

    // 응답코드
    private String msgCd;

    // 응답메세지
    private String msg1;

    // 응답상세
    private List<ResponseOutputDTO> output;
}