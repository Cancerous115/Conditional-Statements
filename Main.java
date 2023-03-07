import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the first number.");
    double number1 = scanner.nextDouble();
		scanner.nextLine();
		
    System.out.print("Enter the second number.");
    double number2 = scanner.nextDouble();
		scanner.nextLine();
    
		System.out.print("What operation do you want to perform?");

		String operation=scanner.nextLine();

		//if statements check if certain value meets a certain condition
		//sum =add,sub=subtract,etc...
		//sum,sub,and mult examples.
		if (operation.equals("sum")){
			System.out.printf("%f+%f=%f",number1,number2,number1+number2);
		}	else if (operation.equals("sub")){
			System.out.printf("%f-%f=%f",number1,number2,number1-number2);
		} else if (operation.equals("mult")){
			System.out.printf("%f*%f=%f",number1,number2,number1*number2);
		}	else if (operation.equals("div")){
			if (number2==0){
				System.out.println("CAn't divide by zero.");
		}	else{
			System.out.printf("%f/%f=%f",number1,number2,number1/number2);
		} 
	}
		else {
			System.out.printf("%s is no a supported operation.",operation);
		}
	
		scanner.close();
	}
}
