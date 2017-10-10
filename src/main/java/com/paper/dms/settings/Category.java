package com.paper.dms.settings;

import javax.persistence.Id;

public class Category {
    @Id
    private Long settingCategoryId;
    private String settingCategoryCode;
    private String settingCategoryName;
    private String settingCategoryType;
}
