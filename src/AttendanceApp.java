/**
 * Student and Course Attendance Application
 *
 * @author Brandon Berger
 * @version 0.3
 * @since 2025.02.26
 * @see <a href="https://github.com/JRBerger123/attendance-app">GitHub Repository</a>
 * @see <a href="https://github.com/JRBerger123">Brandon Berger's GitHub</a>
 */
public class AttendanceApp {
	/**
	 * Standard double dash line for display output
	 */
	private static final String DOUBLE_DASH_LINE = String.format("%50s", "").replace(' ', '=');

	/**
	 * Standard single dash line for display output
	 */
	private static final String SINGLE_DASH_LINE = DOUBLE_DASH_LINE.replace('=', '-');
	
	/**
	 * The first course selection.
	 */
	public Course section1;

	/**
	 * The second course selection.
	 */
	public Course section2;

	/**
	 * The default constructor that that creates two empty courses to maintain attendance for.
	 */
	public AttendanceApp() {
		section1 = new Course();
		section2 = new Course();
	}
    
	/**
     *  Displays the Attendance App header. Example:<br>
	 *  <pre>
	 *  =========================================
	 *  Welcome to the Attendance App
	 *  =========================================
	 *  </pre>
     */
    private void displayAppHeading() {
		System.out.println(DOUBLE_DASH_LINE);
		System.out.println("Welcome to the Attendance App");
		System.out.println(DOUBLE_DASH_LINE);
		System.out.println();
	}
    
    /**
     * Setup courses by getting the course name, plus the student names and seats. Example:<br>
	 * <pre>
	 * Enter Section 1's course name: 
	 * -----------------------------------------
	 * Enter Section 2's course name: 
	 * </pre>
	 * @throws Exception if the course or student setters throws errors back due to invalid user input.
     */
    private void setupCourses() throws Exception {
        String userInput;
        
        userInput = Input.getLine("Enter the name of course 1: ");
        section1.setName(userInput);
        setupStudents(section1);

        System.out.println();
        System.out.println(SINGLE_DASH_LINE);
        System.out.println();

        userInput = Input.getLine("Enter the name of course 2: ");
        section2.setName(userInput);
        setupStudents(section2);
    }
    
    /**
     * Sets up the students for the course.<br>
     * Calls getLine to get the student's name<br>
     * Calls getIntRange to get the student's seat number between 0 and 55<br>
     * Example:<br>
     * <pre>
     * Enter Math101 student's name or 'q' to quit: user input
     * Enter Billy's seat number: user input
     * </pre>
     * @param course The course to set students for.
     */
    private void setupStudents(Course course) {
        String courseName = course.getName();
        String name;
        int seatNumber;

<<<<<<< Updated upstream
    	while (true) {
			System.out.println();
			name = Input.getLine("Enter " + courseName + " students's name or 'q' to quit: ");
			
			if (name.equals("q"))
				return;
			
			try { 
				jersey = Input.getIntRange("Enter " + name + "'s jersey number: ", 0, 55);
				course.addStudent(name, jersey);
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println("Unable to add student!");
			}
			
    	}
		    	
    } // end of setupStudents
=======
        while (true) {
            System.out.println();
            name = Input.getLine("Enter " + courseName + " student's name or 'q' to quit: ");
            
            if (name.equals("q"))
                return;
            
            try { 
                seatNumber = Input.getIntRange("Enter " + name + "'s seat number: ", 0, 55);
                course.addStudent(seatNumber, name);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Unable to add student!");
            }
        }
    }
>>>>>>> Stashed changes
    
    /**
     * Displays the main menu, get the user input, and call the appropriate method. Example:<br>
	 * <pre>
	 * -----------------------------------------
	 * Main Menu
	 * -----------------------------------------
	 * 0 = End Attendance App
	 * 1 = Take 9:00 am Attendance
	 * 2 = Take 10:00 am Attendance
	 * 3 = Display All Attendance Report
	 * -----------------------------------------
	 * Menu Choice: 3
	 * -----------------------------------------
	 * </pre>
     * @throws Exception if any of the menu options throws an error back to this method.
     */
    private void mainMenu() throws Exception {
    	
    	boolean playGame = true;
    	int userInput;
    	
    	System.out.println();
    	System.out.println(DOUBLE_DASH_LINE);    	
    	System.out.println("Game Started!");
    	System.out.println(DOUBLE_DASH_LINE);
    	System.out.println();
    	
    	
    	while (playGame) {
    		
    		System.out.println(SINGLE_DASH_LINE);
    		System.out.println("Main Menu");
    		System.out.println(SINGLE_DASH_LINE);
    		
    		System.out.println("0 = End Attendance App");
    		System.out.println("1 = Enter " + section1.getName() + " Attendance");
    		System.out.println("2 = Enter " + section2.getName() + " Attendance");
    		System.out.println("3 = Display All Attendance Report");
    		
    		System.out.println(SINGLE_DASH_LINE);
    		userInput = Input.getIntRange("Menu Choice: ", 0, 3);
    		System.out.println(SINGLE_DASH_LINE);
    		
    		System.out.println();
    		
    		switch (userInput) {
    		case 0:
    			playGame = false;
    			updateScoreboard();
        		System.out.println();
        		break;
        		
    		case 1:
    		case 2:
    			
    			if (userInput == 1)
    				updateAttendance(section1);
    			else
    				updateTeamStats(section2);
    			
    			System.out.println();
        		updateScoreboard();
        		System.out.println();
        		break;
        		
    		case 3:
    			displayDetailReports();
    			break;
    			
    		default:
    			System.out.println("Invalid menu choice = " + userInput);
    			
    		} // end of switch
    	}

    } // end of playGame
    
