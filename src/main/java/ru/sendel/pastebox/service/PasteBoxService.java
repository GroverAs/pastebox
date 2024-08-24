package ru.sendel.pastebox.service;

import ru.sendel.pastebox.api.request.PasteBoxRequest;
import ru.sendel.pastebox.api.response.PasteBoxResponse;
import ru.sendel.pastebox.api.response.PasteBoxURLResponse;

import java.util.List;

public interface PasteBoxService {

    PasteBoxResponse getByHash(String hash);
    List<PasteBoxResponse> getFirstPublicPasteboxes ();
    PasteBoxURLResponse create (PasteBoxRequest request);
}
