# What's Cooking in Maven?
This repository contains the demo projects for my talk ["What's Cooking in Maven?"](https://maarten.mulders.it/talks/#whats-cooking-in-maven).

## [Maven Wrapper](https://github.com/mthmulders/whats-cooking-maven-demos/tree/main/maven-wrapper)
The Maven Wrapper lets you ensure a user of your Maven build has everything necessary to run your Maven build.
As an additional benefit, you can ensure all users of your Maven build will use the same version of Maven when building the project.

## [Build/Consumer POM](https://github.com/mthmulders/whats-cooking-maven-demos/tree/main/build-consumer)
This project shows how the "build" POM can be different from the "consumer" POM.

## [Improved Reactor](https://github.com/mthmulders/whats-cooking-maven-demos/tree/main/improved-reactor)
The reactor is the backbone of multi module projects in Maven.
This project shows a couple of new use cases that the Reactor will support from Maven 4 onward.

## [Maven Daemon](https://github.com/mthmulders/whats-cooking-maven-demos/tree/main/maven-daemon)
The Maven Daemon is an effort to speed up Maven builds using a long living background process (the _daemon_).
This saves starting the Java Virtual Machine for every Maven invocation.
It also allows for more Just-In-Time (JIT) compiler optimisations to happen.
Finally, Maven Plugin definitions can be reused over multiple builds.

## Test, Reproduce, Report
As mentioned in the talk, you can help the community using these three simple steps:
1. 🧪 test
1. 🛠️ reproduce
1. 📃 report

You can manually build a snapshot of Maven from the source code, or use these utility packages:

For macOS and Linux
```bash
brew install mthmulders/maven-snapshot/maven-snapshot
```

For Windows
```cmd
choco install maven-snapshot
```

Please note that these are unstable and unofficial packages, primary targeted at Maven developers or early-access testers.

## License
These projects are released in the public domain under the terms of the MIT license.
See the [LICENSE file](https://github.com/mthmulders/whats-cooking-maven-demos/blob/main/LICENSE) for details.