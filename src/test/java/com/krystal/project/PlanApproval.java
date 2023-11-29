package com.krystal.project;

import java.io.IOException;
import java.net.URL;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import io.appium.java_client.windows.WindowsDriver;
public class PlanApproval extends ReferencefileChemotheraphy{
	private PlanApprovalPOM plan;
	private Actions act;
	private WebElement field1;
	private WebElement Patientposition;

	@BeforeClass
	public void setUp1()  throws InterruptedException, IOException {
	DesiredCapabilities appCapabilities = new DesiredCapabilities();
	appCapabilities.setCapability("app", "C:\\Program Files\\Panacea Medical Technologies\\Krystal\\Krystal.exe");
	driver = new WindowsDriver<WebElement>(new URL("http://127.0.0.1:4723"), appCapabilities);
	ReferenceSigin Sign=new ReferenceSigin();
	Sign.PlanApproval(driver);
	plan=new PlanApprovalPOM(driver);
	act=new Actions(driver);
	}



	
	@Test(priority =0)
	public void ToverifyplanapprovalLabel() throws IOException , IOException 
	{
	test=extent.createTest(guiTestCaseName()+ "To verify Plan Approval label","Plan Approval label should be present ");	
	demo.Textcomparsion(plan.planapproval, "Plan Approval", test,driver);
	}

@Test(priority =1)

	public void ToverifyimporqaLabel() throws IOException , IOException {
	test=extent.createTest(guiTestCaseName()+"To verify Import QA Plan label "," Import QA Plan label should be present ");	
	demo.Textcomparsion(plan.importqa, "IMPORT QA PLAN", test,driver);
	}

@Test(priority =2)

public void ToverifyimportrtplanLabel() throws IOException , IOException {
test=extent.createTest(guiTestCaseName()+"To verify Import RT Plan label "," Import RT Plan label should be present ");	
demo.Textcomparsion(plan.importrt, "IMPORT RT PLAN", test,driver);
}



WebElement createplan;
@Test(priority =3)
	public void ToverifycreateplanLabel() throws IOException , IOException {
	test=extent.createTest(guiTestCaseName()+" To verify create plan label "," Create plan label should be present ");	
	demo.Textcomparsion(plan.createPlan, "CREATE PLAN", test,driver);
	
	}

@Test(priority =4)
public void ToverifyselecttolerancetableLabel() throws IOException , InterruptedException {
	plan.createPlan.click();
	Thread.sleep(1000);
test=extent.createTest(guiTestCaseName()+" To verify select tolerance table label "," select tolerance table label should be present ");	
demo.Textcomparsion(plan.toltable, "Select Tolerance Table", test,driver);
}

@Test(priority =5)
public void ToverifytolerancetableLabel() throws IOException , IOException {
test=extent.createTest(guiTestCaseName()+" To verify tolerance table name label ","  tolerance table name label should be present ");	
demo.Textcomparsion(plan.toltablename, "Tolerance Table Name", test,driver);

}
@Test(priority =6)
public void ToverifytolerancetablenumberLabel() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify tolerance table number label ","  tolerance table number label should be present ");	
demo.Textcomparsion(plan.toltablenum, "Tolerance Table Number", test,driver);

}
@Test(priority =7)
public void ToverifytolerancetablenumberreadLabel() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify tolerance table number read label ","  tolerance table number read label should be present ");	
demo.Textcomparsion(plan.tolerancenumberread, "4", test,driver);

}
//@Test(priority =8)
public void ToverifytolerancetabledropdownLabel() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify tolerance table dropwdown label ","  tableone  dropdown should be present ");	
//demo.Textcomparsion(plan.tabledropdown, "tableone", test,driver);

}
@Test(priority =9)
public void ToverifyattributesLabel() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify attributes label "," Attributes label should be present ");	
demo.Textcomparsion(plan.attributes, "Attributes", test,driver);

}
@Test(priority =10)
public void ToverifytolerancesLabel() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify tolerances label "," Tolerances label should be present ");	
demo.Textcomparsion(plan.tol1, "Tolerances", test,driver);

}

