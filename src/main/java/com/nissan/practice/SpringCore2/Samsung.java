package com.nissan.practice.SpringCore2;

import org.springframework.beans.factory.annotation.Autowired;

public class Samsung {

	
	@Autowired 
	IMobileProcessor cpu;
	
	public IMobileProcessor getCpu() {
		return cpu;
	}
	
	public void setCpu(IMobileProcessor cpu) {
		this.cpu =cpu;
	}
	public void config() {
		System.out.println("Octa Core, 4gb RAM, 12 Mp camera");
		cpu.process();
	}
}
