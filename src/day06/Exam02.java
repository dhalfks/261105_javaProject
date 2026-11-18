package day06;

public class Exam02 {

	public static void main(String[] args) {
		// 그림파일만 출력 => 확장자가 .jpg  .png
		// 없으면 그림파일이 없습니다.
		
		String[] fileName = {
				"이것이자바다jpg.java","java의정석.java","array.txt",
				"array.java","String.txt", "StringMethod.jpg",
				"ArrayMethod.jpg","method.png","javaMethod.png"
		};
		
		//System.out.println(fileName[0].substring(fileName[0].lastIndexOf(".")+1));
		
		boolean check = false;
		for(int i=0; i<fileName.length; i++) {
			String suffix = fileName[i].substring(fileName[i].lastIndexOf(".")+1);
			if(suffix.equals("jpg") || suffix.equals("png")) {
				System.out.println(fileName[i]);
				check = true;
			}
		}
		
		if(!check) {
			System.out.println("그림파일이 없습니다.");
		}
		
		

	}

}
