public class SeatingChart {
    public static void main(String[] args) {
        
        // Instances of Student class
        Student student = new Student();
        Student student2 = new Student();

        // Setting and getting instance variable
        
        student.setName("Bob");
        student2.setName("Jane");
        System.out.println("Students in the class: " + student.getName() + ", " + student2.getName());

        // Instance of SeatingCharts class
        SeatingCharts seatingchart = new SeatingCharts();

        // Adding 1 student to the 2D array
        seatingchart.addStudent("Bob", 0, 0);
        System.out.println("Student sitting closest to the teacher's desk: " + seatingchart.seating_chart[0][0]);

        // Adding another student to the 2D array
        seatingchart.addStudent("Jane", 1, 1);

        // Change seats of first and second students
        seatingchart.swapStudents("Jane", 0, 0);
        System.out.println("After switching seats, " + seatingchart.seating_chart[0][0] + " sits closest to the teacher.");
        if (seatingchart.seating_chart[1][1] != null) {
            System.out.println(seatingchart.seating_chart[1][1] + " now sits further away from the teacher.");
        }
        
    }
}


class Student {
    private String name;
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


class SeatingCharts {
    // Class size of 20
    String[][] seating_chart = new String[5][4];

    public void addStudent(String name, int row, int column) {
        // Make sure the seating chart is the right size
        if (row > 5 || column > 4) {
            System.out.println("The seating chart has to be 5 rows and 4 columns.");
            return; 
        }

        seating_chart[row][column] = name;
   }

    public void swapStudents(String name, int row, int column) {
        String temp;
        int period = 0;
        int group = 0;

        // 2 for loops to store student's original seat
        for (int i = 0; i < seating_chart.length; i++) {
            for (int j = 0; j < seating_chart[i].length; j++) {
                if (name == seating_chart[i][j]) {
                    period = i;
                    group = j;
                }
            }
        }

        if (seating_chart[row][column] != null) {
            // Swap the students' seats
            temp = seating_chart[row][column];
            seating_chart[row][column] = name;
            seating_chart[period][group] = temp;
        }
        else {
        seating_chart[row][column] = name;
        seating_chart[period][group] = null;
        }
    }
}
    


/*Output:
Students in the class: Bob, Jane
Student sitting closest to the teacher's desk: Bob
After switching seats, Jane sits closest to the teacher.
Bob now sits further away from the teacher.
 */