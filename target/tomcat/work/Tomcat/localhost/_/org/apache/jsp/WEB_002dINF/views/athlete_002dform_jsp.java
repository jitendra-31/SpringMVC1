/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-10-07 10:40:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class athlete_002dform_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fcssClass_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fselect_0026_005fpath;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue_005flabel_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fradiobutton_0026_005fvalue_005fpath_005flabel_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fcheckbox_0026_005fvalue_005fpath_005flabel_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fcssClass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fselect_0026_005fpath = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue_005flabel_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fradiobutton_0026_005fvalue_005fpath_005flabel_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fcheckbox_0026_005fvalue_005fpath_005flabel_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005faction.release();
    _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fcssClass_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005fselect_0026_005fpath.release();
    _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue_005flabel_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005fradiobutton_0026_005fvalue_005fpath_005flabel_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005fcheckbox_0026_005fvalue_005fpath_005flabel_005fnobody.release();
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <style>\n");
      out.write("    .error{\n");
      out.write("            color:red;\n");
      out.write("            font-style: italic;\n");
      out.write("    }\n");
      out.write("    </style>\n");
      out.write("    <title>An Athlete</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<h2><i>Athlete Form</i></h2>\n");
      out.write("\n");
      //  form:form
      org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
      _jspx_th_form_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_form_005fform_005f0.setParent(null);
      // /WEB-INF/views/athlete-form.jsp(26,0) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setAction("showAthleteDetails");
      // /WEB-INF/views/athlete-form.jsp(26,0) name = modelAttribute type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setModelAttribute("athlete");
      int[] _jspx_push_body_count_form_005fform_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_form_005fform_005f0 = _jspx_th_form_005fform_005f0.doStartTag();
        if (_jspx_eval_form_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("<label>Name</label>\n");
            out.write("    ");
            if (_jspx_meth_form_005finput_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("\n");
            out.write("    ");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_005ferrors_005f0 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fcssClass_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_005ferrors_005f0.setPageContext(_jspx_page_context);
            _jspx_th_form_005ferrors_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/views/athlete-form.jsp(29,4) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f0.setPath("name");
            // /WEB-INF/views/athlete-form.jsp(29,4) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f0.setCssClass("error");
            int[] _jspx_push_body_count_form_005ferrors_005f0 = new int[] { 0 };
            try {
              int _jspx_eval_form_005ferrors_005f0 = _jspx_th_form_005ferrors_005f0.doStartTag();
              if (_jspx_th_form_005ferrors_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (java.lang.Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_005ferrors_005f0[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_005ferrors_005f0.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_005ferrors_005f0.doFinally();
              _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fcssClass_005fnobody.reuse(_jspx_th_form_005ferrors_005f0);
            }
            out.write("\n");
            out.write("    <br><br>\n");
            out.write("\n");
            out.write("    <label>Choose Country : </label>\n");
            out.write("    ");
            //  form:select
            org.springframework.web.servlet.tags.form.SelectTag _jspx_th_form_005fselect_005f0 = (org.springframework.web.servlet.tags.form.SelectTag) _005fjspx_005ftagPool_005fform_005fselect_0026_005fpath.get(org.springframework.web.servlet.tags.form.SelectTag.class);
            _jspx_th_form_005fselect_005f0.setPageContext(_jspx_page_context);
            _jspx_th_form_005fselect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/views/athlete-form.jsp(33,4) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005fselect_005f0.setPath("country");
            int[] _jspx_push_body_count_form_005fselect_005f0 = new int[] { 0 };
            try {
              int _jspx_eval_form_005fselect_005f0 = _jspx_th_form_005fselect_005f0.doStartTag();
              if (_jspx_eval_form_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\n");
                  out.write("        ");
                  //  form:option
                  org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_005foption_005f0 = (org.springframework.web.servlet.tags.form.OptionTag) _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue_005flabel_005fnobody.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                  _jspx_th_form_005foption_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_form_005foption_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fselect_005f0);
                  // /WEB-INF/views/athlete-form.jsp(34,8) name = label type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_form_005foption_005f0.setLabel("India");
                  // /WEB-INF/views/athlete-form.jsp(34,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_form_005foption_005f0.setValue("India");
                  int[] _jspx_push_body_count_form_005foption_005f0 = new int[] { 0 };
                  try {
                    int _jspx_eval_form_005foption_005f0 = _jspx_th_form_005foption_005f0.doStartTag();
                    if (_jspx_th_form_005foption_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (java.lang.Throwable _jspx_exception) {
                    while (_jspx_push_body_count_form_005foption_005f0[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_form_005foption_005f0.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_form_005foption_005f0.doFinally();
                    _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue_005flabel_005fnobody.reuse(_jspx_th_form_005foption_005f0);
                  }
                  out.write("\n");
                  out.write("        ");
                  //  form:option
                  org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_005foption_005f1 = (org.springframework.web.servlet.tags.form.OptionTag) _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue_005flabel_005fnobody.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                  _jspx_th_form_005foption_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_form_005foption_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fselect_005f0);
                  // /WEB-INF/views/athlete-form.jsp(35,8) name = label type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_form_005foption_005f1.setLabel("Australia");
                  // /WEB-INF/views/athlete-form.jsp(35,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_form_005foption_005f1.setValue("Ireland");
                  int[] _jspx_push_body_count_form_005foption_005f1 = new int[] { 0 };
                  try {
                    int _jspx_eval_form_005foption_005f1 = _jspx_th_form_005foption_005f1.doStartTag();
                    if (_jspx_th_form_005foption_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (java.lang.Throwable _jspx_exception) {
                    while (_jspx_push_body_count_form_005foption_005f1[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_form_005foption_005f1.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_form_005foption_005f1.doFinally();
                    _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue_005flabel_005fnobody.reuse(_jspx_th_form_005foption_005f1);
                  }
                  out.write("\n");
                  out.write("        ");
                  //  form:option
                  org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_005foption_005f2 = (org.springframework.web.servlet.tags.form.OptionTag) _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue_005flabel_005fnobody.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                  _jspx_th_form_005foption_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_form_005foption_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fselect_005f0);
                  // /WEB-INF/views/athlete-form.jsp(36,8) name = label type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_form_005foption_005f2.setLabel("Pakisthan");
                  // /WEB-INF/views/athlete-form.jsp(36,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_form_005foption_005f2.setValue("Poland");
                  int[] _jspx_push_body_count_form_005foption_005f2 = new int[] { 0 };
                  try {
                    int _jspx_eval_form_005foption_005f2 = _jspx_th_form_005foption_005f2.doStartTag();
                    if (_jspx_th_form_005foption_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (java.lang.Throwable _jspx_exception) {
                    while (_jspx_push_body_count_form_005foption_005f2[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_form_005foption_005f2.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_form_005foption_005f2.doFinally();
                    _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue_005flabel_005fnobody.reuse(_jspx_th_form_005foption_005f2);
                  }
                  out.write("\n");
                  out.write("        ");
                  //  form:option
                  org.springframework.web.servlet.tags.form.OptionTag _jspx_th_form_005foption_005f3 = (org.springframework.web.servlet.tags.form.OptionTag) _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue_005flabel_005fnobody.get(org.springframework.web.servlet.tags.form.OptionTag.class);
                  _jspx_th_form_005foption_005f3.setPageContext(_jspx_page_context);
                  _jspx_th_form_005foption_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fselect_005f0);
                  // /WEB-INF/views/athlete-form.jsp(37,8) name = label type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_form_005foption_005f3.setLabel("Nepal");
                  // /WEB-INF/views/athlete-form.jsp(37,8) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_form_005foption_005f3.setValue("Poland");
                  int[] _jspx_push_body_count_form_005foption_005f3 = new int[] { 0 };
                  try {
                    int _jspx_eval_form_005foption_005f3 = _jspx_th_form_005foption_005f3.doStartTag();
                    if (_jspx_th_form_005foption_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (java.lang.Throwable _jspx_exception) {
                    while (_jspx_push_body_count_form_005foption_005f3[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_form_005foption_005f3.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_form_005foption_005f3.doFinally();
                    _005fjspx_005ftagPool_005fform_005foption_0026_005fvalue_005flabel_005fnobody.reuse(_jspx_th_form_005foption_005f3);
                  }
                  out.write("\n");
                  out.write("    ");
                  int evalDoAfterBody = _jspx_th_form_005fselect_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_form_005fselect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (java.lang.Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_005fselect_005f0[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_005fselect_005f0.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_005fselect_005f0.doFinally();
              _005fjspx_005ftagPool_005fform_005fselect_0026_005fpath.reuse(_jspx_th_form_005fselect_005f0);
            }
            out.write("\n");
            out.write("    <br><br>\n");
            out.write("    <label>Choose Grade : </label>\n");
            out.write("    ");
            if (_jspx_meth_form_005fradiobutton_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("\n");
            out.write("    ");
            if (_jspx_meth_form_005fradiobutton_005f1(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("\n");
            out.write("    <br><br>\n");
            out.write("    \n");
            out.write("    <label>Tournament Lists : </label>\n");
            out.write("    ");
            if (_jspx_meth_form_005fcheckbox_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("\n");
            out.write("    ");
            if (_jspx_meth_form_005fcheckbox_005f1(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("\n");
            out.write("    ");
            if (_jspx_meth_form_005fcheckbox_005f2(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("\n");
            out.write("    ");
            if (_jspx_meth_form_005fcheckbox_005f3(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("\n");
            out.write("    <br><br>\n");
            out.write("    <input type=\"submit\" value=\"Enter\" />\n");
            int evalDoAfterBody = _jspx_th_form_005fform_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_form_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_005fform_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_005fform_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_005fform_005f0.doFinally();
        _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005faction.reuse(_jspx_th_form_005fform_005f0);
      }
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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

  private boolean _jspx_meth_form_005finput_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f0 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/views/athlete-form.jsp(28,4) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f0.setPath("name");
    int[] _jspx_push_body_count_form_005finput_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f0 = _jspx_th_form_005finput_005f0.doStartTag();
      if (_jspx_th_form_005finput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fnobody.reuse(_jspx_th_form_005finput_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_form_005fradiobutton_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:radiobutton
    org.springframework.web.servlet.tags.form.RadioButtonTag _jspx_th_form_005fradiobutton_005f0 = (org.springframework.web.servlet.tags.form.RadioButtonTag) _005fjspx_005ftagPool_005fform_005fradiobutton_0026_005fvalue_005fpath_005flabel_005fnobody.get(org.springframework.web.servlet.tags.form.RadioButtonTag.class);
    _jspx_th_form_005fradiobutton_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005fradiobutton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/views/athlete-form.jsp(41,4) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fradiobutton_005f0.setPath("rank");
    // /WEB-INF/views/athlete-form.jsp(41,4) name = label type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fradiobutton_005f0.setLabel("Grade 1");
    // /WEB-INF/views/athlete-form.jsp(41,4) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fradiobutton_005f0.setValue("A");
    int[] _jspx_push_body_count_form_005fradiobutton_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fradiobutton_005f0 = _jspx_th_form_005fradiobutton_005f0.doStartTag();
      if (_jspx_th_form_005fradiobutton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fradiobutton_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fradiobutton_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fradiobutton_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005fradiobutton_0026_005fvalue_005fpath_005flabel_005fnobody.reuse(_jspx_th_form_005fradiobutton_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_form_005fradiobutton_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:radiobutton
    org.springframework.web.servlet.tags.form.RadioButtonTag _jspx_th_form_005fradiobutton_005f1 = (org.springframework.web.servlet.tags.form.RadioButtonTag) _005fjspx_005ftagPool_005fform_005fradiobutton_0026_005fvalue_005fpath_005flabel_005fnobody.get(org.springframework.web.servlet.tags.form.RadioButtonTag.class);
    _jspx_th_form_005fradiobutton_005f1.setPageContext(_jspx_page_context);
    _jspx_th_form_005fradiobutton_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/views/athlete-form.jsp(42,4) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fradiobutton_005f1.setPath("rank");
    // /WEB-INF/views/athlete-form.jsp(42,4) name = label type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fradiobutton_005f1.setLabel("Grade 2");
    // /WEB-INF/views/athlete-form.jsp(42,4) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fradiobutton_005f1.setValue("B");
    int[] _jspx_push_body_count_form_005fradiobutton_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fradiobutton_005f1 = _jspx_th_form_005fradiobutton_005f1.doStartTag();
      if (_jspx_th_form_005fradiobutton_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fradiobutton_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fradiobutton_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fradiobutton_005f1.doFinally();
      _005fjspx_005ftagPool_005fform_005fradiobutton_0026_005fvalue_005fpath_005flabel_005fnobody.reuse(_jspx_th_form_005fradiobutton_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_form_005fcheckbox_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:checkbox
    org.springframework.web.servlet.tags.form.CheckboxTag _jspx_th_form_005fcheckbox_005f0 = (org.springframework.web.servlet.tags.form.CheckboxTag) _005fjspx_005ftagPool_005fform_005fcheckbox_0026_005fvalue_005fpath_005flabel_005fnobody.get(org.springframework.web.servlet.tags.form.CheckboxTag.class);
    _jspx_th_form_005fcheckbox_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005fcheckbox_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/views/athlete-form.jsp(46,4) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fcheckbox_005f0.setPath("tournaments");
    // /WEB-INF/views/athlete-form.jsp(46,4) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fcheckbox_005f0.setValue("Australia Open");
    // /WEB-INF/views/athlete-form.jsp(46,4) name = label type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fcheckbox_005f0.setLabel("Australia Open");
    int[] _jspx_push_body_count_form_005fcheckbox_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fcheckbox_005f0 = _jspx_th_form_005fcheckbox_005f0.doStartTag();
      if (_jspx_th_form_005fcheckbox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fcheckbox_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fcheckbox_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fcheckbox_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005fcheckbox_0026_005fvalue_005fpath_005flabel_005fnobody.reuse(_jspx_th_form_005fcheckbox_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_form_005fcheckbox_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:checkbox
    org.springframework.web.servlet.tags.form.CheckboxTag _jspx_th_form_005fcheckbox_005f1 = (org.springframework.web.servlet.tags.form.CheckboxTag) _005fjspx_005ftagPool_005fform_005fcheckbox_0026_005fvalue_005fpath_005flabel_005fnobody.get(org.springframework.web.servlet.tags.form.CheckboxTag.class);
    _jspx_th_form_005fcheckbox_005f1.setPageContext(_jspx_page_context);
    _jspx_th_form_005fcheckbox_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/views/athlete-form.jsp(47,4) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fcheckbox_005f1.setPath("tournaments");
    // /WEB-INF/views/athlete-form.jsp(47,4) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fcheckbox_005f1.setValue("India Open");
    // /WEB-INF/views/athlete-form.jsp(47,4) name = label type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fcheckbox_005f1.setLabel("India Open");
    int[] _jspx_push_body_count_form_005fcheckbox_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fcheckbox_005f1 = _jspx_th_form_005fcheckbox_005f1.doStartTag();
      if (_jspx_th_form_005fcheckbox_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fcheckbox_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fcheckbox_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fcheckbox_005f1.doFinally();
      _005fjspx_005ftagPool_005fform_005fcheckbox_0026_005fvalue_005fpath_005flabel_005fnobody.reuse(_jspx_th_form_005fcheckbox_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_form_005fcheckbox_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:checkbox
    org.springframework.web.servlet.tags.form.CheckboxTag _jspx_th_form_005fcheckbox_005f2 = (org.springframework.web.servlet.tags.form.CheckboxTag) _005fjspx_005ftagPool_005fform_005fcheckbox_0026_005fvalue_005fpath_005flabel_005fnobody.get(org.springframework.web.servlet.tags.form.CheckboxTag.class);
    _jspx_th_form_005fcheckbox_005f2.setPageContext(_jspx_page_context);
    _jspx_th_form_005fcheckbox_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/views/athlete-form.jsp(48,4) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fcheckbox_005f2.setPath("tournaments");
    // /WEB-INF/views/athlete-form.jsp(48,4) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fcheckbox_005f2.setValue("UK Open");
    // /WEB-INF/views/athlete-form.jsp(48,4) name = label type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fcheckbox_005f2.setLabel("UK Open");
    int[] _jspx_push_body_count_form_005fcheckbox_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fcheckbox_005f2 = _jspx_th_form_005fcheckbox_005f2.doStartTag();
      if (_jspx_th_form_005fcheckbox_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fcheckbox_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fcheckbox_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fcheckbox_005f2.doFinally();
      _005fjspx_005ftagPool_005fform_005fcheckbox_0026_005fvalue_005fpath_005flabel_005fnobody.reuse(_jspx_th_form_005fcheckbox_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_form_005fcheckbox_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:checkbox
    org.springframework.web.servlet.tags.form.CheckboxTag _jspx_th_form_005fcheckbox_005f3 = (org.springframework.web.servlet.tags.form.CheckboxTag) _005fjspx_005ftagPool_005fform_005fcheckbox_0026_005fvalue_005fpath_005flabel_005fnobody.get(org.springframework.web.servlet.tags.form.CheckboxTag.class);
    _jspx_th_form_005fcheckbox_005f3.setPageContext(_jspx_page_context);
    _jspx_th_form_005fcheckbox_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/views/athlete-form.jsp(49,4) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fcheckbox_005f3.setPath("tournaments");
    // /WEB-INF/views/athlete-form.jsp(49,4) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fcheckbox_005f3.setValue("Nepal Open");
    // /WEB-INF/views/athlete-form.jsp(49,4) name = label type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fcheckbox_005f3.setLabel("Nepal Open");
    int[] _jspx_push_body_count_form_005fcheckbox_005f3 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fcheckbox_005f3 = _jspx_th_form_005fcheckbox_005f3.doStartTag();
      if (_jspx_th_form_005fcheckbox_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fcheckbox_005f3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fcheckbox_005f3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fcheckbox_005f3.doFinally();
      _005fjspx_005ftagPool_005fform_005fcheckbox_0026_005fvalue_005fpath_005flabel_005fnobody.reuse(_jspx_th_form_005fcheckbox_005f3);
    }
    return false;
  }
}
