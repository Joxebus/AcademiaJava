<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://richfaces.org/a4j" prefix="a4j" %>
<%@ taglib uri="http://richfaces.org/rich" prefix="rich" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Iniciar sesión</title>
</head>
<body>
<f:view>
    <center>
        <rich:panel style="width:50%">
            <h:form>
                <h3>Ingresar usuario y contraseña</h3>
                <h:panelGrid columns="2">
                    <h:outputLabel value="Usuario: "></h:outputLabel> <h:inputText
                        value="#{login.usuario}"></h:inputText>
                    <h:outputLabel value="Contraseña: "></h:outputLabel><h:inputSecret
                        value="#{login.contrasenia}"></h:inputSecret>
                    <h:commandButton value="Ingresar" action="#{login.validar}"></h:commandButton>
                    <h:commandButton value="Registrar" action="registrar"></h:commandButton>
                </h:panelGrid>
            </h:form>
        </rich:panel>
    </center>
</f:view>
</body>
</html>