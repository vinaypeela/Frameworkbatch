package org.backend;
import org.company.Adminstration;
public class BackEnd extends Adminstration{
public void backEnd() {
System.out.println("In back end we have 100 employes");
}
public static void main(String[] args) {
	BackEnd BE = new BackEnd();
	BE.adminstration();
	BE.backEnd();
}
}
