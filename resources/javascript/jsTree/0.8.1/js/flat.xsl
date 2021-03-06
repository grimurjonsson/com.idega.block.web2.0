<?xml 
	version="1.0" 
	encoding="utf-8" 
	?>
<xsl:stylesheet 
	version="1.0" 
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	>
<xsl:output 
	method="html" 
	encoding="utf-8" 
	omit-xml-declaration="yes" 
	standalone="no" 
	indent="no" 
	media-type="text/xml" 
	/>

<xsl:template match="/">
	<ul>
	<xsl:for-each select="//item[not(@parent_id) or @parent_id=0]">
		<xsl:call-template name="nodes">
			<xsl:with-param name="node" select="." />
		</xsl:call-template>
	</xsl:for-each>
	</ul>
</xsl:template>

<xsl:template name="nodes">
	<xsl:param name="node" />
	<xsl:variable name="children" select="count(//item[@parent_id=$node/attribute::id]) &gt; 0" />
	
	<li>
	<xsl:attribute name="id"><xsl:value-of select="@id" /></xsl:attribute>
	<xsl:attribute name="rel"><xsl:value-of select="@type" /></xsl:attribute>
	<xsl:attribute name="class">
		<xsl:if test="position() = last()"> last </xsl:if>
		<xsl:choose>
			<xsl:when test="@state = 'open'"> open </xsl:when>
			<xsl:when test="$children or @hasChildren"> closed </xsl:when>
			<xsl:otherwise> leaf </xsl:otherwise>
		</xsl:choose>
		<xsl:value-of select="@class" />
	</xsl:attribute>
	<xsl:for-each select="@*">
		<xsl:if test="name() != 'id' and name() != 'class'">
			<xsl:attribute name="{name()}"><xsl:value-of select="." /></xsl:attribute>
		</xsl:if>
	</xsl:for-each>
	<xsl:for-each select="content/name">
		<a href="#">
		<xsl:attribute name="class"><xsl:value-of select="@lang" /></xsl:attribute>
		<xsl:attribute name="style">
			<xsl:choose>
				<xsl:when test="string-length(attribute::icon) > 0">background-image:url(<xsl:value-of select="@icon" />);</xsl:when>
				<xsl:otherwise></xsl:otherwise>
			</xsl:choose>
		</xsl:attribute><xsl:value-of select="." /></a>
	</xsl:for-each>
	<xsl:if test="$children or @hasChildren">
		<ul>
			<xsl:for-each select="//item[@parent_id=$node/attribute::id]">
				<xsl:call-template name="nodes">
					<xsl:with-param name="node" select="." />
				</xsl:call-template>
			</xsl:for-each>
		</ul>
	</xsl:if>
	</li>
</xsl:template>
</xsl:stylesheet>