package com.univ.tracedin.api.auth.exception;

import com.univ.tracedin.common.exception.WebException;
import com.univ.tracedin.domain.auth.exception.AuthErrorCode;

public class InvalidTokenException extends WebException {

    public static final InvalidTokenException EXCEPTION = new InvalidTokenException();

    private InvalidTokenException() {
        super(AuthErrorCode.INVALID_TOKEN);
    }
}
