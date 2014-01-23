package controllers;

import java.awt.image.renderable.RenderableImage;
import java.beans.Statement;
import java.io.IOException;
import java.sql.*;
import java.util.List;
import java.io.File;

import play.db.*;

import models.BuyNowData;
import play.*;
import play.mvc.*;
import play.data.Form;
import views.html.*;
import models.Start;
import java.util.Map;
import play.data.DynamicForm;
import play.libs.WS;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.ws.Endpoint;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

@WebService
@SOAPBinding(style = Style.RPC)

public class BuyNowMain extends Controller {
	
	static String s;
	
		public static Result Start() {
			Form<Start> startform = Form.form(Start.class);
			return ok(views.html.start.render(startform));
		}
		
		//public static Result listAllApplicants() {
		//	List<BuyNowData> buynowdata = BuyNowData.find.all();
		////	return ok(views.html.list.render(buynowdata));
		//}
		
		public static Result newBuyNowForm() {
			Form<BuyNowData> buyNowForm = Form.form(BuyNowData.class);
			return ok(views.html.buyNowData.render(buyNowForm));
		}
		
		public static Result insertBuyNowData()
		{
			Form<Start> startform = Form.form(Start.class);
			Form<BuyNowData> buyNowForm = Form.form(BuyNowData.class);
			final Map<String, String[]> values = request().body().asFormUrlEncoded();
		   
		    String applicationDate= values.get("applicationDate")[0];
		    String firstname= values.get("firstname")[0];
		    String middlename= values.get("middlename")[0];
		    String Salesman= values.get("Salesman")[0];
		    String lastname= values.get("lastname")[0];
		    String address= values.get("address")[0];
		    String dln= values.get("dln")[0];
		    String zipcode= values.get("zipcode")[0];
		    String state= values.get("state")[0];
		    String city= values.get("city")[0];
		    String dlIssueDt= values.get("dlIssueDt")[0];
		    String dlExpDate= values.get("dlExpDate")[0];
		    String email= values.get("email")[0];
		    String employer= values.get("employer")[0];
		    String empaddress= values.get("empaddress")[0];
		    String supervisorname= values.get("supervisorname")[0];
		    String ssn= values.get("ssn")[0];
		    String timesonjob= values.get("timesonjob")[0];
		    String dob= values.get("dob")[0];
		    String previousjob= values.get("previousjob")[0];
		    String homephone= values.get("homephone")[0];
		    String previoushomeaddress= values.get("previoushomeaddress")[0];
		    String workphone= values.get("workphone")[0];
		    String emergencycontact= values.get("emergencycontact")[0];
		    String cellphone= values.get("cellphone")[0];
		    String highschool= values.get("highschool")[0];
		    String hearaboutus= values.get("hearaboutus")[0];
		    String sourcedownpayment= values.get("sourcedownpayment")[0];
		    
			int max=0,ii=0,maxref=0;
	      	try
	      	{
	     		Connection con=play.db.DB.getConnection();
	     		ResultSet rs;	
	     		try
	     		{
		     		rs = con.createStatement().executeQuery("select max(id) from customerdetails");
		     		while (rs.next())
		     		{
		     			max=Integer.parseInt(rs.getString(1));
		            }
	     		}
	     		catch (Exception e) {
				}
	     		max++;
	     		ii=con.createStatement().executeUpdate("INSERT INTO customerdetails VALUES ("+(max)+",'"+applicationDate+"','"+Salesman+"','"+firstname+"','"+middlename+"','"+lastname+"','"+address+"',"+zipcode+",'"+city+"','"+state+"','"+ssn+"','"+dob+"','"+homephone+"','"+workphone+"','"+cellphone+"','"+dln+"','"+dlIssueDt+"','"+dlExpDate+"','"+email+"','"+employer+"','"+empaddress+"','"+supervisorname+"','"+timesonjob+"','"+previousjob+"','"+previoushomeaddress+"','"+emergencycontact+"','"+highschool+"','"+hearaboutus+"','"+sourcedownpayment+"',null,null)");
	     		session("sid", max+"");
	      	}
			catch(Exception e)
			{
				session("sid", max+"");	
					System.out.print("\n\n"+e);
					return redirect("/newBuyNowForm");
			}
	      	return redirect("/newBuyNowForm?sid="+max);
	      	
		}
		
		public static Result insertBuyNowRef()
		{
			
			Form<Start> startform = Form.form(Start.class);
			final Map<String, String[]> values = request().body().asFormUrlEncoded();
		   
		    String applicantsmotherm= values.get("applicantsmother")[0];
		    String addressm= values.get("addressm")[0];
		    String citystatezipm= values.get("citystatezipm")[0];
		    String phonecellm= values.get("phonecellm")[0];
		    String contactednotesm= values.get("contactednotesm")[0];
		    String phonehomem= values.get("phonehomem")[0];
		    String phoneworkm= values.get("phoneworkm")[0];
		    String applicantsmotherf= values.get("applicantsmotherf")[0];
		    String addressf= values.get("addressf")[0];
		    String citystatezipf= values.get("citystatezipf")[0];
		    String phonecellf= values.get("phonecellf")[0];
		    String contactednotesf= values.get("contactednotesf")[0];
		    String phonehomef= values.get("phonehomef")[0];
		    String phoneworkf= values.get("phoneworkf")[0];
		    String applicantsmother1= values.get("applicantsmother1")[0];
		    String address1= values.get("address1")[0];
		    String citystatezip1= values.get("citystatezip1")[0];
		    String phonecell1= values.get("phonecell1")[0];
		    String contactednotes1= values.get("contactednotes1")[0];
		    String phonehome1= values.get("phonehome1")[0];
		    String phonework1= values.get("phonework1")[0];
		    String applicantsmother2= values.get("applicantsmother2")[0];
		    String address2= values.get("address2")[0];
		    String citystatezip2= values.get("citystatezip2")[0];
		    String phonecell2= values.get("phonecell2")[0];
		    String contactednotes2= values.get("contactednotes2")[0];
		    String phonehome2= values.get("phonehome2")[0];
		    String phonework2= values.get("phonework2")[0];
		    String applicantsmother3= values.get("applicantsmother3")[0];
		    String address3= values.get("address3")[0];
		    String citystatezip3= values.get("citystatezip3")[0];
		    String phonecell3= values.get("phonecell3")[0];
		    String contactednotes3= values.get("contactednotes3")[0];
		    String phonehome3= values.get("phonehome3")[0];
		    String phonework3= values.get("phonework3")[0];
		    String applicantsmother4= values.get("applicantsmother4")[0];
		    String address4= values.get("address4")[0];
		    String citystatezip4= values.get("citystatezip4")[0];
		    String phonecell4= values.get("phonecell4")[0];
		    String contactednotes4= values.get("contactednotes4")[0];
		    String phonehome4= values.get("phonehome4")[0];
		    String phonework4= values.get("phonework4")[0];
		    String applicantsmother5= values.get("applicantsmother5")[0];
		    String address5= values.get("address5")[0];
		    String citystatezip5= values.get("citystatezip5")[0];
		    String phonecell5= values.get("phonecell5")[0];
		    String contactednotes5= values.get("contactednotes5")[0];
		    String phonehome5= values.get("phonehome5")[0];
		    String phonework5= values.get("phonework5")[0];
		    String applicantsmother6= values.get("applicantsmother6")[0];
		    String address6= values.get("address6")[0];
		    String citystatezip6= values.get("citystatezip6")[0];
		    String phonecell6= values.get("phonecell6")[0];
		    String contactednotes6= values.get("contactednotes6")[0];
		    String phonehome6= values.get("phonehome6")[0];
		    String phonework6= values.get("phonework6")[0];
		    
		    String sid= session("sid");
			int max=0,ii=0,maxref=0;
			max=Integer.parseInt(sid);
	      	try
	      	{
	      		
	     		Connection con=play.db.DB.getConnection();
	     		ResultSet rs;
	     		
	     		
	     		try
	     		{
		     		rs = con.createStatement().executeQuery("select max(id) from referencesdetails");
		     		while (rs.next())
		     		{
		     			maxref=Integer.parseInt(rs.getString(1));
		            }
	     		}
	     		catch (Exception e) {
				}
	     		maxref++;
	     		ii=con.createStatement().executeUpdate("INSERT INTO referencesdetails VALUES ("+(maxref)+","+(max)+",'m','"+applicantsmotherm+"','','"+addressm+"','"+citystatezipm+"','"+phonecellm+"','"+phonehomem+"','"+phoneworkm+"','"+contactednotesm+"')");
	     		maxref++;
	     		ii=con.createStatement().executeUpdate("INSERT INTO referencesdetails VALUES ("+(maxref)+","+(max)+",'f','"+applicantsmotherf+"','','"+addressf+"','"+citystatezipf+"','"+phonecellf+"','"+phonehomef+"','"+phoneworkf+"','"+contactednotesf+"')");
	     		maxref++;
	     		ii=con.createStatement().executeUpdate("INSERT INTO referencesdetails VALUES ("+(maxref)+","+(max)+",'o','"+applicantsmother1+"','','"+address1+"','"+citystatezip1+"','"+phonecell1+"','"+phonehome1+"','"+phonework1+"','"+contactednotes1+"')");
	     		maxref++;
	     		ii=con.createStatement().executeUpdate("INSERT INTO referencesdetails VALUES ("+(maxref)+","+(max)+",'o','"+applicantsmother2+"','','"+address2+"','"+citystatezip2+"','"+phonecell2+"','"+phonehome2+"','"+phonework2+"','"+contactednotes2+"')");
	     		maxref++;
	     		ii=con.createStatement().executeUpdate("INSERT INTO referencesdetails VALUES ("+(maxref)+","+(max)+",'o','"+applicantsmother3+"','','"+address3+"','"+citystatezip3+"','"+phonecell3+"','"+phonehome3+"','"+phonework3+"','"+contactednotes3+"')");
	     		maxref++;
	     		ii=con.createStatement().executeUpdate("INSERT INTO referencesdetails VALUES ("+(maxref)+","+(max)+",'o','"+applicantsmother4+"','','"+address4+"','"+citystatezip4+"','"+phonecell4+"','"+phonehome4+"','"+phonework4+"','"+contactednotes4+"')");
	     		
	     		if((applicantsmother5!="" ||applicantsmother5!=null))
	     		{
	     			maxref++;
	     			ii=con.createStatement().executeUpdate("INSERT INTO referencesdetails VALUES ("+(maxref)+","+(max)+",'o','"+applicantsmother5+"','','"+address5+"','"+citystatezip5+"','"+phonecell5+"','"+phonehome5+"','"+phonework5+"','"+contactednotes5+"')");
	     		}
	     		if((applicantsmother6!="" ||applicantsmother6!=null))
	     		{
	     			maxref++;
	     			ii=con.createStatement().executeUpdate("INSERT INTO referencesdetails VALUES ("+(maxref)+","+(max)+",'o','"+applicantsmother6+"','','"+address6+"','"+citystatezip6+"','"+phonecell6+"','"+phonehome6+"','"+phonework6+"','"+contactednotes6+"')");
	     		}
	      	}
			catch(Exception e)
			{
					System.out.print("\n\n"+e);
                    return ok(views.html.start.render(startform));
			}
	      	return ok(views.html.start.render(startform)); 
		}
		