@Test(priority =11)
public void ToverifygantryangleLabel() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify gantry angle label "," gantry angle label should be present ");	
demo.Textcomparsion(plan.ganangle, "Gantry Angle", test,driver);
}
@Test(priority =12)
public void ToverifygantryangleReadLabel() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify gantry angle tolerances label "," gantry angle tolerance label should be present ");	
demo.Textcomparsion(plan.ganangleread, "1", test,driver);
}
@Test(priority =13)
public void ToverifybeamlimitingdeviceangleLabel() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify beam limiting device angle label "," beam limiting device angle label should be present ");	
demo.Textcomparsion(plan.beamlimiting, "Beam Limiting Device Angle", test,driver);
}
@Test(priority =14)
public void ToverifybeamlimitingdeviceanglereadLabel() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify beam limiting device angle tolerance label "," beam limiting device angle tolerance label should be present ");	
demo.Textcomparsion(plan.beamlimitingread, "1", test,driver);
}
@Test(priority =15)
public void ToverifybeamlimitingdevicepositionasymxLabel() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify beam limiting device position ASYMX label "," beam limiting device position ASYMX label should be present ");	
demo.Textcomparsion(plan.beamasyx, "Beam Limiting Device Position ASYMX", test,driver);
}
@Test(priority =16)
public void ToverifybeamlimitingdevicepositionasymxtoleranceLabel() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify beam limiting device position ASYMX tolerance label "," beam limiting device position ASYMX tolerance label should be present ");	
demo.Textcomparsion(plan.beamasyxread, "1", test,driver);
}
@Test(priority =17)
public void ToverifybeamlimitingdevicepositionasymyLabel() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify beam limiting device position ASYMY label "," beam limiting device position ASYMY label should be present ");	
demo.Textcomparsion(plan. asyy, "Beam Limiting Device Position ASYMY", test,driver);
}
@Test(priority =18)
public void ToverifybeamlimitingdevicepositionasymytoleranceLabel() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify beam limiting device position ASYMY tolerance label "," beam limiting device position ASYMY tolearnce label should be present ");	
demo.Textcomparsion(plan.asyyread, "1", test,driver);
}
@Test(priority =19)
public void ToverifybeamlimitingdevicepositionmlcxLabel() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify beam limiting device position MLCX label "," beam limiting device position MLCX label should be present ");	
demo.Textcomparsion(plan.mlcx, "Beam Limiting Device Position MLCX", test,driver);
}
@Test(priority =20)
public void ToverifybeamlimitingdevicepositionmlcxtoleranceLabel() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify beam limiting device position MLCX tolerance label "," beam limiting device position MLCX tolearnce label should be present ");	
demo.Textcomparsion(plan.mlcxread, "1", test,driver);
}
@Test(priority =21)
public void ToverifybeamlimitingdevicepositionmlcyLabel() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify beam limiting device position MLCY label "," beam limiting device position MLCY label should be present ");	
demo.Textcomparsion(plan.mlcy, "Beam Limiting Device Position MLCY", test,driver);
}
@Test(priority =22)
public void ToverifybeamlimitingdevicepositionmlcytoleranceLabel() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify beam limiting device position MLCY tolerance label "," beam limiting device position MLCY tolerance label should be present ");	
demo.Textcomparsion(plan.mlcyread, "1", test,driver);
}
@Test(priority =23)
public void ToverifypatientsupportangleLabel() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify patient support angle label "," patient support angle label should be present ");	
demo.Textcomparsion(plan.patientsupport, "Patient Support Angle", test,driver);
}
@Test(priority =24)
public void ToverifypatientsupportangletoleranceLabel() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify patient support angle tolerance label "," patient support angle tolerance label should be present ");	
demo.Textcomparsion(plan.patientangleread, "1", test,driver);
}
@Test(priority =25)
public void ToverifytabletoplongitudinalpositionLabel() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify table top longitudinal position label "," table top longitudinal label should be present ");	
demo.Textcomparsion(plan.longposition, "Table Top Longitudinal Position", test,driver);
}
@Test(priority =26)
public void ToverifytabletoplongitudinalpositiontoleranceLabel() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify table top longitudinal position tolerance label "," table top longitudinal label tolerance should be present ");	
demo.Textcomparsion(plan.readlong, "1", test,driver);
}
@Test(priority =27)
public void ToverifytabletoplateralpositionLabel() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify table top lateral position  label "," table top lateral position label  should be present ");	
demo.Textcomparsion(plan.latposition, "Table Top Lateral Position", test,driver);
}
@Test(priority =28)
public void ToverifytabletoplateralpositiontoleranceLabel() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify table top lateral position tolerance label "," table top lateral label tolerance should be present ");	
demo.Textcomparsion(plan.latread, "1", test,driver);
}
@Test(priority =29)
public void ToverifytabletopverticalpositiontLabel() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify table top vertical position label "," table top vertical position label  should be present ");	
demo.Textcomparsion(plan.vertical, "Table Top Vertical Position", test,driver);
}
@Test(priority =30)
public void ToverifytabletopverticalpositiontolerancetLabel() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify table top vertical position tolerance label "," table top vertical position tolearnce label  should be present ");	
demo.Textcomparsion(plan.readvertical, "1", test,driver);
}
@Test(priority =31)
public void ToverifytabletoppitchangletLabel() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify table top pitch angle  label "," table top pitch angle label  should be present ");	
demo.Textcomparsion(plan.pitch, "Table Top Pitch Angle", test,driver);
}
@Test(priority =32)
public void ToverifytabletoppitchangletolerancetLabel() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify table top pitch angle tolerance  label "," table top pitch angle tolerance label  should be present ");	
demo.Textcomparsion(plan.readpitch, "1", test,driver);
}
@Test(priority =33)
public void ToverifytabletoprollangleLabel() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify table top roll angle  label "," table top roll angle label  should be present ");	
demo.Textcomparsion(plan.roll, "Table Top Roll Angle", test,driver);
}
@Test(priority =34)
public void ToverifytabletoprollangletolerancetLabel() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify table top roll angle tolerance  label "," table top roll angle tolerance label  should be present ");	
demo.Textcomparsion(plan.rollread, "1", test,driver);
}

