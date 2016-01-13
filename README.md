Demonstration of Powermock broken on Robolectric version 3.1-SNAPSHOT.

If you run (`./gradlew clean test`) on Robolectric `3.0`, the test passes. However, if you do that
on version `3.1-SNAPSHOT`, it fails with the following error:

    com.thoughtworks.xstream.converters.ConversionException: Cannot convert type org.apache.tools.ant.Project to type org.apache.tools.ant.Project
    ---- Debugging information ----
    class               : org.apache.tools.ant.Project$1
    required-type       : org.apache.tools.ant.Project$1
    converter-type      : com.thoughtworks.xstream.converters.reflection.ReflectionConverter
    path                : /org.powermock.modules.junit4.rule.PowerMockStatement$1/outer-class/fNext/this$1/outer-class/dependencyResolver/dependencyResolver/project/isLoggingMessage/outer-class
    line number         : 198
    class[1]            : org.apache.tools.ant.Project
    class[2]            : org.robolectric.internal.dependency.MavenDependencyResolver
    class[3]            : org.robolectric.internal.dependency.CachedDependencyResolver
    class[4]            : org.robolectric.RobolectricGradleTestRunner
    class[5]            : org.robolectric.RobolectricTestRunner$HelperTestRunner
    class[6]            : org.robolectric.RobolectricTestRunner$HelperTestRunner$1
    class[7]            : org.powermock.modules.junit4.rule.PowerMockStatement
    class[8]            : org.powermock.modules.junit4.rule.PowerMockStatement$1
    version             : not available
    -------------------------------
        at com.thoughtworks.xstream.converters.reflection.AbstractReflectionConverter.doUnmarshal(AbstractReflectionConverter.java:439)
        at com.thoughtworks.xstream.converters.reflection.AbstractReflectionConverter.unmarshal(AbstractReflectionConverter.java:263)
        at com.thoughtworks.xstream.core.TreeUnmarshaller.convert(TreeUnmarshaller.java:72)
        at com.thoughtworks.xstream.core.AbstractReferenceUnmarshaller.convert(AbstractReferenceUnmarshaller.java:65)
        at com.thoughtworks.xstream.core.TreeUnmarshaller.convertAnother(TreeUnmarshaller.java:66)
        at com.thoughtworks.xstream.converters.reflection.AbstractReflectionConverter.unmarshallField(AbstractReflectionConverter.java:480)
        at com.thoughtworks.xstream.converters.reflection.AbstractReflectionConverter.doUnmarshal(AbstractReflectionConverter.java:412)
        at com.thoughtworks.xstream.converters.reflection.AbstractReflectionConverter.unmarshal(AbstractReflectionConverter.java:263)
        at com.thoughtworks.xstream.core.TreeUnmarshaller.convert(TreeUnmarshaller.java:72)
        at com.thoughtworks.xstream.core.AbstractReferenceUnmarshaller.convert(AbstractReferenceUnmarshaller.java:65)
        at com.thoughtworks.xstream.core.TreeUnmarshaller.convertAnother(TreeUnmarshaller.java:66)
        at com.thoughtworks.xstream.converters.reflection.AbstractReflectionConverter.unmarshallField(AbstractReflectionConverter.java:480)
        at com.thoughtworks.xstream.converters.reflection.AbstractReflectionConverter.doUnmarshal(AbstractReflectionConverter.java:412)
        at com.thoughtworks.xstream.converters.reflection.AbstractReflectionConverter.unmarshal(AbstractReflectionConverter.java:263)
        at com.thoughtworks.xstream.core.TreeUnmarshaller.convert(TreeUnmarshaller.java:72)
        at com.thoughtworks.xstream.core.AbstractReferenceUnmarshaller.convert(AbstractReferenceUnmarshaller.java:65)
        at com.thoughtworks.xstream.core.TreeUnmarshaller.convertAnother(TreeUnmarshaller.java:66)
        at com.thoughtworks.xstream.converters.reflection.AbstractReflectionConverter.unmarshallField(AbstractReflectionConverter.java:480)
        at com.thoughtworks.xstream.converters.reflection.AbstractReflectionConverter.doUnmarshal(AbstractReflectionConverter.java:412)
        at com.thoughtworks.xstream.converters.reflection.AbstractReflectionConverter.unmarshal(AbstractReflectionConverter.java:263)
        at com.thoughtworks.xstream.core.TreeUnmarshaller.convert(TreeUnmarshaller.java:72)
        at com.thoughtworks.xstream.core.AbstractReferenceUnmarshaller.convert(AbstractReferenceUnmarshaller.java:65)
        at com.thoughtworks.xstream.core.TreeUnmarshaller.convertAnother(TreeUnmarshaller.java:66)
        at com.thoughtworks.xstream.converters.reflection.AbstractReflectionConverter.unmarshallField(AbstractReflectionConverter.java:480)
        at com.thoughtworks.xstream.converters.reflection.AbstractReflectionConverter.doUnmarshal(AbstractReflectionConverter.java:412)
        at com.thoughtworks.xstream.converters.reflection.AbstractReflectionConverter.unmarshal(AbstractReflectionConverter.java:263)
        at com.thoughtworks.xstream.core.TreeUnmarshaller.convert(TreeUnmarshaller.java:72)
        at com.thoughtworks.xstream.core.AbstractReferenceUnmarshaller.convert(AbstractReferenceUnmarshaller.java:65)
        at com.thoughtworks.xstream.core.TreeUnmarshaller.convertAnother(TreeUnmarshaller.java:66)
        at com.thoughtworks.xstream.converters.reflection.AbstractReflectionConverter.unmarshallField(AbstractReflectionConverter.java:480)
        at com.thoughtworks.xstream.converters.reflection.AbstractReflectionConverter.doUnmarshal(AbstractReflectionConverter.java:412)
        at com.thoughtworks.xstream.converters.reflection.AbstractReflectionConverter.unmarshal(AbstractReflectionConverter.java:263)
        at com.thoughtworks.xstream.core.TreeUnmarshaller.convert(TreeUnmarshaller.java:72)
        at com.thoughtworks.xstream.core.AbstractReferenceUnmarshaller.convert(AbstractReferenceUnmarshaller.java:65)
        at com.thoughtworks.xstream.core.TreeUnmarshaller.convertAnother(TreeUnmarshaller.java:66)
        at com.thoughtworks.xstream.converters.reflection.AbstractReflectionConverter.unmarshallField(AbstractReflectionConverter.java:480)
        at com.thoughtworks.xstream.converters.reflection.AbstractReflectionConverter.doUnmarshal(AbstractReflectionConverter.java:412)
        at com.thoughtworks.xstream.converters.reflection.AbstractReflectionConverter.unmarshal(AbstractReflectionConverter.java:263)
        at com.thoughtworks.xstream.core.TreeUnmarshaller.convert(TreeUnmarshaller.java:72)
        at com.thoughtworks.xstream.core.AbstractReferenceUnmarshaller.convert(AbstractReferenceUnmarshaller.java:65)
        at com.thoughtworks.xstream.core.TreeUnmarshaller.convertAnother(TreeUnmarshaller.java:66)
        at com.thoughtworks.xstream.converters.reflection.AbstractReflectionConverter.unmarshallField(AbstractReflectionConverter.java:480)
        at com.thoughtworks.xstream.converters.reflection.AbstractReflectionConverter.doUnmarshal(AbstractReflectionConverter.java:412)
        at com.thoughtworks.xstream.converters.reflection.AbstractReflectionConverter.unmarshal(AbstractReflectionConverter.java:263)
        at com.thoughtworks.xstream.core.TreeUnmarshaller.convert(TreeUnmarshaller.java:72)
        at com.thoughtworks.xstream.core.AbstractReferenceUnmarshaller.convert(AbstractReferenceUnmarshaller.java:65)
        at com.thoughtworks.xstream.core.TreeUnmarshaller.convertAnother(TreeUnmarshaller.java:66)
        at com.thoughtworks.xstream.converters.reflection.AbstractReflectionConverter.unmarshallField(AbstractReflectionConverter.java:480)
        at com.thoughtworks.xstream.converters.reflection.AbstractReflectionConverter.doUnmarshal(AbstractReflectionConverter.java:412)
        at com.thoughtworks.xstream.converters.reflection.AbstractReflectionConverter.unmarshal(AbstractReflectionConverter.java:263)
        at com.thoughtworks.xstream.core.TreeUnmarshaller.convert(TreeUnmarshaller.java:72)
        at com.thoughtworks.xstream.core.AbstractReferenceUnmarshaller.convert(AbstractReferenceUnmarshaller.java:65)
        at com.thoughtworks.xstream.core.TreeUnmarshaller.convertAnother(TreeUnmarshaller.java:66)
        at com.thoughtworks.xstream.core.TreeUnmarshaller.convertAnother(TreeUnmarshaller.java:50)
        at com.thoughtworks.xstream.core.TreeUnmarshaller.start(TreeUnmarshaller.java:134)
        at com.thoughtworks.xstream.core.AbstractTreeMarshallingStrategy.unmarshal(AbstractTreeMarshallingStrategy.java:32)
        at com.thoughtworks.xstream.XStream.unmarshal(XStream.java:1206)
        at com.thoughtworks.xstream.XStream.unmarshal(XStream.java:1190)
        at com.thoughtworks.xstream.XStream.fromXML(XStream.java:1061)
        at com.thoughtworks.xstream.XStream.fromXML(XStream.java:1052)
        at org.powermock.classloading.DeepCloner.clone(DeepCloner.java:54)
        at org.powermock.classloading.ClassloaderExecutor.execute(ClassloaderExecutor.java:89)
        at org.powermock.classloading.ClassloaderExecutor.execute(ClassloaderExecutor.java:78)
        at org.powermock.modules.junit4.rule.PowerMockStatement.evaluate(PowerMockRule.java:49)
        at org.robolectric.RobolectricTestRunner$2.evaluate(RobolectricTestRunner.java:255)
        at org.robolectric.RobolectricTestRunner.runChild(RobolectricTestRunner.java:185)
        at org.robolectric.RobolectricTestRunner.runChild(RobolectricTestRunner.java:54)
        at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
        at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
        at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
        at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
        at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
        at org.robolectric.RobolectricTestRunner$1.evaluate(RobolectricTestRunner.java:151)
        at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
        at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
        at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:78)
        at com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:212)
        at com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:68)
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
        at com.intellij.rt.execution.application.AppMain.main(AppMain.java:140)
        