package com.sikkabell.dp.factory;

import java.util.ArrayList;
import java.util.List;

public class TestFactory {
	static List<Employee> list = null;
	static {
		list = new ArrayList<>();
		list.add(new Employee(101, "Mack", 9898787690l, "WhatsApp"));
		list.add(new Employee(102, "Jhon", 9898787690l, "Facebook"));
		list.add(new Employee(103, "Sam", 9898787690l, "WhatsApp"));
		list.add(new Employee(104, "Pitter", 9898787690l, "Facebook"));
		
		
		
	}

	public static void main(String[] args) {
		list.stream().forEach(s->{
			IMessage msg = MessageFactory.create(s.getMsgType());
			msg.send();
		});

	}
}
