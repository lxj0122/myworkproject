/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-12-08 08:20:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>物资管理</title>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"/easyui/themes/default/easyui.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"/easyui/themes/icon.css\">\n");
      out.write("    <script type=\"text/javascript\" src=\"/easyui/jquery.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"/easyui/jquery.easyui.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"/easyui/locale/easyui-lang-zh_CN.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"/scripts/user/login.js\"></script>\n");
      out.write("</head>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("<body style=\"background-image: url(../../images/bg.jpg);height:600px;\">\n");
      out.write("<div class=\"easyui-dialog\" id=\"loginDialog\" title=\"用户登录\" style=\"width:100%;max-width:400px;padding:30px 60px;\"  data-options=\"closable:false,draggable:false\">\n");
      out.write("  <form id=\"loginForm\" method=\"post\">\n");
      out.write("          <div style=\"margin-bottom:20px\">\n");
      out.write("              <input class=\"easyui-textbox easyui-validatebox\" label=\"用户名:\" id=\"userName\" labelPosition=\"top\" data-options=\"required:true,validateOnBlur:true,missingMessage:'用户名不能为空'\" style=\"width:100%;height:52px\">\n");
      out.write("          </div>\n");
      out.write("          <div style=\"margin-bottom:40px\">\n");
      out.write("              <input class=\"easyui-textbox easyui-validatebox\" label=\"密码:\" id=\"password\" labelPosition=\"top\" type=\"password\" data-options=\"required:true,validateOnBlur:true,missingMessage:'密码不能为空'\" style=\"width:100%;height:52px\">\n");
      out.write("          </div>\n");
      out.write("          <div style=\"margin-bottom:20px\">\n");
      out.write("              <a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" id=\"login\" iconCls=\"icon-ok\" style=\"width:100%;height:32px\">登陆</a>\n");
      out.write("          </div>\n");
      out.write("  </form>\n");
      out.write("          <div id=\"loginDialogButtons\">\n");
      out.write("              <a href=\"\" class=\"easyui-linkbutton\" id=\"forgetPassword\"  style=\"width:30%;height:32px;margin-right: 100px;\">忘记密码？</a>\n");
      out.write("              <a href=\"http://localhost:8010/views/user/register.jsp\"  class=\"easyui-linkbutton\" id=\"toRegister\" style=\"width:30%;height:32px;margin-left: 2px;\">注册</a>\n");
      out.write("          </div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
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
