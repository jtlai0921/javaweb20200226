<%-- 
    Document   : empForm
    Created on : 2020/4/6, 下午 08:37:28
    Author     : teacher
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
     <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>    
        
            ID : <input type="text" id="uid" value="103"/><br/>
            Age : <input type="text" id="age" value="30"/><br/>
            FirstName : <input type="text" id="firstname" value="Shirly"/><br/>
            LastName : <input type="text" id="lastname" value="Lee"/><br/>
            <input type="button" id="bt" value="Send"/>
            <script>
                  $(document).ready(function(){
                        $("#bt").click(function(){     
                            alert("test");
                              $.post("MDBInsert.jsp",{"uid":$("#uid").val() , "age":$("#age").val() , "firstname":$("#firstname").val(),"lastname":$("#lastname").val()} , function(data){
                                     $("#div1").html(data);
                              });  
                        });
                  });
            </script>
            <div id="div1"> employee table show here</div>
    </body>
</html>
