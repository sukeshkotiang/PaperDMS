package com.paper.service.management.document.settings;

import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class Setting {

    @Id
    private Long settingId;
    private String settingName;
    private String settingCode;

    @ManyToOne
    private Long settingCategoryId;

    private String description;
    private String fieldType;
    private String lookupType;
    private Boolean globalEnabledFlag;
    private Boolean userEnabledFlag;
    private Boolean userGroupEnabledFlag;
    private int displayOrder;
    private Boolean displayFlag;
}
