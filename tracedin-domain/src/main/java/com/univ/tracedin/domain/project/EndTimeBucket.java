package com.univ.tracedin.domain.project;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;

public record EndTimeBucket(
        LocalDateTime endTime, long errorCount, List<ResponseTimeBucket> responseTimeBuckets) {

    public static EndTimeBucket from(
            Long endEpochMillis, long errorCount, List<ResponseTimeBucket> responseTimeBuckets) {
        LocalDateTime endTime =
                LocalDateTime.ofInstant(
                        Instant.ofEpochMilli(endEpochMillis), ZoneId.systemDefault());
        return new EndTimeBucket(endTime, errorCount, responseTimeBuckets);
    }
}