WebElement confirmbtm;
private WebElement energy1;
private WebElement Patientposition1;
private WebElement field11;

@Test(priority =36)
public void ToverifyclosebuttonLabel() throws IOException , IOException {
test=extent.createTest(guiTestCaseName()+" To verify close button label ","Close button label  should be present ");	
demo.Textcomparsion(plan.CLOSE, "CLOSE", test,driver);
}
@Test(priority =37)
public void ToverifyconfirmLabel() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify confirm label ","confirm label  should be present ");	
demo.Textcomparsion(plan.confirmbtm, "CONFIRM", test,driver);
}


@Test(priority =38)
public void ToverifyalllinearmotionsareincmandrotationalmotionsareindegreesLabel() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify all linear motions are in cm and rotational motions are in degrees label ","all linear motions are in cm and rotational motions are in degrees label  should be present ");	
demo.Textcomparsion(plan.close, "*All Linear Motions are in cm and Rotational Motions are in degrees", test,driver);
}




@Test(priority =39)
public void ToverifyplandetailssLabel() throws IOException , InterruptedException {
	plan.confirmbtm.click();
	Thread.sleep(1000);
test=extent.createTest(guiTestCaseName()+" To verify the plan details label ","plan details label  should be present ");	
demo.Textcomparsion(plan.plandetails, "Plan Details", test,driver);
}

