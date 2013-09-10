fitnesseworkshop
================

Code for a FitNesse Workshop held for CSI - Steria Norway september 2013

Thing to do for development:
* mvn install:install-file -Dfile=fitlibrary-2.0.jar -DgroupId=org.fitnesse -DartifactId=fitlibrary -Dpackaging=jar -Dversion=2.0

To run it in standalone mode:
* mvn dependency:copy-dependencies
* run runFitnesse.bat
* point your browser to http://localhost
