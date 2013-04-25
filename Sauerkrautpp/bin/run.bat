cd C:\Users\smgug_000\workspace\Sauerkrautpp\
antlr4 .\Sauerkrautpp.g4 -no-listener -visitor
javac *.java -cp "C:\javalib\antlr-4.0-complete.jar"
grun Sauerkrautpp start -gui