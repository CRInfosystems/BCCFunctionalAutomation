package com.bcc.customer;

import com.bcc.general.StoryBase;


public abstract class CustomerStoryBase extends StoryBase {
	
	/* add more new accounts related pages here*/
	protected static final String CREATE_ACCOUNT_MENU = "HOME.CREATE_ACCOUNT_MENU";
	protected static final String MY_ACCOUNT_MENU = "HOME.MY_ACCOUNT_MENU";
	protected static final String HOME_MENU = "HOME.HOME_MENU";
	protected static final String WASTE_MENU = "HOME.WASTE_MENU";
	
	

	protected static final String GETNEWPASSWORDLINK = "LOGIN.GETNEWPASSWORDLINK";
	
	protected static final String ADDRESS_UPRN = "REGISTRATION.ADDRESS_UPRN";
	
	protected static final String EMAIL = "FORGORTPASSWORD.EMAILID";
	protected static final String SENDRESETBUTTON = "FORGORTPASSWORD.SENDRESETBUTTON";
	protected static final String VERIFYMESSAGE = "FORGORTPASSWORD.MESSAGE";
	
	protected static final String ORDERSANDPAYMENTSTAB = "TRANSACTIONHISTORY.ORDERSANDPAYMENTSTAB";
	protected static final String TRANSACTIONTABLE = "TRANSACTIONHISTORY.TRANSACTIONTABLE";
	
	protected static final String ORDERNUMBER = "WASTEORDER.ORDERNUMBER";
	protected static final String ORDERNEWREPLACEMENT_BUTTON = "WASTE.ORDERNEWREPLACEMENT_BUTTON";
	protected static final String ORDERNEWBIN_FIELDSETS = "WASTEORDER.ORDERNEWBIN_FIELDSETS";
	protected static final String GET_BIN_NAME = "WASTEORDER.GET_BIN_NAME";
	protected static final String BROWNFOODWASTECADDY_NAME = "WASTEORDER.BROWNFOODWASTECADDY_NAME";
	protected static final String SELECTBIN_CHECKBOX = "WASTEORDER.SELECTBIN_CHECKBOX";
	protected static final String BROWNFOODWASTECADDYQTY = "WASTEORDER.BROWNFOODWASTECADDY_QTY";
	protected static final String BROWNFOODWASTECADDY_REASON = "WASTEORDER.BROWNFOODWASTECADDY_REASON";
	protected static final String BROWNFOODWASTECADDY_REMOVEOLD = "WASTEORDER.BROWNFOODWASTECADDY_REMOVEOLD";
	protected static final String CONFIRMOFFSTREET = "WASTEORDER.CONFIRMOFFSTREET";
	protected static final String ORDERITEMSBUTTON = "WASTEORDER.ORDERITEMSBUTTON";
	protected static final String PLACEORDER = "WASTEORDER.PLACEORDER";
	protected static final String ADDRESS = "WASTEORDER.ADDRESS_NAME_LOGGEDIN";
	
	protected static final String POSTCODE = "UPDATEADDRESS.POSTCODE";
	protected static final String LOOKUPADDRESS = "UPDATEADDRESS.LOOKUPADDRESS";
	protected static final String SAVEADDRESS ="UPDATEADDRESS.SAVEADDRESS";
	protected static final String UPDATEADDRESS_TITLE = "UPDATEADDRESS.TITLE";
	
	
	protected static final String CURRENTADDRESS = "PROFILE.CURRENTADDRESS";
	protected static final String CHANGEADDRESSLINK = "PROFILE.CHANGEADRESSLINK";
	protected static final String YOURDETAILS_TAB = "PROFILE.YOURDETAILS_TAB";
	protected static final String CONTACTDETAILS = "PROFILE.CONTACTDETAILS";
	protected static final String CONTACTDETAILS_ROWS = "PROFILE.CONTACTDETAILS_ROWS";
	protected static final String CHANGEPHONELINK = "PROFILE.CHANGEPHONELINK";
	protected static final String YOURACCOUNT_MESSAGE = "PROFILE.YOURDETAILS_TAB";
	protected static final String CHANGE_PWD_LINK = "PROFILE.CHANGEPWDLINK";
	
	
	protected static final String UPDATEPHONE_TITLE = "UPDATEPHONE.TITLE";
	protected static final String LANDLINE = "UPDATEPHONE.LANDLINE";
	protected static final String MOBILE = "UPDATEPHONE.MOBILE";
	protected static final String SAVEPHONE = "UPDATEPHONE.SAVEPHONE";
	protected static final String ERRORMESSAGE = "UPDATEPHONE.ERRORMESSAGE";
	protected static final String CHANGE_EMAIL_LINK = "PROFILE.CHANGEEMAILLINK";
	
	
	protected static final String CHANGEPWD_TITLE = "CHANGEPASSWORD.TITLE";
	protected static final String CURRENT_PASSWORD = "CHANGEPASSWORD.CURRENTPWD";
	protected static final String NEW_PASSWORD = "CHANGEPASSWORD.NEWPWD";
	protected static final String CONFIRM_PASSWORD = "CHANGEPASSWORD.CONFIRMNEWPASSWORD";
	protected static final String SAVE_CHANGES = "CHANGEPASSWORD.SAVECHANGESBUTTON";
	protected static final String SAVE_CHANGES_EMAIL = "CHANGEEMAIL.SAVEBUTTON";
	protected static final String ERRORMESSAGE_PWD_MISMATCH = "CHANGEPASSWORD.ERRORPASSWORDMISMATCH";
	protected static final String ERRORMESSAGE_EXISTING_PWD = "CHANGEPASSWORD.ERRORMESSAGE";
	
	protected static final String CHANGEEMAIL_TITLE = "CHANGEEMAIL.TITLE";
	protected static final String CHANGE_PWD_MESSAGE = "PROFILE.CHANGEPWDMESSAGE";
	protected static final String INCORRECTEMAILERRORMESSAGE = "FORGORTPASSWORD.INCORRECTEMAILERRORMESSAGE";
	protected static final String RESTPASSWORDLINK = "FORGORTPASSWORD.RESETPASSWORDLINK";
	protected static final String NEWCUSTOMERMESSAGE = "TRANSACTIONHISTORY.NEWCUSTOMERMESSAGE";
	
	

	protected static final String NEWEMAIL = "CHANGEEMAIL.EMAIL";
	protected static final String CONFIRMEMAIL = "CHANGEEMAIL.CONFIRMEMAIL";
	protected static final String SAVECHANGES = "CHANGEEMAIL.SAVEBUTTON";
	protected static final String MESSAGEEMAIL = "PROFILE.CHANGEEMAIL";
	protected static final String PROFILE_PROFILEUPDATES = "PROFILE.PROFILEUPDATES";
	protected static final String CHANGEEMAIL_ERRORMSG = "CHANGEEMAIL.ERRORMSG";
	
		
	
	
	public String ordernumber = null;
	public int intialrowcount = 0;
	//public ArrayList listvaleues = new ArrayList();
	public int neworderrowcount = 0;
	public String postcode;
	public String lookupAddress;
	public String currectAddress;
	public String expectedAddress;
	public String currentpostcode;
	public String currentHouseNo;
	public String ActualLandlinetelephone;
	public String ActualMobile;
	public String ExpectedLandline;
	public String ExpectedMobile;
	public String oldlandlinenumber ;
	public String oldMobilenumber;
	public String expectedmobile;
	public String newpassword;
	public String incorrectpassword;
	public String newemail;
	
	
	
	
}
