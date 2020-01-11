package tang;

import java.util.ArrayList;
import java.util.List;

public class Sort {
	
	public static <T extends Comparable<T>> ArrayList<T> quickSort(ArrayList<T> unsort,boolean isAscending)
	{
		if(unsort.size()>=2) 
		{
			int mid = unsort.size() /2;
			ArrayList<T> right = new ArrayList<T>();
			ArrayList<T> left = new ArrayList<T>();
			T pivot = unsort.get(mid);
			unsort.remove(mid);
			for(T i:unsort) 
			{
				if(isAscending ==true) 
				{
					if(i.compareTo(pivot)<0) 
						left.add(i);
					else
						right.add(i);
				}
				else 
				{
					if(i.compareTo(pivot)<0) 
						right.add(i);
					else
						left.add(i);
				}
				
			}
			
			ArrayList<T> leftResult = quickSort(left,isAscending);
			ArrayList<T> rightResult = quickSort(right,isAscending);
			leftResult.add(pivot);
			leftResult.addAll(rightResult);
			return leftResult;
			
		}
		else
			return unsort;
	}
	
	public static<T extends Comparable<T>> ArrayList<T> selectionSort(ArrayList<T> unsort, boolean isAscending)
	{
		for(int i=0;i< unsort.size()-1;i++) 
		{
			for(int j=i+1;j <unsort.size();j++) 
			{
				if(isAscending == true) 
				{
					if(unsort.get(i).compareTo(unsort.get(j))>0) 
					{
						T c = unsort.get(i);
						unsort.set(i, unsort.get(j));
						unsort.set(j, c);
					}
				}
				else 
				{
					if(unsort.get(i).compareTo(unsort.get(j))<0) 
					{
						T c = unsort.get(i);
						unsort.set(i, unsort.get(j));
						unsort.set(j, c);
					}
				}
				
			}
		}
		return unsort;
	}
	
	public static<T extends Comparable> ArrayList<T> insertSort(ArrayList<T> unsort, boolean isAscending)
	{
		ArrayList<T> sort = new ArrayList<T>();
		sort.add(unsort.get(0));
		unsort.remove(0);
		int length = unsort.size();
		for(int i=0;i<length;i++) 
		{
			for(int j=0;j<sort.size();j++) 
			{
				if(isAscending == true) 
				{
					if(unsort.get(0).compareTo(sort.get(0))<0) 
					{
						sort.add(0, unsort.get(0));
						unsort.remove(0);
						break;
					}
					else if(j== sort.size()-1)
					{
						sort.add(unsort.get(0));
						unsort.remove(0);
						break;
					}
					else if(sort.get(j).compareTo(unsort.get(0))<0&&sort.get(j+1).compareTo(unsort.get(0))>0) 
					{
						sort.add(j+1, unsort.get(0));
						unsort.remove(0);
						break;
					}
				}
				else 
				{
					if(unsort.get(0).compareTo(sort.get(0))>0) 
					{
						sort.add(0, unsort.get(0));
						unsort.remove(0);
						break;
					}
					else if(j== sort.size()-1)
					{
						sort.add(unsort.get(0));
						unsort.remove(0);
						break;
					}
					else if(sort.get(j).compareTo(unsort.get(0))>0&&sort.get(j+1).compareTo(unsort.get(0))<0) 
					{
						sort.add(j+1, unsort.get(0));
						unsort.remove(0);
						break;
					}
				}
				
			}
		}
		return sort;
	}
	
public static<T extends Comparable> ArrayList<T> bubbleSort(ArrayList<T> unsort)
{
	for(int i=0;i<unsort.size();i++) 
	{
		for(int j=0;j<unsort.size()-i;j++) 
		{
			if(unsort.get(i).compareTo(unsort.get(j))>0) 
			{
				T c = unsort.get(i);
				unsort.set(i, unsort.get(j));
				unsort.set(j, c);
			}
		}
	}
	return unsort;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> unsort =new  ArrayList<Integer>();
		unsort.add(21);
		unsort.add(24);
		unsort.add(42);
		unsort.add(29);
		unsort.add(23);
		unsort.add(13);
		unsort.add(8);
		unsort.add(39);
		unsort.add(38);
		
		ArrayList<Card> cards = new ArrayList<Card>();
		cards.add(new Card("Heart",13));
		cards.add(new Card("Heart",2));
		cards.add(new Card("Heart",4));
		
		ArrayList<Card> sort = Sort.insertSort(cards,false);
		
		for(Card i: sort) 
		{
			System.out.println(i.getNumber());
		}
		
	}

}
