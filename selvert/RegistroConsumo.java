package com.mycompany.RegistroConsumo.resources;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.sql.*;

/**
 *
 * @author Gloria Eugenia Echev
 */
@WebServlet("/RegistroConsumo")
public class RegistroConsumo extends HttpServlet {

    private static final long serialVersionUID = 1L;
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    String nombre = request.getParameter("nombre");
    int agua = Integer.parseInt(request.getParameter("agua"));
    int luz = Integer.parseInt(request.getParameter("luz"));

    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/servicios", "usuario", "contraseña")) {
            String sql = "INSERT INTO consumo (nombre_cliente, agua, luz) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, nombre);
            stmt.setInt(2, agua);
            stmt.setInt(3, luz);
            
            stmt.executeUpdate();
        }

      response.sendRedirect("formulario.jsp?exito=true");
    } catch (IOException | ClassNotFoundException | SQLException e) {
      response.sendRedirect("formulario.jsp?error=true");
    }
  }
}