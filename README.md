# web_service

java.lang.IllegalArgumentException: Invalid character found in method name. HTTP method names must be tokens
	at org.apache.coyote.http11.Http11InputBuffer.parseRequestLine(Http11InputBuffer.java:415) ~[tomcat-embed-core-9.0.24.jar:9.0.24]
	at org.apache.coyote.http11.Http11Processor.service(Http11Processor.java:292) ~[tomcat-embed-core-9.0.24.jar:9.0.24]
	at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:66) [tomcat-embed-core-9.0.24.jar:9.0.24]
	at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:860) [tomcat-embed-core-9.0.24.jar:9.0.24]
	at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1587) [tomcat-embed-core-9.0.24.jar:9.0.24]
	at org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:49) [tomcat-embed-core-9.0.24.jar:9.0.24]
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149) [na:1.8.0_222]
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624) [na:1.8.0_222]
	at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61) [tomcat-embed-core-9.0.24.jar:9.0.24]
	at java.lang.Thread.run(Thread.java:748) [na:1.8.0_222]

