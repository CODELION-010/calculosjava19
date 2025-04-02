<%-- 
    Document   : index
    Created on : 2/04/2025, 12:49:13 p. m.
    Author     : LEON-PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calcular Salario Post Gets JSP y Servlet</title>
        <link rel="stylesheet" href="css/style.css"/>
    </head>
    <body>
        <div>
            <form action="control" method="POST">

                <h1>Calcula es salario por meses</h1>
                <h3>Ingrsa los datos en el formulario,
                    el sistema multiplicara el salario por los meses ingresados y te dara un total</h3>
                <label>Ingrese nombre:</label>
                <input type="text" name="nombre" required placeholder="Ingresa nombre del empleado" /> <br>

                <label>Ingrese salario:</label>
                <input type="text" name="salario" placeholder="Ingresa sin puntos ni comas porfavor"  />  <br>

                <label>Ingrese número de meses:</label>
                <input type="number" name="cantidad" required min="1" placeholder="Solo números" /> <br>

                <input type="submit" name="btncal" value="Calcular">
                <p title="Se genera al ingresar datos y operar el sistema" >
                    <strong>Total</strong> 
                    <%= request.getAttribute("java19") != null ? request.getAttribute("java19") : ""%>
                </p>
            </form>
        </div>

    </body>
</html>
