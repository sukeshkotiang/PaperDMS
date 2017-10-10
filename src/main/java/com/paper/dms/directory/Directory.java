package com.paper.dms.directory;

import javax.persistence.Id;

public class Directory {

    @Id
    private Long directoryId;
    private String categoryId;
    private String directoryName;
    private String description;
    private String status;
    private Boolean enabled;

}
