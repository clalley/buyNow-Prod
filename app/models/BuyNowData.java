package models;
import java.sql.Connection;

import play.db.ebean.Model;
import play.db.ebean.Model.Finder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.swing.JOptionPane;


import play.data.validation.Constraints.Email;
import play.data.validation.Constraints.Pattern;
import play.data.validation.Constraints.Required;
import play.api.db.*;
//import play.api.Play.current;

//import anorm.*;
//import anorm.SqlParser.*;

@Entity
public class BuyNowData extends Model {
	Connection con = play.db.DB.getConnection();
    @Id
    @GeneratedValue
    public long id;
    public String applicationDate;
    public String firstname;
    public String middlename;
    public String Salesman;
    public String lastname;
    public String address;
    public String dln;
    public String zipcode;
    public String state;
    public String city;
    public String dlIssueDt;
    public String dlExpDate;
    public String email;
    public String employer;
    public String empaddress;
    public String supervisorname;
    public String ssn;
    public String timesonjob;
    public String dob;
    public String previousjob;
    public String homephone;
    public String previoushomeaddress;
    public String workphone;
    public String emergencycontact;
    public String cellphone;
    public String highschool;
    public String hearaboutus;
    public String sourcedownpayment;
    
    public String applicantsmotherm;
    public String addressm;
    public String citystatezipm;
    public String phonecellm;
    public String contactednotesm;
    public String phonehomem;
    public String phoneworkm;
    
    public String applicantsmotherf;
    public String addressf;
    public String citystatezipf;
    public String phonecellf;
    public String contactednotesf;
    public String phonehomef;
    public String phoneworkf;
    
    public String applicantsmother1;
    public String address1;
    public String citystatezip1;
    public String phonecell1;
    public String contactednotes1;
    public String phonehome1;
    public String phonework1;
    
    public String applicantsmother2;
    public String address2;
    public String citystatezip2;
    public String phonecell2;
    public String contactednotes2;
    public String phonehome2;
    public String phonework2;
    
    public String applicantsmother3;
    public String address3;
    public String citystatezip3;
    public String phonecell3;
    public String contactednotes3;
    public String phonehome3;
    public String phonework3;
    
    public String applicantsmother4;
    public String address4;
    public String citystatezip4;
    public String phonecell4;
    public String contactednotes4;
    public String phonehome4;
    public String phonework4;
    
    public String applicantsmother5;
    public String address5;
    public String citystatezip5;
    public String phonecell5;
    public String contactednotes5;
    public String phonehome5;
    public String phonework5;
    
    public String applicantsmother6;
    public String address6;
    public String citystatezip6;
    public String phonecell6;
    public String contactednotes6;
    public String phonehome6;
    public String phonework6;

    //public static Finder<Long, BuyNowData> find = new Finder<Long,BuyNowData>(Long.class, BuyNowData.class);
    
    	

    public String validate() {
        return null;
    }
  
    
    
}
