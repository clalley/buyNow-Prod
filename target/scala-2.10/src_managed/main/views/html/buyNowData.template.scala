
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
import models.BuyNowData
/**/
object buyNowData extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[BuyNowData],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(buyNowForm : Form[BuyNowData]):play.api.templates.Html = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.33*/("""

"""),format.raw/*5.1*/("""
<meta http-equiv="Content-Type" content="text/html;">

   <script language="javaScript" type="text/javascript" src="""),_display_(Seq[Any](/*8.62*/routes/*8.68*/.Assets.at("javascripts/CalendarControl.js"))),format.raw/*8.112*/("""></script>
   <script language="javaScript" type="text/javascript" src="""),_display_(Seq[Any](/*9.62*/routes/*9.68*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*9.113*/("""></script>
   <link href="""),_display_(Seq[Any](/*10.16*/routes/*10.22*/.Assets.at("stylesheets/calendra.css"))),format.raw/*10.60*/(""" rel="stylesheet" type="text/css">
   
   <style type="text/css">
    td
    """),format.raw/*14.5*/("""{"""),format.raw/*14.6*/("""
    font-family: arial;
    """),format.raw/*16.5*/("""}"""),format.raw/*16.6*/("""
    p
    """),format.raw/*18.5*/("""{"""),format.raw/*18.6*/("""
    font-family: arial;
    """),format.raw/*20.5*/("""}"""),format.raw/*20.6*/("""
    </style>
  
 <body  style="background-color:#EEAA1F;" onload="gettdate()">
<script type="text/javascript" >

$(document).ready(function() """),format.raw/*26.30*/("""{"""),format.raw/*26.31*/("""
	var id = getParameterByName("sid");
	if(id=="")"""),format.raw/*28.12*/("""{"""),format.raw/*28.13*/("""
		document.getElementById('divfrmCustomer').style.display = "inline";
		document.getElementById('divfrmReferences').style.display = "none";
	"""),format.raw/*31.2*/("""}"""),format.raw/*31.3*/("""else"""),format.raw/*31.7*/("""{"""),format.raw/*31.8*/("""
		document.getElementById('divfrmCustomer').style.display = "none";
		document.getElementById('divfrmReferences').style.display = "inline";
	"""),format.raw/*34.2*/("""}"""),format.raw/*34.3*/("""
"""),format.raw/*35.1*/("""}"""),format.raw/*35.2*/(""");

function getParameterByName(name) """),format.raw/*37.35*/("""{"""),format.raw/*37.36*/("""
    name = name.replace(/[\[]/, "\\\[").replace(/[\]]/, "\\\]");
    var regex = new RegExp("[\\?&]" + name + "=([^&#]*)"),
        results = regex.exec(location.search);
    return results == null ? "" : decodeURIComponent(results[1].replace(/\+/g, " "));
"""),format.raw/*42.1*/("""}"""),format.raw/*42.2*/("""

function gettdate()
"""),format.raw/*45.1*/("""{"""),format.raw/*45.2*/("""
	var today = new Date();
	var dd = today.getDate();
	var mm = today.getMonth();
	var yy = today.getYear();
	mm=mm+1;
	if(mm==13)
		mm=1;
	document.forms["frmCustomer"]["applicationDate"].value=mm+"/"+dd+"/"+(yy+1900);
	
"""),format.raw/*55.1*/("""}"""),format.raw/*55.2*/("""

var year18=currentTime.getFullYear()-18;
function mask(e,f)"""),format.raw/*58.19*/("""{"""),format.raw/*58.20*/("""
	var len = f.value.length;
	var key = whichKey(e);
	if(key>47 && key<58)
	"""),format.raw/*62.2*/("""{"""),format.raw/*62.3*/("""
		if( len==3 )f.value=f.value+'-'
		else if(len==7 )f.value=f.value+'-'
		else f.value=f.value;
	"""),format.raw/*66.2*/("""}"""),format.raw/*66.3*/("""
	else"""),format.raw/*67.6*/("""{"""),format.raw/*67.7*/("""
		f.value = f.value.replace(/[^0-9-]/,'')
		f.value = f.value.replace('--','-')
	"""),format.raw/*70.2*/("""}"""),format.raw/*70.3*/("""
"""),format.raw/*71.1*/("""}"""),format.raw/*71.2*/("""
function maskssn(e,f)"""),format.raw/*72.22*/("""{"""),format.raw/*72.23*/("""
	var len = f.value.length;
	var key = whichKey(e);
	if(key>47 && key<58)
	"""),format.raw/*76.2*/("""{"""),format.raw/*76.3*/("""
		if( len==3 )f.value=f.value+'-'
		else if(len==6 )f.value=f.value+'-'
		else f.value=f.value;
	"""),format.raw/*80.2*/("""}"""),format.raw/*80.3*/("""
	else"""),format.raw/*81.6*/("""{"""),format.raw/*81.7*/("""
		f.value = f.value.replace(/[^0-9-]/,'')
		f.value = f.value.replace('--','-')
	"""),format.raw/*84.2*/("""}"""),format.raw/*84.3*/("""
"""),format.raw/*85.1*/("""}"""),format.raw/*85.2*/("""

function maskdate(e,f)"""),format.raw/*87.23*/("""{"""),format.raw/*87.24*/("""
	var len = f.value.length;
	var key = whichKey(e);
	if(key>47 && key<58)
	"""),format.raw/*91.2*/("""{"""),format.raw/*91.3*/("""
		if( len==2 )f.value=f.value+'/'
		else if(len==5 )f.value=f.value+'/'
		else f.value=f.value;
	"""),format.raw/*95.2*/("""}"""),format.raw/*95.3*/("""
	else"""),format.raw/*96.6*/("""{"""),format.raw/*96.7*/("""
		//f.value = f.value.replace(/[^0-9-]/,'')
		//f.value = f.value.replace('//','/')
	"""),format.raw/*99.2*/("""}"""),format.raw/*99.3*/("""
"""),format.raw/*100.1*/("""}"""),format.raw/*100.2*/("""

function maskzip(e,f)"""),format.raw/*102.22*/("""{"""),format.raw/*102.23*/("""
	var len = f.value.length;
	var key = whichKey(e);
	if(key>47 && key<58)
	"""),format.raw/*106.2*/("""{"""),format.raw/*106.3*/("""
		if( len==2 )f.value=f.value+'-'
		else if(len==5 )f.value=f.value+'-'
		else f.value=f.value;
	"""),format.raw/*110.2*/("""}"""),format.raw/*110.3*/("""
	else"""),format.raw/*111.6*/("""{"""),format.raw/*111.7*/("""
		f.value = f.value.replace(/[^0-9-]/,'')
		f.value = f.value.replace('--','-')
	"""),format.raw/*114.2*/("""}"""),format.raw/*114.3*/("""
"""),format.raw/*115.1*/("""}"""),format.raw/*115.2*/("""
function whichKey(e) """),format.raw/*116.22*/("""{"""),format.raw/*116.23*/("""
	var code;
	if (!e) var e = window.event;
	if (e.keyCode) code = e.keyCode;
	else if (e.which) code = e.which;
	return code
"""),format.raw/*122.1*/("""}"""),format.raw/*122.2*/("""

function onlyletters(u)
"""),format.raw/*125.1*/("""{"""),format.raw/*125.2*/("""
	if(u.value=="")
	"""),format.raw/*127.2*/("""{"""),format.raw/*127.3*/("""
		u.style.borderColor="red";
	"""),format.raw/*129.2*/("""}"""),format.raw/*129.3*/("""
	else
	"""),format.raw/*131.2*/("""{"""),format.raw/*131.3*/("""
		u.style.borderColor="gray";
	"""),format.raw/*133.2*/("""}"""),format.raw/*133.3*/("""
"""),format.raw/*134.1*/("""}"""),format.raw/*134.2*/("""
function ZipCodePop(u)
"""),format.raw/*136.1*/("""{"""),format.raw/*136.2*/("""
	onlyletters(u);
	if(u.value!="")"""),format.raw/*138.17*/("""{"""),format.raw/*138.18*/("""
	 var url = "/GetCityState?Zipcode=" + u.value;    
        $.get(url , function(data) """),format.raw/*140.36*/("""{"""),format.raw/*140.37*/("""
		if(data!="")"""),format.raw/*141.15*/("""{"""),format.raw/*141.16*/("""
		"""),format.raw/*142.3*/("""}"""),format.raw/*142.4*/("""
            var statecity = data.split(',');
			document.forms["frmCustomer"]["state"].value = statecity[0];
			document.forms["frmCustomer"]["city"].value = statecity[1];
        """),format.raw/*146.9*/("""}"""),format.raw/*146.10*/(""");
		"""),format.raw/*147.3*/("""}"""),format.raw/*147.4*/("""
"""),format.raw/*148.1*/("""}"""),format.raw/*148.2*/("""

function chkdob()
"""),format.raw/*151.1*/("""{"""),format.raw/*151.2*/("""
	var date1 = new Date(document.forms["frmCustomer"]["dob"].value);  
	var date2 = new Date();  

	var date_diff = Math.abs(date2.getTime() - date1.getTime())/86400000;
        if (date_diff < 6570)
	"""),format.raw/*157.2*/("""{"""),format.raw/*157.3*/("""
              alert('Date of Birth should be more 18 years');
		return false;
	"""),format.raw/*160.2*/("""}"""),format.raw/*160.3*/("""
"""),format.raw/*161.1*/("""}"""),format.raw/*161.2*/("""

function validateCustomerForm()
"""),format.raw/*164.1*/("""{"""),format.raw/*164.2*/("""
	var date1 = new Date(document.forms["frmCustomer"]["dob"].value);  
	var date2 = new Date();  

	var date_diff = Math.abs(date2.getTime() - date1.getTime())/86400000;
        if (date_diff < 6570)
	"""),format.raw/*170.2*/("""{"""),format.raw/*170.3*/("""
              alert('Date of Birth should be more 18 years');
		return false;
	"""),format.raw/*173.2*/("""}"""),format.raw/*173.3*/("""
	var x=document.forms["frmCustomer"]["applicationDate"].value;
	if (x==null || x=="")
	  """),format.raw/*176.4*/("""{"""),format.raw/*176.5*/("""
	  alert("Applicaion Date must be filled out");
	  return false;
	  """),format.raw/*179.4*/("""}"""),format.raw/*179.5*/("""

	
	  var x=document.forms["frmCustomer"]["firstname"].value;
	if (x==null || x=="")
	  """),format.raw/*184.4*/("""{"""),format.raw/*184.5*/("""
	  alert("First name must be filled out");
	  return false;
	  """),format.raw/*187.4*/("""}"""),format.raw/*187.5*/("""
	  var x=document.forms["frmCustomer"]["middlename"].value;
	if (x==null || x=="")
	  """),format.raw/*190.4*/("""{"""),format.raw/*190.5*/("""
	  alert("Middle name must be filled out");
	  return false;
	  """),format.raw/*193.4*/("""}"""),format.raw/*193.5*/("""
	  var x=document.forms["frmCustomer"]["Salesman"].value;
	if (x==null || x=="")
	  """),format.raw/*196.4*/("""{"""),format.raw/*196.5*/("""
	  alert("Salesman name must be filled out");
	  return false;
	  """),format.raw/*199.4*/("""}"""),format.raw/*199.5*/("""
	  var x=document.forms["frmCustomer"]["lastname"].value;
	if (x==null || x=="")
	  """),format.raw/*202.4*/("""{"""),format.raw/*202.5*/("""
	  alert("Last name must be filled out");
	  return false;
	  """),format.raw/*205.4*/("""}"""),format.raw/*205.5*/("""
	  var x=document.forms["frmCustomer"]["address"].value;
	if (x==null || x=="")
	  """),format.raw/*208.4*/("""{"""),format.raw/*208.5*/("""
	  alert("Address must be filled out");
	  return false;
	  """),format.raw/*211.4*/("""}"""),format.raw/*211.5*/("""
	  var x=document.forms["frmCustomer"]["dln"].value;
	if (x==null || x=="")
	  """),format.raw/*214.4*/("""{"""),format.raw/*214.5*/("""
	  alert("DLN must be filled out");
	  return false;
	  """),format.raw/*217.4*/("""}"""),format.raw/*217.5*/("""
	  var x=document.forms["frmCustomer"]["zipcode"].value;
	if (x==null || x=="")
	  """),format.raw/*220.4*/("""{"""),format.raw/*220.5*/("""
	  alert("Zipcode must be filled out");
	  return false;
	  """),format.raw/*223.4*/("""}"""),format.raw/*223.5*/("""
	 
	  var x=document.forms["frmCustomer"]["state"].value;
	if (x==null || x=="")
	  """),format.raw/*227.4*/("""{"""),format.raw/*227.5*/("""
	  alert("State name must be filled out");
	  return false;
	  """),format.raw/*230.4*/("""}"""),format.raw/*230.5*/("""
	  var x=document.forms["frmCustomer"]["city"].value;
	if (x==null || x=="")
	  """),format.raw/*233.4*/("""{"""),format.raw/*233.5*/("""
	  alert("City name must be filled out");
	  return false;
	  """),format.raw/*236.4*/("""}"""),format.raw/*236.5*/("""
	  var x=document.forms["frmCustomer"]["dlIssueDt"].value;
	if (x==null || x=="")
	  """),format.raw/*239.4*/("""{"""),format.raw/*239.5*/("""
	  alert("DL Issue Date must be filled out");
	  return false;
	  """),format.raw/*242.4*/("""}"""),format.raw/*242.5*/("""
	  var x=document.forms["frmCustomer"]["dlExpDate"].value;
	if (x==null || x=="")
	  """),format.raw/*245.4*/("""{"""),format.raw/*245.5*/("""
	  alert("DL Expiration Date must be filled out");
	  return false;
	  """),format.raw/*248.4*/("""}"""),format.raw/*248.5*/("""
	  var x=document.forms["frmCustomer"]["email"].value;
	if (x==null || x=="")
	  """),format.raw/*251.4*/("""{"""),format.raw/*251.5*/("""
	  alert("Email must be filled out");
	  return false;
	  """),format.raw/*254.4*/("""}"""),format.raw/*254.5*/("""
	  var x=document.forms["frmCustomer"]["employer"].value;
	if (x==null || x=="")
	  """),format.raw/*257.4*/("""{"""),format.raw/*257.5*/("""
	  alert("Employer must be filled out");
	  return false;
	  """),format.raw/*260.4*/("""}"""),format.raw/*260.5*/("""
	  var x=document.forms["frmCustomer"]["empaddress"].value;
	if (x==null || x=="")
	  """),format.raw/*263.4*/("""{"""),format.raw/*263.5*/("""
	  alert("Employer Address must be filled out");
	  return false;
	  """),format.raw/*266.4*/("""}"""),format.raw/*266.5*/("""
	  var x=document.forms["frmCustomer"]["supervisorname"].value;
	if (x==null || x=="")
	  """),format.raw/*269.4*/("""{"""),format.raw/*269.5*/("""
	  alert("Supervisor name must be filled out");
	  return false;
	  """),format.raw/*272.4*/("""}"""),format.raw/*272.5*/("""
	  var x=document.forms["frmCustomer"]["ssn"].value;
	if (x==null || x=="")
	  """),format.raw/*275.4*/("""{"""),format.raw/*275.5*/("""
	  alert("SSN must be filled out");
	  return false;
	  """),format.raw/*278.4*/("""}"""),format.raw/*278.5*/("""
	  var x=document.forms["frmCustomer"]["timesonjob"].value;
	if (x==null || x=="")
	  """),format.raw/*281.4*/("""{"""),format.raw/*281.5*/("""
	  alert("Time on job must be filled out");
	  return false;
	  """),format.raw/*284.4*/("""}"""),format.raw/*284.5*/("""
	  var x=document.forms["frmCustomer"]["dob"].value;
	if (x==null || x=="")
	  """),format.raw/*287.4*/("""{"""),format.raw/*287.5*/("""
	  alert("DOB must be filled out");
	  return false;
	  """),format.raw/*290.4*/("""}"""),format.raw/*290.5*/("""
	  var x=document.forms["frmCustomer"]["previousjob"].value;
	if (x==null || x=="")
	  """),format.raw/*293.4*/("""{"""),format.raw/*293.5*/("""
	  alert("Previous Job must be filled out");
	  return false;
	  """),format.raw/*296.4*/("""}"""),format.raw/*296.5*/("""
	  var x=document.forms["frmCustomer"]["homephone"].value;
	if (x==null || x=="")
	  """),format.raw/*299.4*/("""{"""),format.raw/*299.5*/("""
	  alert("Home Phone must be filled out");
	  return false;
	  """),format.raw/*302.4*/("""}"""),format.raw/*302.5*/("""
	  var x=document.forms["frmCustomer"]["previoushomeaddress"].value;
	if (x==null || x=="")
	  """),format.raw/*305.4*/("""{"""),format.raw/*305.5*/("""
	  alert("Previous Home Address must be filled out");
	  return false;
	  """),format.raw/*308.4*/("""}"""),format.raw/*308.5*/("""
	  var x=document.forms["frmCustomer"]["workphone"].value;
	if (x==null || x=="")
	  """),format.raw/*311.4*/("""{"""),format.raw/*311.5*/("""
	  alert("Work Phone must be filled out");
	  return false;
	  """),format.raw/*314.4*/("""}"""),format.raw/*314.5*/("""
	 
	  var x=document.forms["frmCustomer"]["emergencycontact"].value;
	if (x==null || x=="")
	  """),format.raw/*318.4*/("""{"""),format.raw/*318.5*/("""
	  alert("Emergency Contact must be filled out");
	  return false;
	  """),format.raw/*321.4*/("""}"""),format.raw/*321.5*/("""
	
	  var x=document.forms["frmCustomer"]["cellphone"].value;
	if (x==null || x=="")
	  """),format.raw/*325.4*/("""{"""),format.raw/*325.5*/("""
	  alert("Cell Phone must be filled out");
	  return false;
	  """),format.raw/*328.4*/("""}"""),format.raw/*328.5*/("""
	  
	  var x=document.forms["frmCustomer"]["highschool"].value;
	  if (x==null || x=="")
	  """),format.raw/*332.4*/("""{"""),format.raw/*332.5*/("""
	  alert("High School must be filled out");
	  return false;
	  """),format.raw/*335.4*/("""}"""),format.raw/*335.5*/("""
	"""),format.raw/*336.2*/("""}"""),format.raw/*336.3*/("""
 	
function validateReferencesForm()
"""),format.raw/*339.1*/("""{"""),format.raw/*339.2*/("""
	  var x=document.forms["frmReferences"]["applicantsmother"].value;
	if (x==null || x=="")
	  """),format.raw/*342.4*/("""{"""),format.raw/*342.5*/("""
	  alert("Applicant mothers name must be filled");
	  return false;
	  """),format.raw/*345.4*/("""}"""),format.raw/*345.5*/("""
	  var x=document.forms["frmReferences"]["addressm"].value;
	if (x==null || x=="")
	  """),format.raw/*348.4*/("""{"""),format.raw/*348.5*/("""
	  alert("Applicant mothers address must be filled");
	  return false;
	  """),format.raw/*351.4*/("""}"""),format.raw/*351.5*/("""			
	  var x=document.forms["frmReferences"]["citystatezipm"].value;
	if (x==null || x=="")
	  """),format.raw/*354.4*/("""{"""),format.raw/*354.5*/("""
	  alert("Applicant mothers address must be filled");
	  return false;
	  """),format.raw/*357.4*/("""}"""),format.raw/*357.5*/("""
	  var x=document.forms["frmReferences"]["phonecellm"].value;
	if (x==null || x=="")
	  """),format.raw/*360.4*/("""{"""),format.raw/*360.5*/("""
	  alert("Applicant mothers phonecell must be filled");
	  return false;
	  """),format.raw/*363.4*/("""}"""),format.raw/*363.5*/("""
	 // var x=document.forms["frmReferences"]["contactednotesm"].value;
	//if (x==null || x=="")
	 // """),format.raw/*366.6*/("""{"""),format.raw/*366.7*/("""
	  //alert("Applicant mothers contactednote must be filled");
	  //return false;
	  //"""),format.raw/*369.6*/("""}"""),format.raw/*369.7*/("""
	  var x=document.forms["frmReferences"]["phonehomem"].value;
	if (x==null || x=="")
	  """),format.raw/*372.4*/("""{"""),format.raw/*372.5*/("""
	  alert("Applicant mothers phonehome must be filled");
	  return false;
	  """),format.raw/*375.4*/("""}"""),format.raw/*375.5*/("""
	  var x=document.forms["frmReferences"]["phoneworkm"].value;
	if (x==null || x=="")
	  """),format.raw/*378.4*/("""{"""),format.raw/*378.5*/("""
	  alert("Applicant mothers phonework must be filled");
	  return false;
	  """),format.raw/*381.4*/("""}"""),format.raw/*381.5*/("""
	  
	  
	  var x=document.forms["frmReferences"]["applicantsmotherf"].value;
	if (x==null || x=="")
	  """),format.raw/*386.4*/("""{"""),format.raw/*386.5*/("""
	  alert("Applicant Father name must be filled");
	  return false;
	  """),format.raw/*389.4*/("""}"""),format.raw/*389.5*/("""
	  var x=document.forms["frmReferences"]["addressf"].value;
	if (x==null || x=="")
	  """),format.raw/*392.4*/("""{"""),format.raw/*392.5*/("""
	  alert("Applicant Father address must be filled");
	  return false;
	  """),format.raw/*395.4*/("""}"""),format.raw/*395.5*/("""			
	  var x=document.forms["frmReferences"]["citystatezipf"].value;
	if (x==null || x=="")
	  """),format.raw/*398.4*/("""{"""),format.raw/*398.5*/("""
	  alert("Applicant Father citystatezip must be filled");
	  return false;
	  """),format.raw/*401.4*/("""}"""),format.raw/*401.5*/("""
	  var x=document.forms["frmReferences"]["phonecellf"].value;
	if (x==null || x=="")
	  """),format.raw/*404.4*/("""{"""),format.raw/*404.5*/("""
	  alert("Applicant Father phonecell must be filled");
	  return false;
	  """),format.raw/*407.4*/("""}"""),format.raw/*407.5*/("""
	//  var x=document.forms["frmReferences"]["contactednotesf"].value;
	//if (x==null || x=="")
	//  """),format.raw/*410.6*/("""{"""),format.raw/*410.7*/("""
	//  alert("Applicant Father contactednotes must be filled");
	//  return false;
	//  """),format.raw/*413.6*/("""}"""),format.raw/*413.7*/("""
	  var x=document.forms["frmReferences"]["phonehomef"].value;
	if (x==null || x=="")
	  """),format.raw/*416.4*/("""{"""),format.raw/*416.5*/("""
	  alert("Applicant Father phonehome must be filled");
	  return false;
	  """),format.raw/*419.4*/("""}"""),format.raw/*419.5*/("""
	  var x=document.forms["frmReferences"]["phoneworkf"].value;
	if (x==null || x=="")
	  """),format.raw/*422.4*/("""{"""),format.raw/*422.5*/("""
	  alert("Applicant Father phonework must be filled");
	  return false;
	  """),format.raw/*425.4*/("""}"""),format.raw/*425.5*/("""
	  
	  
	  var x=document.forms["frmReferences"]["applicantsmother1"].value;
	if (x==null || x=="")
	  """),format.raw/*430.4*/("""{"""),format.raw/*430.5*/("""
	  alert("Appllicant Block-1 name must be filled");
	  return false;
	  """),format.raw/*433.4*/("""}"""),format.raw/*433.5*/("""
	  var x=document.forms["frmReferences"]["address1"].value;
	if (x==null || x=="")
	  """),format.raw/*436.4*/("""{"""),format.raw/*436.5*/("""
	  alert("Appllicant Block-1 address must be filled");
	  return false;
	  """),format.raw/*439.4*/("""}"""),format.raw/*439.5*/("""			
	  var x=document.forms["frmReferences"]["citystatezip1"].value;
	if (x==null || x=="")
	  """),format.raw/*442.4*/("""{"""),format.raw/*442.5*/("""
	  alert("Appllicant Block-1 citystatezip must be filled");
	  return false;
	  """),format.raw/*445.4*/("""}"""),format.raw/*445.5*/("""
	  var x=document.forms["frmReferences"]["phonecell1"].value;
	if (x==null || x=="")
	  """),format.raw/*448.4*/("""{"""),format.raw/*448.5*/("""
	  alert("Appllicant Block-1 phonecell must be filled");
	  return false;
	  """),format.raw/*451.4*/("""}"""),format.raw/*451.5*/("""
	 // var x=document.forms["frmReferences"]["contactednotes1"].value;
	//if (x==null || x=="")
	//  """),format.raw/*454.6*/("""{"""),format.raw/*454.7*/("""
	//  alert("Appllicant Block-1 phonecell must be filled");
	//  return false;
	//  """),format.raw/*457.6*/("""}"""),format.raw/*457.7*/("""
	  var x=document.forms["frmReferences"]["phonehome1"].value;
	if (x==null || x=="")
	  """),format.raw/*460.4*/("""{"""),format.raw/*460.5*/("""
	  alert("Appllicant Block-1 phonecell must be filled");
	  return false;
	  """),format.raw/*463.4*/("""}"""),format.raw/*463.5*/("""
	  var x=document.forms["frmReferences"]["phonework1"].value;
	if (x==null || x=="")
	  """),format.raw/*466.4*/("""{"""),format.raw/*466.5*/("""
	  alert("Appllicant Block-1 phonecell must be filled");
	  return false;
	  """),format.raw/*469.4*/("""}"""),format.raw/*469.5*/("""
	  
	  
	  var x=document.forms["frmReferences"]["applicantsmother2"].value;
	if (x==null || x=="")
	  """),format.raw/*474.4*/("""{"""),format.raw/*474.5*/("""
	  alert("Appllicant Block-2 name must be filled");
	  return false;
	  """),format.raw/*477.4*/("""}"""),format.raw/*477.5*/("""
	  var x=document.forms["frmReferences"]["address2"].value;
	if (x==null || x=="")
	  """),format.raw/*480.4*/("""{"""),format.raw/*480.5*/("""
	  alert("Appllicant Block-2 address must be filled");
	  return false;
	  """),format.raw/*483.4*/("""}"""),format.raw/*483.5*/("""			
	  var x=document.forms["frmReferences"]["citystatezip2"].value;
	if (x==null || x=="")
	  """),format.raw/*486.4*/("""{"""),format.raw/*486.5*/("""
	  alert("Appllicant Block-2 citystatezip must be filled");
	  return false;
	  """),format.raw/*489.4*/("""}"""),format.raw/*489.5*/("""
	  var x=document.forms["frmReferences"]["phonecell2"].value;
	if (x==null || x=="")
	  """),format.raw/*492.4*/("""{"""),format.raw/*492.5*/("""
	  alert("Appllicant Block-2 phonecell must be filled");
	  return false;
	  """),format.raw/*495.4*/("""}"""),format.raw/*495.5*/("""
	 // var x=document.forms["frmReferences"]["contactednotes2"].value;
	//if (x==null || x=="")
	//  """),format.raw/*498.6*/("""{"""),format.raw/*498.7*/("""
	 // alert("Appllicant Block-2 contactednotes must be filled");
	 // return false;
	 // """),format.raw/*501.6*/("""}"""),format.raw/*501.7*/("""
	  var x=document.forms["frmReferences"]["phonehome2"].value;
	if (x==null || x=="")
	  """),format.raw/*504.4*/("""{"""),format.raw/*504.5*/("""
	  alert("Appllicant Block-2 phonehome must be filled");
	  return false;
	  """),format.raw/*507.4*/("""}"""),format.raw/*507.5*/("""
	  var x=document.forms["frmReferences"]["phonework2"].value;
	if (x==null || x=="")
	  """),format.raw/*510.4*/("""{"""),format.raw/*510.5*/("""
	  alert("Appllicant Block-2 phonework must be filled");
	  return false;
	  """),format.raw/*513.4*/("""}"""),format.raw/*513.5*/("""
	   
	  var x=document.forms["frmReferences"]["applicantsmother3"].value;
	if (x==null || x=="")
	  """),format.raw/*517.4*/("""{"""),format.raw/*517.5*/("""
	  alert("Appllicant Block-3 name must be filled");
	  return false;
	  """),format.raw/*520.4*/("""}"""),format.raw/*520.5*/("""
	  var x=document.forms["frmReferences"]["address3"].value;
	if (x==null || x=="")
	  """),format.raw/*523.4*/("""{"""),format.raw/*523.5*/("""
	  alert("Appllicant Block-3 address must be filled");
	  return false;
	  """),format.raw/*526.4*/("""}"""),format.raw/*526.5*/("""			
	  var x=document.forms["frmReferences"]["citystatezip3"].value;
	if (x==null || x=="")
	  """),format.raw/*529.4*/("""{"""),format.raw/*529.5*/("""
	  alert("Appllicant Block-3 citystatezip must be filled");
	  return false;
	  """),format.raw/*532.4*/("""}"""),format.raw/*532.5*/("""
	  var x=document.forms["frmReferences"]["phonecell3"].value;
	if (x==null || x=="")
	  """),format.raw/*535.4*/("""{"""),format.raw/*535.5*/("""
	  alert("Appllicant Block-3 phonecell must be filled");
	  return false;
	  """),format.raw/*538.4*/("""}"""),format.raw/*538.5*/("""
	//  var x=document.forms["frmReferences"]["contactednotes3"].value;
	//if (x==null || x=="")
	//  """),format.raw/*541.6*/("""{"""),format.raw/*541.7*/("""
	//  alert("Appllicant Block-3 contactednotes must be filled");
	//  return false;
	//  """),format.raw/*544.6*/("""}"""),format.raw/*544.7*/("""
	  var x=document.forms["frmReferences"]["phonehome3"].value;
	if (x==null || x=="")
	  """),format.raw/*547.4*/("""{"""),format.raw/*547.5*/("""
	  alert("Appllicant Block-3 phonehome must be filled");
	  return false;
	  """),format.raw/*550.4*/("""}"""),format.raw/*550.5*/("""
	  var x=document.forms["frmReferences"]["phonework3"].value;
	if (x==null || x=="")
	  """),format.raw/*553.4*/("""{"""),format.raw/*553.5*/("""
	  alert("Appllicant Block-3 phonework must be filled");
	  return false;
	  """),format.raw/*556.4*/("""}"""),format.raw/*556.5*/("""
	  
	  
	  
	  var x=document.forms["frmReferences"]["applicantsmother4"].value;
	if (x==null || x=="")
	  """),format.raw/*562.4*/("""{"""),format.raw/*562.5*/("""
	  alert("Appllicant Block-4 name must be filled");
	  return false;
	  """),format.raw/*565.4*/("""}"""),format.raw/*565.5*/("""
	  var x=document.forms["frmReferences"]["address4"].value;
	if (x==null || x=="")
	  """),format.raw/*568.4*/("""{"""),format.raw/*568.5*/("""
	  alert("Appllicant Block-4 adddress must be filled");
	  return false;
	  """),format.raw/*571.4*/("""}"""),format.raw/*571.5*/("""			
	  var x=document.forms["frmReferences"]["citystatezip4"].value;
	if (x==null || x=="")
	  """),format.raw/*574.4*/("""{"""),format.raw/*574.5*/("""
	  alert("Appllicant Block-4 cityzipcode must be filled");
	  return false;
	  """),format.raw/*577.4*/("""}"""),format.raw/*577.5*/("""
	  var x=document.forms["frmReferences"]["phonecell4"].value;
	if (x==null || x=="")
	  """),format.raw/*580.4*/("""{"""),format.raw/*580.5*/("""
	  alert("Appllicant Block-4 phonecell must be filled");
	  return false;
	  """),format.raw/*583.4*/("""}"""),format.raw/*583.5*/("""
	//  var x=document.forms["frmReferences"]["contactednotes4"].value;
	//if (x==null || x=="")
	//  """),format.raw/*586.6*/("""{"""),format.raw/*586.7*/("""
	//  alert("Appllicant Block-4 contactednotes must be filled");
	////  return false;
	//  """),format.raw/*589.6*/("""}"""),format.raw/*589.7*/("""
	  var x=document.forms["frmReferences"]["phonehome4"].value;
	if (x==null || x=="")
	  """),format.raw/*592.4*/("""{"""),format.raw/*592.5*/("""
	  alert("Appllicant Block-4 phonehome must be filled");
	  return false;
	  """),format.raw/*595.4*/("""}"""),format.raw/*595.5*/("""
	  var x=document.forms["frmReferences"]["phonework4"].value;
	if (x==null || x=="")
	  """),format.raw/*598.4*/("""{"""),format.raw/*598.5*/("""
	  alert("Appllicant Block-4 phonework must be filled");
	  return false;
	  """),format.raw/*601.4*/("""}"""),format.raw/*601.5*/("""
"""),format.raw/*602.1*/("""}"""),format.raw/*602.2*/("""

</script>
<center >
	<div id="wrapper" style="background-color:#EEAA1F;position:absolute;width:100%;">
		<center><img src=""""),_display_(Seq[Any](/*607.22*/routes/*607.28*/.Assets.at("images/HolmesMotorsLogo.png"))),format.raw/*607.69*/(""""/></center>
		<div id="main" style="background-color:#018445;width:1100px;border-radius:20px;margin:0px auto;margin-top:50px;margin-bottom:50px;">
			<br />
			
			<div id="divfrmCustomer">
				<form action="/insertBuyNowData" id="frmCustomer" method="post" >
					<center><h3  style="color:white; font-family: arial">CUSTOMER INFORMATION</h3></center>
					<center >
						<div style="background-color:white;border-radius:20px;width:95%;padding:10px;" >
							<table border="0" >
								<tr>
									<td>Date</td>
									<td style="width:250px;">
										<input autocomplete="off" type="text" id=buyNowForm("applicationDate") name="applicationDate"  maxlength="10" tabindex=1>
										<a href="#" onClick="setYears(1947, 2030);
										showCalender(this, 'applicationDate');">
										<img src="""),_display_(Seq[Any](/*623.21*/routes/*623.27*/.Assets.at("images/calender.png"))),format.raw/*623.60*/("""></a>
									</td>
									<td width="20" ></td>
									<td>Salesman</td>
									<td>
										<select id=buyNowForm("Salesman") name="Salesman" tabindex=28>
													<option></option>
													<option>Steve</option>
													<option>Dustan</option>
													<option>Richard</option>
													<option>Cameron</option>
										</select>
									</td>
								</tr>

								<tr>
									<td>Last Name</td>
									<td><input autocomplete="off" type="text" id=buyNowForm("lastname") name="lastname" onblur="if(onlyletters(this)==false)this.value=''" tabindex=2></td>
									<td width="20" ></td>
									<td>DL Number</td>
									<td><input autocomplete="off" type="text" id=buyNowForm("dln") name="dln"  onblur="onlyletters(this)" tabindex=16></td>
								</tr>
								<tr>
									<td>First Name</td>
									<td><input autocomplete="off" type="text" id=buyNowForm("firstname") name="firstname" onblur="if(onlyletters(this)==false)this.value=''" tabindex=3></td>
									<td width="20" ></td>
									<td>DL Issue Date</td>
									<td>
										<input autocomplete="off" type="text" id=buyNowForm("dlIssueDt") name="dlIssueDt" placeholder="mm/dd/yyyy"  onkeypress="maskdate(event,this)" maxlength="10" tabindex=17>
										<a href="#" onClick="setYears(1947, 2030); showCalender(this, 'dlIssueDt');">
										<img src="""),_display_(Seq[Any](/*653.21*/routes/*653.27*/.Assets.at("images/calender.png"))),format.raw/*653.60*/(""" ></a>
									</td>
								</tr>
								<tr>
									<td>Middle Name/Nick Name</td>
									<td><input autocomplete="off" type="text" id=buyNowForm("middlename") name="middlename" onblur="if(onlyletters(this)==false)this.value=''" tabindex=4></td>
									<td width="20" ></td>
									<td>DL Expiration Date</td>
									<td>
										<input autocomplete="off" type="text" id=buyNowForm("dlExpDate") name="dlExpDate"  placeholder="mm/dd/yyyy"  onkeypress="maskdate(event,this)" maxlength="10" tabindex=18>
										<a href="#" onClick="setYears(1947, 2030); showCalender(this, 'dlExpDate');">
										<img src="""),_display_(Seq[Any](/*664.21*/routes/*664.27*/.Assets.at("images/calender.png"))),format.raw/*664.60*/(""" ></a>
									</td>
								</tr>
								<tr>
									<td>Address</td>
									<td><input autocomplete="off" type="text" id=buyNowForm("address") name="address"  onblur="onlyletters(this)" tabindex=5></td>
									<td width="20" ></td>
									<td>Email</td>
									<td><input autocomplete="off" type="text" id=buyNowForm("email") name="email"   onblur="onlyletters(this)" tabindex=19> </td>
								</tr>
								<tr>
									<td>Zip Code</td>
									<td><input autocomplete="off" type="text" id=buyNowForm("zipcode") name="zipcode"   maxlength="5"   onblur="ZipCodePop(this)" tabindex=6 ></td>
									<td width="20" ></td>
									<td>Employer</td>
									<td><input autocomplete="off" type="text" id=buyNowForm("employer") name="employer" onblur="if(onlyletters(this)==false)this.value=''" tabindex=20></td>
								</tr>
								<tr>
									<td>City</td>
									<td><input autocomplete="off" type="text" id=buyNowForm("city") name="city" onblur="if(onlyletters(this)==false)this.value=''" tabindex=7></td>
									<td width="20" ></td>
									<td>Employer Address</td>
									<td><input autocomplete="off" type="text" id=buyNowForm("empaddress") name="empaddress"  onblur="onlyletters(this)" tabindex=21></td>
								</tr>
								<tr>
									<td>State</td>
									<td><input autocomplete="off" type="text" id=buyNowForm("state") name="state" onblur="onlyletters(this)" tabindex=8></td>
									<td width="20" ></td>
									<td>Supervisor Name</td>
									<td><input autocomplete="off" type="text" id=buyNowForm("supervisorname") name="supervisorname" onblur="if(onlyletters(this)==false)this.value=''" tabindex=22></td>
								</tr>
								<tr>
									<td>SSN</td>
									<td><input  autocomplete="off" type="text" id=buyNowForm("ssn") name="ssn"  onblur="onlyletters(this)" maxlength="11"  onkeypress="maskssn(event,this)" tabindex=9></td>
									<td width="20" ></td>
									<td>Time on job</td>
									<td><input autocomplete="off" type="text" id=buyNowForm("timesonjob") name="timesonjob"  onblur="onlyletters(this)" tabindex=23></td>
								</tr>
								<tr>
									<td>DOB</td>
									<td>
										<input autocomplete="off" type="text" id=buyNowForm("dob") name="dob"  placeholder="mm/dd/yyyy"  onkeypress="maskdate(event,this)" maxlength="10" tabindex=10>
										<a href="#" onClick="setYears(1947, 2030);   showCalender(this, 'dob'); ">
										<img src="""),_display_(Seq[Any](/*707.21*/routes/*707.27*/.Assets.at("images/calender.png"))),format.raw/*707.60*/(""" ></a>
									</td>
									<td width="20" ></td>
									<td>Previous Job</td>
									<td><input autocomplete="off" type="text" id=buyNowForm("previousjob") name="previousjob" onblur="chkdob()"  onblur="onlyletters(this)" tabindex=24></td>
								</tr>
								<tr>
									<td>Home Phone</td>
									<td><input autocomplete="off" type="text" id=buyNowForm("homephone") name="homephone"  onkeypress="mask(event,this)" maxlength="12"   onblur="onlyletters(this)" tabindex=11></td>
									<td width="20" ></td>
									<td>Previous Home Address</td>
									<td><input autocomplete="off" type="text" id=buyNowForm("previoushomeaddress") name="previoushomeaddress"  onblur="onlyletters(this)" tabindex=25></td>
								</tr>
								<tr>
									<td>Work Phone</td>
									<td><input autocomplete="off" type="text" id=buyNowForm("workphone") name="workphone" onkeypress="mask(event,this)" maxlength="12"  onblur="onlyletters(this)" tabindex=12></td>
									<td width="20" ></td>
									<td>Emergency Contact<br><font size="2">(Name & Relationship)</font></td>
									<td><input autocomplete="off" type="text" id=buyNowForm("emergencycontact") name="emergencycontact" maxlength="30"  onblur="onlyletters(this)" tabindex=26></td>
								</tr>
								<tr>
									<td>Cell Phone</td>
									<td><input autocomplete="off" type="text" id=buyNowForm("cellphone") name="cellphone" onkeypress="mask(event,this)" onkeypress="mask(event,this)" maxlength="12"  onblur="onlyletters(this)" tabindex=13></td>
									<td width="20" ></td>
									<td>High School<br><font size="2">(High school Name/Mascot)</font></td>
									<td><input autocomplete="off" type="text" id=buyNowForm("highschool") name="highschool"  onblur="onlyletters(this)" tabindex=27></td>
								</tr>
								<tr>
									<td>How did you hear about <br>us? Choose one</td>
									<td>
										<select id=buyNowForm("hearaboutus") name="hearaboutus" tabindex=14>
												<option></option>
												<option >Radio</option>
												<option >Name</option>
												<option >Station</option>
												<option >Magzine</option>
												<option >Drive By</option>
												<option >Friend</option>
												<option >Previous Customer</option>
												<option >Other</option>
										</select>
									</td>
									<td width="20" ></td>
									<td>Source of Down <br>payment</td>
									<td>
										<select id=buyNowForm("sourcedownpayment") name="sourcedownpayment" tabindex=28>
												<option></option>
												<option>Savings</option>
												<option>Borrowed</option>
												<option>Income Tax Refund</option>
												<option>Settlement</option>
												<option>Was Given Money</option>
												<option>Trade In</option>
												<option>Sold Something</option>
												<option>Other</option>
										</select>
									</td>
								</tr>
								</table>
						</div>
					</center>
					<br />
					<input type="Reset" Value="Reset" style="font-size:20px;width:200px"> 
					<input type="submit" Value="Submit" style="font-size:20px;width:200px;" onclick="return validateCustomerForm();">
				</form>
			</div>
			
			<div id="divfrmReferences">
				<form action="/insertBuyNowRef" id="frmReferences" method="post" >
					<center>
						<h3 style="color:white;font-family: arial">HOLMES MOTORS</h3>
						<div style="background-color:white;border-radius:20px;width:95%;padding:10px;" >
							<div style="margin:20px;">
								<table width=100%>
									<tr>
										<td>
											<table>
												<tr>
													<td><strong>Applicants <br>Mother</strong></td>
													<td colspan="2">
														<input type="text" style="width:100%" id=buyNowForm("applicantsmother") name="applicantsmother" onblur="if(onlyletters(this)==false)this.value=''">
													</td>
												</tr>
												<tr>
													<td>Address</td>
													<td colspan="2">
														<input autocomplete="off" type="text" style="width:100%" id=buyNowForm("addressm") name="addressm"  onblur="onlyletters(this)">
													</td>
												</tr>
												<tr>
													<td>City,state,Zip</td>
													<td colspan="2">
														<input autocomplete="off" type="text" style="width:100%" id=buyNowForm("citystatezipm") name="citystatezipm"  onblur="onlyletters(this)">
													</td>
												</tr>
												<tr>
													<td>Phone Cell</td>
													<td>
														<input autocomplete="off" type="text" style="width:100px" id=buyNowForm("phonecellm") name="phonecellm" onkeypress="mask(event,this)" onkeypress="mask(event,this)" maxlength="12"  onblur="onlyletters(this)">
													</td>
													<td rowspan=3>
														<textarea rows="5" cols="15" onclick='javascript: this.value = ""'  id=buyNowForm("contactednotesm")  name="contactednotesm" placeholder="Contacted/Notes"></textarea>
													</td>
												</tr>
												<tr>
													<td>Phone Home</td>
													<td>
														<input autocomplete="off" type="text" style="width:100px" id=buyNowForm("phonehomem") name="phonehomem" onkeypress="mask(event,this)" onkeypress="mask(event,this)" maxlength="12"  onblur="onlyletters(this)">
												   </td>
												</tr>
												<tr>
													<td>Phone Work</td>
													<td>
														<input autocomplete="off" type="text" style="width:100px" id=buyNowForm("phoneworkm") name="phoneworkm" onkeypress="mask(event,this)" onkeypress="mask(event,this)" maxlength="12"  onblur="onlyletters(this)">
												   </td>
												</tr>
											</table>
					
										</td>
										<td>
											<br>
											<table>
												<tr>
													<td><strong>Applicants <br>Father</strong></td>
													<td colspan="2">
														<input autocomplete="off" type="text" style="width:100%" id=buyNowForm("applicantsmotherf") name="applicantsmotherf" onblur="if(onlyletters(this)==false)this.value=''" >
													</td>
												</tr>
												<tr>
													<td>Address</td>
													<td colspan="2">
														<input autocomplete="off" type="text" style="width:100%" id=buyNowForm("addressf") name="addressf"  onblur="onlyletters(this)">
													</td>
												</tr>
												<tr>
													<td>City,state,Zip</td>
													<td colspan="2">
														<input  autocomplete="off" type="text" style="width:100%" id=buyNowForm("citystatezipf") name="citystatezipf"  onblur="onlyletters(this)">
													</td>
												</tr>
												<tr>
													<td>Phone Cell</td>
													<td>
														<input autocomplete="off" type="text" style="width:100px" id=buyNowForm("phonecellf") name="phonecellf"  onkeypress="mask(event,this)" maxlength="12"  onblur="onlyletters(this)">
													</td>
													<td rowspan=3><textarea rows="5" cols="15" onclick='javascript: this.value = ""'  id=buyNowForm("contactednotesf")  name="contactednotesf" placeholder="Contacted/Notes"></textarea></td>
												</tr>
												<tr>
													<td>Phone Home</td>
													<td>
														<input autocomplete="off" type="text" style="width:100px" id=buyNowForm("phonehomef") name="phonehomef" onkeypress="mask(event,this)" maxlength="12"  onblur="onlyletters(this)">
													</td>
												</tr>
												<tr>
													<td>Phone Work</td>
													<td>
														<input autocomplete="off" type="text" style="width:100px" id=buyNowForm("phoneworkf") name="phoneworkf"  onkeypress="mask(event,this)" maxlength="12"  onblur="onlyletters(this)">
													</td>
												</tr>
											</table>
										</td>
									</tr>
									<tr>
										<td>
											<br>
												<table>
													<tr>
														<td><strong>Name</strong></td>
														<td colspan="2">
															<input autocomplete="off" type="text" style="width:100%" id=buyNowForm("applicantsmother1") name="applicantsmother1" onblur="if(onlyletters(this)==false)this.value=''">
														</td>
													</tr>
													<tr>
														<td>Address</td>
														<td colspan="2">
															<input autocomplete="off" type="text" style="width:100%" id=buyNowForm("address1") name="address1"  onblur="onlyletters(this)">
														</td>
													</tr>
													<tr>
														<td>City,state,Zip</td>
														<td colspan="2">
															<input  autocomplete="off" type="text" style="width:100%" id=buyNowForm("citystatezip1") name="citystatezip1"  onblur="onlyletters(this)">
														</td>
													</tr>
													<tr>
														<td>Phone Cell</td>
														<td>
															<input autocomplete="off" type="text" style="width:100px" id=buyNowForm("phonecell1") name="phonecell1" onkeypress="mask(event,this)" maxlength="12"  onblur="onlyletters(this)">
														</td>
														<td rowspan=3><textarea rows="5" cols="15" onclick='javascript: this.value = ""'  id=buyNowForm("contactednotes1")  name="contactednotes1" placeholder="Contacted/Notes"></textarea></td>
													</tr>
													<tr>
														<td>Phone Home</td>
														<td>
															<input autocomplete="off" type="text" style="width:100px" id=buyNowForm("phonehome1") name="phonehome1" onkeypress="mask(event,this)"  maxlength="12"  onblur="onlyletters(this)">
														</td>
													</tr>
													<tr>
														<td>Phone Work</td>
														<td>
															<input autocomplete="off" type="text" style="width:100px" id=buyNowForm("phonework1") name="phonework1" onkeypress="mask(event,this)"  maxlength="12"  onblur="onlyletters(this)">
														</td>
													</tr>
												</table>
										</td>
										<td>
											<br>
											<table>
												<tr>
													<td><strong>Name</strong></td>
													<td colspan="2">
														<input autocomplete="off" type="text" style="width:100%" id=buyNowForm("applicantsmother2") name="applicantsmother2" onblur="if(onlyletters(this)==false)this.value=''">
													</td>
												</tr>
												<tr>
													<td>Address</td>
													<td colspan="2">
														<input autocomplete="off" type="text" style="width:100%" id=buyNowForm("address2") name="address2"  onblur="onlyletters(this)">
													</td>
												</tr>
												<tr>
													<td>City,state,Zip</td>
													<td colspan="2">
														<input autocomplete="off"  type="text" style="width:100%" id=buyNowForm("citystatezip2") name="citystatezip2"  onblur="onlyletters(this)">
													</td>
												</tr>
												<tr>
													<td>Phone Cell</td>
													<td>
														<input autocomplete="off" type="text" style="width:100px" id=buyNowForm("phonecell2") name="phonecell2" onkeypress="mask(event,this)"  maxlength="12"  onblur="onlyletters(this)">
													</td>
													<td rowspan=3><textarea rows="5" cols="15" onclick='javascript: this.value = ""'  id=buyNowForm("contactednotes2")  name="contactednotes2" placeholder="Contacted/Notes"></textarea></td>
												</tr>
												<tr>
													<td>Phone Home</td>
													<td>
														<input autocomplete="off" type="text" style="width:100px" id=buyNowForm("phonehome2") name="phonehome2" onkeypress="mask(event,this)"  maxlength="12"  onblur="onlyletters(this)">
													</td>
												</tr>
												<tr>
													<td>Phone Work</td>
													<td>
														<input autocomplete="off" type="text" style="width:100px" id=buyNowForm("phonework2") name="phonework2" onkeypress="mask(event,this)"  maxlength="12"  onblur="onlyletters(this)">
													</td>
												</tr>
											</table>
										</td>
									</tr>
									<tr>
										<td>
											<br>
											<table>
												<tr>
													<td><strong>Name</strong></td>
													<td colspan="2">
														<input autocomplete="off" type="text" style="width:100%" id=buyNowForm("applicantsmother3") name="applicantsmother3" onblur="if(onlyletters(this)==false)this.value=''" >
													</td>
												</tr>
												<tr>
													<td>Address</td>
													<td colspan="2">
														<input autocomplete="off" type="text" style="width:100%" id=buyNowForm("address3") name="address3"  onblur="onlyletters(this)">
													</td>
												</tr>
												<tr>
													<td>City,state,Zip</td>
													<td colspan="2">
														<input autocomplete="off" type="text" style="width:100%" id=buyNowForm("citystatezip3") name="citystatezip3"  onblur="onlyletters(this)">
													</td>
												</tr>
												<tr>
													<td>Phone Cell</td>
													<td>
														<input autocomplete="off" type="text" style="width:100px" id=buyNowForm("phonecell3") name="phonecell3"  onkeypress="mask(event,this)" maxlength="12"  onblur="onlyletters(this)">
													</td>
													<td rowspan=3><textarea rows="5" cols="15" onclick='javascript: this.value = ""'  id=buyNowForm("contactednotes3")  name="contactednotes3" placeholder="Contacted/Notes"></textarea></td>
												</tr>
												<tr>
													<td>Phone Home</td>
													<td>
														<input autocomplete="off" type="text" style="width:100px" id=buyNowForm("phonehome3") name="phonehome3"  onkeypress="mask(event,this)" maxlength="12"  onblur="onlyletters(this)">
													</td>
												</tr>
												<tr>
													<td>Phone Work</td>
													<td>
														<input autocomplete="off" type="text" style="width:100px" id=buyNowForm("phonework3") name="phonework3"  onkeypress="mask(event,this)" maxlength="12"  onblur="onlyletters(this)">
													</td>
												</tr>
											</table>
										</td>
										<td>
											<br>
												<table>
													<tr>
														<td><strong>Name</strong></td>
														<td colspan="2">
															<input autocomplete="off" type="text" style="width:100%" id=buyNowForm("applicantsmother4") name="applicantsmother4" onblur="if(onlyletters(this)==false)this.value=''">
														</td>
													</tr>
													<tr>
														<td>Address</td>
														<td colspan="2">
															<input autocomplete="off" type="text" style="width:100%" id=buyNowForm("address4") name="address4"  onblur="onlyletters(this)">
														</td>
													</tr>
													<tr>
														<td>City,state,Zip</td>
														<td colspan="2">
															<input autocomplete="off" type="text" style="width:100%" id=buyNowForm("citystatezip4") name="citystatezip4"  onblur="onlyletters(this)">
														</td>
													</tr>
													<tr>
														<td>Phone Cell</td>
														<td>
															<input autocomplete="off" type="text" style="width:100px" id=buyNowForm("phonecell4") name="phonecell4" onkeypress="mask(event,this)" maxlength="12"  onblur="onlyletters(this)">
														</td>
														<td rowspan=3><textarea rows="5" cols="15" onclick='javascript: this.value = ""'  id=buyNowForm("contactednotes4")  name="contactednotes4" placeholder="Contacted/Notes"></textarea>
														</td>
													</tr>
													<tr>
														<td>Phone Home</td>
														<td>
															<input autocomplete="off" type="text" style="width:100px" id=buyNowForm("phonehome4") name="phonehome4"onkeypress="mask(event,this)"  maxlength="12"  onblur="onlyletters(this)">
														</td>
													</tr>
													<tr>
														<td>Phone Work</td>
														<td>
															<input autocomplete="off" type="text" style="width:100px" id=buyNowForm("phonework4") name="phonework4" onkeypress="mask(event,this)"  maxlength="12" onblur="onlyletters(this)">
														</td>
													</tr>
												</table>
										</td>
									</tr>
									<tr>
										<td>
											<br>
											<table>
												<tr>
													<td><strong>Name</strong></td>
													<td colspan="2">
													<input autocomplete="off" type="text" style="width:100%" id=buyNowForm("applicantsmother5") name="applicantsmother5">
													</td>
												</tr>
												<tr>
													<td>Address</td>
													<td colspan="2">
													<input autocomplete="off" type="text" style="width:100%" id=buyNowForm("address5") name="address5">
													</td>
												</tr>
												<tr>
													<td>City,state,Zip</td>
													<td colspan="2">
													<input autocomplete="off" type="text" style="width:100%" id=buyNowForm("citystatezip5") name="citystatezip5">
													</td>
												</tr>
												<tr>
													<td>Phone Cell</td>
													<td>
													<input autocomplete="off" type="text" style="width:100px" id=buyNowForm("phonecell5") name="phonecell5" onkeypress="mask(event,this)"  maxlength="12">
													</td>
													<td rowspan=3><textarea rows="5" cols="15" onclick='javascript: this.value = ""'  id=buyNowForm("contactednotes5")  name="contactednotes5" placeholder="Contacted/Notes"></textarea></td>
												</tr>
												<tr>
													<td>Phone Home</td>
													<td>
													<input autocomplete="off" type="text" style="width:100px" id=buyNowForm("phonehome5") name="phonehome5"  onkeypress="mask(event,this)" maxlength="12">
													</td>
												</tr>
												<tr>
													<td>Phone Work</td>
													<td>
													<input autocomplete="off" type="text" style="width:100px" id=buyNowForm("phonework5") name="phonework5"  onkeypress="mask(event,this)" maxlength="12">
													</td>
												</tr>
											</table>
										</td>
										<td>
											<br>
											<table>
												<tr>
													<td><strong>Name</strong></td>
													<td colspan="2">
													<input autocomplete="off" type="text" style="width:100%" id=buyNowForm("applicantsmother6") name="applicantsmother6">
													</td>
												</tr>
												<tr>
													<td>Address</td>
													<td colspan="2">
													<input autocomplete="off" type="text" style="width:100%" id=buyNowForm("address6") name="address6">
													</td>
												</tr>
												<tr>
													<td>City,state,Zip</td>
													<td colspan="2">
													<input autocomplete="off" type="text" style="width:100%" id=buyNowForm("citystatezip6") name="citystatezip6">
													</td>
												</tr>
												<tr>
													<td>Phone Cell</td>
													<td>
													<input autocomplete="off" type="text" style="width:100px" id=buyNowForm("phonecell6") name="phonecell6"  onkeypress="mask(event,this)" maxlength="12">
													</td>
													<td rowspan=3><textarea rows="5" cols="15" onclick='javascript: this.value = ""'  id=buyNowForm("contactednotes6")  name="contactednotes6" placeholder="Contacted/Notes"></textarea></td>
												</tr>
												<tr>
													<td>Phone Home</td>
													<td>
													<input autocomplete="off" type="text" style="width:100px" id=buyNowForm("phonehome6") name="phonehome6" onkeypress="mask(event,this)"  maxlength="12">
													</td>
												</tr>
												<tr>
													<td>Phone Work</td>
													<td>
													<input autocomplete="off" type="text" style="width:100px" id=buyNowForm("phonework6") name="phonework6" onkeypress="mask(event,this)"  maxlength="12">
													</td>
												</tr>
											</table>
											<br>
										</td>
									</tr>
								</table>
								<br>
								<p align="left"><strong>Note :</strong>Please include full name, complete address and phone numbers.<br> These references are required to be living relatives at different addresses.</p>
							</div>
							<br>
						</div>
						<br>
						<center>
							<input type="Reset" Value="Reset" style="font-size:20px;width:200px"> 
							<input type="submit" Value="Submit" style="font-size:20px;width:200px;" onclick="return validateReferencesForm();">
						</center>
					</center>
				</form>
			</div>
			
			<br />
			
		</div>
	</div>
</center>
</body>

	<table id="calenderTable">
        <tbody id="calenderTableHead">
          <tr>
            <td colspan="3" align="left">
            <div class="dropdown_container">
	          <select onChange="showCalenderBody(createCalender(document.getElementById('selectYear').value,
	           this.selectedIndex, false));" id="selectMonth" class="my_dropdown">
	              <option value="0">Jan</option>
	              <option value="1">Feb</option>
	              <option value="2">Mar</option>
	              <option value="3">Apr</option>
	              <option value="4">May</option>
	              <option value="5">Jun</option>
	              <option value="6">Jul</option>
	              <option value="7">Aug</option>
	              <option value="8">Sep</option>
	              <option value="9">Oct</option>
	              <option value="10">Nov</option>
	              <option value="11">Dec</option>
	          </select>
	          </div>
            </td>
            <td colspan="3" align="left">
            <div class="dropdown_container">
			    <select onChange="showCalenderBody(createCalender(this.value, 
				document.getElementById('selectMonth').selectedIndex, false));" id="selectYear" class="my_dropdown">
				</select>
				</div>
			</td>
            <td align="center">
			    <a href="#" onClick="closeCalender();"><font color="#003333" size="+1">X</font></a>
			</td>
		  </tr>
       </tbody>
       <tbody id="calenderTableDays">
         <tr style="">
           <td>Sun</td><td>Mon</td><td>Tue</td><td>Wed</td><td>Thu</td><td>Fri</td><td>Sat</td>
         </tr>
       </tbody>
       <tbody id="calender"></tbody>
    </table>
"""))}
    }
    
    def render(buyNowForm:Form[BuyNowData]): play.api.templates.Html = apply(buyNowForm)
    
    def f:((Form[BuyNowData]) => play.api.templates.Html) = (buyNowForm) => apply(buyNowForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jan 28 20:45:00 CST 2014
                    SOURCE: C:/Users/Jason/Documents/buyNow-Prod/app/views/buyNowData.scala.html
                    HASH: 9c7ff6ab3c7093afa70e7102ae064a2ed7d1bc9a
                    MATRIX: 763->1|923->32|953->89|1108->209|1122->215|1188->259|1296->332|1310->338|1377->383|1440->410|1455->416|1515->454|1623->535|1651->536|1709->567|1737->568|1777->581|1805->582|1863->613|1891->614|2068->763|2097->764|2176->815|2205->816|2377->961|2405->962|2436->966|2464->967|2636->1112|2664->1113|2693->1115|2721->1116|2789->1156|2818->1157|3108->1420|3136->1421|3188->1446|3216->1447|3474->1678|3502->1679|3594->1743|3623->1744|3729->1823|3757->1824|3886->1926|3914->1927|3948->1934|3976->1935|4088->2020|4116->2021|4145->2023|4173->2024|4224->2047|4253->2048|4359->2127|4387->2128|4516->2230|4544->2231|4578->2238|4606->2239|4718->2324|4746->2325|4775->2327|4803->2328|4857->2354|4886->2355|4992->2434|5020->2435|5149->2537|5177->2538|5211->2545|5239->2546|5355->2635|5383->2636|5413->2638|5442->2639|5496->2664|5526->2665|5633->2744|5662->2745|5792->2847|5821->2848|5856->2855|5885->2856|5998->2941|6027->2942|6057->2944|6086->2945|6138->2968|6168->2969|6327->3100|6356->3101|6413->3130|6442->3131|6491->3152|6520->3153|6581->3186|6610->3187|6648->3197|6677->3198|6739->3232|6768->3233|6798->3235|6827->3236|6881->3262|6910->3263|6975->3299|7005->3300|7124->3390|7154->3391|7199->3407|7229->3408|7261->3412|7290->3413|7503->3598|7533->3599|7567->3605|7596->3606|7626->3608|7655->3609|7706->3632|7735->3633|7969->3839|7998->3840|8109->3923|8138->3924|8168->3926|8197->3927|8262->3964|8291->3965|8525->4171|8554->4172|8665->4255|8694->4256|8815->4349|8844->4350|8944->4422|8973->4423|9095->4517|9124->4518|9219->4585|9248->4586|9366->4676|9395->4677|9491->4745|9520->4746|9636->4834|9665->4835|9763->4905|9792->4906|9908->4994|9937->4995|10031->5061|10060->5062|10175->5149|10204->5150|10296->5214|10325->5215|10436->5298|10465->5299|10553->5359|10582->5360|10697->5447|10726->5448|10818->5512|10847->5513|10964->5602|10993->5603|11088->5670|11117->5671|11229->5755|11258->5756|11352->5822|11381->5823|11498->5912|11527->5913|11625->5983|11654->5984|11771->6073|11800->6074|11903->6149|11932->6150|12045->6235|12074->6236|12164->6298|12193->6299|12309->6387|12338->6388|12431->6453|12460->6454|12578->6544|12607->6545|12708->6618|12737->6619|12859->6713|12888->6714|12988->6786|13017->6787|13128->6870|13157->6871|13245->6931|13274->6932|13392->7022|13421->7023|13517->7091|13546->7092|13657->7175|13686->7176|13774->7236|13803->7237|13922->7328|13951->7329|14048->7398|14077->7399|14194->7488|14223->7489|14318->7556|14347->7557|14474->7656|14503->7657|14609->7735|14638->7736|14755->7825|14784->7826|14879->7893|14908->7894|15036->7994|15065->7995|15167->8069|15196->8070|15316->8162|15345->8163|15440->8230|15469->8231|15594->8328|15623->8329|15719->8397|15748->8398|15779->8401|15808->8402|15877->8443|15906->8444|16032->8542|16061->8543|16164->8618|16193->8619|16311->8709|16340->8710|16446->8788|16475->8789|16601->8887|16630->8888|16736->8966|16765->8967|16885->9059|16914->9060|17022->9140|17051->9141|17182->9244|17211->9245|17329->9335|17358->9336|17478->9428|17507->9429|17615->9509|17644->9510|17764->9602|17793->9603|17901->9683|17930->9684|18067->9793|18096->9794|18198->9868|18227->9869|18345->9959|18374->9960|18479->10037|18508->10038|18634->10136|18663->10137|18773->10219|18802->10220|18922->10312|18951->10313|19058->10392|19087->10393|19218->10496|19247->10497|19365->10587|19394->10588|19514->10680|19543->10681|19650->10760|19679->10761|19799->10853|19828->10854|19935->10933|19964->10934|20101->11043|20130->11044|20234->11120|20263->11121|20381->11211|20410->11212|20517->11291|20546->11292|20672->11390|20701->11391|20813->11475|20842->11476|20962->11568|20991->11569|21100->11650|21129->11651|21260->11754|21289->11755|21404->11842|21433->11843|21553->11935|21582->11936|21691->12017|21720->12018|21840->12110|21869->12111|21978->12192|22007->12193|22144->12302|22173->12303|22277->12379|22306->12380|22424->12470|22453->12471|22560->12550|22589->12551|22715->12649|22744->12650|22856->12734|22885->12735|23005->12827|23034->12828|23143->12909|23172->12910|23303->13013|23332->13014|23452->13106|23481->13107|23601->13199|23630->13200|23739->13281|23768->13282|23888->13374|23917->13375|24026->13456|24055->13457|24188->13562|24217->13563|24321->13639|24350->13640|24468->13730|24497->13731|24604->13810|24633->13811|24759->13909|24788->13910|24900->13994|24929->13995|25049->14087|25078->14088|25187->14169|25216->14170|25347->14273|25376->14274|25496->14366|25525->14367|25645->14459|25674->14460|25783->14541|25812->14542|25932->14634|25961->14635|26070->14716|26099->14717|26241->14831|26270->14832|26374->14908|26403->14909|26521->14999|26550->15000|26658->15080|26687->15081|26813->15179|26842->15180|26953->15263|26982->15264|27102->15356|27131->15357|27240->15438|27269->15439|27400->15542|27429->15543|27551->15637|27580->15638|27700->15730|27729->15731|27838->15812|27867->15813|27987->15905|28016->15906|28125->15987|28154->15988|28184->15990|28213->15991|28381->16122|28397->16128|28461->16169|29324->16995|29340->17001|29396->17034|30833->18434|30849->18440|30905->18473|31578->19109|31594->19115|31650->19148|34159->21620|34175->21626|34231->21659
                    LINES: 27->1|33->1|35->5|38->8|38->8|38->8|39->9|39->9|39->9|40->10|40->10|40->10|44->14|44->14|46->16|46->16|48->18|48->18|50->20|50->20|56->26|56->26|58->28|58->28|61->31|61->31|61->31|61->31|64->34|64->34|65->35|65->35|67->37|67->37|72->42|72->42|75->45|75->45|85->55|85->55|88->58|88->58|92->62|92->62|96->66|96->66|97->67|97->67|100->70|100->70|101->71|101->71|102->72|102->72|106->76|106->76|110->80|110->80|111->81|111->81|114->84|114->84|115->85|115->85|117->87|117->87|121->91|121->91|125->95|125->95|126->96|126->96|129->99|129->99|130->100|130->100|132->102|132->102|136->106|136->106|140->110|140->110|141->111|141->111|144->114|144->114|145->115|145->115|146->116|146->116|152->122|152->122|155->125|155->125|157->127|157->127|159->129|159->129|161->131|161->131|163->133|163->133|164->134|164->134|166->136|166->136|168->138|168->138|170->140|170->140|171->141|171->141|172->142|172->142|176->146|176->146|177->147|177->147|178->148|178->148|181->151|181->151|187->157|187->157|190->160|190->160|191->161|191->161|194->164|194->164|200->170|200->170|203->173|203->173|206->176|206->176|209->179|209->179|214->184|214->184|217->187|217->187|220->190|220->190|223->193|223->193|226->196|226->196|229->199|229->199|232->202|232->202|235->205|235->205|238->208|238->208|241->211|241->211|244->214|244->214|247->217|247->217|250->220|250->220|253->223|253->223|257->227|257->227|260->230|260->230|263->233|263->233|266->236|266->236|269->239|269->239|272->242|272->242|275->245|275->245|278->248|278->248|281->251|281->251|284->254|284->254|287->257|287->257|290->260|290->260|293->263|293->263|296->266|296->266|299->269|299->269|302->272|302->272|305->275|305->275|308->278|308->278|311->281|311->281|314->284|314->284|317->287|317->287|320->290|320->290|323->293|323->293|326->296|326->296|329->299|329->299|332->302|332->302|335->305|335->305|338->308|338->308|341->311|341->311|344->314|344->314|348->318|348->318|351->321|351->321|355->325|355->325|358->328|358->328|362->332|362->332|365->335|365->335|366->336|366->336|369->339|369->339|372->342|372->342|375->345|375->345|378->348|378->348|381->351|381->351|384->354|384->354|387->357|387->357|390->360|390->360|393->363|393->363|396->366|396->366|399->369|399->369|402->372|402->372|405->375|405->375|408->378|408->378|411->381|411->381|416->386|416->386|419->389|419->389|422->392|422->392|425->395|425->395|428->398|428->398|431->401|431->401|434->404|434->404|437->407|437->407|440->410|440->410|443->413|443->413|446->416|446->416|449->419|449->419|452->422|452->422|455->425|455->425|460->430|460->430|463->433|463->433|466->436|466->436|469->439|469->439|472->442|472->442|475->445|475->445|478->448|478->448|481->451|481->451|484->454|484->454|487->457|487->457|490->460|490->460|493->463|493->463|496->466|496->466|499->469|499->469|504->474|504->474|507->477|507->477|510->480|510->480|513->483|513->483|516->486|516->486|519->489|519->489|522->492|522->492|525->495|525->495|528->498|528->498|531->501|531->501|534->504|534->504|537->507|537->507|540->510|540->510|543->513|543->513|547->517|547->517|550->520|550->520|553->523|553->523|556->526|556->526|559->529|559->529|562->532|562->532|565->535|565->535|568->538|568->538|571->541|571->541|574->544|574->544|577->547|577->547|580->550|580->550|583->553|583->553|586->556|586->556|592->562|592->562|595->565|595->565|598->568|598->568|601->571|601->571|604->574|604->574|607->577|607->577|610->580|610->580|613->583|613->583|616->586|616->586|619->589|619->589|622->592|622->592|625->595|625->595|628->598|628->598|631->601|631->601|632->602|632->602|637->607|637->607|637->607|653->623|653->623|653->623|683->653|683->653|683->653|694->664|694->664|694->664|737->707|737->707|737->707
                    -- GENERATED --
                */
            