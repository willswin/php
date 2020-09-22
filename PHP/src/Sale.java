import java.time.LocalDate;
import java.time.LocalDateTime;

public class Sale {
	String menuID;
	String mIDName;
	String saleID;
	int itemSaleID;
	LocalDateTime daySold;
	
	//Sale struct, making up for no queries
	public Sale(String mID, String mIDN, String sID, int isID, LocalDateTime dS) {
		menuID=mID;
		mIDName =mIDN;
		saleID=sID;
		itemSaleID=isID;
		daySold=dS;
	}

	public String getMenuID() {
		return menuID;
	}

	public String getMIDName() {
		return mIDName;
	}

	public String getSaleID() {
		return saleID;
	}

	public int getItemSaleID() {
		return itemSaleID;
	}

	public LocalDateTime getDaySold() {
		return daySold;
	}


}
