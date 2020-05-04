/**
 *
 */
package com.rcyc.bonvoy.dto.resco;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author sreejithjn
 *
 */
@XmlRootElement(name = "ResInfoFolio")
public class ResInfoFolio {

    @XmlElement(name = "Result")
    private Result Result;

    @XmlElement(name = "FolioList")
    private FolioList FolioList;

    /**
     * @return the result
     */
    public Result getResult() {
        return Result;
    }

    /**
     * @param result the result to set
     */
    public void setResult(Result result) {
        Result = result;
    }

    /**
     * @return the folioList
     */
    public FolioList getFolioList() {
        return FolioList;
    }

    /**
     * @param folioList the folioList to set
     */
    public void setFolioList(FolioList folioList) {
        FolioList = folioList;
    }


}
