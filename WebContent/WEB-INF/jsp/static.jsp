<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
   <head>
      <title>Spring Landing Page</title>
   </head>

   <body>
      <h2>Spring Landing Pag</h2>
      <p>Click below button to get a simple HTML page</p>
      
      <form:form method = "GET" action = "/FirstSpringMVCProject/staticPage">
         <table>
            <tr>
               <td>
                  <input type = "submit" value = "Get HTML Page"/>
               </td>
            </tr>
         </table>  
      </form:form>
      
      <form:form method = "GET" action = "/FirstSpringMVCProject/staticPage2">
         <table>
            <tr>
               <td>
                  <input type = "submit" value = "Get HTML Page2"/>
               </td>
            </tr>
         </table>  
      </form:form>
   </body>
   
</html>