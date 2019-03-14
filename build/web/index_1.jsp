<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>EVENT | Event Organizer </title>
    <meta name="description" content="Free Bootstrap Theme by uicookies.com">
    <meta name="keywords" content="free website templates, free bootstrap themes, free template, free bootstrap, free website template">
    
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Poppins:400,500,700">
    <link rel="stylesheet" href="css/styles-merged.css">
    <link rel="stylesheet" href="css/style.min.css">
   
    <link rel="stylesheet" href="css/style.css" type="text/css">
    <!--[if lt IE 9]>
      <script src="js/vendor/html5shiv.min.js"></script>
      <script src="js/vendor/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>
    
    <!-- Fixed navbar -->
    
    
    <header><nav class="navbar navbar-default navbar-fixed-top probootstrap-navbar">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar-collapse" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="index.jsp" title="Event | An Event Site">Stack</a>
        </div><div class="navbar-header">
            <%
		//HERE WE GETTING THE ATTRIBUTE DECLARED IN VALIDATE.JSP AND CHECKING IF IT IS NULL, THE USER WILL BE REDIRECTED TO LOGIN PAGE
				String uid = (String)session.getAttribute("user");
				if (uid == null)
				{
		%><!-- NOT A VALID USER, IF THE USER TRIES TO EXECUTE LOGGED IN PAGE DIRECTLY, ACCESS IS RESTRICTED -->
					 <jsp:forward page="index.jsp"/>
		<%	
				}
				else
				{//IF THE VALUE IN SESSION IS NOT NULL THEN THE IS USER IS VALID
					uid="Welcome "+uid+" !";
                                        out.print(" <h4 style=\"line-height: 5; color:#ffffff\"> " +uid+" !</h4>");
					%>
					<!-- WE HAVE GIVEN LOGOUT.JSP FILE INORDER TO LOGOUT THE SESSION -->
                                        
				<%}
		%> 
        </div>
        

        <div id="navbar-collapse" class="navbar-collapse collapse">
          <ul class="nav navbar-nav navbar-right">
            <li><a href="index.jsp">Home</a></li>
            <li class="dropdown">
              <a href="#" data-toggle="dropdown" class="dropdown-toggle">Pages</a>
              <ul class="dropdown-menu">
                  <li><a href="contact.html">Contact Us</a></li>
                <li><a href="about.html">About Us</a></li>
                <li><a href="portfolio.html">Portfolio</a></li>
                
                <li class="dropdown-submenu dropdown">
                  <a href="#" data-toggle="dropdown" class="dropdown-toggle"><span>Sub Menu</span></a>
                  <ul class="dropdown-menu">
                    <li><a href="#">Second Level Menu</a></li>
                    <li><a href="#">Second Level Menu</a></li>
                    <li><a href="#">Second Level Menu</a></li>
                    <li><a href="#">Second Level Menu</a></li>
                  </ul>
                </li>
                <li><a href="services.html">Services</a></li>
              </ul>
            </li>
            <li><a href="Events.html">Events</a></li>
            
            <li class="probootstra-cta-button last"><a href="logout.jsp" class="btn btn-ghost" >Log Out</a></li>
                <li><div class="section">
                        <div class="search">
                            <form action="/blog/search" method="get">
                                <input name="q" type="text" placeholder="Search" value="">
                                <button class="colorbtn" type="submit" >
                                <img src="img/search.png" alt="search">
                                </button>
                            </form>
                        </div>
                    </div>
                </li>
            </ul>
        </div>
      </div>
    </nav>
    </header>
    <section class="flexslider">
      <ul class="slides">
        <li style="background-image: url(img/slider_1.jpg)" class="overlay">
          <div class="container">
            <div class="row">
              <div class="col-md-8 col-md-offset-2">
                <div class="probootstrap-slider-text text-center">
                  <h1 class="probootstrap-heading">We Create Interfaces</h1>
                </div>
              </div>
            </div>
          </div>
        </li>
        <li style="background-image: url(img/slider_2.jpg)" class="overlay">
          <div class="container">
            <div class="row">
              <div class="col-md-8 col-md-offset-2">
                <div class="probootstrap-slider-text text-center">
                  <h1 class="probootstrap-heading">We Design Powerful Experiences</h1>
                </div>
              </div>
            </div>
          </div>
          
        </li>
        <li style="background-image: url(img/slider_3.jpg)" class="overlay">
          <div class="container">
            <div class="row">
              <div class="col-md-8 col-md-offset-2">
                <div class="probootstrap-slider-text text-center">
                  <h1 class="probootstrap-heading">We Bring Ideas To Life</h1>
                </div>
              </div>
            </div>
          </div>
        </li>
      </ul>
    </section>
    <section class="probootstrap-section probootstrap-bg-white probootstrap-zindex-above-showcase">
      <div class="container">
        <div class="row">
          <div class="col-md-6 col-md-offset-3 text-center section-heading probootstrap-animate" data-animate-effect="fadeIn">
            <h2>Our Services</h2>
          </div>
        </div>
        <!-- END row -->
        <div class="row probootstrap-gutter60">
          <div class="col-md-4 probootstrap-animate" data-animate-effect="fadeIn">
            <div class="service hover_service text-center">
              <div class="icon"><i class="icon-mobile3"></i></div>
              <div class="text">
                <h3>Responsive Design</h3>
                <p>Under Construction.</p>
              </div>  
            </div>
          </div>
          <div class="col-md-4 probootstrap-animate" data-animate-effect="fadeIn">
            <div class="service hover_service text-center">
              <div class="icon"><i class="icon-presentation"></i></div>
              <div class="text">
                <h3>Business Solutions</h3>
                <p>Under Construction.</p>
              </div>
            </div>
          </div>
          <div class="col-md-4 probootstrap-animate" data-animate-effect="fadeIn">
            <div class="service hover_service text-center">
              <div class="icon"><i class="icon-circle-compass"></i></div>
              <div class="text">
                <h3>Brand Identity</h3>
                <p>Under Construction.</p>
              </div>
            </div>
          </div>

          <div class="col-md-4 probootstrap-animate" data-animate-effect="fadeIn">
            <div class="service hover_service text-center">
              <div class="icon"><i class="icon-lightbulb"></i></div>
              <div class="text">
                <h3>Creative Ideas</h3>
                <p>Under Construction.</p>
              </div>  
            </div>
          </div>
          <div class="col-md-4 probootstrap-animate" data-animate-effect="fadeIn">
            <div class="service hover_service text-center">
              <div class="icon"><i class="icon-magnifying-glass2"></i></div>
              <div class="text">
                <h3>Search Engine Friendly</h3>
                <p>Under Construction.</p>
              </div>
            </div>
          </div>
          <div class="col-md-4 probootstrap-animate" data-animate-effect="fadeIn">
            <div class="service hover_service text-center">
              <div class="icon"><i class="icon-browser2"></i></div>
              <div class="text">
                <h3>Easy Customization</h3>
                <p>Under Construction.</p>
              </div>
            </div>
          </div>
        </div>
        <!-- END row -->
        <div class="row mt50">
          <div class="col-md-12 text-center">
            <a href="services.html" class="btn btn-primary btn-lg" role="button">View all our services</a>
          </div>
        </div>
      </div>
    </section>

    <section class="probootstrap-section probootstrap-bg-white ">
      <div class="owl-carousel owl-work">
        <div class="item">
          <a href="portfolio-single.html">
            <img src="img/work_1.jpg" alt="#">
          </a>
        </div>
        <div class="item">
          <a href="portfolio-single.html">
            <img src="img/work_2.jpg" alt="#">
          </a>
        </div>
        <div class="item">
          <a href="portfolio-single.html">
            <img src="img/work_3.jpg" alt="#">
          </a>
        </div>
        <div class="item">
          <a href="portfolio-single.html">
            <img src="img/work_4.jpg" alt="#">
          </a>
        </div>  
        <div class="item">
          <a href="portfolio-single.html">
            <img src="img/work_5.jpg" alt="#">
          </a>
        </div>
        <div class="item">
          <a href="portfolio-single.html">
            <img src="img/work_6.jpg" alt="#">
          </a>
        </div>
        <div class="item">
          <a href="portfolio-single.html">
            <img src="img/work_7.jpg" alt="#">
          </a>
        </div>
      </div>
    </section>      
    
    <section class="probootstrap-section proboostrap-clients probootstrap-bg-white probootstrap-zindex-above-showcase">
      <div class="container">

        <div class="row">
          <div class="col-md-6 col-md-offset-3 text-center section-heading probootstrap-animate">
            <h2>Trusts Us</h2>
            <p class="lead">Description.</p>
          </div>
        </div>
        <!-- END row -->
        <div class="row">
          <div class="col-md-3 col-sm-6 col-xs-6 text-center client-logo probootstrap-animate" data-animate-effect="fadeIn">
            <img src="img/client1.png" class="img-responsive" alt="#">
          </div>
          <div class="col-md-3 col-sm-6 col-xs-6 text-center client-logo probootstrap-animate" data-animate-effect="fadeIn">
            <img src="img/client2.png" class="img-responsive" alt="#">
          </div>
          <div class="clearfix visible-sm-block visible-xs-block"></div>
          <div class="col-md-3 col-sm-6 col-xs-6 text-center client-logo probootstrap-animate" data-animate-effect="fadeIn">
            <img src="img/client3.png" class="img-responsive" alt="#">
          </div>
          <div class="col-md-3 col-sm-6 col-xs-6 text-center client-logo probootstrap-animate" data-animate-effect="fadeIn">
            <img src="img/client4.png" class="img-responsive" alt="#">
          </div>          
          
        </div>
      </div>
    </section>


    <section class="probootstrap-section">
      <div class="container">
        <div class="row">
          <div class="col-md-6">
            <div class="service left-icon probootstrap-animate" data-animate-effect="fadeInLeft">
              <div class="icon"><i class="icon-mobile3"></i></div>
              <div class="text">
                <h3>Responsive Design</h3>
                <p>Under Construction.</p>
              </div>  
            </div>
            <div class="service left-icon probootstrap-animate" data-animate-effect="fadeInLeft">
              <div class="icon"><i class="icon-presentation"></i></div>
              <div class="text">
                <h3>Business Solutions</h3>
                <p>Under Construction.</p>
              </div>
            </div>
            <div class="service left-icon probootstrap-animate" data-animate-effect="fadeInLeft">
              <div class="icon"><i class="icon-circle-compass"></i></div>
              <div class="text">
                <h3>Brand Identity</h3>
                <p>Under Construction.</p>
              </div>
            </div>
          </div>
          <div class="col-md-6">
            <div class="service left-icon probootstrap-animate" data-animate-effect="fadeInLeft">
              <div class="icon"><i class="icon-lightbulb"></i></div>
              <div class="text">
                <h3>Creative Ideas</h3>
                <p>Under Construction.</p>
              </div>  
            </div>
            
            <div class="service left-icon probootstrap-animate" data-animate-effect="fadeInLeft">
              <div class="icon"><i class="icon-magnifying-glass2"></i></div>
              <div class="text">
                <h3>Search Engine Friendly</h3>
                <p>Under Construction.</p>
              </div>
            </div>
            
            <div class="service left-icon probootstrap-animate" data-animate-effect="fadeInLeft">
              <div class="icon"><i class="icon-browser2"></i></div>
              <div class="text">
                <h3>Easy Customization</h3>
                <p>Under Construction.</p>
              </div>
            </div>

          </div>
        </div>
        <!-- END row -->
      </div>
    </section>

    <section class="probootstrap-section probootstrap-border-top probootstrap-bg-white">
      <div class="container">
        <div class="row">
          <div class="col-md-6 col-md-offset-3 text-center section-heading probootstrap-animate">
            <h2>Testimonial</h2>
          </div>
        </div>
        <!-- END row -->
        <div class="row">
          <div class="col-md-12">
            <div class="owl-carousel owl-carousel-fullwidth">
              <div class="item">

                <div class="probootstrap-testimony-wrap text-center">
                  <figure>
                    <img src="img/person_1.jpg" alt="Free Bootstrap Template by uicookies.com">
                  </figure>
                  <blockquote class="quote">&ldquo;Design must be functional and functionality must be translated into visual aesthetics, without any reliance on gimmicks that have to be explained.&rdquo; <cite class="author">&mdash; Ferdinand A. Porsche <br> <span>Design Lead at AirBNB</span></cite></blockquote>
                </div>

              </div>
              <div class="item">
                <div class="probootstrap-testimony-wrap text-center">
                  <figure>
                    <img src="img/person_2.jpg" alt="Free Bootstrap Template by uicookies.com">
                  </figure>
                  <blockquote class="quote">&ldquo;Creativity is just connecting things. When you ask creative people how they did something, they feel a little guilty because they didn?t really do it, they just saw something. It seemed obvious to them after a while.&rdquo; <cite class="author">&mdash; Steve Jobs <br> <span>Co-Founder Square</span></cite></blockquote>
                </div>
              </div>
              <div class="item">
                <div class="probootstrap-testimony-wrap text-center">
                  <figure>
                    <img src="img/person_3.jpg" alt="Free Bootstrap Template by uicookies.com">
                  </figure>
                  <blockquote class="quote">&ldquo;I think design would be better if designers were much more skeptical about its applications. If you believe in the potency of your craft, where you choose to dole it out is not something to take lightly.&rdquo; <cite class="author">&mdash; Frank Chimero <br> <span>Creative Director at Twitter</span></cite></blockquote>
                </div>
              </div>
              
            </div>
          </div>
        </div>
        <!-- END row -->
      </div>
    </section>
    
 
    <footer class="probootstrap-footer">
      <div class="container">
        <div class="row">
          <div class="col-md-6">
            <div class="probootstrap-footer-widget">
              <h3>Paragraph</h3>
              <p>What we Do ,Is what we are showing the World - Team Event.</p>
              <ul class="probootstrap-footer-social">
                <li><a href="#"><i class="icon-twitter"></i></a></li>
                
                <li><a href="#"><i class="icon-facebook"></i></a></li>
                
              </ul>
            </div>
          </div>
          <div class="col-md-6">
            <div class="row">
              <div class="col-md-4">
                <div class="probootstrap-footer-widget">
                  
               
                </div>
              </div>
              <div class="col-md-4">
                <div class="probootstrap-footer-widget">
                  <h3>Links</h3>
                  <ul>
                    <li><a href="#">Knowledge Base</a></li>
                    <li><a href="#">Career</a></li>
                    <li><a href="#">Press Releases</a></li>
                    <li><a href="#">Terms of services</a></li>
                    <li><a href="#">Privacy Policy</a></li>
                  </ul>
                </div>
              </div>
              
            </div>
          </div>
          
          
        </div>
        <!-- END row -->
        <div class="row">
          <div class="col-md-12 copyright clear">
            <p class="p_left"><small>&copy; 2017 <a href="#">EVENT | An Event site </a>. All Rights Reserved. <br> Designed &amp; Developed with <i class="icon icon-heart"></i> by <a href="https://uicookies.com/">EVENT Team</a></small></p>
            <p class="p_right"> 
            <span class="span1">0</span>
            <span class="span1">0</span>
            <span class="span1">0</span>
            <span class="span1">6</span>
            <span class="span1">3</span>
            <span class="span1">0</span>
            <br />
            <!-- <a href='https://www.symptoma.it/'>symptoma.it</a> <script type='text/javascript' src='https://www.freevisitorcounters.com/auth.php?id=6cb17291dc4110996029c00039af3ed6c0e08056'></script>
