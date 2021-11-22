package ru.adm123.helloworld.utils;

import org.springframework.lang.Nullable;

/**
 * @author Dmitry Ushakov at 22.11.2021
 */
public abstract class StringUtil {

    public static boolean isEmptyOrNull(@Nullable String str) {
        return str == null || str.trim().length() == 0;
    }

}
