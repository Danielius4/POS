package com.psp.possystem.Common;

import org.springframework.http.HttpStatusCode;
import org.springframework.web.client.HttpServerErrorException;

public class Exceptions {
    public static final HttpServerErrorException NotImplementedException = new HttpServerErrorException(
            HttpStatusCode.valueOf(501)
        );
}
