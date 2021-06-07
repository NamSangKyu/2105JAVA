package com.step02;

import com.step01.Person;
import com.step01.*;//com 패키지 안에있는 step01 패키지 안에 있는 모든 클래스를 읽어옴

public class PersonMain {

	public static void main(String[] args) {
		//Person 생성하고 printPerson 실행
		Person p = new Person();
		p.printPerson();
	}

}
