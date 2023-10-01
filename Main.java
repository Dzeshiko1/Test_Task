import java.util.Random;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;

public class Main
{
	public static void main(String[] args) {
		System.out.println(Arrays.deepToString(Main.method(7)));
	}
   
       
	static Integer [][] method(Integer n) {
	    
	    //Начальная инициализация
	    Random rand = new Random();
	    Integer [][] array = new Integer [n][];
	    List<Integer> randomElement = new ArrayList<>(); //Создание динамического массива для хранения размеров массивов
	        
	    //Генерация массивов
	    for (int i = 0; i < n; i++) {
            int temp = rand.nextInt(10);
            while (randomElement.contains(temp)){
                temp =  rand.nextInt(10);
            }
            randomElement.add(temp); 
            array[i] = new Integer [temp];
            for (int j = 0; j < array[i].length; j++) {
            array[i][j] = rand.nextInt (10);
            }
	    }
	    
	    //Сортировка массивов
	    for (int i = 0; i < n; i++) {
	        if ( i % 2 != 0) {
	            Arrays.sort(array[i], Comparator.reverseOrder()); 
	        } //это нечетное
	        else {
	            Arrays.sort(array[i]);
	        }
	    }
	    return array;
	}
}



