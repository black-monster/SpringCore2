package com.nissan.practice.SpringCore2;

import org.springframework.stereotype.Component;

@Component
public class Mediatek implements IMobileProcessor{
	public void process() {
		System.out.println("2nd best cpu");
	}
}
