package com.sethu.theassessment

/**
 * Created by Sethu on 2020/09/23.
 */
class GeneralUtils {

    static def responseObj() {
        return new HashMap<String, Object>()
    }

    static def responseSuccessObj() {
        def response = responseObj()
        response.success = true
        return response
    }

    static def responseFailureObj() {
        def response = responseObj()
        response.success = false
        response.message = responseObj()
        return response
    }
}
