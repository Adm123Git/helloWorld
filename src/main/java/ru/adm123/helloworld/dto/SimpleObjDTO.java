package ru.adm123.helloworld.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.lang.NonNull;

/**
 * @author Dmitry Ushakov at 22.11.2021
 */
@Data
@AllArgsConstructor
public class SimpleObjDTO<T> {

    @NonNull
    private T object;

}
