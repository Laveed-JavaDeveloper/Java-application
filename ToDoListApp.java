import java.util.*;
public class ToDoListApp {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       ArrayList<String> tasks=new ArrayList<>();
       int choice;
       do { 
           System.out.println("\n=======To-Do List App\"=======");
           System.out.println("1.View Task");
           System.out.println("2.Add Task");
           System.out.println("3.Edit Task");
           System.out.println("4.Delete Task");
           System.out.println("5.Exit");
           System.out.print("Choose an option (1-5): ");
           choice=scan.nextInt();
           scan.nextLine();

           switch(choice){
                 case 1:
                  if(tasks.isEmpty()){
                    System.out.println("No Task Added Yet!, Add Task ");
                  }else{
                    for(int i=0;i<tasks.size();i++){
                        System.out.println((i+1)+"."+tasks.get(i));
                    }
                  }
                  break;

                  case 2:
                  System.out.print("Enter Task:: ");
                  String task=scan.nextLine();
                  tasks.add(task);
                  System.out.println("Task Added");
                  break;
                  
                  case 3:
                  if(tasks.isEmpty()){
                    System.out.println("No tasks to edit");
                  }else{
                    for(int i=0;i<tasks.size();i++){
                        System.out.println((i+1)+"."+tasks.get(i));
                    }
                        System.out.print("Enter Task Number To Edit :: ");
                        int taskNumber=scan.nextInt();
                        scan.nextLine();
                        if(taskNumber>0 && taskNumber<=tasks.size()){
                            String edited=tasks.remove(taskNumber-1);
                            System.out.println(edited);
                            System.out.print("Enter The Edited Task :: ");
                            String editedTask=scan.nextLine();
                            System.out.println("Edited Task :: "+editedTask);
                        }else{
                            System.out.println("Invalid Task Number");
                        }
                  }
                  break;
                  
                  case 4:
                  if(tasks.isEmpty()){
                    System.out.println("No Tasks to delete ");
                  }else{
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i+1)+"."+tasks.get(i));
                    }
                        System.out.print("Enter Task Number to delete :: ");
                        int index=scan.nextInt();
                        scan.nextLine();
                        if(index>0 && index<=tasks.size()){
                            String removed=tasks.remove(index-1);
                            System.out.println("Task is deleted :: "+removed);
                        }
                        else{
                            System.out.println("Invalid Task Number !");
                        }
                  }
                  break;

                  case 5:
                   System.out.println("Thank You visit again :) ");
                   break;

                   default:
                   System.out.println("InValid Task Number");
                   System.out.println("Enter a Number between (1-5)");
           }
       }
        while (choice!=5);
        scan.close();
    }
}
