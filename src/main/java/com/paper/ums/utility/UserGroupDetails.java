package com.paper.ums.utility;

import javax.persistence.Id;

public class UserGroupDetails {

    @Id
    private Long userGroupDetailsId;
    private Long userGroupId;
    private Long userId;
    private Boolean enabled;
}
