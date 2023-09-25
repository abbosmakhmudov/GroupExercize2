public abstract class T10Marks {
    /*
    We have to calculate the average of marks obtained in three subjects
by student A and by student B. Create class 'Marks' with an abstract
method 'getPercentage' that will be returning the average percentage
of marks. Provide implementation of abstract method in classes 'A'
and 'B'. The constructor of student A takes the marks in three
subjects as its parameters and the marks in four subjects as its
parameters for student B. Test your code
     */

        abstract double getPercentage();
    }

    class StudentA extends T10Marks {
        private double subject1, subject2, subject3;

        public StudentA(double subject1, double subject2, double subject3) {
            this.subject1 = subject1;
            this.subject2 = subject2;
            this.subject3 = subject3;
        }

        @Override
        double getPercentage() {
            return (subject1 + subject2 + subject3) / 3.0;
        }
    }

    class StudentB extends T10Marks {
        private double subject1, subject2, subject3, subject4;

        public StudentB(double subject1, double subject2, double subject3, double subject4) {
            this.subject1 = subject1;
            this.subject2 = subject2;
            this.subject3 = subject3;
            this.subject4 = subject4;
        }

        @Override
        double getPercentage() {
            return (subject1 + subject2 + subject3 + subject4) / 4.0;
        }
    }
    class MarksTest{
        public static void main(String[] args) {


            StudentA s1 = new StudentA(85, 90, 95);
            StudentB s2 = new StudentB(90, 95, 100, 80);
            double averageA=s1.getPercentage();
            double averageB=s2.getPercentage();
            System.out.println("Student A average mark: "+averageA);
            System.out.println("Student B average mark: "+averageB);
        }
    }