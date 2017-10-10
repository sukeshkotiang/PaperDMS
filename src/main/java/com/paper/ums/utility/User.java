package com.paper.ums.utility;

import javax.persistence.Id;

public class User {

    @Id
    private Long userId;
    private String userName;
    private String password;
    private String firstName;
    private String middleName;
    private String lastName;
    private String emailAddress;
    private String mobilePhone;
    private String imagePath;
    private Boolean adminFlag;
    private Boolean enabled;
}
