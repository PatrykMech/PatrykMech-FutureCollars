package com.futurecollars.lesson7.task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import java.time.Month;

public class SeasonConverterTest {
    @ParameterizedTest
    @EnumSource(value = SeasonConverter.Season.class,
            names = {"WINTER", "SPRING", "SUMMER", "AUTUMN"})
    void shouldConvertMonthToSeason(SeasonConverter.Season season) {
        // Given
        Month month = getMonthForSeason(season);

        // When
        SeasonConverter.Season actualSeason = SeasonConverter.getSeason(month);

        // Then
        Assertions.assertEquals(season, actualSeason);
    }

    private Month getMonthForSeason(SeasonConverter.Season season) {
        return switch (season) {
            case WINTER -> Month.DECEMBER;
            case SPRING -> Month.MARCH;
            case SUMMER -> Month.JUNE;
            case AUTUMN -> Month.SEPTEMBER;
        };
    }
}
