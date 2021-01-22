<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:template match="/Students">
    <html>
      <body>
        <h1 align="center">Students Table</h1>
        <table border="1" align="center">
          <tr>
            <th>Student Name</th>
            <th>Student id</th>
            <th>Student branch</th>
            <th>Student cgpa</th>
          </tr>
          <xsl:for-each select="student">
            <tr>
              <td><xsl:value-of select="name"/></td> 
              <td><xsl:value-of select="id"/></td> 
              <td><xsl:value-of select="branch"/></td> 
              <td><xsl:value-of select="cgpa"/></td> 
            </tr>
          </xsl:for-each>
        </table>
      </body>
    </html>
  </xsl:template>
  
</xsl:stylesheet>