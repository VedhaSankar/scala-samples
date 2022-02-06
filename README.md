# scala-samples

## Scala Installation - Ubuntu

```
$ curl -fL https://github.com/coursier/launchers/raw/master/cs-x86_64-pc-linux.gz | gzip -d > cs
$ chmod +x cs
$ ./cs setup
    Add ~/.local/share/coursier/bin to your PATH by choosing 'y' during the set-up
```

Check your set-up with:
```
$ scala -version
Scala code runner version 2.13.7 -- Copyright 2002-2021, LAMP/EPFL and Lightbend, Inc.
```

Run the command 
```sbt new scala/scala3.g8``` to create a Scala 3 project, or ```sbt new scala/hello-world.g8``` to create a Scala 2 project. This pulls a project template from GitHub. It will also create a target folder, which you can ignore.

* Install Scala (Metals) for VSCode

* cd into hello-world.
* Run ```sbt```. This opens up the sbt console.
Type ```~run```. This is optional and causes sbt to re-run on every file save, allowing for a fast edit/run/debug cycle. sbt will also generate a target directory which you can ignore.
* When you’re finished experimenting with this project, press [Enter] to interrupt the run command. Then type exit or press [Ctrl+D] to exit sbt and return to your command line prompt.

## Spark Installation

```
$ sudo apt-get update
$ sudo apt-get install default-jdk 
$ java –version
$ sudo tar xvf spark-2.3.1-bin-hadoop2.7.tgz -C /usr/local/spark
Add Spark path to bash file:
$ nano ~/.bashrc
```

Add below code snippet to the bash file:
```
SPARK_HOME=/usr/local/spark
export PATH=$SPARK_HOME/bin:$PATH
```

```
source ~/.bashrc
```
Go to the Bin Directory and execute the spark shell:
```
./usr/local/spark/bin/spark-shell
```
Visit https://medium.com/beeranddiapers/installing-apache-spark-on-ubuntu-8796bfdd0861


References:

[https://docs.scala-lang.org/getting-started/index.html](https://docs.scala-lang.org/getting-started/index.html)