<<<<<<< Updated upstream
    /**
     * Update the select team's stats.<br>
	 * Calls Input.getIntRange using range from 1 and 55.<br>
	 * Example: <br>
	 * <pre>
	 * Enter Wildcats's Jersey # user input
	 * </pre>
	 * @param course The team to update stats for.
     * @throws Exception getPlayer could throw an invalid jersey error
     */
    private void courseAttendance(Course course) throws Exception {

    	int seat;
    	Student student;
    	
		while (true) {
			seat = Input.getIntRange("Enter " + course.getName() + "'s Jersey # ", 1, 55);
			
			student = course.getStudent(seat);
			
			if (student == null) {
				System.out.println("Invalid #, please try again!");
				continue;
			}
			
			studentAttendance(student);
			
			break;
		}
			
		System.out.println();
		System.out.println(SINGLE_DASH_LINE);
			
    } // end of updateTeam
    
    /**
     * Displays the player's name along with the stats menu. Example:
	 * <pre>
 	 * -----------------------------------------
	 * Enter #10 Billy Stats
	 * -----------------------------------------
	 * 0 = foul
	 * 1 = free throw
	 * 2 = 2pt field goal
	 * 3 = 3pt field goal
	 * -----------------------------------------
	 * Enter Stat Type: 2
	 * -----------------------------------------
	 * #10 Billy Fouls=0 Points=2
	 * -----------------------------------------
     * </pre>
     * @param student The player to enter attendance for
     */
    private void studentAttendance(Student student) {
    	int type;

        System.out.println();
		
		System.out.println(SINGLE_DASH_LINE);
		System.out.println("Enter #" + student.getSeat() + " " +student.getName() + " Attendance");
		System.out.println(SINGLE_DASH_LINE);
		
		System.out.println("0 = foul");
		System.out.println("1 = free throw");
		System.out.println("2 = 2pt field goal");
		System.out.println("3 = 3pt field goal");
		
		System.out.println(SINGLE_DASH_LINE);
		type = Input.getIntRange("Enter Stat Type: ", 0, 3);
		System.out.println(SINGLE_DASH_LINE);
		
		try {
			student.updateAttendance(type);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Unable to update player's stats!");
		}

		student.displayAttendance();

    }

    /**
     * Display all team player's detail stats. call the displayDetailsStats
	 * for both the home and away teams.
     */
    private void displayDetailReports()  throws Exception{

    	section1.displayDetailReport();
    	section2.displaySummaryReport();

    } // end of playGame
=======
	/**
	 * Take attendance for a specific course.
	 * @param course The course to take attendance for.
	 * @throws Exception if the course's attendance setter throws an error back due to invalid user input.
	 */
	private void courseAttendance(Course course) {

	}

	/**
	 * Take attendance for a specific student.
	 * @param student The student to take attendance for.
	 * @throws Exception if the student's attendance setter throws an error back due to invalid user input.
	 */
	private void studentAttendance(Student student) {

	}
    
    /**
     * Display the detail attendance report for both course sections.
     */
    private void displayDetailReports() {
    	section1.displayDetailReport();
    	section2.displayDetailReport();

    }
>>>>>>> Stashed changes
    
	/**
	 * Creates the AttendanceApp object, displays the app's heading, and then calls the setup courses
	 * method that initializes the program with course and student information.
	 */
	public static void main(String[] args) {
		// Create the attendance application instance
		AttendanceApp attendanceApp = new AttendanceApp();

<<<<<<< Updated upstream
		AttendanceApp object = new AttendanceApp();

		object.displayAppHeading();
		
		try {
			object.courseAttendance();
			object.mainMenu();
=======
		// Display the application header
		attendanceApp.displayAppHeading();
		
		try {
			// Setup the courses and students
			attendanceApp.setupCourses();
			
			// If you have a main menu method, uncomment the line below
			// attendanceApp.mainMenu();
>>>>>>> Stashed changes
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Sorry but this program ended with an error. Please contact technical support!");
		}
		
	} // end of main
	
} // end of StudentApp class