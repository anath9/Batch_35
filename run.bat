set projectLocation=C:\Users\nived\Downloads\TestWorkSpace\Framework_Batch35
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml