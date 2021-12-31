package org.frontend;
import org.company.Adminstration;
public class FrontEnd extends Adminstration{
private void frontEnd() {
System.out.println("In front end we have 150 eployees");
}
public static void main(String[] args) {
	FrontEnd FE = new FrontEnd();
	FE.adminstration();
	FE.frontEnd();
}
}
