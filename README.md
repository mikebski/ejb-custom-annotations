# EJB Demo WAR

## Description

This is an EJB project that shows how to create a custom annotation to allow a servlet to 
lookup beans in the application context.  The idea is that a bean can be annotated and implement
an interface.

This way, servlets or other components can support plugins that do something at various points 
during execution.  See the DemoServlet for an example.

See the explanation here: https://blog.mikeski.net/java/ee-custom-annotation-lookup/
