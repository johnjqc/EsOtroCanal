package com.jsoft.restservice.dto;

public class ResponseViewDto {

    private String value;

    public ResponseViewDto(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
