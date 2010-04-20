JAVAC=javac
JAR=jar
JAVADOC=javadoc
JDKVER=1.6
JFLAGS=-source $(JDKVER) -target $(JDKVER)

DOCSDIR=javaDoc

SRC=RJScript.java

all: RJScript.jar

RJScript.jar: $(SRC)
	$(JAVAC) -d . $(JFLAGS) $(SRC)
	$(JAR) fc $@ .

docs: $(SRC)
	rm -rf $(DOCSDIR)
	mkdir $(DOCSDIR)
	$(JAVADOC) -d $(DOCSDIR) -author -version -breakiterator -link $(JAPIURL) $(SRC)

install: RJScript.jar
	-mkdir -p ../inst/java
	cp RJScript.jar ../inst/java/RJScript.jar

clean:
	rm -rf *.class RJScript.jar $(DOCSDIR)
