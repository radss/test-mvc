<!DOCTYPE html>
<html lang="cs">
  <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
  </head>
  <body>
  
    <#list persons as person>
      Student name: ${person.name} ${person.surname}   <br/>
    </#list>
    
  </body>
</html>
