package service;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Student;



public class ServletService {
	private static List<Student> students = new ArrayList<>();
	
	 static {
		 students.add(new Student("ndeye","ndour",LocalDate.of(2022, 10, 25),LocalDate.now(),false));
		 students.add(new Student("amy","ndour",LocalDate.of(2022, 10, 25),LocalDate.now(),false));
		 students.add(new Student("oumy","ndour",LocalDate.of(2022, 10, 25),LocalDate.now(),false));
		 
	 }

	
	public void showList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
request.setAttribute("students", students);
request.getRequestDispatcher("/WEB-INF/views/student-list.jsp")
 .forward(request, response);

		
	}

	public void createStudent(HttpServletRequest request, HttpServletResponse response)throws IOException {
		// TODO Auto-generated method stub
		Student student = new Student();
		//String firstname=request.getParameter("firstnane");
		//String lastname=request.getParameter("lastname");
		student.setFirstname(request.getParameter("firstname"));
		student.setLastname(request.getParameter("lastname"));
		student.setDateOfBirth(LocalDate.parse(request
                .getParameter("dateOfBirth")));
		//student.setTrainingDuration(request.getParameter("trainingDuration"));
		student.setRegistrationDate(LocalDate.parse(request.getParameter("registrationDate")));
		student.setStatus(false);
		 students.add(student);

        response.sendRedirect("/students.do");
		
		
	}

	public void retrieveStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String studentFirstname = request.getParameter("firstname");
		 	Student student = new Student();
	        //Todo todo = new Todo();
	        student.setFirstname(studentFirstname);
	        for(Student t : students){
	            if (t.equals(student)){
	                student = t;
	                break;
	            }
	        }
	        request.setAttribute("student", student);
	        request.setAttribute("students", students);

	        request.getRequestDispatcher("/WEB-INF/views/update.jsp")
	                .forward(request, response);
	    
	}

	public void updateStudent(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException {
		Student student = new Student();
        student.setFirstname(httpServletRequest.getParameter("studentFirstname"));
        //Creation du nouveau Todo
        Student newStudent = new Student();
        newStudent.setFirstname(httpServletRequest.getParameter("firstname"));
        newStudent.setLastname(httpServletRequest.getParameter("lastname"));
        newStudent.setDateOfBirth(LocalDate.parse(httpServletRequest.getParameter("dateOfBirth")));
        newStudent.setRegistrationDate(LocalDate.parse(httpServletRequest.getParameter("registrationDate")));
        if (httpServletRequest.getParameter("status") != null) {
            newStudent.setStatus(true);
        } else {
            newStudent.setStatus(false);
        }

        students.set(students.indexOf(student), newStudent);

        

        httpServletResponse.sendRedirect("/students.do");
    }

    public void markAsDone(HttpServletRequest httpServletRequest,
                           HttpServletResponse httpServletResponse) throws IOException {
        Student student = new Student();
        student.setFirstname(httpServletRequest.getParameter("firstname"));

       students.get(students.indexOf(student)).setStatus(!students.get(students.indexOf(student)).isStatus());

        httpServletResponse.sendRedirect("/students.do");
    }
    public void deleteStudent(HttpServletRequest httpServletRequest,
            HttpServletResponse httpServletResponse) throws IOException {
	String studentFirstname = httpServletRequest.getParameter("firstname");
	/*System.out.println(todoName);*/
	Student student = new Student();
	student.setFirstname(studentFirstname);
	students.remove(student);
	httpServletResponse.sendRedirect("/students.do");
	}

	

	
	}

	 

