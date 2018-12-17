package org.redhat.alertservice;

public class AlertMessage {

	public static String enumSwitch(Types alertType) {

		String messageBody = "";

		switch (alertType) {

		case ACCIDENT:
			messageBody = " This service will alert to accident infromation can be used by traffic police department to inform about accident ";
			break;
		case ADVERTISEMENT:
			messageBody = "  Alert message about advertisement";
			break;
		case APPOINTMENT:
			messageBody = "  Alert message about appointment schedule";
			break;
		case MAILBOX:
			messageBody = "  Alert message about delievry or mail box ";
			break;
		case TRANSACTION:
			messageBody = "  Alert message about transaction";
			break;
		case WEATHER:
			messageBody = " This will alert about weather condition specfice to user address ";
			break;
		default:
			messageBody = " Service alert message ";
			break;

		}
		return messageBody;

	}
}
