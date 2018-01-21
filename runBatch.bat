set myProjectpath=C:\Users\V I N E E T H\Desktop\javaTrainingProjects\VNSelfTrainingPrograms
echo %myProjectpath%
cd %myProjectpath%
set classpath=%myProjectpath%\bin;%myProjectpath%\lib\*
java org.testng.TestNG %myProjectpath%\testng.xml 
pause
