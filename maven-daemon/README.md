# Maven Daemon
The Maven Daemon is an effort to speed up Maven builds using a long living background process (the _daemon_).
This saves starting the Java Virtual Machine for every `mvn` invocation.
It also allows for more Just-In-Time (JIT) compiler optimisations to happen.
Finally, Maven Plugin definitions can be reused over multiple builds.