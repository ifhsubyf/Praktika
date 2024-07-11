<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="text"/>

    <xsl:template match="/">
        <xsl:apply-templates select="Paper/Publication"/>
    </xsl:template>

    <xsl:template match="Publication">
        Title: <xsl:value-of select="Title"/>&#10;
        Type: <xsl:value-of select="Type"/>&#10;
        Monthly: <xsl:value-of select="Monthly"/>&#10;
        Color: <xsl:value-of select="Chars/Color"/>&#10;
        Volume: <xsl:value-of select="Chars/Volume"/>&#10;
        <xsl:if test="Type = 'журнал' or Type = 'буклет'">
            Glossy: <xsl:value-of select="Chars/Glossy"/>&#10;
        </xsl:if>
        <xsl:if test="Type = 'газета' or Type = 'журнал'">
            Subscription Index: <xsl:value-of select="Chars/SubscriptionIndex"/>&#10;
        </xsl:if>
        &#10;
    </xsl:template>
</xsl:stylesheet>