		public static Result convert(String code) {//String from, String to,Float amount
			//final Map<String, String[]> values = request().body().asFormUrlEncoded();
			 String ID= "0";
			 String wsReq="";
			 
			try
		  	{
		 		Connection con=play.db.DB.getConnection();
		 		ResultSet rs=null,rs1=null;
		 		
		 		rs1 = con.createStatement().executeQuery("select * from security where authenticatingcode='"+code+"'");
		 		if(rs1.next())
		 		{
		     	rs = con.createStatement().executeQuery("select * from customerdetails where transmittedon is null");

		 wsReq = wsReq+"\n <?xml version=\"1.0\" encoding=\"utf-8\"?>" +
		 "<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n <soap12:Body>";		
		 	while(rs.next())
		  	{
		     	//rs1 = con.createStatement().executeQuery("select * from referencesdetails where CustomerDetailsId="+rs.getString(1)+"");	
		  
		wsReq = wsReq+"\n<CustomerDetailstbl>" +"\n"+
		 "<CustomerDetails>\n" +
		"<id>"+rs.getString(1)+"</id>" +"\n"+ 
		"<applicationDate>"+rs.getString(2)+"</applicationDate>" +"\n"+
		"<Salesman>"+rs.getString(3)+"</Salesman>" +"\n"+
		"<firstname>"+rs.getString(4)+"</firstname>"+"\n"+
		"<middlename>"+rs.getString(5)+"</middlename>"+"\n"+
		"<lastname>"+rs.getString(6)+"</lastname>" +"\n"+
		"<address>"+rs.getString(7)+"</address>"+"\n"+
		"<zipcode>"+rs.getString(8)+"</zipcode>" +"\n"+
		"<city>"+rs.getString(9)+"</city>" +"\n"+
		"<state>"+rs.getString(10)+"</state>"+"\n"+
		"<ssn>"+rs.getString(11)+"</ssn>"+"\n"+
		"<dob>"+rs.getString(12)+"</dob>" +"\n"+
		"<homephone>"+rs.getString(13)+"</homephone>" +"\n"+
		"<workphone>"+rs.getString(14)+"</workphone>"+"\n"+
		"<cellphone>"+rs.getString(15)+"</cellphone>"+"\n"+
		"<DriverLicenseNo>"+rs.getString(16)+"</DriverLicenseNo>"+"\n"+
		"<DriverLicenseIssueDate>"+rs.getString(17)+"</DriverLicenseIssueDate>"+"\n"+
		"<DriverLicenceExpiryDate>"+rs.getString(18)+"</DriverLicenceExpiryDate>" +"\n"+
		"<Email>"+rs.getString(19)+"</Email>"+"\n"+
		"<Employer>"+rs.getString(20)+"</Employer>" +"\n"+
		"</CustomerDetails>\n\n";
		 wsReq =wsReq+"</CustomerDetailstbl>" +"\n";
		
		}

		 wsReq =wsReq+"</soap12:Body></soap12:Envelope>";

		int ii=con.createStatement().executeUpdate("update customerdetails set transmittedon=(select now()) where transmittedon is null");
		 		}
		 	}
			catch(Exception e)
			{
				wsReq=e+"";
			}
		return ok (wsReq);
		}

public static Result getAllTransactions(String code) {
	 String ID= "0";
	 String wsReq="";
	try
	{
		Connection con=play.db.DB.getConnection();
		ResultSet rs=null,rs1=null;
		
		rs1 = con.createStatement().executeQuery("select * from security where authenticatingcode='"+code+"'");
		if(rs1.next())
		{
			rs = con.createStatement().executeQuery("select * from customerdetails  where transmittedon is null");

			wsReq = wsReq+"<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
					"<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n<soap12:Body>\n";		
			while(rs.next())
			{
				wsReq = wsReq+"<CustomerDetailstbl>" +"\n"+
						"<CustomerDetails>\n" +
						"<id>"+rs.getString(1)+"</id>" +"\n"+ 
						"<applicationDate>"+rs.getString(2)+"</applicationDate>" +"\n"+
						"<Salesman>"+rs.getString(3)+"</Salesman>" +"\n"+
						"<firstname>"+rs.getString(4)+"</firstname>"+"\n"+
						"<middlename>"+rs.getString(5)+"</middlename>"+"\n"+
						"<lastname>"+rs.getString(6)+"</lastname>" +"\n"+
						"<address>"+rs.getString(7)+"</address>"+"\n"+
						"<zipcode>"+rs.getString(8)+"</zipcode>" +"\n"+
						"<city>"+rs.getString(9)+"</city>" +"\n"+
						"<state>"+rs.getString(10)+"</state>"+"\n"+
						"<ssn>"+rs.getString(11)+"</ssn>"+"\n"+
						"<dob>"+rs.getString(12)+"</dob>" +"\n"+
						"<homephone>"+rs.getString(13)+"</homephone>" +"\n"+
						"<workphone>"+rs.getString(14)+"</workphone>"+"\n"+
						"<cellphone>"+rs.getString(15)+"</cellphone>"+"\n"+
						"<DriverLicenseNo>"+rs.getString(16)+"</DriverLicenseNo>"+"\n"+
						"<DriverLicenseIssueDate>"+rs.getString(17)+"</DriverLicenseIssueDate>"+"\n"+
						"<DriverLicenceExpiryDate>"+rs.getString(18)+"</DriverLicenceExpiryDate>" +"\n"+
						"<Email>"+rs.getString(19)+"</Email>"+"\n"+
						"<Employer>"+rs.getString(20)+"</Employer>" +"\n"+
						"</CustomerDetails>\n";
				wsReq =wsReq+"</CustomerDetailstbl>" +"\n";
			}

			wsReq =wsReq+"</soap12:Body>\n</soap12:Envelope>";
			
			int ii=con.createStatement().executeUpdate("update customerdetails set transmittedtoclienton=(select now()) where transmittedon is null");
		}
	}
	catch(Exception e)
	{
		wsReq=e+"";
	}
	return ok (wsReq);
}		
		
public static Result GetCityState(String Zipcode) {
    String out=",";
	try
		  	{
			 		Connection con=play.db.DB.getConnection();
		 		ResultSet rs=null;
		 		
		 		rs = con.createStatement().executeQuery("select * from \"Zipcodes\" where \"ZipCode\" = '"+Zipcode+"'");
		 		if(rs.next())
		 		{
				out = rs.getString(2) + ","  + rs.getString(3);
				}
				}
			catch(Exception e)
			{
				out="";
			}
    return ok (out);
}

