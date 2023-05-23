/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2023-05-23 00:14:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.perfil;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class perfil_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    \n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Perfil</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"./perfil.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../style.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div class=\"header_Border\">\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <div class=\"Logo\">\n");
      out.write("                <a href=\"/index.jsp\">\n");
      out.write("                    <img src=\"/assets/logo-techstore/logo.png\" alt=\"logo\">\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"search_Bar\">\n");
      out.write("                <input type=\"search\" class=\"search\" placeholder=\"Buscar\">\n");
      out.write("                <img src=\"/assets/lupa.png\" class=\"btnBusca\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <section class=\"telaPerfil\">\n");
      out.write("        <div class=\"menuPerfil\">\n");
      out.write("\n");
      out.write("            <div class=\"fotoPerfil\">\n");
      out.write("                <img src=\"/assets/fotoUsuario.png\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"nomePerfil\">\n");
      out.write("                <p>\n");
      out.write("                    Seu Nome\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("            <button class=\"tipoDados\" id=\"perfil\" onclick=\"mostrarPerfil()\">\n");
      out.write("\n");
      out.write("                <img src=\"/assets/perfil.png\">\n");
      out.write("                <p>Perfil</p>\n");
      out.write("\n");
      out.write("            </button>\n");
      out.write("            <button class=\"tipoDados\" id=\"historico\" onclick=\"mostrarHist()\">\n");
      out.write("                <img src=\"/assets/listaPedidos.png\">\n");
      out.write("                <p>Pedidos</p>\n");
      out.write("            </button>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"infoPerfil\">\n");
      out.write("            <h1>Informações do usuario</h1>\n");
      out.write("\n");
      out.write("            <div class=\"pb\" id=\"pb\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                <label id=\"nome\">Nome\n");
      out.write("                    <p class=\"nome\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.loggedUser}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</p>\n");
      out.write("                </label>\n");
      out.write("                <div class=\"linha\"></div>\n");
      out.write("\n");
      out.write("                <label id=\"nome\">CPF\n");
      out.write("                    <p class=\"nome\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.cpf}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</p>\n");
      out.write("                </label>\n");
      out.write("                <div class=\"linha\"></div>\n");
      out.write("\n");
      out.write("                <label id=\"nome\">Data de Nascimento\n");
      out.write("                    <p class=\"nome\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.nascimento}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</p>\n");
      out.write("                </label>\n");
      out.write("                <div class=\"linha\"></div>\n");
      out.write("\n");
      out.write("                <label id=\"nome\">Endereço\n");
      out.write("                    <p class=\"nome\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.endereco}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</p>\n");
      out.write("                </label>\n");
      out.write("                <div class=\"linha\"></div>\n");
      out.write("\n");
      out.write("                <label id=\"nome\">CEP\n");
      out.write("                    <p class=\"nome\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.cep}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</p>\n");
      out.write("                </label>\n");
      out.write("                <div class=\"linha\"></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"hb\" id=\"hb\">\n");
      out.write("                <h1>HISTÓRICO</h1>\n");
      out.write("                <label id=\"nome\">\n");
      out.write("                    <img src=\"../assets/pc foda.jpg\">\n");
      out.write("                    <p class=\"nome\">Computador Eletrolux</p>\n");
      out.write("                    <p class=\"nome\">Comprado em: 20/09/2022</p>\n");
      out.write("                </label>\n");
      out.write("                <div class=\"linha\"></div>\n");
      out.write("                <label id=\"nome\">\n");
      out.write("                    <img src=\"../assets/mouse foda.png\">\n");
      out.write("                    <p class=\"nome\">Mouse Polishop</p>\n");
      out.write("                    <p class=\"nome\">Comprado em: 20/09/2022</p>\n");
      out.write("                </label>\n");
      out.write("                <div class=\"linha\"></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <script src=\"./script.js\" defer> </script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
