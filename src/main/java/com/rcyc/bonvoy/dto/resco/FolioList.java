package com.rcyc.bonvoy.dto.resco;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

public class FolioList {
	
	
	private List<Folio> folio;

	/**
	 * @return the folio
	 */
	@XmlElement(name="Folio")
	public  List<Folio> getFolio() {
		return folio;
	}

	/**
	 * @param folio the folio to set
	 */
	public void setFolio( List<Folio> folio) {
		this.folio = folio;
	}
	
	/**
	 * @param folioIds
	 */
	public FolioList(ArrayList<String> folioIds) {
		super();
		List<Folio> folios=new ArrayList<>();
		for (String inputFolioId : folioIds) {
			Folio folioObj = new Folio(inputFolioId);
			folioObj.setQuantity("1");
//			folioObj.setQuantity(Constants.FOLIO_Quantity);
			folios.add(folioObj);
		}
		this.folio = folios;
	}
	

	/**
	 * @param folio
	 */
	public FolioList(List<Folio> folio) {
		super();
		this.folio = folio;
	}
	
	/**
	 * @param folio
	 */
	public FolioList(Folio folio) {
		super();
		List<Folio> folioList=new ArrayList<>(1);
		folioList.add(folio);
		this.folio = folioList;
	}

	/**
	 * 
	 */
	public FolioList() {
		super();
	}
	
	
	
}
