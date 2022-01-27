package com.forTUE.SwimmingRaceRegistrationManagement.models;

import lombok.Getter;

@Getter
public enum UserAuthority {

    READ_HOME("Read home"),
    READ_ALL("Read all"),
    WRITE_MYSELF("Write myself"),
    WRITE_ALL("Write all"),
    UPLOAD_DATA("Upload data"),
    DELETE_MYSELF("Delete myself"),
    DELETE_ALl("Delete all");

    private String label;

    UserAuthority(String labels){
        this.label = labels;
    }
}
