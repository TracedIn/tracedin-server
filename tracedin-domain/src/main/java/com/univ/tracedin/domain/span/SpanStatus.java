package com.univ.tracedin.domain.span;

public enum SpanStatus {
    UNSET,
    OK,
    ERROR;

    public static SpanStatus fromValue(String spanStatus) {
        if (spanStatus == null) {
            return UNSET;
        }
        for (SpanStatus type : SpanStatus.values()) {
            if (type.name().equalsIgnoreCase(spanStatus)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown span status: " + spanStatus);
    }
}
