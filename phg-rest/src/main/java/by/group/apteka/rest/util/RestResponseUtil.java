package by.group.apteka.rest.util;

import by.group.apteka.rest.model.RestResponse;
import org.springframework.stereotype.Component;

/**
 * Date: Mar 13, 2016
 */
@Component
public class RestResponseUtil {

    public static final String SUCCESS_STATUS = "success";

    public RestResponse createSuccessRestResponse(Object businessObject) {
        return new RestResponse(SUCCESS_STATUS, null, businessObject);
    }
}
