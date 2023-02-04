package com.sikkabell.dp.factory;

public class MessageFactory {

	public static IMessage create(String msgType) {
		if (msgType.equalsIgnoreCase("WhatsApp")) {
			return new WhatsAppImpl();
		} else if (msgType.equalsIgnoreCase("Facebook")) {
			return new FacebookImpl();
		} else {
			return null;
		}

	}
}
