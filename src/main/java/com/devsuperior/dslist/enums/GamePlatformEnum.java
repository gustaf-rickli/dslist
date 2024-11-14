package com.devsuperior.dslist.enums;

public enum GamePlatformEnum {
	SEGA_CD("Sega CD"),
	XBOX("Xbox"), 
	Playstation("Playstation"),
	PC("PC"),
	SUPER_NESS("Super Ness");

	private String value;
	
	GamePlatformEnum(String value) { this.value = value; }
	
	public String toString() { return this.value; }
	
}
