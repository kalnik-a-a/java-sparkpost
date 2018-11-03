
package com.sparkpost.exception;

import com.sparkpost.model.responses.ServerErrorResponses;
import com.yepher.jsondoc.annotations.Description;

import lombok.Getter;

public class SparkPostErrorServerResponseException extends SparkPostException {

    private static final long serialVersionUID = -7196264905004169555L;

    @Getter
    @Description(value = "HTTP Response Code generated by request", sample = {"426"})
    private int responseCode = -1;

    public SparkPostErrorServerResponseException(String message, int responseCode) {
        super(message);
        this.responseCode = responseCode;
    }

    public SparkPostErrorServerResponseException(String message, int responseCode, ServerErrorResponses errorResponses) {
        super(message, errorResponses);
        this.responseCode = responseCode;
    }

}
