/**
 *
 */
package com.rcyc.bonvoy.dto.resco;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author sreejithjn
 *
 */

@XmlRootElement(name = "ResListSurcharge")
@XmlAccessorType(XmlAccessType.FIELD)
public class ResListSurcharge {

    private Result Result;

    private SurchargeList SurchargeList;

    /**
     * @return the result
     */
    @XmlElement(name = "Result")
    public Result getResult() {
        return Result;
    }

    /**
     * @param result the result to set
     */
    public void setResult(Result result) {
        Result = result;
    }

    @XmlElement(name = "SurchargeList")
    public com.rcyc.bonvoy.dto.resco.SurchargeList getSurchargeList() {
        return SurchargeList;
    }

    public void setSurchargeList(com.rcyc.bonvoy.dto.resco.SurchargeList surchargeList) {
        SurchargeList = surchargeList;
    }
}




