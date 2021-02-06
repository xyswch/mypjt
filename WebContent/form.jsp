<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>form</title>
</head>
<body>
	<form action="add.jsp" method="POST">
      <table>
        <tr>
          <td>pName</td>
          <td><input type="text" name="pName"/></td>
        </tr>
        <tr>
          <td>origin</td>
          <td><input type="text" name="origin"/></td>
        </tr>
        <tr>
          <td>price</td>
          <td><input type="text" name="price"/></td>
        </tr>
        <tr>
          <td>inventory</td>
          <td><input type="text" name="inventory"/></td>
        </tr>
        <tr>
          <td colspan="2"><input type="submit" value="submit"/></td> 
        </tr>
      </table>
	</form>
</body>
</html>