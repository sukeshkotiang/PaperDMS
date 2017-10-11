package com.paper.service.management.document.share;

import javax.persistence.Id;
import java.util.Date;

public class ShareDetails {

    @Id
    private Long shareId;
    private Long userId;
    private Long userGroupId;
    private Long folderId;
    private Long fileId;
    private Date startDate;
    private Date endDate;
    private Boolean editEnabled;
    private Boolean enabled;
}