@Test(priority =40)
public void ToverifyplannameLabel() throws IOException , InterruptedException {
test=extent.createTest(guiTestCaseName()+" To verify the plan name label ","plan name label  should be present ");	
demo.Textcomparsion(plan.planname, "Plan Name", test,driver);

}

@Test(priority =41)
public void ToverifyplannedbyLabel() throws IOException {
test=extent.createTest(guiTestCaseName()+"  To verify the planned by label ","planedby label  should be present ");	
demo.Textcomparsion(plan.plannedby, "Planned By", test,driver);
}
@Test(priority =42)
public void ToverifytreatmentmachineLabel() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify the treatment machine label ","treatment machine label  should be present ");	
demo.Textcomparsion(plan.treatmentmachine, "Treatment Machine", test,driver);
}
@Test(priority =43)
public void ToverifyplandescriptionLabel() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify the plan description label ","plan description label  should be present ");	
demo.Textcomparsion(plan.description, "Plan Description", test,driver);
}

@Test(priority =44)
public void ToverifypatientpositionLabel() throws IOException , InterruptedException {
test=extent.createTest(guiTestCaseName()+" To verify the patient position label ","patient position label  should be present ");	
act.moveToElement(Patientposition).moveByOffset(-65, -13).perform();
Thread.sleep(3500);
demo.Textcomparsion(plan.position, "Patient Position", test,driver);
}
@Test(priority =45)
public void ToverifynumberoffractionsLabel() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify the number of fractions label ","Number of fractions label  should be present ");	
demo.Textcomparsion(plan.frac, "Number of Fractions", test,driver);
}
@Test(priority =46)
public void ToverifyenergyMeVLabel() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify the Energy(MeV) label ","Energy(MeV) label  should be present ");	
demo.Textcomparsion(plan.energy, "Energy (MV)", test,driver);
}
@Test(priority =47)
public void ToverifyradiationtypeLabel() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify the radiation type label ","Radiation type label  should be present ");	
demo.Textcomparsion(plan.energy1, "Radiation Type", test,driver);
}
@Test(priority =48)
public void ToverifybeamsequenceLabel() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify the beam sequence label ","beam sequence label  should be present ");	
demo.Textcomparsion(plan.sequence, "Beam Sequence", test,driver);
}
@Test(priority =49)
public void ToverifyaddbeamLabel() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify the add beam  label ","Add beam label  should be present ");	
demo.Textcomparsion(plan.addbeam, "Add Beam", test,driver);
}
@Test(priority =50)
public void ToverifybeamnameLabel() throws IOException , InterruptedException {
test=extent.createTest(guiTestCaseName()+" To verify the beam name label "," beam name label  should be present ");	
demo.Textcomparsion(plan.name, "Beam Name", test,driver);


}
@Test(priority =51)
public void ToverifygantryangledegLabel() throws IOException , InterruptedException {
test=extent.createTest(guiTestCaseName()+" To verify the gantry angle(deg) label "," gantry angle(deg) label  should be present ");	
demo.Textcomparsion(plan.gandegree, "Gantry Angle(deg)", test,driver);
Thread.sleep(500);

}
@Test(priority =52)
public void ToverifycollimatorangledegLabel() throws IOException , InterruptedException {
test=extent.createTest(guiTestCaseName()+" To verify the collimator angle(deg) label "," collimator angle(deg) label  should be present ");	
demo.Textcomparsion(plan.collidegree, "Collimator Angle(deg)", test,driver);
}

