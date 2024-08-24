package ru.sendel.pastebox.api.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
@Data
@AllArgsConstructor
public class PasteBoxResponse {
    private String data;
    private final boolean isPublic;
}
