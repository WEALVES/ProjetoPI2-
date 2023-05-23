<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <%@ page contentType="text/html; charset=UTF-8" %>
    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <title>Site</title>
      <link rel="stylesheet" href="./style.css">
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
</head>

<body>
  <div class="header_Border">

    <div class="header">
      <div class="filter">
        <img src="/assets/option.png" alt="filtro" onclick="clickMenu()">
      </div>
      <div class="Logo">
        <img src="/assets/logo-techstore/logo.png" alt="logo">
      </div>
      <div class="search_Bar">
        <input type="search" class="search" placeholder="Buscar">
        <img src="./assets/lupa.png" class="btnBusca">
      </div>
      <div class="carrinho">
        <a href="./carrinho/carrinho.jsp"><img src="./assets/carrinho.png" alt="Carrinho Compras"></a>
      </div>

      <c:if test="${sessionScope.loggedUser != null}">
        <div class="cadProduto">
          <a href="./cadProduto/cadProduto.jsp"><img src="./assets/pacote.png" alt="Cadastrar Produtos"></a>
        </div>
        <div class="infos">
          <span>${sessionScope.loggedUser}
          </span>
          <a href="/logout">Sair</a>
        </div>
        <div class="profile">
          <a href="./perfil/perfil.jsp"><img src="./assets/perfil.png" alt="perfil"></a>
        </div>
      </c:if>

      <c:if test="${sessionScope.loggedUser == null}">
        <a href="/login/login.jsp">Login</a>
        <div class="profile">
          <a href="/login/login.jsp"><img src="./assets/perfil.png" alt="perfil"></a>
        </div>
      </c:if>



    </div>
  </div>

  <div id="menuFilter">

  </div>
  <section class="main_Screen">
    <c:forEach var="produto" items="${produtos}">
      <div class="block" id="${produto.id}">
        <div>
          <a href="/pagProduto/pagProduto.jsp">
            <img src="${produto.imagem}" alt="">

            <p>${produto.nome}</p>
          </a>
        </div>
      </div>
    </c:forEach>

    <div class="block" id="produto-1">
      <div><a href="./pagProduto/pagProduto.jsp"><img src="./assets/pc foda.jpg"
            style="height: 200px; width: 200px;"></a>
        <c:forEach var="produto" items="${produtos}">
          <tr>
            ${produto.nome}
          </tr>
        </c:forEach>
      </div>
    </div>
  </section>



  <script>
    function clickMenu() {
      if (menuFilter.style.display == 'block') {
        menuFilter.style.display = 'none'
      }

      else {
        menuFilter.style.display = 'block'
      }
    }

  </script>
</body>

</html>