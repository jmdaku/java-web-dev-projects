public class Student {
        private String name;
        private int studentId;
        private int numberOfCredits = 0;
        private double gpa = 0.0;

        public Student(String name, int studentId , int numberOfCredits, double gpa) {
        }

        // Drop your getters and setters below for the Student class.
        // To instantiate the Student class, add your code to the main in the file, SchoolPractice.
        private void setName(String aName) {
                name = aName;
        }
        private void setStudentId(int aStudentId) {
                studentId = aStudentId;
        }
        private void setNumberOfCredits(int aNumberOfCredits) {
                numberOfCredits = aNumberOfCredits;
        }
        private void setNumberOfCredits(double aGpa) {
                gpa = aGpa;
        }

        public String getName() {
                return name;
        }
        public int getStudentId() {
                return studentId;
        }
        public int getNumberOfCredits() {
                return numberOfCredits;
        }
        public double getGpa() {
                return gpa;
        }





}
