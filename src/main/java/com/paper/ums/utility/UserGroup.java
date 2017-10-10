package com.paper.ums.utility;

import javax.persistence.Id;

public class UserGroup {

    @Id
    private Long userGroupId;
    private String groupName;
    private String description;
    private String imagePath;
    private Boolean enabled;
}
