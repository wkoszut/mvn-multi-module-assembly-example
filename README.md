mvn-multi-module-assembly-example
=================================

A project using modules in maven with assembly plugin.

## Goal
Create distribution directory:
+bin
+-classes - contains all unpacked classes and resources that are necessary to run application
+-lib - contains all third party libraries

## Modules
* api - public API
* standalone - contains
* db - database access for modules web and standalone
* web - web interface, depends on api and db

To build project run command:
'''
mvn package
...
[INFO] Reactor Summary:
[INFO]
[INFO] mvn-multi-module .................................. SUCCESS [0.001s]
[INFO] api ............................................... SUCCESS [0.917s]
[INFO] db ................................................ SUCCESS [0.118s]
[INFO] web ............................................... SUCCESS [0.464s]
[INFO] standalone ........................................ SUCCESS [0.593s]
[INFO] distribution ...................................... SUCCESS [0.763s]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 3.112s
[INFO] Finished at: Thu Feb 06 15:48:25 CET 2014
[INFO] Final Memory: 8M/81M
[INFO] ------------------------------------------------------------------------

'''

after that in following directory You will find distribution

'''
mvn-multi-module-assembly-example/distribution/target/distribution-1.0.0-SNAPSHOT-bin
'''

run following command to run application
'''
java -classpath classes:lib/log4j-1.2.17.jar com.synapsis.mvn.App
'''