		public static Result getiddata(String id,String code) {//String from, String to,Float amount
			//final Map<String, String[]> values = request().body().asFormUrlEncoded();
			 String ID= id;
			 String wsReq="";
			 
			try
		  	{
				
		 		Connection con=play.db.DB.getConnection();
		 		ResultSet rs=null,rs1=null;
		 		rs1 = con.createStatement().executeQuery("select * from security where authenticatingcode='"+code+"'");
		 		if(rs1.next())
		 		{
		 		
		     	rs = con.createStatement().executeQuery("select * from customerdetails where id="+ID+"");

		 wsReq = wsReq+"\n <?xml version=\"1.0\" encoding=\"utf-8\"?>" +
		 "<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n <soap12:Body>";		
		 	while(rs.next())
		  	{	
		  
		wsReq = wsReq+"\n<CustomerDetailstbl>" +"\n"+
		 "<CustomerDetails>\n" +
		"<id>"+rs.getString(1)+"</id>" +"\n"+ 
		"<applicationDate>"+rs.getString(2)+"</applicationDate>" +"\n"+
		"<Salesman>"+rs.getString(3)+"</Salesman>" +"\n"+
		"<firstname>"+rs.getString(4)+"</firstname>"+"\n"+
		"<middlename>"+rs.getString(5)+"</middlename>"+"\n"+
		"<lastname>"+rs.getString(6)+"</lastname>" +"\n"+
		"<address>"+rs.getString(7)+"</address>"+"\n"+
		"<zipcode>"+rs.getString(8)+"</zipcode>" +"\n"+
		"<city>"+rs.getString(9)+"</city>" +"\n"+
		"<state>"+rs.getString(10)+"</state>"+"\n"+
		"<ssn>"+rs.getString(11)+"</ssn>"+"\n"+
		"<dob>"+rs.getString(12)+"</dob>" +"\n"+
		"<homephone>"+rs.getString(13)+"</homephone>" +"\n"+
		"<workphone>"+rs.getString(14)+"</workphone>"+"\n"+
		"<cellphone>"+rs.getString(15)+"</cellphone>"+"\n"+
		"<DriverLicenseNo>"+rs.getString(16)+"</DriverLicenseNo>"+"\n"+
		"<DriverLicenseIssueDate>"+rs.getString(17)+"</DriverLicenseIssueDate>"+"\n"+
		"<DriverLicenceExpiryDate>"+rs.getString(18)+"</DriverLicenceExpiryDate>" +"\n"+
		"<Email>"+rs.getString(19)+"</Email>"+"\n"+
		"<Employer>"+rs.getString(20)+"</Employer>" +"\n"+
		"</CustomerDetails>\n\n";
		 wsReq =wsReq+"</CustomerDetailstbl>" +"\n";
		
		 wsReq =wsReq+"</soap12:Body></soap12:Envelope>";

		 	}
		 		}
		  	}
			catch(Exception e)
			{
				wsReq=e+"";
			}
		return ok (wsReq);
		}
		
