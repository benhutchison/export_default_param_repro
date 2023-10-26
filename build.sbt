inThisBuild(scalaVersion := "3.3.1")

val module1 = project.in(file("module1"))

val module2 = project.in(file("module2")).dependsOn(module1)

