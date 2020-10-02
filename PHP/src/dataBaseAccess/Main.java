package dataBaseAccess;


import inventory.Inventory;
public class Main {
    public static void main(String[] args) throws Exception {
/*    	
    	// these will be replaced with the information from login screen 
    	// IF login is successful.
    	String User ="phpadmin";
    	String PW ="phpadminpw";
    	//
    	Login Login = new Login(); // Creates a new Sign in object
    	Login.updateCredentials(User, PW); // Updates User information, if incorrect then attempts to connect to DataB will be rejected.
    	Inventory dao = new Inventory();

//Edit Name Test
    	//int EditBarcode = 21871;
    	//int Editbarcode = 22890;
    	//String Editname = "The answer is yes";
    	//String EditName = "Does this name work"; 
        //dao.EditName(Editbarcode, Editname);
// Edit barcode Test
    	//int Editbarcode = 22890;
    	//String Editname = "The answer is yes"; 
        //dao.EditCode(Editbarcode, EditName);
        
//Tests Successful
    	
    	int Barcode = 21871;
    	int Amount = 897;
    	double Price = 19.2;
    	String Category = "Y";
    	int Obsolescence = 1;
        dao.EditItemPlusOne(101);
        dao.ReadDB();
        dao.EditQuantity(Barcode, Amount);
        dao.EditPrice(Barcode, Price);
        dao.EditCategory(Barcode, Category);
        dao.EditObsolescence(Barcode, Obsolescence);
        ////////////////////////
        /* 
         * New Items to add
         */
/*
        int test_bar = 15;
        String test_desc = "CredentialTest";
        int test_amount = 5;
        float test_price = 16;
        String test_category = "A";
        int test_obsolescence = 1;*/
        //dao.Add(test_desc, test_amount, test_price, test_category, test_obsolescence); // Confirms that item added will generate its own Barcode
/*
        int test_bar2 = 21870;
        dao.Add(test_bar2); // Confirms that item can be added with barcode only
//Test-Succesful
*/        
/*       
        String test_desc3 = "NameOnlyTest";     
        dao.Add(test_desc3); // Confirms item can be added using only a name
//Test-Successful
*/        
/*        
        int test_bar = 160;
        String test_desc = "FullItemTest";
        int test_amount = 165;
        float test_price = 216;
        String test_category = "Z";
        int test_obsolescence = 1;
        dao.Add(test_bar, test_desc, test_amount, test_price, test_category, test_obsolescence); // Test all including user generated barcode
//Test-Successful
*/      
        // dao.ReadDB();
        
        
        
        
        
        //Item delete Test
/*       
        int Barcode = 150;
        dao.Delete(Barcode);
//Test-Succesful
*/     
/*        
        String test_desc = "FullItemTest";
        dao.Delete(test_desc);
//Test-Successful |||| Confirmed will delete Multiple Items with the same name        
*/        
     /*   int testbar = 15;
        String testName = "CoffeeMug";
        int testamount = 500;
        String testcategory = "Bric a Brac";
        String testdescription = "Worlds No.1 Dad!";
        // Test Items for Inventory add method
        */
       /////Successful/////
       // dao.inventoryadd("phpadmin", "phpadminpw", testbar, testName, testamount, testcategory, testdescription);
        //Test read to confirm changes 
       // dao.readDataBase("phpadmin", "phpadminpw"); // check to see if new item added succesfully
    }

}