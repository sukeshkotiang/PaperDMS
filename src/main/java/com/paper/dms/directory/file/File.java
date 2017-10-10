package com.paper.dms.directory;

import javax.persistence.Id;

public class File {

    @Id
    private Long fileId;
    private Long categoryId;
    private String fileName;
    private String description;
    private String status;
    private Boolean enabled;
    private Boolean readOnly;
}
