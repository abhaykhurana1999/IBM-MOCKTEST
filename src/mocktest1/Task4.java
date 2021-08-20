package mocktest1;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class Task4 {

	public static void main(String[] args) {
		
		List<Integer> list= new ArrayList<Integer>();
		list.add(205);
        list.add(102);
        list.add(98);
        list.add(275);
        list.add(203);
		List<Integer> sortedList=list.stream().sorted().collect(Collectors.toList()); //Through Stream api. 
		sortedList.forEach(System.out::println);
		
		Collections.sort(list, (o1, o2) -> (o1 > o2) ? -1 ://Through Lambda Expresion
            (o1 < o2) ? 1 : 0);

	}

}
