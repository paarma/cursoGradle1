package co.ceiba.service;

public class EmailService {
	
	public String sendMail(String message){
		try {
			return "Email send succesful with message: "+ message;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
