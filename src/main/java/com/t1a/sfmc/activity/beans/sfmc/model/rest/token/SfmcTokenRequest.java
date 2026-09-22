package com.t1a.sfmc.activity.beans.sfmc.model.rest.token;

import lombok.Data;

@Data
public class SfmcTokenRequest {

    String grant_type;
    String client_id;
    String client_secret;

}
