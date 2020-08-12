package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class insertarPersona_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Formulario persona</h1>\n");
      out.write("        \n");
      out.write("        ");
      d.model.pojos.Persona perso = null;
      synchronized (_jspx_page_context) {
        perso = (d.model.pojos.Persona) _jspx_page_context.getAttribute("perso", PageContext.PAGE_SCOPE);
        if (perso == null){
          perso = new d.model.pojos.Persona();
          _jspx_page_context.setAttribute("perso", perso, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("        ");
      cl.model.dao.PersonaDAO dao = null;
      synchronized (_jspx_page_context) {
        dao = (cl.model.dao.PersonaDAO) _jspx_page_context.getAttribute("dao", PageContext.PAGE_SCOPE);
        if (dao == null){
          dao = new cl.model.dao.PersonaDAO();
          _jspx_page_context.setAttribute("dao", dao, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("        <fieldset style=\"width: 250px\">\n");
      out.write("            <legend align=\"center\"><big><b>Datos</b></big></legend> \n");
      out.write("            \n");
      out.write("            <form action=\"insertarPersona.jsp\" method=\"POST\">\n");
      out.write("                <table>\n");
      out.write("                    <tr><td>RUT</td><td><input type=\"text\" name=\"ru\" value=\"$(param.ru)\" size=\"11\"></td></tr>\n");
      out.write("                    <tr><td>NOMBRE</td><td><input type=\"text\" name=\"nom\" value=\"$(param.nom)\" size=\"30\"></td></tr>\n");
      out.write("                    <tr><td>TELEFONO</td><td><input type=\"text\" name=\"fijo\" value=\"$(param.fijo)\" size=\"15\"></td></tr>\n");
      out.write("                    <tr><td>CELULAR</td><td><input type=\"text\" name=\"cel\" value=\"$(param.cel)\" size=\"15\"></td></tr>\n");
      out.write("                    <tr><td>EMAIL</td><td><input type=\"text\" name=\"em\" value=\"$(param.em)\" size=\"30\"></td></tr>                    \n");
      out.write("                    <tr><td colspan=\"2\" align=\"right\"><input type=\"submit\" name=\"bt\" value=\"Agregar\"></td></tr>                                        \n");
      out.write("                    <tr><td colspan=\"2\" align=\"center\"><a href=\"index.jsp\">Volver</a></td></tr>\n");
      out.write("                </table>                                \n");
      out.write("            </form>            \n");
      out.write("        </fieldset>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
