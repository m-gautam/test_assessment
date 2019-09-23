public class SolutionLovelyNo{


	public int solution(int A, int B){

		int count = 0;
		int flag = 1;
		if(A > B){
			System.out.println("Range is incorrect (A > B)");
			return 0;
		}


		else {
			for(int i = A; i <= B; i++){
				flag = 1;
				int n = i;
				int[] arr = new int[10];
				for(int l =0; l < 10; l++){
					arr[l] = 0;
				}
				while(n>0){
					int d = n%10;
					n = n/10;
					arr[d] = arr[d] + 1;
				}

				for(int j = 0; j < 10; j++){
					if(arr[j] >= 3){
						flag = 0;
					}
				}
				if(flag == 1){
					count++;
				}		
			}
		}

		return count;
	}

}
