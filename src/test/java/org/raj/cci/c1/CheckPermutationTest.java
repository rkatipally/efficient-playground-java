package org.raj.cci.c1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CheckPermutationTest {

    @ParameterizedTest
    @MethodSource("provideStringsForCheckPermutation")
    void checkPermutation(String str1, String str2) {
        assertTrue(CheckPermutation.checkPermutation(str1, str2));
    }

      private static Stream<Arguments> provideStringsForCheckPermutation() {
        return Stream.of(
                Arguments.of("abc", "bca"),
                Arguments.of("aabcc", "bacac")
        );
    }
}
