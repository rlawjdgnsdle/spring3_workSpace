<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %> <!-- false로 돼있으면 세션이 돌아가지 않는다 -->
<html>
<head>
	<title>Home</title>
	<script src="${context}/resources/js/app.js"></script>
<script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"57142",secure:"57151"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>
<body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-8" data-genuitec-path="/gms/src/main/webapp/WEB-INF/views/home.jsp">
<h1 data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-8" data-genuitec-path="/gms/src/main/webapp/WEB-INF/views/home.jsp">
	Hello world!
</h1>

<script>
	common.main('${context}');
</script>
</body>
</html>
