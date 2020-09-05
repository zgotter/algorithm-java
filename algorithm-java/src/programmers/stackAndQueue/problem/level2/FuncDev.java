package programmers.stackAndQueue.problem.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import programmers.stackAndQueue.problem.level2.solution.funcDev.DeveloperDK;
import programmers.stackAndQueue.problem.level2.solution.funcDev.Programmers;

// https://programmers.co.kr/learn/courses/30/lessons/42586

/**
* 
* @author shkim
* 
* ##### ��ɰ��� #####
* 
* ���α׷��ӽ� �������� ��� ���� �۾��� ���� ���Դϴ�. 
* �� ����� ������ 100%�� �� ���񽺿� �ݿ��� �� �ֽ��ϴ�.
* 
* ��, �� ����� ���߼ӵ��� ��� �ٸ��� ������ �ڿ� �ִ� ����� �տ� �ִ� ��ɺ��� ���� ���ߵ� �� �ְ�, 
* �̶� �ڿ� �ִ� ����� �տ� �ִ� ����� ������ �� �Բ� �����˴ϴ�.
* 
* ���� �����Ǿ�� �ϴ� ������� �۾��� ������ ���� ���� �迭 progresses�� 
* �� �۾��� ���� �ӵ��� ���� ���� �迭 speeds�� �־��� �� 
* �� �������� �� ���� ����� �����Ǵ����� return �ϵ��� solution �Լ��� �ϼ��ϼ���.
* 
* 
* # ���� ����
* 
*  - �۾��� ����(progresses, speeds�迭�� ����)�� 100�� �����Դϴ�.
*  - �۾� ������ 100 �̸��� �ڿ����Դϴ�.
*  - �۾� �ӵ��� 100 ������ �ڿ����Դϴ�.
*  - ������ �Ϸ翡 �� ���� �� �� ������, �Ϸ��� ���� �̷�����ٰ� �����մϴ�. 
*    ���� ��� �������� 95%�� �۾��� ���� �ӵ��� �Ϸ翡 4%��� ������ 2�� �ڿ� �̷�����ϴ�.
*  
* 
* # ����� ��
* 
* (����1)
* 
*   - progresses : [93,30,55]
*   - speeds 	 : [1,30,5]
*   
*   - return : [2,1]
*   
*   - ù ��° ����� 93% �Ϸ�Ǿ� �ְ� �Ϸ翡 1%�� �۾��� �����ϹǷ� 7�ϰ� �۾� �� ������ �����մϴ�.
*   - �� ��° ����� 30%�� �Ϸ�Ǿ� �ְ� �Ϸ翡 30%�� �۾��� �����ϹǷ� 3�ϰ� �۾� �� ������ �����մϴ�. 
*     ������ ���� ù ��° ����� ���� �ϼ��� ���°� �ƴϱ� ������ ù ��° ����� �����Ǵ� 7��° �����˴ϴ�.
*   - �� ��° ����� 55%�� �Ϸ�Ǿ� �ְ� �Ϸ翡 5%�� �۾��� �����ϹǷ� 9�ϰ� �۾� �� ������ �����մϴ�.
*   - ���� 7��°�� 2���� ���, 9��°�� 1���� ����� �����˴ϴ�.
*   
*   
*/

public class FuncDev {

	
	
	public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        
        
        
        return answer;
    }
	
	public static void main(String[] args) {
		
		int[] progresses = {93,30,55};
		int[] speeds = {1,30,5};
		
		int[] answer = {};
		
		String show = "pg03"; // default, dk, pg01, pg02, pg03
		
		if (show.equals("default")) {
			
			FuncDev fd = new FuncDev();
			
			answer = fd.solution(progresses, speeds);
			
		} else if (show.equals("dk")) {
			
			DeveloperDK dk = new DeveloperDK();
			
			answer = dk.solution(progresses, speeds);
			
		} else if (show.equals("pg01")) {
			
			Programmers pg01 = new Programmers();
			
			answer = pg01.solution1(progresses, speeds);
			
		} else if (show.equals("pg02")) {
			
			Programmers pg02 = new Programmers();
			
			answer = pg02.solution2(progresses, speeds);
			
		} else if (show.equals("pg03")) {
			
			Programmers pg03 = new Programmers();
			
			answer = pg03.solution3(progresses, speeds);
			
		}
		
		System.out.println("answer : " + Arrays.toString(answer));
		
		
	}
	
	
}