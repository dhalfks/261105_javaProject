package day15;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class WordController implements Word{
	
//	Map<String, List<String>> voca = new HashMap<>();
//	하나의 단어에 뜻이 여러개인 값을 저장하기 위한 클래스
//	private int no;
//	private String word;
//	private List<String> mean = new ArrayList<>();
//	List<클래스>
	
	
	private Map<String, String> map = new HashMap<>();
	
	public WordController() {
		map.put("apple", "사과");
		map.put("banana", "바나나");
		map.put("kiwi", "키위");
		map.put("orange", "오렌지");
		map.put("dog", "강아지");
	}

	@Override
	public void insertWord(Scanner scan) {
		// TODO Auto-generated method stub
		System.out.println("단어>");
		String word = scan.next();
		System.out.println("뜻>");
		// 앞의 단어에서 입력한 enter 이 입력버퍼에 남아있어서 다음 nextLine()에 영향을 미침
		scan.nextLine();
		// 뜻에 공백을 같이 포함하려면 nextLine()
		String mean = scan.nextLine();
		
		map.put(word, mean);
		System.out.println("단어등록완료!!");
		
	}

	@Override
	public void searchWord(Scanner scan) {
		// TODO Auto-generated method stub
		System.out.println("단어>");
		String word = scan.next();
		
		if(map.containsKey(word)) {
			System.out.println("---검색결과---");
			System.out.println(word + ":"+map.get(word) );
			System.out.println();
			return;
		}
		System.out.println("검색결과가 없습니다.");
	}

	@Override
	public void modifyWord(Scanner scan) {
		// TODO Auto-generated method stub
		System.out.println("단어>");
		String word = scan.next();
		if(map.containsKey(word)) {
			System.out.println("뜻>");
			scan.nextLine();
			String maen = scan.nextLine();
			map.put(word, maen);
			System.out.println(word + ":"+map.get(word) );
			System.out.println("수정완료");
			return;
		}
		System.out.println("찾는 단어가 없습니다.");
		
	}

	@Override
	public void printWord() {
		// TODO Auto-generated method stub
		System.out.println("---단어장---");
		int cnt = 0;
		for(String s : map.keySet()) {
			cnt++;
			System.out.println(cnt+". "+s+" : "+map.get(s));
		}
		System.out.println("------------------------");
	}

	@Override
	public void removeWord(Scanner scan) {
		// TODO Auto-generated method stub
		System.out.println("단어>");
		String word = scan.next();
		// 단어가 있었다면 이미 if조건 안에서 삭제 완료
		if(map.remove(word) == null) {  // 삭제한 단어가 없다면...
			System.out.println("삭제할 단어가 없습니다. ");
			return;
		}
		System.out.println("삭제완료!!");
		
	}

}