@Test(priority =53)
public void ToverifytreatmenttimeminLabel() throws IOException , InterruptedException {
test=extent.createTest(guiTestCaseName()+" To verify the treatment time(MINUTE) label "," treatment time(MINUTE) label  should be present ");	
demo.Textcomparsion(plan.time, "Treatment Time (MINUTE)", test,driver);


}
@Test(priority =54)
public void ToverifyfieldtypeLabel() throws IOException , InterruptedException {
test=extent.createTest(guiTestCaseName()+" To verify the field type label "," field type label  should be present ");	

act.moveToElement(field1).moveByOffset(-65, -13).perform();
Thread.sleep(3000);
demo.Textcomparsion(plan.field, "Field Type", test,driver);
}
@Test(priority =55)
public void ToverifybolusLabel() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify the bolus(cm) label "," bolus(cm) label  should be present ");	//13index is for bplus
demo.Textcomparsion(plan.bolus, "Bolus (cm)", test,driver);
}
@Test(priority =56)
public void ToverifyfxcmLabel() throws IOException , InterruptedException {
test=extent.createTest(guiTestCaseName()+" To verify the FX(cm)[Min:0,Max:30] label "," FX(cm)[Min:0,Max:20] label  should be present ");	
demo.Textcomparsion(plan.fxcm, "FX(cm) [Min:0,Max:30]", test,driver);


}
@Test(priority =57)
public void ToverifyfycmLabel() throws IOException , InterruptedException {
	
test=extent.createTest(guiTestCaseName()+" To verify the FY(cm)[Min:0,Max:20] label "," FY(cm)[Min:0,Max:20] label  should be present ");	
demo.Textcomparsion(plan.fycm, "FY(cm) [Min:0,Max:30]", test,driver);
}

@Test(priority =58)
public void ToverifyDoseLabel() throws IOException , InterruptedException {
	
test=extent.createTest(guiTestCaseName()+" To verify the Dose label "," Dose label  should be present ");	
demo.Textcomparsion(plan.dose, "Dose (MU)", test,driver);
}


@Test(priority =59)
public void ToverifyDoserateLabel() throws IOException , InterruptedException {
	
test=extent.createTest(guiTestCaseName()+" To verify the Dose Rate  label "," Dose Rate label  should be present ");	
demo.Textcomparsion(plan.doserate1, "Dose Rate(MU/MINUTE)", test,driver);
}

@Test(priority =59)
public void ToverifyfilterttypeLabel() throws IOException , InterruptedException {
	
test=extent.createTest(guiTestCaseName()+" To verify the Filter Type  label "," Filter Type label  should be present ");	
demo.Textcomparsion(plan.filter, "Filter Type", test,driver);
}




WebElement fieldtype;
String[] fieldtypes = { "Symmetric", "Asymmetric", "Configured Field"/*,"MLC Shaper" */};
private WebElement fieldName;
private WebElement Wedgetype;
private WebElement wedgeid;
private WebElement addbeam1;
private WebElement fxcm;
private WebElement fractiongroup;



//@Test(priority =58)
public void ToverifyX1jawLabel() throws IOException , InterruptedException {
	
test=extent.createTest(guiTestCaseName()+" To verify the FX1(cm)[Min:0,Max:20] label "," FX1(cm)[Min:0,Max:20] label  should be present ");	
Thread.sleep(1000);
demo.Textcomparsion(plan.x1, "FX1(cm) [Min:-15, Max:7.5]", test,driver);
}

//@Test(priority =59)
public void ToverifyX2jawLabel() throws IOException , InterruptedException {
	
test=extent.createTest(guiTestCaseName()+" To verify the FX2(cm)[Min:0,Max:20] label "," FX2(cm)[Min:0,Max:20] label  should be present ");	
demo.Textcomparsion(plan.x2, "FX2(cm) [Min:-6, Max:10]", test,driver);
}
//@Test(priority =60)
public void ToverifyY1jawLabel() throws IOException , InterruptedException {	
test=extent.createTest(guiTestCaseName()+" To verify the FY1(cm)[Min:0,Max:20] label "," FY1(cm)[Min:0,Max:20] label  should be present ");	
demo.Textcomparsion(plan.y1, "FY1(cm) [Min:-14, Max:0]", test,driver);
}
//@Test(priority =61)
public void ToverifyY2jawLabel() throws IOException , InterruptedException {	
test=extent.createTest(guiTestCaseName()+" To verify the FY2(cm)[Min:0,Max:20] label "," FY2(cm)[Min:0,Max:20] label  should be present ");	
demo.Textcomparsion(plan.y2, "FY2(cm) [Min:0, Max:14]", test,driver);
}

