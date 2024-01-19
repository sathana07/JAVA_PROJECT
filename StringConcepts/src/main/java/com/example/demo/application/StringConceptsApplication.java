package com.example.demo.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StringConceptsApplication {

	public static void main(String[] args) {

		SpringApplication.run(StringConceptsApplication.class, args);

	//	ReverseString objReverseString = new ReverseString();
		//objReverseString.methodReversestring();
	 //RemoveLeadingZeros objRemoveLeadingZeros = new  RemoveLeadingZeros();
		// objRemoveLeadingZeros.methodRemoveLeadingZeros();	
		 //InsertString objInsertString = new  InsertString();
		 //objInsertString.methodInsertString();		 
		 CompareString  objCompareString =new  CompareString();
		 objCompareString.methodCompareString();
	}

}
 