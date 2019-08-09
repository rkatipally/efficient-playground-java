package org.raj.misc;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

public class ExtractStringTester {

    public static void main(String[] args) {
        var sampleString = "I:[15JAN19-30JAN19^10FEB19-25MAY19^01JUN19-10JUL19^22JUL19-12DEC19] O:[15JAN19-30JAN19^10FEB19-25MAY19^01JUN19-10JUL19^22JUL19-12DEC19]";
        System.out.println(StringUtils.substringBetween(sampleString, "I:[", "]"));
        Pattern pattern = Pattern.compile("O:\\[(.*?)]|I:\\[(.*?)]");
        Matcher matcher = pattern.matcher(sampleString);
        MatchResult result = matcher.toMatchResult();
        System.out.println(result);
        while (matcher.find())
        {
            System.out.println(matcher.group(1));
        }
    }
}
