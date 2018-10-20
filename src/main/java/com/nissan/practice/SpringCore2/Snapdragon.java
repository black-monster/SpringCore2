package com.nissan.practice.SpringCore2;

import org.springframework.stereotype.Component;

@Component
public class Snapdragon implements IMobileProcessor{

		public void process() {
			System.out.println("World best CPU");
		}
}
