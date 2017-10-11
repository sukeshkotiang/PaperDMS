package com.paper.service.management.document.directory.file;

import javax.persistence.Id;

public class FileCategory {

    @Id
    private Long categoryId;
    private String category;
    private String description;
    private Boolean enabled;
    private Boolean readOnly;
}
