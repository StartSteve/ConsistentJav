package com.agile.echo.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
public class CommonResponse {
    private Object data;
    private String message;
}
