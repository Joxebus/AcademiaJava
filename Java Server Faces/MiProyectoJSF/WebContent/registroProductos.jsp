<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://richfaces.org/a4j" prefix="a4j"%>
<%@ taglib uri="http://richfaces.org/rich" prefix="rich"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registro de productos</title>
</head>
<body>
<f:view>
	<center>
		
		<a4j:form>
		
			<rich:panel>			
				<h3>Formulario de registro de productos</h3>
				<h:panelGrid columns="2">			
					<h:outputLabel value="Nombre producto: "></h:outputLabel> <h:inputText id="nombreProducto" value="#{productoRegistrar.nombre}" size="4" required="true"
						requiredMessage="Nombre del producto es requerido"
						validatorMessage="No se ha ingresado un nombre para el producto">
						<a4j:support event="onblur" />
					</h:inputText>
					<rich:message for="nombreProducto"/>
					<h:outputLabel value="Precio: "></h:outputLabel> <h:inputText value="#{productoRegistrar.precio}" ></h:inputText>
					<h:outputLabel value="Existencia: "></h:outputLabel> <h:inputText value="#{productoRegistrar.cantidad}" ></h:inputText>
					
					<a4j:commandButton value="Registrar" action="#{mantenimientoProductos.registrarProducto}" reRender="tablaProductos"/>					
				</h:panelGrid>
			</rich:panel>					
		</a4j:form>
		
		<hr>
			<br>
			
			<rich:dataTable id="tablaProductos" value="#{mantenimientoProductos.listaProductos}" var="productoLista">
				
				<h:column>
					<f:facet name="header">
						<h:outputText value="id"></h:outputText>
					</f:facet>
					<h:outputText value="#{productoLista.id}"></h:outputText>
				</h:column>
				
				<h:column>
					<f:facet name="header">
						<h:outputText value="nombre"></h:outputText>
					</f:facet>
					<h:outputText value="#{productoLista.nombre}"></h:outputText>
					<rich:toolTip mode="client" >
						<h:panelGrid columns="2">
						<h:outputText value="Existencia :"/>
						<h:outputText value="#{productoLista.cantidad}" />						
						</h:panelGrid>
					</rich:toolTip>
				</h:column>
				
				<h:column>
					<f:facet name="header">
						<h:outputText value="precio"></h:outputText>
					</f:facet>
					<h:outputText value="#{productoLista.precio}"></h:outputText>
				</h:column>				
				
			
			</rich:dataTable>
	</center>	
</f:view>
</body>
</html>