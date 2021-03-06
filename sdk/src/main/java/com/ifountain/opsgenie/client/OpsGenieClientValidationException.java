package com.ifountain.opsgenie.client;

/**
 * @see OpsGenieClientValidationException
 */
public class OpsGenieClientValidationException extends OpsGenieClientException {
    public static final int MISSING_MANDATORY_PROPERTY = 4000;
    public OpsGenieClientValidationException(String message, int code) {
        super(message, code);
    }

    public static OpsGenieClientValidationException missingMandatoryProperty(String propertyName){
        return new OpsGenieClientValidationException("Missing mandatory property ["+propertyName+"]", MISSING_MANDATORY_PROPERTY);
    }
}
