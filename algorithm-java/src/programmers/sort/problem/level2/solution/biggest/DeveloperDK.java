package programmers.sort.problem.level2.solution.biggest;

import java.util.Arrays;
import java.util.Comparator;

// https://developerdk.tistory.com/24

public class DeveloperDK {

	/**
	 * 
	 * @param numbers
	 * @return
	 * 
	 * - 제출 결과 : 실패...
	 */
	public String solution(int[] numbers) {
		
		String answer = "";
		
		// int 배열을 String 배열로 변환
		String[] arr = new String[numbers.length];
		
		for (int i=0; i < numbers.length; i++) {
			
			arr[i] = (String.valueOf(numbers[i]));
			
		}
		
		System.out.println(Arrays.toString(arr));
		
		// 배열 정렬
		//  - 정렬 규칙으로는 2개를 더하여 더 큰 쪽이 우선순위가 있도록 정렬
		Arrays.sort(arr, new Comparator<String>() {
			
			@Override
			public int compare(String s1, String s2) {
				
				return (s2+s1).compareTo(s1+s2);
			}
			
		});
		
		
		System.out.println(Arrays.toString(arr));
		
		// 0000 처럼 0으로만 구성되어 있으면 0 return
		if (arr[0].equals("0")) return "0";
		
		// 그 외의 경우 순차적으로 연결하여 answer return
		for (int i=0; i < arr.length; i++) {
			
			answer += arr[i];
			
		}
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		
		String a = "20";
		String b = "10";
		
		System.out.println(a.compareTo(b));
		
	}
	
}
