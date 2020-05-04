package com.rcyc.bonvoy.dto.resco;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class SurveyItemList {

    @XmlElement(name = "SurveyItem")
    private List<SurveyItem> SurveyItem;

    public List<SurveyItem> getSurveyItem() {
        return SurveyItem;
    }

    public void setSurveyItem(List<SurveyItem> surveyItem) {
        SurveyItem = surveyItem;
    }


}
