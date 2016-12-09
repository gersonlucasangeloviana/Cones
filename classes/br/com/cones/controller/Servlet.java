package br.com.cones.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.cones.beans.Cliente;
import br.com.cones.bo.ClienteBO;
import br.com.cones.dao.DAO;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/cadastro")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Servlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cliente c = new Cliente();
		
	 c.setCpf(request.getParameter("cpf"));
	 c.setNome(request.getParameter("nome"));
	 c.setSetor(request.getParameter("setor"));
	 c.setPredio(Integer.parseInt(request.getParameter("predio")));
	 c.setAndar(Integer.parseInt(request.getParameter("andar")));
	 try{
	 ClienteBO bo = new ClienteBO();
	 bo.Gravar(c);
	 } catch(Exception e) {
		 e.printStackTrace();
	 }
	 request.setAttribute("cliente", c);
		request.getRequestDispatcher("resultado.jsp").forward(request,response);
	}

}
