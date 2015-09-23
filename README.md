This is an example application of a blog post:

* [Gradle Tutorial : Part 4 : Java Web Applications](http://rominirani.com/2014/08/12/gradle-tutorial-part-4-java-web-applications/)

You can package the application by running one of the following commands at command prompt:

    gradle assemble (runs only the tasks required to create the jar file)
    gradle build (runs the full build)
    
You can can run the website by the following command at command prompt:

    jettyRun - Uses your files as and where they are and deploys them to Jetty.
    jettyRunWar - Assembles the webapp into a war and deploys it to Jetty.
    jettyStop - Stops Jetty.


You visit this website throw the below url:

    http://localhost:8080/product/daystogo