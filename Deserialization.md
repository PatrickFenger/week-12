# Deserialization in Java

The exploids described in this owasp chapter is very hard to get around and fix in general. It is widespread because it is in a Apache library to enable upload of classes to servers. 

For understand this exploid, there are several aspects  of Java coming into play, most of which you have not seen. 

* *Reflection* is how you access java code as it the programs themself are objects. Reflection allow you to:
	*  make instances of classes without `new` just fromt the name of the class.
	*  call methods on an object using just the String name of a method
	*  find all methods of a class, all fields of the class
	*  set and get fields of an object (even if they are private)
* *Class loaders* is how you add new classes to the virtual machine at runtime.
* *Serialization/deserialization* and object into bytes and back from bytes to object.

### Resources

* [OWASP 2017 - issue-8](https://www.owasp.org/index.php/Top_10-2017_A8-Insecure_Deserialization)
* [Intro to url-based class loading](http://www.oracle.com/technetwork/articles/java/classloaders-140370.html)
* [Detailed walkthrough](https://foxglovesecurity.com/2015/11/06/what-do-weblogic-websphere-jboss-jenkins-opennms-and-your-application-have-in-common-this-vulnerability/) of the java deserilization issue
* My gosh, the same issue exist for the [Jackson library](https://adamcaudill.com/2017/10/04/exploiting-jackson-rce-cve-2017-7525/) (JSON to Java object)

### Exercises
To set up a demo that shows the vulnability is somewhat beyond the scope of this class. Instead we will look at the three underlying Java technologies that play into this.

1. Reflection and classload - In pairs. 
	* One of you fork the repository for this week, and make a change to the TesterJester class, and upload the class file to the forked repository.
	* The other clones the repository, and change the MyLoader class to load from the forked repository of the other.

2. Which piece of code did you (in principle) use within the last hour that uses this technology?

3. Serialization/deserialization
	* You need to fork this repository - to commit and push the serialized object to a github file.
	* The deserializer reads from a local file. Change it so it will read of the file your coworker put in github using the SerialWriter and then commit and pushed.
	* Can you make it work? 
		* If so, try to change the `SerialObject` class minimally.
		* If not - why?
	* Try to change the `SerialReader` so it does not cast to `SerialObject`, but just prints using `toString()`. 
		* Why is there a difference in how it works?
