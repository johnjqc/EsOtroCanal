package com.jsoft.restservice.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.time.LocalDateTime;

@JsonIgnoreProperties
public class GenericResponse<T> {

    private T data;

    private LocalDateTime localDateTime;

    private String code;

    public GenericResponse(T data) {

        this.data = data;
        this.localDateTime = LocalDateTime.now();
        this.code = "SCS-00";
    }

    public static <T> GenericResponse<T> of(T data) {
        return new GenericResponse<T> (data);
    }

    public T getData() {
        return  data;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public String getCode() {
        return code;
    }
}
