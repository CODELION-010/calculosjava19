package controler;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.RequestDispatcher;

@WebServlet(name = "control", urlPatterns = {"/control"})
public class control extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nombre = request.getParameter("nombre");
        String salarioStr = request.getParameter("salario");
        String cantidadStr = request.getParameter("cantidad");

        // Validación para evitar NullPointerException
        if (salarioStr == null || salarioStr.isEmpty() || cantidadStr == null || cantidadStr.isEmpty()) {
            request.setAttribute("java19", "Por favor, ingrese todos los datos.");
        } else {
            try {
                double salario = Double.parseDouble(salarioStr);
                int cantidad = Integer.parseInt(cantidadStr);

                double total = salario * cantidad;
                request.setAttribute("java19", "El total de salario para " + nombre + " es: " + total);
            } catch (NumberFormatException e) {
                request.setAttribute("java19", "Error: Ingrese valores numéricos válidos.");
            }
        }

        RequestDispatcher dis = request.getRequestDispatcher("/index.jsp");
        dis.forward(request, response);
    }
}
