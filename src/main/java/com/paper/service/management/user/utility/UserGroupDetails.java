package com.paper.service.management.user.utility;

import javax.persistence.Id;

public class UserGroupDetails {

    @Id
    private Long userGroupDetailsId;
    private Long userGroupId;
    private Long userId;
    private Boolean enabled;
}
