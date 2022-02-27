package application;

public class Produit {
	Integer id_product;
	String designation;
	String marque;
	String numCat;
	Double prixUnit;
	Integer qtStock;
	
	public Produit(Integer id_product, String designation, String marque, String numCat, Double prixUnit,
			Integer qtStock) {
		super();
		this.id_product = id_product;
		this.designation = designation;
		this.marque = marque;
		this.numCat = numCat;
		this.prixUnit = prixUnit;
		this.qtStock = qtStock;
	}
	
	public Integer getId_product() {
		return id_product;
	}
	public void setId_product(Integer id_product) {
		this.id_product = id_product;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getNumCat() {
		return numCat;
	}
	public void setNumCat(String numCat) {
		this.numCat = numCat;
	}
	public Double getPrixUnit() {
		return prixUnit;
	}
	public void setPrixUnit(Double prixUnit) {
		this.prixUnit = prixUnit;
	}
	public Integer getQtStock() {
		return qtStock;
	}
	public void setQtStock(Integer qtStock) {
		this.qtStock = qtStock;
	}
}