//@Test(priority =62)
public void ToverifyFieldnameLabel() throws IOException , InterruptedException {
	
test=extent.createTest(guiTestCaseName()+" To verify the FieldName label ","FieldName label  should be present ");	
act.moveToElement(fieldName).moveByOffset(-65, -13).perform();
Thread.sleep(4000);
demo.Textcomparsion(plan.FieldNme, "FY2(cm) [Min:0, Max:14]", test,driver);
}


//@Test(priority =63)
public void ToverifywedgetypeLabel() throws IOException , InterruptedException {
test=extent.createTest(guiTestCaseName()+" To verify the wedge type label "," wedge type label should be present ");	
act.moveToElement(Wedgetype).moveByOffset(-65, -13).perform();
Thread.sleep(3000);
demo.Textcomparsion(plan.wedgetype, "Wedge Type", test,driver);
}

//@Test(priority =64)
public void ToverifywedgeidLabel() throws IOException , InterruptedException {
test=extent.createTest(guiTestCaseName()+" To verify the wedge ID type label "," wedge ID type label should be present ");	
act.moveToElement(wedgeid).moveByOffset(-65, -13).perform();
Thread.sleep(4000);
demo.Textcomparsion(plan.wedgeid1, "Wedge ID", test,driver);
}
//@Test(priority =65)
public void ToverifyisowedgetimeLabel() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify the iso wedge time(MINUTE) type label "," iso wedge time(MINUTE) label should be present ");//	index 21 is isowedge
demo.Textcomparsion(plan.isotime, "Iso Wedge Time (MINUTE)", test,driver);
}
//@Test(priority =66)
public void ToverifyaddbeamLabel1() throws InterruptedException, IOException {
test=extent.createTest(guiTestCaseName()+" To verify the add beam label "," Add Beam label should be present ");	
demo.Textcomparsion(plan.addbeam1, "ADD BEAM", test,driver);
addbeam1.click();
Thread.sleep(1000);
}
//@Test(priority =62)
public void ToverifyrefreshLabel() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify the refresh label "," Refresh label should be present ");	
demo.Textcomparsion(plan.refresh1, "Refresh", test,driver);
}



//@Test(priority =67)
public void ToverifyCcreateplanLabel() throws IOException , InterruptedException {
test=extent.createTest(guiTestCaseName()+" To verify the create plan label "," create plan label should be present ");	
demo.Textcomparsion(plan.createplan1, "CREATE PLAN", test,driver);
plan.createplan1.click();
 Thread.sleep(2000);
}

//@Test(priority =68)
public void ToverifyplandetailsLabel() throws IOException , InterruptedException {
	 Thread.sleep(20000);
test=extent.createTest(guiTestCaseName()+" To verify plan details label "," plan details label should be present ");	
demo.Textcomparsion(plan.plandetails, "PLAN DETAILS", test,driver); 

}
//@Test(priority =69)
public void ToverifytargetprescriptiondoseLabel() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify target prescription dose (cGy) label "," target Prescription dose(cGy) label should be present ");	
demo.Textcomparsion(plan.targetdose, "Target Prescription Dose(cGy)", test,driver);

}
 //@Test(priority =70)
public void ToverifytargetprescriptiondosetextLabel() throws IOException , InterruptedException {
	Thread.sleep(10000);
test=extent.createTest(guiTestCaseName()+" To verify target prescription dose (cGy) Readonly data ","500 should be present ");	
//demo.Textcomparsion(plan.targetprescriptiontext, "500", test,driver);
}


