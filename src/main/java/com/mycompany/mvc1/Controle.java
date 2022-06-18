/*
 * Base Exerc-Prof.Ramon C.
 */
package com.mycompany.mvc1;
/**
 *
 * @lf
 */
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/controle")
public class Controle extends HttpServlet {

   @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
           HttpSession session = req.getSession();  
           Temperatura aquecedor = (Temperatura) session.getAttribute("aquecedor");      
           String acao = req.getParameter("acao"); 
           switch(acao){
               case "aumentar":
                   aquecedor.aumentar(); 
                   break; 
               case "diminuir":    
                   aquecedor.diminuir(); 
                   break;          
        }
        resp.sendRedirect("index");    
    }

} 