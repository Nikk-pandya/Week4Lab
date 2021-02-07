package servlets;

import models.note;

import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.File;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NoteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        
       
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));
        
   
        String title = br.readLine();
             String con = br.readLine();
      
      
        getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp")
            .forward(request, response);


    }

        
        
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        
      String path = getServletContext().getRealPath("/WEB-INF/note.txt");

        String headeredit = request.getParameter("headeredit");
        String conedit = request.getParameter("conedit");
        
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)));
        
        pw.println(headeredit);
        pw.println(conedit);
        
        pw.close();
       
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp")
        .forward(request, response);
    }
}


