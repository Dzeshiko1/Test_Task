/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
   
       
	int [][] metod(Integer n) {
	    Random rand = new Random();
	    int [][] array = new int [n]
	    for (int i = 0; i < n; i++) {
            array[i] = new int [rand.nextInt(1000)];
            for (int j = 0; j < array[i].lenght; j++) {
                array[i][j] = rand.nextInt (1000)
            }
	    }
    }
    
}



