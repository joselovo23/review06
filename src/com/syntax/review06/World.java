package com.syntax.review06;

public class World {

	public static void main(String[] args) {
		Human human1=new Human();//create an object
		human1.name="John";
		human1.lastName="Doe";
		human1.eyeColor="blue";
		human1.hairColor="grey";
		human1.age=33;
		human1.gender='m';
		
		//human1.hands=2; doesn't work because "hands" was not declared in Human Class
		human1.sleep();
		human1.eat();
		human1.run();
		
		
	}

}
