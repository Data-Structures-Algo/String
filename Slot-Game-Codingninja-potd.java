import java.util.* ;
import java.io.*; 
public class Solution {
	public static int slotScore(String original, String guess) {
		int perfectHits=0;
		int pseudoHits=0;
		int []originalcount=new int[4];
		int []guesscount=new int[4];

		HashMap<Character,Integer>map=new HashMap<>();
		map.put('R',0);
		map.put('G',1);
		map.put('Y',2);
		map.put('B',3);

		for(int i=0;i<original.length();i++){
			if(original.charAt(i)==guess.charAt(i)){
				perfectHits++;
			}
			else{
				originalcount[map.get(original.charAt(i))]++;
				guesscount[map.get(guess.charAt(i))]++;
			}
		}
		for(int i=0;i<4;i++){
			pseudoHits += Math.min(originalcount[i], guesscount[i]);
		}

		return 2* perfectHits + pseudoHits;
	}
}
