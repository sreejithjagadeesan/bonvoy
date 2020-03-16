package com.rcyc.bonvoy.dto.resco;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class SurveyList {

    @XmlElement(name = "Survey")
    private List<Survey> Survey;

//	public List<Survey> getSurvey() {
//		return Survey;
//	}

    public void setSurvey(List<Survey> survey) {
        Survey = survey;
    }

    public List<Survey> getSurvey() {
        // TODO Auto-generated method stub
        return Survey;
    }

    @Override
    public String toString() {
        return "SurveyList [Survey=" + Survey + "]";
    }


}
