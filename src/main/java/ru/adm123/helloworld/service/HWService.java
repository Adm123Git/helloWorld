package ru.adm123.helloworld.service;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;
import ru.adm123.helloworld.dto.SimpleObjDTO;
import ru.adm123.helloworld.utils.StringUtil;

/**
 * @author Dmitry Ushakov at 22.11.2021
 */
@Service
public class HWService {

    private static final String HELLO_WORLD = "Hello, World! This is a main page";
    private static final String HELLO_WORLD_FOR_USER = "Hello, World! App works for you";

    @NonNull
    public SimpleObjDTO<String> helloWorld() {
        return new SimpleObjDTO<>(HELLO_WORLD);
    }

    @NonNull
    public SimpleObjDTO<String> greeting(@Nullable String userName) {
        String greetingString = HELLO_WORLD_FOR_USER
                + ", "
                + (StringUtil.isEmptyOrNull(userName) ? "anonymous" : userName);
        return new SimpleObjDTO<>(greetingString);
    }

}