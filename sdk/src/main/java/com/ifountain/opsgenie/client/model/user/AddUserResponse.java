package com.ifountain.opsgenie.client.model.user;

import com.ifountain.opsgenie.client.model.BaseResponse;

import java.text.ParseException;
import java.util.Map;

/**
 * Represents OpsGenie service response for add user request.
 *
 * @see com.ifountain.opsgenie.client.IUserOpsGenieClient#addUser(AddUserRequest)
 */
public class AddUserResponse extends BaseResponse{
    private String id;
    /**
     * Id of the added user
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the id of the added user
     */
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void deserialize(Map data) throws ParseException {
        super.deserialize(data);
        id = (String) data.get("id");
    }
}
