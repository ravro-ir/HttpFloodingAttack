# Http Flooding Tools

A tools for bug bounty [Http Flooding Attack](https://en.wikipedia.org/wiki/HTTP_Flood) in the web application 


### Config Async 80 Thread
```java
        executor.setCorePoolSize(80);
        executor.setMaxPoolSize(80);
        executor.setQueueCapacity(80);
```
