<%--
refer http://teethgrinder.co.uk/open-flash-chart/gallery-bar.php
 --%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="org.openflashchart.Graph" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%-- GalleryBar chart --%>
<%
org.openflashchart.bar_outline aBar = new org.openflashchart.bar_outline("50", "#9933CC", "#8010A0");
aBar.key("Page Views", 10);
java.util.Random random = new java.util.Random();
for(int i=0;i<9;i++){
	int x = random.nextInt(10);
	aBar.data.add(""+x);
	//aBar.data.add("6");
}

org.openflashchart.Graph g = new org.openflashchart.Graph();
g.title("Bar Chart", "{font-size:20px;}");
// BAR CHART
g.data_sets.add(aBar);
// X axis tweeks:
g.set_x_labels(java.util.Arrays.asList("January","February","March","April","May","June","July","August","September"));
// set the X axis to show every 2nd label:
g.set_x_label_style("10", "#9933CC", 0, 2, "");
// and tick every second value
g.set_x_axis_steps(2);

g.set_y_max(10);
g.y_label_steps(4);
g.set_y_legend("Open Flash Chart", 12, "#736AFF");

%>
<%= g.render()  %>

</body>
</html>