<script type="text/javascript" src="https://www.freevisitorcounters.com/en/home/counter/488264/t/13"></script> -->
            </p>
          </div>
        
        
        </div>
      </div>
    </footer>   
    

    <!-- Modal login -->
    <form action="validate.jsp" method="post">
    <div class="modal fadeInUp probootstrap-animated" id="loginModal" tabindex="-1" role="dialog" aria-labelledby="loginModalLabel" aria-hidden="true">
      <div class="vertical-alignment-helper">
        <div class="modal-dialog modal-md vertical-align-center">
          <div class="modal-content">
            <button type="button" class="close" data-dismiss="modal" aria-hidden="true"><i class="icon-cross"></i></button>
            <div class="probootstrap-modal-flex">
              <div class="probootstrap-modal-figure" style="background-image: url(img/modal_bg.png);"></div>
              <div class="probootstrap-modal-content">
                <form action="#" class="probootstrap-form">
                  <div class="form-group">
                    <input type="text" class="form-control" name="email" placeholder="Email" required>
                  </div> 
                  <div class="form-group">
                    <input type="password" class="form-control" name="pass" placeholder="Password" required>
                  </div> 
                  <div class="form-group clearfix mb40">
                    <label for="remember" class="probootstrap-remember"><input type="checkbox" id="remember"> Remember Me</label>
                    <a href="#" class="probootstrap-forgot">Forgot Password?</a>
                  </div>
                  <div class="form-group text-left">
                    <div class="row">
                      <div class="col-md-6">
                        <input type="submit" class="btn btn-primary btn-block" value="Sign In">
                      </div>
                    </div>
                  </div>
                  
                </form>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    </form>
    <!-- END modal login -->
    
    <!-- Modal signup -->
    <div class="modal fadeInUp probootstrap-animated" id="signupModal" tabindex="-1" role="dialog" aria-labelledby="signupModalLabel" aria-hidden="true">
      <div class="vertical-alignment-helper">
        <div class="modal-dialog modal-md vertical-align-center">
          <div class="modal-content">
            <button type="button" class="close" data-dismiss="modal" aria-hidden="true"><i class="icon-cross"></i></button>
            <div class="probootstrap-modal-flex">
              <div class="probootstrap-modal-figure" style="background-image: url(img/modal_bg.png);"></div>
              <div class="probootstrap-modal-content">
                <form action="/jsplogin/INSERT2.jsp" method="post" class="probootstrap-form">
                  <div class="form-group">
                      <input type="text" class="form-control" placeholder="Full Name" name="username" maxlength="20" required="">
                  </div> 
                  <div class="form-group">
                      <input type="date" class="form-control" placeholder="Date of Birth" name="dob" required="">
                  </div> 
                  <div class="form-group">
                      <input type="text" class="form-control" placeholder="Email" name="email" pattern="[^@]*@[^@]*" required>
                  </div> 
                    <div class="form-group">
                        <input type="password" class="form-control" placeholder="Type Password" name="pass" required>
                  </div>
                    <div class="form-group">
                        <input type="password" class="form-control" placeholder="Re-type Password" name="pass" required>
                  </div>
                  <div class="form-group clearfix mb40">
                    <label for="remember" class="probootstrap-remember"><input type="checkbox" id="remember"> Remember Me</label>
                    <a href="#" class="probootstrap-forgot">Forgot Password?</a>
                  </div>
                  <div class="form-group text-left">
                    <div class="row">
                      <div class="col-md-6">
                        <input type="submit" class="btn btn-primary btn-block" data-toggle="modal" data-target="#myModal" value="Sign Up">
                      </div>
                    </div>
                    
                  </div>
                  
                </form>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <!-- END modal signup -->
    
    

    <script src="js/scripts.min.js"></script>
    <script src="js/custom.min.js"></script>

  </body>
</html>