package day15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List02 {

	public static void main(String[] args) {
		// 리스트를 생성하여 과일 5가지 정도 저장하고 => 출력 (향상된 for문 / Iterator)
		List<String> list = new ArrayList<String>();
		
		list.add("사과");
		list.add("딸기");
		list.add("바나나");
		list.add("배");
		list.add("키위");
		
		System.out.println(list);
		
		for(String s : list) {
			System.out.println(s);
		}
		
		Iterator<String> it = list.iterator(); // object
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
		
		// 1. 내 리스트에 '사과'가 있으면 '사과판매' / 없으면 '재고없음' 출력 
		if(list.contains("수박")) {
			System.out.println("사과판매");
		}else {
			System.out.println("재고없음");
		}
		
		String s = list.contains("사과") ? "사과판매" : "재고없음";
		System.out.println(s);
		
		if(list.indexOf("사과") != -1) {
			System.out.println("사과판매");
		}else {
			System.out.println("재고없음");
		}
		
		


	}

}
