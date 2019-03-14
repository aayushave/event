package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <title>EVENT | Event Organizer </title>\n");
      out.write("    <meta name=\"description\" content=\"Free Bootstrap Theme by uicookies.com\">\n");
      out.write("    <meta name=\"keywords\" content=\"free website templates, free bootstrap themes, free template, free bootstrap, free website template\">\n");
      out.write("    \n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Poppins:400,500,700\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/styles-merged.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.min.css\">\n");
      out.write("   \n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\">\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("      <script src=\"js/vendor/html5shiv.min.js\"></script>\n");
      out.write("      <script src=\"js/vendor/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    \n");
      out.write("    <!-- Fixed navbar -->\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <header><nav class=\"navbar navbar-default navbar-fixed-top probootstrap-navbar\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("          <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar-collapse\" aria-expanded=\"false\" aria-controls=\"navbar\">\n");
      out.write("            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("          </button>\n");
      out.write("          <a class=\"navbar-brand\" href=\"index.jsp\" title=\"Event | An Event Site\">Stack</a>\n");
      out.write("        </div><div class=\"navbar-header\">\n");
      out.write("            ");

		//HERE WE GETTING THE ATTRIBUTE DECLARED IN VALIDATE.JSP AND CHECKING IF IT IS NULL, THE USER WILL BE REDIRECTED TO LOGIN PAGE
				String uid = (String)session.getAttribute("user");
				if (uid == null)
				{
		
      out.write("<!-- NOT A VALID USER, IF THE USER TRIES TO EXECUTE LOGGED IN PAGE DIRECTLY, ACCESS IS RESTRICTED -->\n");
      out.write("\t\t\t\t\t ");
      if (true) {
        _jspx_page_context.forward("index.jsp");
        return;
      }
      out.write("\n");
      out.write("\t\t");
	
				}
				else
				{//IF THE VALUE IN SESSION IS NOT NULL THEN THE IS USER IS VALID
					out.print(" <h4 style=\"line-height: 5; color:#ffffff\"> Welcome " +uid+" !</h4>");
					
      out.write("\n");
      out.write("\t\t\t\t\t<!-- WE HAVE GIVEN LOGOUT.JSP FILE INORDER TO LOGOUT THE SESSION -->\n");
      out.write("                                        \n");
      out.write("\t\t\t\t");
}
		
      out.write(" \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("\n");
      out.write("        <div id=\"navbar-collapse\" class=\"navbar-collapse collapse\">\n");
      out.write("          <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("            <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("            <li class=\"dropdown\">\n");
      out.write("              <a href=\"#\" data-toggle=\"dropdown\" class=\"dropdown-toggle\">Pages</a>\n");
      out.write("              <ul class=\"dropdown-menu\">\n");
      out.write("                  <li><a href=\"Events.html\">Events</a></li>\n");
      out.write("                <li><a href=\"about.html\">About Us</a></li>\n");
      out.write("                <li><a href=\"portfolio.html\">Portfolio</a></li>\n");
      out.write("                \n");
      out.write("                <li class=\"dropdown-submenu dropdown\">\n");
      out.write("                  <a href=\"#\" data-toggle=\"dropdown\" class=\"dropdown-toggle\"><span>Sub Menu</span></a>\n");
      out.write("                  <ul class=\"dropdown-menu\">\n");
      out.write("                    <li><a href=\"#\">Second Level Menu</a></li>\n");
      out.write("                    <li><a href=\"#\">Second Level Menu</a></li>\n");
      out.write("                    <li><a href=\"#\">Second Level Menu</a></li>\n");
      out.write("                    <li><a href=\"#\">Second Level Menu</a></li>\n");
      out.write("                  </ul>\n");
      out.write("                </li>\n");
      out.write("                <li><a href=\"services.html\">Services</a></li>\n");
      out.write("              </ul>\n");
      out.write("            </li>\n");
      out.write("            <li><a href=\"contact.html\">Contact</a></li>\n");
      out.write("            \n");
      out.write("            <li class=\"probootstra-cta-button last\"><a href=\"logout.jsp\" class=\"btn btn-ghost\" >Log Out</a></li>\n");
      out.write("                <li><div class=\"section\">\n");
      out.write("                        <div class=\"search\">\n");
      out.write("                            <form action=\"/blog/search\" method=\"get\">\n");
      out.write("                                <input name=\"q\" type=\"text\" placeholder=\"Search\" value=\"\">\n");
      out.write("                                <button class=\"colorbtn\" type=\"submit\" >\n");
      out.write("                                <img src=\"img/search.png\" alt=\"search\">\n");
      out.write("                                </button>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("    </header>\n");
      out.write("    <section class=\"flexslider\">\n");
      out.write("      <ul class=\"slides\">\n");
      out.write("        <li style=\"background-image: url(img/slider_1.jpg)\" class=\"overlay\">\n");
      out.write("          <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"col-md-8 col-md-offset-2\">\n");
      out.write("                <div class=\"probootstrap-slider-text text-center\">\n");
      out.write("                  <h1 class=\"probootstrap-heading\">We Create Interfaces</h1>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </li>\n");
      out.write("        <li style=\"background-image: url(img/slider_2.jpg)\" class=\"overlay\">\n");
      out.write("          <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"col-md-8 col-md-offset-2\">\n");
      out.write("                <div class=\"probootstrap-slider-text text-center\">\n");
      out.write("                  <h1 class=\"probootstrap-heading\">We Design Powerful Experiences</h1>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          \n");
      out.write("        </li>\n");
      out.write("        <li style=\"background-image: url(img/slider_3.jpg)\" class=\"overlay\">\n");
      out.write("          <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"col-md-8 col-md-offset-2\">\n");
      out.write("                <div class=\"probootstrap-slider-text text-center\">\n");
      out.write("                  <h1 class=\"probootstrap-heading\">We Bring Ideas To Life</h1>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("    </section>\n");
      out.write("    <section class=\"probootstrap-section probootstrap-bg-white probootstrap-zindex-above-showcase\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-md-6 col-md-offset-3 text-center section-heading probootstrap-animate\" data-animate-effect=\"fadeIn\">\n");
      out.write("            <h2>Our Services</h2>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- END row -->\n");
      out.write("        <div class=\"row probootstrap-gutter60\">\n");
      out.write("          <div class=\"col-md-4 probootstrap-animate\" data-animate-effect=\"fadeIn\">\n");
      out.write("            <div class=\"service hover_service text-center\">\n");
      out.write("              <div class=\"icon\"><i class=\"icon-mobile3\"></i></div>\n");
      out.write("              <div class=\"text\">\n");
      out.write("                <h3>Responsive Design</h3>\n");
      out.write("                <p>Under Construction.</p>\n");
      out.write("              </div>  \n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-4 probootstrap-animate\" data-animate-effect=\"fadeIn\">\n");
      out.write("            <div class=\"service hover_service text-center\">\n");
      out.write("              <div class=\"icon\"><i class=\"icon-presentation\"></i></div>\n");
      out.write("              <div class=\"text\">\n");
      out.write("                <h3>Business Solutions</h3>\n");
      out.write("                <p>Under Construction.</p>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-4 probootstrap-animate\" data-animate-effect=\"fadeIn\">\n");
      out.write("            <div class=\"service hover_service text-center\">\n");
      out.write("              <div class=\"icon\"><i class=\"icon-circle-compass\"></i></div>\n");
      out.write("              <div class=\"text\">\n");
      out.write("                <h3>Brand Identity</h3>\n");
      out.write("                <p>Under Construction.</p>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"col-md-4 probootstrap-animate\" data-animate-effect=\"fadeIn\">\n");
      out.write("            <div class=\"service hover_service text-center\">\n");
      out.write("              <div class=\"icon\"><i class=\"icon-lightbulb\"></i></div>\n");
      out.write("              <div class=\"text\">\n");
      out.write("                <h3>Creative Ideas</h3>\n");
      out.write("                <p>Under Construction.</p>\n");
      out.write("              </div>  \n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-4 probootstrap-animate\" data-animate-effect=\"fadeIn\">\n");
      out.write("            <div class=\"service hover_service text-center\">\n");
      out.write("              <div class=\"icon\"><i class=\"icon-magnifying-glass2\"></i></div>\n");
      out.write("              <div class=\"text\">\n");
      out.write("                <h3>Search Engine Friendly</h3>\n");
      out.write("                <p>Under Construction.</p>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-4 probootstrap-animate\" data-animate-effect=\"fadeIn\">\n");
      out.write("            <div class=\"service hover_service text-center\">\n");
      out.write("              <div class=\"icon\"><i class=\"icon-browser2\"></i></div>\n");
      out.write("              <div class=\"text\">\n");
      out.write("                <h3>Easy Customization</h3>\n");
      out.write("                <p>Under Construction.</p>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- END row -->\n");
      out.write("        <div class=\"row mt50\">\n");
      out.write("          <div class=\"col-md-12 text-center\">\n");
      out.write("            <a href=\"services.html\" class=\"btn btn-primary btn-lg\" role=\"button\">View all our services</a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <section class=\"probootstrap-section probootstrap-bg-white \">\n");
      out.write("      <div class=\"owl-carousel owl-work\">\n");
      out.write("        <div class=\"item\">\n");
      out.write("          <a href=\"portfolio-single.html\">\n");
      out.write("            <img src=\"img/work_1.jpg\" alt=\"#\">\n");
      out.write("          </a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"item\">\n");
      out.write("          <a href=\"portfolio-single.html\">\n");
      out.write("            <img src=\"img/work_2.jpg\" alt=\"#\">\n");
      out.write("          </a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"item\">\n");
      out.write("          <a href=\"portfolio-single.html\">\n");
      out.write("            <img src=\"img/work_3.jpg\" alt=\"#\">\n");
      out.write("          </a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"item\">\n");
      out.write("          <a href=\"portfolio-single.html\">\n");
      out.write("            <img src=\"img/work_4.jpg\" alt=\"#\">\n");
      out.write("          </a>\n");
      out.write("        </div>  \n");
      out.write("        <div class=\"item\">\n");
      out.write("          <a href=\"portfolio-single.html\">\n");
      out.write("            <img src=\"img/work_5.jpg\" alt=\"#\">\n");
      out.write("          </a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"item\">\n");
      out.write("          <a href=\"portfolio-single.html\">\n");
      out.write("            <img src=\"img/work_6.jpg\" alt=\"#\">\n");
      out.write("          </a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"item\">\n");
      out.write("          <a href=\"portfolio-single.html\">\n");
      out.write("            <img src=\"img/work_7.jpg\" alt=\"#\">\n");
      out.write("          </a>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </section>      \n");
      out.write("    \n");
      out.write("    <section class=\"probootstrap-section proboostrap-clients probootstrap-bg-white probootstrap-zindex-above-showcase\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-md-6 col-md-offset-3 text-center section-heading probootstrap-animate\">\n");
      out.write("            <h2>Trusts Us</h2>\n");
      out.write("            <p class=\"lead\">Description.</p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- END row -->\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-md-3 col-sm-6 col-xs-6 text-center client-logo probootstrap-animate\" data-animate-effect=\"fadeIn\">\n");
      out.write("            <img src=\"img/client1.png\" class=\"img-responsive\" alt=\"#\">\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-3 col-sm-6 col-xs-6 text-center client-logo probootstrap-animate\" data-animate-effect=\"fadeIn\">\n");
      out.write("            <img src=\"img/client2.png\" class=\"img-responsive\" alt=\"#\">\n");
      out.write("          </div>\n");
      out.write("          <div class=\"clearfix visible-sm-block visible-xs-block\"></div>\n");
      out.write("          <div class=\"col-md-3 col-sm-6 col-xs-6 text-center client-logo probootstrap-animate\" data-animate-effect=\"fadeIn\">\n");
      out.write("            <img src=\"img/client3.png\" class=\"img-responsive\" alt=\"#\">\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-3 col-sm-6 col-xs-6 text-center client-logo probootstrap-animate\" data-animate-effect=\"fadeIn\">\n");
      out.write("            <img src=\"img/client4.png\" class=\"img-responsive\" alt=\"#\">\n");
      out.write("          </div>          \n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <section class=\"probootstrap-section\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-md-6\">\n");
      out.write("            <div class=\"service left-icon probootstrap-animate\" data-animate-effect=\"fadeInLeft\">\n");
      out.write("              <div class=\"icon\"><i class=\"icon-mobile3\"></i></div>\n");
      out.write("              <div class=\"text\">\n");
      out.write("                <h3>Responsive Design</h3>\n");
      out.write("                <p>Under Construction.</p>\n");
      out.write("              </div>  \n");
      out.write("            </div>\n");
      out.write("            <div class=\"service left-icon probootstrap-animate\" data-animate-effect=\"fadeInLeft\">\n");
      out.write("              <div class=\"icon\"><i class=\"icon-presentation\"></i></div>\n");
      out.write("              <div class=\"text\">\n");
      out.write("                <h3>Business Solutions</h3>\n");
      out.write("                <p>Under Construction.</p>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"service left-icon probootstrap-animate\" data-animate-effect=\"fadeInLeft\">\n");
      out.write("              <div class=\"icon\"><i class=\"icon-circle-compass\"></i></div>\n");
      out.write("              <div class=\"text\">\n");
      out.write("                <h3>Brand Identity</h3>\n");
      out.write("                <p>Under Construction.</p>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-6\">\n");
      out.write("            <div class=\"service left-icon probootstrap-animate\" data-animate-effect=\"fadeInLeft\">\n");
      out.write("              <div class=\"icon\"><i class=\"icon-lightbulb\"></i></div>\n");
      out.write("              <div class=\"text\">\n");
      out.write("                <h3>Creative Ideas</h3>\n");
      out.write("                <p>Under Construction.</p>\n");
      out.write("              </div>  \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"service left-icon probootstrap-animate\" data-animate-effect=\"fadeInLeft\">\n");
      out.write("              <div class=\"icon\"><i class=\"icon-magnifying-glass2\"></i></div>\n");
      out.write("              <div class=\"text\">\n");
      out.write("                <h3>Search Engine Friendly</h3>\n");
      out.write("                <p>Under Construction.</p>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"service left-icon probootstrap-animate\" data-animate-effect=\"fadeInLeft\">\n");
      out.write("              <div class=\"icon\"><i class=\"icon-browser2\"></i></div>\n");
      out.write("              <div class=\"text\">\n");
      out.write("                <h3>Easy Customization</h3>\n");
      out.write("                <p>Under Construction.</p>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- END row -->\n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <section class=\"probootstrap-section probootstrap-border-top probootstrap-bg-white\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-md-6 col-md-offset-3 text-center section-heading probootstrap-animate\">\n");
      out.write("            <h2>Testimonial</h2>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- END row -->\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-md-12\">\n");
      out.write("            <div class=\"owl-carousel owl-carousel-fullwidth\">\n");
      out.write("              <div class=\"item\">\n");
      out.write("\n");
      out.write("                <div class=\"probootstrap-testimony-wrap text-center\">\n");
      out.write("                  <figure>\n");
      out.write("                    <img src=\"img/person_1.jpg\" alt=\"Free Bootstrap Template by uicookies.com\">\n");
      out.write("                  </figure>\n");
      out.write("                  <blockquote class=\"quote\">&ldquo;Design must be functional and functionality must be translated into visual aesthetics, without any reliance on gimmicks that have to be explained.&rdquo; <cite class=\"author\">&mdash; Ferdinand A. Porsche <br> <span>Design Lead at AirBNB</span></cite></blockquote>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("              </div>\n");
      out.write("              <div class=\"item\">\n");
      out.write("                <div class=\"probootstrap-testimony-wrap text-center\">\n");
      out.write("                  <figure>\n");
      out.write("                    <img src=\"img/person_2.jpg\" alt=\"Free Bootstrap Template by uicookies.com\">\n");
      out.write("                  </figure>\n");
      out.write("                  <blockquote class=\"quote\">&ldquo;Creativity is just connecting things. When you ask creative people how they did something, they feel a little guilty because they didn?t really do it, they just saw something. It seemed obvious to them after a while.&rdquo; <cite class=\"author\">&mdash; Steve Jobs <br> <span>Co-Founder Square</span></cite></blockquote>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"item\">\n");
      out.write("                <div class=\"probootstrap-testimony-wrap text-center\">\n");
      out.write("                  <figure>\n");
      out.write("                    <img src=\"img/person_3.jpg\" alt=\"Free Bootstrap Template by uicookies.com\">\n");
      out.write("                  </figure>\n");
      out.write("                  <blockquote class=\"quote\">&ldquo;I think design would be better if designers were much more skeptical about its applications. If you believe in the potency of your craft, where you choose to dole it out is not something to take lightly.&rdquo; <cite class=\"author\">&mdash; Frank Chimero <br> <span>Creative Director at Twitter</span></cite></blockquote>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              \n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- END row -->\n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("    \n");
      out.write(" \n");
      out.write("    <footer class=\"probootstrap-footer\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-md-6\">\n");
      out.write("            <div class=\"probootstrap-footer-widget\">\n");
      out.write("              <h3>Paragraph</h3>\n");
      out.write("              <p>What we Do ,Is what we are showing the World - Team Event.</p>\n");
      out.write("              <ul class=\"probootstrap-footer-social\">\n");
      out.write("                <li><a href=\"#\"><i class=\"icon-twitter\"></i></a></li>\n");
      out.write("                \n");
      out.write("                <li><a href=\"#\"><i class=\"icon-facebook\"></i></a></li>\n");
      out.write("                \n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-6\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"col-md-4\">\n");
      out.write("                <div class=\"probootstrap-footer-widget\">\n");
      out.write("                  \n");
      out.write("               \n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"col-md-4\">\n");
      out.write("                <div class=\"probootstrap-footer-widget\">\n");
      out.write("                  <h3>Links</h3>\n");
      out.write("                  <ul>\n");
      out.write("                    <li><a href=\"#\">Knowledge Base</a></li>\n");
      out.write("                    <li><a href=\"#\">Career</a></li>\n");
      out.write("                    <li><a href=\"#\">Press Releases</a></li>\n");
      out.write("                    <li><a href=\"#\">Terms of services</a></li>\n");
      out.write("                    <li><a href=\"#\">Privacy Policy</a></li>\n");
      out.write("                  </ul>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              \n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          \n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("        <!-- END row -->\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-md-12 copyright clear\">\n");
      out.write("            <p class=\"p_left\"><small>&copy; 2017 <a href=\"#\">EVENT | An Event site </a>. All Rights Reserved. <br> Designed &amp; Developed with <i class=\"icon icon-heart\"></i> by <a href=\"https://uicookies.com/\">EVENT Team</a></small></p>\n");
      out.write("            <p class=\"p_right\"> \n");
      out.write("            <span class=\"span1\">0</span>\n");
      out.write("            <span class=\"span1\">0</span>\n");
      out.write("            <span class=\"span1\">0</span>\n");
      out.write("            <span class=\"span1\">6</span>\n");
      out.write("            <span class=\"span1\">3</span>\n");
      out.write("            <span class=\"span1\">0</span>\n");
      out.write("            <br />\n");
      out.write("            <!-- <a href='https://www.symptoma.it/'>symptoma.it</a> <script type='text/javascript' src='https://www.freevisitorcounters.com/auth.php?id=6cb17291dc4110996029c00039af3ed6c0e08056'></script>\n");
      out.write("<script type=\"text/javascript\" src=\"https://www.freevisitorcounters.com/en/home/counter/488264/t/13\"></script> -->\n");
      out.write("            </p>\n");
      out.write("          </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </footer>   \n");
      out.write("    \n");
      out.write("\n");
      out.write("    <!-- Modal login -->\n");
      out.write("    <form action=\"validate.jsp\" method=\"post\">\n");
      out.write("    <div class=\"modal fadeInUp probootstrap-animated\" id=\"loginModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"loginModalLabel\" aria-hidden=\"true\">\n");
      out.write("      <div class=\"vertical-alignment-helper\">\n");
      out.write("        <div class=\"modal-dialog modal-md vertical-align-center\">\n");
      out.write("          <div class=\"modal-content\">\n");
      out.write("            <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\"><i class=\"icon-cross\"></i></button>\n");
      out.write("            <div class=\"probootstrap-modal-flex\">\n");
      out.write("              <div class=\"probootstrap-modal-figure\" style=\"background-image: url(img/modal_bg.png);\"></div>\n");
      out.write("              <div class=\"probootstrap-modal-content\">\n");
      out.write("                <form action=\"#\" class=\"probootstrap-form\">\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"email\" placeholder=\"Email\" required>\n");
      out.write("                  </div> \n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                    <input type=\"password\" class=\"form-control\" name=\"pass\" placeholder=\"Password\" required>\n");
      out.write("                  </div> \n");
      out.write("                  <div class=\"form-group clearfix mb40\">\n");
      out.write("                    <label for=\"remember\" class=\"probootstrap-remember\"><input type=\"checkbox\" id=\"remember\"> Remember Me</label>\n");
      out.write("                    <a href=\"#\" class=\"probootstrap-forgot\">Forgot Password?</a>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"form-group text-left\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                      <div class=\"col-md-6\">\n");
      out.write("                        <input type=\"submit\" class=\"btn btn-primary btn-block\" value=\"Sign In\">\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                  \n");
      out.write("                </form>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    </form>\n");
      out.write("    <!-- END modal login -->\n");
      out.write("    \n");
      out.write("    <!-- Modal signup -->\n");
      out.write("    <div class=\"modal fadeInUp probootstrap-animated\" id=\"signupModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"signupModalLabel\" aria-hidden=\"true\">\n");
      out.write("      <div class=\"vertical-alignment-helper\">\n");
      out.write("        <div class=\"modal-dialog modal-md vertical-align-center\">\n");
      out.write("          <div class=\"modal-content\">\n");
      out.write("            <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\"><i class=\"icon-cross\"></i></button>\n");
      out.write("            <div class=\"probootstrap-modal-flex\">\n");
      out.write("              <div class=\"probootstrap-modal-figure\" style=\"background-image: url(img/modal_bg.png);\"></div>\n");
      out.write("              <div class=\"probootstrap-modal-content\">\n");
      out.write("                <form action=\"/jsplogin/INSERT2.jsp\" method=\"post\" class=\"probootstrap-form\">\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                      <input type=\"text\" class=\"form-control\" placeholder=\"Full Name\" name=\"username\" maxlength=\"20\" required=\"\">\n");
      out.write("                  </div> \n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                      <input type=\"date\" class=\"form-control\" placeholder=\"Date of Birth\" name=\"dob\" required=\"\">\n");
      out.write("                  </div> \n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                      <input type=\"text\" class=\"form-control\" placeholder=\"Email\" name=\"email\" pattern=\"[^@]*@[^@]*\" required>\n");
      out.write("                  </div> \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <input type=\"password\" class=\"form-control\" placeholder=\"Type Password\" name=\"pass\" required>\n");
      out.write("                  </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <input type=\"password\" class=\"form-control\" placeholder=\"Re-type Password\" name=\"pass\" required>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"form-group clearfix mb40\">\n");
      out.write("                    <label for=\"remember\" class=\"probootstrap-remember\"><input type=\"checkbox\" id=\"remember\"> Remember Me</label>\n");
      out.write("                    <a href=\"#\" class=\"probootstrap-forgot\">Forgot Password?</a>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"form-group text-left\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                      <div class=\"col-md-6\">\n");
      out.write("                        <input type=\"submit\" class=\"btn btn-primary btn-block\" data-toggle=\"modal\" data-target=\"#myModal\" value=\"Sign Up\">\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                  </div>\n");
      out.write("                  \n");
      out.write("                </form>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- END modal signup -->\n");
      out.write("    \n");
      out.write("    \n");
      out.write("\n");
      out.write("    <script src=\"js/scripts.min.js\"></script>\n");
      out.write("    <script src=\"js/custom.min.js\"></script>\n");
      out.write("\n");
      out.write("  </body>\n");
      out.write("</html>");
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