//@Test(priority =71)
public void ToverifynumberoffrcationgroupsLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" To verify number of fraction groups label "," Number of frcation groups label should be present ");	
demo.Textcomparsion(plan.fractiongroup, "Number of Fraction Groups", test,driver);

}
//@Test(priority =72)
public void ToverifynumberoffrcationgroupstextLabel() throws IOException {
test=extent.createTest(guiTestCaseName()+"To verify number of fraction groups text label "," 1 should be present ");	
//demo.Textcomparsion(plan.fractiontext, "1", test,driver);

}
@Test(priority =73)
public void ToverifynumberoffrcationpllannedLabel() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify number of fraction planned label "," Number of frcations planned label should be present ");	
demo.Textcomparsion(plan.fractionplanned, "Number of fractions planned", test,driver);
}
//@Test(priority =74)
public void ToverifynumberoffrcationpllannedtextLabel() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify number of fraction planned Readonly data "," 4 should be present ");	
//demo.Textcomparsion(plan.fractiongrouptext, "4", test,driver);
}
@Test(priority =75)
public void ToverifynumberofbeamsLabel() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify number of beams label "," Number of beams label should be present ");	
demo.Textcomparsion(plan.beams, "Number of beams", test,driver);
}
//@Test(priority =76)
public void ToverifynumberofbeamstextLabel() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify number of beams Readonly data ","1 should be present ");	
//demo.Textcomparsion(plan.beamstext, "1", test,driver);
}
//@Test(priority =77)
public void ToverifybeamparametersLabel() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify bram parameters label "," beam parameters label should be present ");	
demo.Textcomparsion(plan.beamparameter, "BEAM PARAMETERS", test,driver);
}
//@Test(priority =78)
public void ToverifygantryLabel() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify gantry label "," gantry label should be present ");	
demo.Textcomparsion(plan.gantry, "GANTRY", test,driver);
}
//@Test(priority =79)
public void ToverifybevLabel() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify BEV label "," BEV label should be present ");	
demo.Textcomparsion(plan.bev, "BEV", test,driver);
}
//@Test(priority =96)
public void ToverifyfluencymapLabel() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify fluency map label "," fluency map label should be present ");	
demo.Textcomparsion(plan.fluence, "FLUENCE MAP", test,driver);
}
//@Test(priority =96)
public void ToverifydoserateLabel() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify dose rate label "," dose rate label should be present ");	
demo.Textcomparsion(plan.doserate, "DOSE RATE", test,driver);
}
//@Test(priority =98)
public void ToverifydoserateminLabel() throws IOException {
test=extent.createTest(guiTestCaseName()+"To verify dose(Gy/mim) label "," dose(Gy/mim) label should be present ");	
//demo.Textcomparsion(plan.dosemin, "Dose (Gy/min)", test,driver);
}
//@Test(priority =99)
public void ToverifycontrolpointindexLabel() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify control point index label "," control point index label should be present ");	
demo.Textcomparsion(plan.control, "Control Point Index", test,driver);
}



//@Test(priority =80)
public void ToverifyBeamnumberLabel() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify number of beams label ","Beam Number label should be present ");	
demo.Textcomparsion(plan.beamnum, "Beam Number", test,driver);
}
//@Test(priority =81)
public void ToverifyBeamnumberLabeltxt() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify Beam Number Readonly data ","1 should be present ");	
//demo.Textcomparsion(plan.beamsnotext, "1", test,driver);
}


//@Test(priority =82)
public void ToverifyBeamnameLabel() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify Beam Name label "," Beam Name label should be present ");	
demo.Textcomparsion(plan.beamname, "Beam Name", test,driver);
}
//@Test(priority =83)
public void ToverifyBeamnametxt() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify number of beams Readonly data ","18 should be present ");	
//demo.Textcomparsion(plan.beamstext, "18", test,driver);
}


