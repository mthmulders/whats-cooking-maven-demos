# Build/Consumer POM
This project shows how the "build" POM can be different from the "consumer" POM.

You can:
- remove the `<parent>`/`<version>` element in the **app** and **lib** projects.
- remove the `<dependency>`/`<version>` element in the **app** project for the dependency on **lib**.
- inspect the installed **pom.xml** (in **~/.m2/repository**) and see the parent module no longer has a `<modules>` element - it's not relevant for the consumer.

## References

* [Build vs. Consumer POM (Apache Maven Wiki)](https://cwiki.apache.org/confluence/display/MAVEN/Build+vs+Consumer+POM)
* [Maven 4 snapshots for macOS and Linux](https://github.com/mthmulders/homebrew-maven-snapshot/)
* [Maven 4 snapshots for Windows](https://community.chocolatey.org/packages/maven-snapshot)
