import java.util.Scanner;

class Simple_Calculator{

  public static void main(String[] args) {
    boolean checker;
    boolean op_checker;
    double solution = 0;
    double first_num = 0;
    double sec_num = 0;
    String op = "";
    Scanner scan = new Scanner(System.in);
    //FirstNumberRetrival
    do{
    System.out.println("Enter the first number you would like to use(Order matters): ");
    if(scan.hasNextDouble()){
      first_num = scan.nextDouble();
      checker = false;
    }
    else{
      System.out.println("Not a valid input!");
      checker = true;
      scan.next();
      }
    }while(checker == true);
    //SecondNumberRetrival
    do{
    System.out.println("Enter the second number you would like to use(Order Matters): ");
    if(scan.hasNextDouble()){
      sec_num = scan.nextDouble();
      checker = false;
    }
    else{
      System.out.println("Not a valid input!");
      checker = true;
      scan.next();
      }
    }while(checker == true);
    //Operation Cehcker
    do{
    System.out.println("What operation do you chose to perform with these two numbers?(M,D,S,A)");
    if(scan.hasNext("[MADS]")){
      op = scan.next();
      op_checker = true;
    }
    else{
      System.out.println("Not a valid input!");
      op_checker = false;
      scan.next();
    }

  }while(op_checker == false);
  if(op.equals("M")){
    solution = (first_num * sec_num);
  }
  if(op.equals("A")){
    solution = (first_num + sec_num);
  }
  if(op.equals("D")){
    solution = (first_num/sec_num);
  }
  if(op.equals("S")){
    solution = (first_num - sec_num);
  }
  System.out.println("The solution is " + solution);
  scan.close();

  }
}
