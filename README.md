# DLTK SDK(Java)

[![](https://github.com/dltk-ai/dltk-sdk-java/blob/master/java/img/dltk.png)](https://dltk.ai/)

DLTK renders a comprehensive spectrum of solutions that can be accessed by users on-demand from our pool of transformational technologies.

## Installation
1. Install java 

https://www.oracle.com/in/java/technologies/javase/javase-jdk8-downloads.html 

2. Install maven 

https://www.baeldung.com/install-maven-on-windows-linux-mac 

3. Create a Maven project or use the existing project and add the repository and dependency in pom.xml file where u want to use dltk-sdk-java repository as a maven dependency 
```
<repositories>
	<repository>
          <id>dltk-ai</id>
          <name>dltk-java-sdk</name>
          <url>https://github.com/dltk-ai/dltk-java-sdk/raw/master/</url>
        </repository>
</repositories>

<dependency> 

      <groupId>com.dltk</groupId>   
       <artifactId>dltk-ai</artifactId>   
       <version>1.0.0</version>  

</dependency> 
```
4. Add the following lines in java file which has main class. The below code is one of example related to dltk-sdk-java. 

In the below code give API KEY in place of “xxx”. 
```
DltkAiClient c = new DltkAiClient("xxx"); 
        JSONObject r = null; 
        try { 
            r = c.nerTagger("Apple is a Big Organization"); 
            System.out.print(r); 
        } catch (IOException e) { 
            e.printStackTrace(); 
        } 
```
5. Build the code and run it to get output. 

## License

The content of this project itself is licensed under [GNU LGPL, Version 3 (LGPL-3)](https://github.com/dltk-ai/dltk-sdk-java/blob/master/LICENSE)

