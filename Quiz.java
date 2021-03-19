package d_array;

import java.util.Arrays;

public class Quiz {
	public static void main(String[] args) {
		// 거스름돈 동전 개수
		int money = (int) (Math.random() * 500) * 10;
		int[] coin = { 500, 100, 50, 10 };
		System.out.println("거스름돈 : " + money);

		/*
		 * 거스름돈에 동전의 단위마다 몇개의 동전이 필요한지 출력해 주세요
		 * 
		 * 거스름돈 2860원 500원 5개 100원 1개 50원 1개 10원 1개
		 */
		int count = 0;

		for (int i = 0; i < coin.length; i++) {
			count = money / coin[i];
			money = money % coin[i];
			System.out.println(coin[i] + "원 : " + count + "개");
		}
		// 그래프 그리기
		int[] arr = new int[20];
		int[] counts = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 5) + 1;
		}
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			counts[arr[i] - 1]++;
		}

		for (int i = 0; i < counts.length; i++) {
			System.out.print(i + 1 + " : ");
			for (int j = 0; j < counts[i]; j++) {
				System.out.print("*");
			}
			System.out.println(" " + counts[i]);
		}
		//중복되지 않는 배열
		arr = new int[10];
		for(int i = 0 ; i < arr.length; i++){
			arr[i] = (int)(Math.random() * 5 ) + 1;
		}
		System.out.println(Arrays.toString(arr));
		
		/*
		 * 1~5사이의 랜덤한 값이 10개 저장된 배열에서 중복된 값이 제거된 배열을 만들어주세요.
		 */
		int[] key = new int[5];
		count = 0;
		for (int i = 0; i < arr.length; i++) {
			boolean flag = true;
			for (int j = 0; j < key.length; j++) {
				if (arr[i] == key[j]) {
					flag = false;
					}
				}
				if(flag) {
					key[count++] = arr[i];
			}
		}
		int[] result = new int[count];
		for(int i = 0; i < result.length; i++) {
			result[i] = key[i];
		}
		System.out.println(Arrays.toString(result));
		
		arr = new int[10];
		for(int i = 0 ; i < arr.length; i++){
			arr[i] = (int)(Math.random() * 100 ) + 1;
		}

		System.out.println("-----------------------------------------------------------------");	 
		System.out.println(Arrays.toString(arr));

		int random = (int)(Math.random() * 4 ) + 2;
		System.out.println(random);
		/* 2~5사이의 랜덤한 수로 나누어 떨어지는 숫자로만 이루어진 배열을 정렬하여 출력해주세요.
		 * 
		 */	
		int[] s = new int[5];
		count = 0;
		for(int i=0; i<arr.length; i++){
			boolean flag = true;
			if(arr[i]%random != 0){
				flag = false;
			}
			if(flag){
				s[count++] = arr[i];
			}	
			
		}
		System.out.println(Arrays.toString(s));
		int t = 0;
		for (int i = 1; i < s.length-1; i++) {
			int min = i;
			for (int j = i+1; j < s.length; j++) {
				if (s[min] > s[j]) {
					t = s[min];
					s[min] = s[j];
					s[j] = t;
				}
			}

		}
		System.out.println(" ");
		System.out.println(Arrays.toString(s));
	}
	}
