<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registro de usuarios</title>
</head>
<body>
<f:view>
	<center>
		<h:form>			
			<h3>Formulario de registro</h3>
			<h:panelGrid columns="2">			
				<h:outputLabel value="Nombre: "></h:outputLabel> <h:inputText value="#{usuarioRegistro.nombre}" ></h:inputText>
				<h:outputLabel value="e-mail: "></h:outputLabel> <h:inputText value="#{usuarioRegistro.email}" ></h:inputText>
				<h:outputLabel value="Usuario: "></h:outputLabel> <h:inputText value="#{usuarioRegistro.usuario}" ></h:inputText>
				<h:outputLabel value="Contraseña: "></h:outputLabel> <h:inputSecret value="#{usuarioRegistro.contrasenia}" ></h:inputSecret>
				<h:commandButton value="Registrar" action="#{registro.registrar}"></h:commandButton>
			</h:panelGrid>			
		</h:form>
	</center>	
</f:view>
</body>
</html>