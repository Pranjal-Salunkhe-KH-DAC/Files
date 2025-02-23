//Q5. Student Pass/Fail Status with Nested Switch
class Que5{
	public static void main(String args[]){
	
	int marks = 90;

        if (marks >= 0 && marks <= 100) {
            String status;
            switch (marks / 10) {
                case 10:
                case 9:
                case 8:
                case 7:
                case 6:
                    status = "Pass";
                    break;
                default:
                    status = "Fail";
                    break;
            }
            System.out.println("Status: " + status);
        } else {
            System.out.println("Invalid marks entered.");
        }
	}

}