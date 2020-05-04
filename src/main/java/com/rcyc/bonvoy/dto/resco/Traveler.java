/**
 * 
 */
package com.rcyc.bonvoy.dto.resco;

import javax.xml.bind.annotation.XmlElement;

/**
 * @author sreejithjn
 */
public class Traveler {
	private String FolioId;

	private String Primary;

	private TripList TripList;

	private ItemList ItemList;

	private String TravelerId;

	private FlexItemList flexItemList;

	private TransactionList transactionList;

	private Folio folio;

	/**
	 * @return the folioId
	 */
	@XmlElement(name = "FolioId")
	public String getFolioId() {
		return FolioId;
	}

	/**
	 * @param folioId the folioId to set
	 */
	public void setFolioId(String folioId) {
		FolioId = folioId;
	}

	/**
	 * @re turn the primary
	 */
	@XmlElement(name = "Primary")
	public String getPrimary() {
		return Primary;
	}

	/**
	 * @param primary the primary to set
	 */
	public void setPrimary(String primary) {
		Primary = primary;
	}

	/**
	 * @return the tripList
	 */
	@XmlElement(name = "TripList")
	public TripList getTripList() {
		return TripList;
	}

	/**
	 * @param tripList the tripList to set
	 */
	public void setTripList(TripList tripList) {
		TripList = tripList;
	}

	/**
	 * @return the itemList
	 */
	@XmlElement(name = "ItemList")
	public ItemList getItemList() {
		return ItemList;
	}

	/**
	 * @param itemList the itemList to set
	 */
	public void setItemList(ItemList itemList) {
		ItemList = itemList;
	}

	/**
	 * @return the travelerId
	 */
	@XmlElement(name = "TravelerId")
	public String getTravelerId() {
		return TravelerId;
	}

	/**
	 * @param travelerId the travelerId to set
	 */
	public void setTravelerId(String travelerId) {
		TravelerId = travelerId;
	}

	@XmlElement(name = "FlexItemList")
	public FlexItemList getFlexItemList() {
		return flexItemList;
	}

	public void setFlexItemList(FlexItemList flexItemList) {
		this.flexItemList = flexItemList;
	}

	@XmlElement(name = "TransactionList")
	public TransactionList getTransactionList() {
		return transactionList;
	}

	public void setTransactionList(TransactionList transactionList) {
		this.transactionList = transactionList;
	}

	@XmlElement(name = "Folio")
	public Folio getFolio() {
		return folio;
	}

	public void setFolio(Folio folio) {
		this.folio = folio;
	}

	@Override
	public String toString() {
		return "Traveler [FolioId=" + FolioId + ", Primary=" + Primary + ", TripList=" + TripList + ", ItemList="
				+ ItemList + ", TravelerId=" + TravelerId + "]";
	}

}
