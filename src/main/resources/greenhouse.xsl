<?xml version="1.0"?>

<xsl:stylesheet version="1.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <head>
                <meta charset="utf-8"/>
                <title>Green House</title>
            </head>

            <body>
                <h2>Flowers</h2>
                <table border="2">
                    <tr bgcolor="#00ffff">
                        <th>Name</th>
                        <th>Soil</th>
                        <th>Origin</th>
                        <th>Visual</th>
                        <th>Growing Tips</th>
                        <th>Multiplying</th>
                    </tr>
                    <xsl:for-each select="plants/flowers">
                        <xsl:sort select="growingTips/temperature"/>

                        <tr>
                            <td>
                                <xsl:value-of select="name"/>
                            </td>
                            <td>
                                <xsl:value-of select="soil"/>
                            </td>
                            <td>
                                <xsl:value-of select="origin"/>
                            </td>
                            <td>
                                <table width="100%">
                                    <tr>
                                        <th align="left">stem color</th>
                                        <td align="right">
                                            <xsl:value-of select="visual/stem_color"/>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th align="left">leaf color</th>
                                        <td align="right">
                                            <xsl:value-of select="visual/leaf_color"/>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th align="left">average plant size</th>
                                        <td align="right">
                                            <xsl:value-of select="visual/average_plant_size"/>
                                        </td>
                                    </tr>

                                </table>
                            </td>
                            <td>
                                <table width="100%">
                                    <tr>
                                        <th align="left">temperature</th>
                                        <td align="right">
                                            <xsl:value-of select="growingTips/temperature"/>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th align="left">lighting</th>
                                        <td align="right">
                                            <xsl:value-of select="growingTips/lighting"/>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th align="left">watering</th>
                                        <td align="right">
                                            <xsl:value-of select="growingTips/watering"/>
                                        </td>
                                    </tr>

                                </table>
                            </td>
                            <td>
                                <xsl:value-of select="multiplying"/>
                            </td>
                        </tr>
                    </xsl:for-each>
                </table>

            </body>
        </html>


    </xsl:template>
</xsl:stylesheet>