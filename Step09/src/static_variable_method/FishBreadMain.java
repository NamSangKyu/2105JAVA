package static_variable_method;

public class FishBreadMain {

	public static void main(String[] args) {
		FishBread bread1 = new FishBread("단팥");
		FishBread bread2 = new FishBread("슈크림");
		FishBread bread3 = new FishBread("불닭");
		FishBread bread4 = new FishBread("김치"); 
		
		bread1.printInfo();
		bread2.printInfo();
		bread3.printInfo();
		bread4.printInfo();
		
		//현재 FishBread에 있는 count를 조회
		System.out.println("현재 붕어빵 개수 : "+bread1.count);
		System.out.println("현재 붕어빵 개수 : "+bread4.count);
		System.out.println("현재 붕어빵 개수 : "+FishBread.count);
		System.out.println("현재 붕어빵 개수 : "+FishBread.getCount());
		
	}

}

