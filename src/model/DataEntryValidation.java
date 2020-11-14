package model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataEntryValidation {
	public static boolean checkEmptyFields(String cName, String date, String xThPerc, String xIIthPerc,
			String BEMinPerc, String MaxDeadBacks, String MaxLiveBacks, String ctc) {
		if (cName.isEmpty() || date.isEmpty() || xThPerc.isEmpty() || xIIthPerc.isEmpty() || BEMinPerc.isEmpty()
				|| MaxDeadBacks.isEmpty() || MaxLiveBacks.isEmpty() || ctc.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean checkEmptyFields(String fname, String lname, String masterSerNum, String email, String branch,
			String college) {
		if (fname.isEmpty() || lname.isEmpty() || masterSerNum.isEmpty() || email.isEmpty() || branch.isEmpty()) {
			return true;
		} else
			return false;
	}
	
	public static boolean checkEmptyFields(String fname, String lname, String email, String branch,
			String college) {
		if (fname.isEmpty() || lname.isEmpty() || email.isEmpty() || branch.isEmpty()) {
			return true;
		} else
			return false;
	}
	
	public static boolean checkLoginCred(String uname, String pwd) {
		if(uname.isEmpty() || pwd.isEmpty())
			return true;
		else
			return false;
	}
	
	public static boolean checkMsnLoginNumber(String msn) {
		try
        {
            Integer.parseInt(msn);
        }
        catch(NumberFormatException ex)
        {
            return true;
        }
        return false;
	}
	
	public static boolean checkEmailRegex(String email) {
		String EmailRegex = "^(.+)@(.+)$";
		Pattern patt = Pattern.compile(EmailRegex);
		Matcher match = patt.matcher(email);
		if(match.matches())
			return true;
		else
			return false;
	}
	
	public static boolean checkpercFields(int XthPer, int XIIthPer, int BEPer) {
		if(XthPer > 100 || XIIthPer > 100 || BEPer > 100)
			return false;
		if(XthPer < 55 || XIIthPer < 55 || BEPer < 55 )
			return false;
		else
			return true;
	}
	
	public static boolean checkBacklogField(int deadBack, int liveBack) {
		if(deadBack > 5 || liveBack > 5)
			return false;
		if(deadBack < 0 || liveBack < 0)
			return false;
		else
			return true;
	}
}
