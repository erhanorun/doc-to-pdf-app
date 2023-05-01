package com.converter.doctopdfapp.service;

import java.io.File;

public interface CloudmersiveApiService {
    byte[] convertDocumentDocxToPdf(File file);
}
