package com.ssafy.exception;

public class DuplicateException extends RuntimeException{
    public static final String FESTIVAL_DUPLICATED = "이미 존재하는 축제입니다.";
    public static final String FESTIVAL_TYPE_DUPLICATED = "이미 존재하는 카테고리 입니다.";
    public static final String FESTIVAL_FORM_DUPLICATED = "이미 존재하는 요청 내역 입니다.";

    public DuplicateException(String message){
        super(message);
    }
}
