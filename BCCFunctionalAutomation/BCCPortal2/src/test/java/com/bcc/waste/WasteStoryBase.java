package com.bcc.waste;



import com.bcc.general.StoryBase;

public abstract class WasteStoryBase extends StoryBase {
	
	/* add more new accounts related pages here*/
	protected static final String WASTE_MENU = "HOME.WASTE_MENU";
	protected static final String LOGOUT_PAGE = "LOGOUT_PAGE";
	protected static final String SIGNLINK = "WASTE.SIGNLINK";
	protected static final String USER_NAME = "LOGIN.USER_NAME";
	protected static final String PASSWORD = "LOGIN.PASSWORD";
	protected static final String SIGN_IN = "LOGIN.SIGNIN_BUTTON";
	protected static final String SIGNOUT = "HOME.SIGNOUT";
	
	protected static final String ORDERNEWBIN_FIELDSETS = "WASTEORDER.ORDERNEWBIN_FIELDSETS";
	protected static final String BROWNFOODWASTEBINQTY = "WASTEORDER.BROWNFOODWASTEBIN_QTY";
	protected static final String BROWNFOODWASTEBIN_REASON = "WASTEORDER.BROWNFOODWASTEBIN_REASON";
	protected static final String BROWNFOODWASTEBIN_REMOVEOLD = "WASTEORDER.BROWNFOODWASTEBIN_REMOVEOLD";
	protected String ADDRESS = "WASTEORDER.ADDRESS";
	protected String ADDRESS_LOGGEDIN = "WASTEORDER.ADDRESS_NAME_LOGGEDIN";
	protected String BROWNFOODWASTEBIN_NAME = "WASTEORDER.BROWNFOODWASTEBIN_NAME";
	protected static final String GET_BIN_NAME = "WASTEORDER.GET_BIN_NAME";
	
	
	protected static final String POSTCODE = "WASTE.POSTCODE";
	protected static final String LOOKUPADDRESS = "WASTE.LOOKUPADDRESS";
	protected static final String SELECTADDRESS = "WASTE.SELECTADDRESS";
	protected static final String NEXT = "WASTE.NEXT";
	protected static final String ORDERNEWBIN = "WASTE.ORDERNEWREPLACEMENT_BUTTON";
	protected static final String NEXTCHOOSEYOURBIN = "WASTEORDER.NEXTCHOOSEYOURBIN";
	protected static final String ORDERNOW = "WASTE.ORDERNOW";
	
	
	protected static final String ORDERSUMMARY = "WASTEORDER.ORDERSUMMARY";
	protected static final String DELIVERYADDRESS = "WASTEORDER.DELIVERYADDRESS";
	protected static final String PLACEORDER = "WASTEORDER.PLACEORDER";
	protected static final String YOURORDERTABLE = "WASTEORDER.YOURORDERTABLE";

	
	protected static final String SELECTBIN_CHECKBOX = "WASTEORDER.SELECTBIN_CHECKBOX";
	protected static final String EMAIL = "WASTEORDER.EMAIL";
	protected static final String DETAILSDELIVERYLOCATION = "WASTEORDER.DETAILSDELIVERYLOCATION";
	protected static final String CONFIRMOFFSTREET = "WASTEORDER.CONFIRMOFFSTREET";
	protected static final String ORDERITEMSBUTTON = "WASTEORDER.ORDERITEMSBUTTON";
	
	
	protected static final String BLACKRECYCLEBOXQTY = "WASTEORDER.BLACKRECYCLEBOX_QTY";
	protected static final String BROWNFOODWASTECADDYQTY = "WASTEORDER.BROWNFOODWASTECADDY_QTY";
	protected static final String GREENCYCLEBOXQTY = "WASTEORDER.GREENCYCLEBOX_QTY";
	protected static final String GREENBOXNETQTY = "WASTEORDER.GREENBOXNET_QTY";
	protected static final String BLACKBOXLIDQTY = "WASTEORDER.BLACKBOXLID_QTY";
	
	protected static final String BLACKWHEELIEBIN_REASON = "WASTEORDER.BLACKWHEELIEBIN_REASON";
	protected static final String BLACKRECYCLINGBOX_REASON = "WASTEORDER.BLACKRECYCLINGBOX_REASON";
	protected static final String BROWNFOODWASTECADDY_REASON = "WASTEORDER.BROWNFOODWASTECADDY_REASON";
	protected static final String GREENBOXNET_REASON = "WASTEORDER.GREENBOXNET_REASON";
	protected static final String GREENCYCLEBOX_REASON = "WASTEORDER.GREENCYCLEBOX_REASON";
	protected static final String BLACKBOXLID_REASON = "WASTEORDER.BLACKBOXLID_REASON";
	
	protected static final String BLACKWHEELEDBIN_REMOVEOLD = "WASTEORDER.BLACKWHEELEDBIN_REMOVEOLD";
	protected static final String BLACKRECYCLINGBOX_REMOVEOLD = "WASTEORDER.BLACKRECYCLINGBOX_REMOVEOLD";
	protected static final String BROWNFOODWASTECADDY_REMOVEOLD = "WASTEORDER.BROWNFOODWASTECADDY_REMOVEOLD";
	protected static final String GREENRECYCLINGBOX_REMOVEDOLD = "WASTEORDER.GREENRECYCLINGBOX_REMOVEDOLD";
	protected static final String GREENBOXNET_REMOVEOLD = "WASTEORDER.GREENBOXNET_REMOVEOLD";
	protected static final String BLACKBOXLID_REMOVEOLD = "WASTEORDER.BLACKBOXLID_REMOVEOLD";
	
	protected static final String BLACKWHEELEBIN_NAME = "WASTEORDER.BLACKWHEELEBIN_NAME";
	protected static final String BLACKWHEELIBIN_SIZE = "WASTEORDER.BLACKWHEELIBIN_SIZE";
	protected static final String BROWNFOODWASTECADDY_NAME = "WASTEORDER.BROWNFOODWASTECADDY_NAME";
	
	protected static final String BLACKRECYCLINGBOX_NAME= "WASTEORDER.BLACKRECYCLINGBOX_NAME";
	protected static final String GREENRECYCLINGBOX_NAME= "WASTEORDER.GREENRECYCLINGBOX_NAME";
	
			
	
	protected String postcode;
	protected String lookupAddress;
	protected String deliverylocation;
	protected String email;
	protected String password;
	
	protected String expectedaddress;
	protected String quantityofallbins;
	protected String ordertype;
	protected String blackbinsize;
	

	
	
}
