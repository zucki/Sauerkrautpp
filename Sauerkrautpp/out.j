.class public Spp
.super java/lang/Object
.method public static test(II)I
.limit stack 10000
.limit locals 10000
iload 0
iload 1
iadd
ireturn
.end method
.method public <init>()V
aload_0
invokenonvirtual java/lang/Object/<init>()V
return
.end method

.method public static main([Ljava/lang/String;)V
.limit stack 10000
.limit locals 10000
ldc 1
ldc 2
invokestatic Spp/test(II)I
istore 2
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 2
invokevirtual java/io/PrintStream/println(I)V
return
.end method
