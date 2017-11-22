package com.example.util;

public class Enum {

	public static enum ESTATUS_REQUEST{
		EXITO(0,"Exito"),
		ERROR(1,"Error");
		
		private int state;
		private String message;
		
		private ESTATUS_REQUEST(int estado,String message){
			this.state = estado;
			this.message = message;
		}

		public int getState() {
			return state;
		}

		public String getMessage() {
			return message;
		}	
	}
}
