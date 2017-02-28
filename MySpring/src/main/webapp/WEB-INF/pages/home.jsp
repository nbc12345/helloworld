<html>
<body>
      <div align="center">
          <h1>Department List</h1>
          <table border="1">
              <tr>
                <th>No</th>
                <th>Dept No</th>
                <th>Dept Name</th>
                <th>Location</th>
                <th>Location</th>
              </tr>
              <c:forEach var="dept" items="${chinh}" varStatus="status">
              <tr>
                  <td>${status.index + 1}</td>
                  
                  <td>${dept.idplayer}</td>
                  <td>${dept.name}</td>
					<td>${dept.name}</td>
					<td>${dept.name}</td>                    
              </tr>
              </c:forEach>                
          </table>
      </div>
  </body>
</html>
