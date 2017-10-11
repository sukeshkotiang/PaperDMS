package com.paper.service.management.document.directory.file;

import javax.persistence.Id;

public class FileSecurity {

    @Id
    private Long fileSecurityId;
    private Long fileId;
    private Long folderId;
    private Boolean enabled;
    private Boolean readOnly;
    private Boolean protect;
}
