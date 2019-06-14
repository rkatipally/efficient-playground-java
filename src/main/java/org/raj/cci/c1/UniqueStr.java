package org.raj.cci.c1;

public class UniqueStr {

    public boolean isUnique(String str) {
        if (str.length() > 128) return false;
        boolean[] char_flags = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            char val = str.charAt(i);
            if (char_flags[val]) return false;
            char_flags[val] = true;
        }
        return true;
    }
}
