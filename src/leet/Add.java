package leet;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Add{
	
	public static void main(String[] args) {
		List<Integer> list1= new LinkedList<Integer>();
		list1.add(2);
		list1.add(4);
		list1.add(3);
		
		
		List<Integer> list2= new LinkedList<Integer>();
		list2.add(5);
		list2.add(6);
		list2.add(4);
		
		int listSum[] = new int[list1.size()+1] ;
		int overLoad=0;
		
		for(int i=0; i<list1.size(); i++) {
			if(list1.get(i)+list2.get(i)>10) {
				listSum[i]=1;
				overLoad++;
				listSum[i+1] = list1.get(i+1)+list2.get(i+1)+overLoad;
			}
		else if (list1.get(i)+list2.get(i) == 10) {
					listSum[i]=0;
					overLoad++;
					listSum[i+1] = list1.get(i+1)+list2.get(i+1)+overLoad;
				
			}else {
				listSum[i] = list1.get(i)+list2.get(i)+overLoad;
			}
				
			
				
				System.out.println(listSum[i]);

		}
		

	}
} 