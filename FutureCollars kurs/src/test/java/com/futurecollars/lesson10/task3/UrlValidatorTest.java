package com.futurecollars.lesson10.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UrlValidatorTest {

    @Test
    public void shouldValidateValidUrls() {
        // Given
        String[] validUrls = {
                "http://www.onet.pl",
                "https://mail.google.com",
                "http://wiadmosci.onet.pl",
                "http://onet.pl"
        };

        // When and Then
        for (String url : validUrls) {
            Assertions.assertTrue(UrlValidator.validateUrl(url));
        }
    }

    @Test
    public void shouldInvalidateInvalidUrls() {
        // Given
        String[] invalidUrls = {
                "www.onet.pl",
                "ftp://mail.google.com",
                "http://wiadmosci",
                "https://onet.pl/.com"
        };

        // When and Then
        for (String url : invalidUrls) {
            Assertions.assertFalse(UrlValidator.validateUrl(url));
        }
    }
}
