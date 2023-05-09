package com.converter.doctopdfapp.validator;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import com.converter.doctopdfapp.common.FileUtils;
import com.converter.doctopdfapp.exception.BusinessException;

import static com.converter.doctopdfapp.common.FileConstants.FILE_EXTENSION_ALLOWED;

@Component
public class FileValidator {

    public void validateExtension(MultipartFile file) {
        String extension = FileUtils.getExtension(file);
        String extensionByContent = FileUtils.detectExtensionByContent(file);

        if(FILE_EXTENSION_ALLOWED.stream().noneMatch(extension::equals) ||
                FILE_EXTENSION_ALLOWED.stream().noneMatch(extensionByContent::equals)) {
            throw new BusinessException("Invalid file extension");
        }
    }
}
