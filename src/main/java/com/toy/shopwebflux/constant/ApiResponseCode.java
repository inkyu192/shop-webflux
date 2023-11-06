package com.toy.shopwebflux.constant;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ApiResponseCode {

    SUCCESS("성공"),
    PARAMETER_NOT_VALID("유효성 검증 실패"),
    ORDER_NOT_CANCEL("주문 취소가 불가"),
    QUANTITY_NOT_ENOUGH("수량 부족"),
    DATA_DUPLICATE("데이터 중복"),
    DATA_NOT_FOUND("데이터 없음"),
    BAD_REQUEST("잘못된 요청"),
    LOGIN_REQUIRED("로그인 필요"),
    SYSTEM_ERROR("시스템 오류");

    private final String message;
}
