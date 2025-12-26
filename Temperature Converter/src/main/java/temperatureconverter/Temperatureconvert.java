package temperatureconverter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@SuppressWarnings("serial")
@WebServlet("/convert")
public class Temperatureconvert extends HttpServlet {
	  public void service(HttpServletRequest request, HttpServletResponse response) 
	            throws ServletException, IOException {
	        
	        response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	        
	        String celsiusStr = request.getParameter("celsius");
	        
	        out.println("<!DOCTYPE html>");
	        out.println("<html>");
	        out.println("<head>");
	        out.println("<title>Temperature Conversion Result</title>");
	        out.println("<meta charset='UTF-8'>");
	        out.println("<style>");
	        out.println("body {");
	        out.println("    font-family: 'Arial', sans-serif;");
	        out.println("    background: linear-gradient(135deg, #74b9ff, #0984e3);");
	        out.println("    height: 100vh;");
	        out.println("    display: flex;");
	        out.println("    justify-content: center;");
	        out.println("    align-items: center;");
	        out.println("    margin: 0;");
	        out.println("}");
	        out.println(".container {");
	        out.println("    background: white;");
	        out.println("    padding: 40px;");
	        out.println("    border-radius: 15px;");
	        out.println("    box-shadow: 0 10px 30px rgba(0, 0, 0, 0.2);");
	        out.println("    text-align: center;");
	        out.println("    width: 400px;");
	        out.println("}");
	        out.println("h1 {");
	        out.println("    color: #2d3436;");
	        out.println("    margin-bottom: 20px;");
	        out.println("}");
	        out.println(".result-box {");
	        out.println("    background: #f8f9fa;");
	        out.println("    padding: 25px;");
	        out.println("    border-radius: 10px;");
	        out.println("    margin: 25px 0;");
	        out.println("}");
	        out.println(".temperature-display {");
	        out.println("    display: flex;");
	        out.println("    justify-content: space-between;");
	        out.println("    align-items: center;");
	        out.println("    margin: 20px 0;");
	        out.println("    padding: 20px;");
	        out.println("    background: white;");
	        out.println("    border-radius: 10px;");
	        out.println("    box-shadow: 0 5px 15px rgba(0,0,0,0.1);");
	        out.println("}");
	        out.println(".celsius {");
	        out.println("    color: #0984e3;");
	        out.println("}");
	        out.println(".fahrenheit {");
	        out.println("    color: #e17055;");
	        out.println("}");
	        out.println(".temp-value {");
	        out.println("    font-size: 36px;");
	        out.println("    font-weight: bold;");
	        out.println("}");
	        out.println(".temp-unit {");
	        out.println("    font-size: 20px;");
	        out.println("    margin-left: 5px;");
	        out.println("}");
	        out.println(".arrow {");
	        out.println("    font-size: 30px;");
	        out.println("    color: #636e72;");
	        out.println("}");
	        out.println(".calculation {");
	        out.println("    background: #e8f4f8;");
	        out.println("    padding: 15px;");
	        out.println("    border-radius: 8px;");
	        out.println("    margin: 20px 0;");
	        out.println("    font-family: 'Courier New', monospace;");
	        out.println("}");
	        out.println(".back-btn {");
	        out.println("    background: #00b894;");
	        out.println("    color: white;");
	        out.println("    border: none;");
	        out.println("    padding: 12px 30px;");
	        out.println("    border-radius: 8px;");
	        out.println("    font-size: 16px;");
	        out.println("    font-weight: bold;");
	        out.println("    cursor: pointer;");
	        out.println("    text-decoration: none;");
	        out.println("    display: inline-block;");
	        out.println("    margin-top: 20px;");
	        out.println("}");
	        out.println(".back-btn:hover {");
	        out.println("    background: #00a085;");
	        out.println("    transform: translateY(-2px);");
	        out.println("}");
	        out.println(".icon {");
	        out.println("    font-size: 40px;");
	        out.println("    margin-bottom: 15px;");
	        out.println("}");
	        out.println(".error {");
	        out.println("    color: #d63031;");
	        out.println("    background: #ffeaa7;");
	        out.println("    padding: 15px;");
	        out.println("    border-radius: 8px;");
	        out.println("    margin: 20px 0;");
	        out.println("}");
	        out.println("</style>");
	        out.println("</head>");
	        out.println("<body>");
	        out.println("<div class='container'>");
	        out.println("<div class='icon'>🌡️</div>");
	        out.println("<h1>Conversion Result</h1>");
	        
	        try {
	            
	            double celsius = Double.parseDouble(celsiusStr);
	            
	            
	            double fahrenheit = (celsius * 9/5) + 32;
	            
	            // Display result
	            out.println("<div class='result-box'>");
	            out.println("<p style='color: #636e72;'>You entered:</p>");
	            
	            out.println("<div class='temperature-display'>");
	            out.println("<div class='celsius'>");
	            out.println("<div class='temp-value'>" + String.format("%.1f", celsius) + "</div>");
	            out.println("<div class='temp-unit'>°C</div>");
	            out.println("</div>");
	            
	            out.println("<div class='arrow'>→</div>");
	            
	            out.println("<div class='fahrenheit'>");
	            out.println("<div class='temp-value'>" + String.format("%.1f", fahrenheit) + "</div>");
	            out.println("<div class='temp-unit'>°F</div>");
	            out.println("</div>");
	            out.println("</div>");
	            
	            // Show calculation steps
	            out.println("<div class='calculation'>");
	            out.println("<p>Calculation Steps:</p>");
	            out.println("<p>F = (" + celsius + " × 9/5) + 32</p>");
	            out.println("<p>F = (" + (celsius * 9/5) + ") + 32</p>");
	            out.println("<p>F = " + fahrenheit + "</p>");
	            out.println("</div>");
	            
	            out.println("</div>");
	            
	            
	            
	        } catch (NumberFormatException e) {
	            out.println("<div class='error'>");
	            out.println("<h3>⚠️ Invalid Input</h3>");
	            out.println("<p>Please enter a valid number for temperature.</p>");
	            out.println("</div>");
	        } catch (Exception e) {
	            out.println("<div class='error'>");
	            out.println("<h3>❌ Error</h3>");
	            out.println("<p>An error occurred: " + e.getMessage() + "</p>");
	            out.println("</div>");
	        }
	        
	        
	        out.println("<a href='Temp.html' class='back-btn'>");
	        out.println("🔄 Convert Another Temperature");
	        out.println("</a>");
	        
	        out.println("</div>");
	        out.println("</body>");
	        out.println("</html>");
	        
	        out.close();
	    }

}
