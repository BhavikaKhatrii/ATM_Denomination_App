import java.util.Scanner;

public class Denomination {
	public static void main(String[] args) {
		int notes[] = {2000,500,200,100,50,20,10};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount: ");
		int amount = sc.nextInt();
		int copy = amount;
		int totalNotes = 0;
		int count = 0;
		boolean quit = false;

		if(amount<=80000){
			for(int i=1;i<=6;i++) {
				count = amount/notes[i];
				if(count!=0) {
					System.out.println(notes[i] + "\t x \t" + count + "\t" + notes[i]*count);
				}
				totalNotes = totalNotes+count;
				amount = amount%notes[i];
			}
			System.out.println(copy+"\nTotal Notes: \t" + totalNotes);
	}
	else{
		System.out.println("Try with some less amount :)");
	}

	int Choice;
        do{
            System.out.println("--------------------------------");
            System.out.println("Enter 1 to Add Notes: ");
            System.out.println("Enter 2 to Update Notes: ");
            System.out.println("Enter 3 to Delete Notes:");
            System.out.println("Enter 0 to exit: ");
            System.out.println("--------------------------------");
            Choice = sc.nextInt();
			
            switch(Choice){
                case 1:
                    int add;
                    System.out.println("Enter amount to add: ");
                    add = sc.nextInt();
                    if(add < 0)
                    {
                        System.out.println("Sorry not possible..");
                    }
                    else{
                        amount =amount+ add;
                        System.out.println("\t\t\tAmount added..");
						int added = copy+add;
                        System.out.println("Total amount : "+added+"\n...............................................");
                    }
                    break;

                case 2:
                    int update;
                    System.out.println("Enter amount to update: ");
                    update = sc.nextInt();
					int sum = update+copy;
					System.out.println("Updated notes: "+sum);
					for(int i=1;i<=5;i++) {
						count = sum/notes[i];
						if(count!=0) {
							System.out.println(notes[i] + "\t x \t" + count + "\t" + notes[i]*count);
						}
						totalNotes = totalNotes+count;
						sum = sum%notes[i];
					}
                    break;

                case 3:
					int delAmt;
					System.out.println("Enter amount to delete notes: ");
                    delAmt = sc.nextInt();
                    if(delAmt < amount){
						System.out.println("Sorry Not Possible...");
					}
					else{
						amount -= delAmt;
						System.out.println("Note deleted..");
					}
                    break;

                case 0:
                    quit = true;
                    break;

                default:
                    System.out.println("Entered wrong number...");
                    break;
            }
        }while(!quit);
        System.out.println("Visit again...");
	}

	
	
}