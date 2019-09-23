import java.util.*;

class SolutionCorrectHour{

	public int solution(int A, int B, int C, int D){

		HashMap<String, Integer> occ = new HashMap<String, Integer>();

		int hours = 0;
		int minutes = 0;

		int count = 0;
		int arr[] = new int[4];
		arr[0] = A;
		arr[1] = B;
		arr[2] = C;
		arr[3] = D;

		String time = null;
		for(int i =0 ; i < 4; i++){

			hours = arr[0]*10 + arr[1];
			minutes = arr[2]*10 + arr[3];
			time = Integer.toString(hours) + Integer.toString(minutes);
			if(hours <= 23 && minutes <= 59){
				if(!occ.containsKey(time)){
					occ.put(time, 1);
					count ++;
				}
			}

			hours = arr[0]*10 + arr[1];
			minutes = arr[3]*10 + arr[2];
			time = Integer.toString(hours) + Integer.toString(minutes);
			if(hours <= 23 && minutes <= 59){
				if(!occ.containsKey(time)){
					occ.put(time, 1);
					count ++;
				}
            }

			hours = arr[0]*10 + arr[2];
            minutes = arr[1]*10 + arr[3];
            time = Integer.toString(hours) + Integer.toString(minutes);
            if(hours <= 23 && minutes <= 59){
                if(!occ.containsKey(time)){
					occ.put(time, 1);
					count ++;
				}
            }

			hours = arr[0]*10 + arr[2];
            minutes = arr[3]*10 + arr[1];
			time = Integer.toString(hours) + Integer.toString(minutes);
            if(hours <= 23 && minutes <= 59){
                if(!occ.containsKey(time)){
					occ.put(time, 1);
					count ++;
				}
            }

			hours = arr[0]*10 + arr[3];
            minutes = arr[1]*10 + arr[2];
			time = Integer.toString(hours) + Integer.toString(minutes);
            if(hours <= 23 && minutes <= 59){
                if(!occ.containsKey(time)){
					occ.put(time, 1);
					count ++;
				}
            }

            hours = arr[0]*10 + arr[3];
            minutes = arr[2]*10 + arr[1];
			
			time = Integer.toString(hours) + Integer.toString(minutes);
            if(hours <= 23 && minutes <= 59){
                if(!occ.containsKey(time)){
					occ.put(time, 1);
					count ++;
				}
            }

			int temp = arr[0];
			arr[0] = arr[1];
			arr[1] = arr[2];
			arr[2] = arr[3];
			arr[3] = arr[0];
		}
		return count;
	}


}
