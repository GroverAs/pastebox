package ru.sendel.pastebox.api.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PasteBoxURLResponse {
    private final String url;
}