//@Test(priority =84)
public void ToverifyBeamtypeLabel() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify Beam Name label "," Beam Type label should be present ");	
demo.Textcomparsion(plan.beamtype, "Beam Type", test,driver);
}
//@Test(priority =85)
public void ToverifyBeamtypeLabeltxt() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify Beam Type Readonly data ","STATIC should be present ");	
demo.Textcomparsion(plan.stat, "STATIC", test,driver);
}


//@Test(priority =86)
public void ToverifyRADIATIONtypeLabel() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify Radiation Type label "," Radiation Type label should be present ");	
demo.Textcomparsion(plan.radtype, "Radiation Type", test,driver);
}
//@Test(priority =87)
public void ToverifyRADIATIONtypeLabelTXT() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify Radiation Type Readonly data ","PHOTON should be present ");	
demo.Textcomparsion(plan.photon, "PHOTON", test,driver);
}


//@Test(priority =88)
public void ToverifyBeamDoseGyLabel() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify Beam Dose (Gy) label "," Beam Dose (Gy) label should be present ");	
demo.Textcomparsion(plan.beamdose, "Beam Dose (Gy)", test,driver);
}
//@Test(priority =89)
public void ToverifyBeamDoseGytxt() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify Beam Dose (Gy) Readonly data ","5 should be present ");	
//demo.Textcomparsion(plan.beamsTYPEtext, "5", test,driver);

}


//@Test(priority =90)
public void ToverifyBeamMeterSetMINUTELabel() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify Beam MeterSet (MINUTE) label "," Beam MeterSet (MINUTE) label should be present ");	
demo.Textcomparsion(plan.beammeter, "Beam MeterSet (MINUTE)", test,driver);
}
//@Test(priority =91)
public void ToverifyBeamMeterSetMINUTEtxt() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify Beam MeterSet (MINUTE) Readonly data ","5.00 should be present ");	
//demo.Textcomparsion(plan.beamsTYPEtext, "1.00", test,driver);

}

//@Test(priority =92)
public void ToverifyWedgeTypeLabel() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify Wedge Type label "," Wedge Type label should be present ");	
demo.Textcomparsion(plan.wedge, "Wedge Type", test,driver);
}
//@Test(priority =93)
public void ToverifyWedgeTypeLabeltxt() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify Wedge Type Readonly data ","MOTORIZED should be present ");	
//demo.Textcomparsion(plan.beamsTYPEtext, "MOTORIZED", test,driver);

}
//@Test(priority =94)
public void ToverifyIsoWedgeTimeMINUTELabel() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify Iso Wedge Time (MINUTE) label "," Iso Wedge Time (MINUTE) label should be present ");	
demo.Textcomparsion(plan.isowedge, "Iso Wedge Time (MINUTE)", test,driver);
}
//@Test(priority =95)
public void ToverifyIsoWedgeTimeMINUTETXT() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify Iso Wedge Time (MINUTE) Readonly data ","0.00 should be present ");	
//demo.Textcomparsion(plan.beamsTYPEtext, "0.00", test,driver);

}
//@Test(priority =94)
public void ToverifyfractiongroupLLabel() throws IOException , InterruptedException {
test=extent.createTest(guiTestCaseName()+" To verify Fraction Group dropdown label "," Fraction Group label should be present ");	
act.moveToElement(fractiongroup).moveByOffset(-10, -20).perform();
Thread.sleep(4000);
demo.Textcomparsion(plan.fractiong, "Fraction Group", test,driver);



}

//@Test(priority =95)
public void Toverifyfractiongrouptxt() throws IOException {
test=extent.createTest(guiTestCaseName()+" To verify Fraction Group dropdown Readonly data ","Fraction Group 1 should be present ");	
//demo.Textcomparsion(plan.beamsTYPEtext, "Fraction Group 1", test,driver);

}



@AfterSuite
public void tearDown() {
	extent.flush();
}
	




}










		
		
		
		
		
		
		
		
		
		
		
		
		
		