		public static Result main() {
			//Endpoint.publish("http://localhost:9000/SimpleWebService", convert()); ;
			 Endpoint.publish("http://localhost:9000/demo",new DemoFunctions());

			return ok("");
		}

public static Result updateTransactionsXML(String code){
	String Status="Transaction data has been updated successfully!";
	try
	{
		Connection con=play.db.DB.getConnection();
		ResultSet rs=null;
		
		rs = con.createStatement().executeQuery("select * from security where authenticatingcode='"+code+"'");
		if(rs.next())
		{
			File fXmlFile = new File("customerFile\\Horuke-CustomerData.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);		

			doc.getDocumentElement().normalize();
			NodeList nList = doc.getElementsByTagName("CustomerDetails");
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					//System.out.println("Customer ID : " + eElement.getElementsByTagName("id").item(0).getTextContent());
					//System.out.println("update customerdetails set transmittedon= null where id='" + eElement.getElementsByTagName("id").item(0).getTextContent() +"'");
					con.createStatement().executeUpdate("update customerdetails set transmittedon= null where id='" + eElement.getElementsByTagName("id").item(0).getTextContent() +"'");
				}
			}
		}
	}
	catch(Exception e)
	{
		Status = e + "";
	}
	return ok (Status);
}		

public static Result updateTransactions(String code, String ids){
	String Status="Transaction data has been updated successfully!";
	try
	{
		Connection con=play.db.DB.getConnection();
		ResultSet rs=null;
		
		rs = con.createStatement().executeQuery("select * from security where authenticatingcode='"+code+"'");
		if(rs.next())
		{
			con.createStatement().executeUpdate("update customerdetails set transmittedon = (select now()) where id in (" + ids +")");
		}
	}
	catch(Exception e)
	{
		Status = e + "";
	}
	return ok (Status);
}		

}
