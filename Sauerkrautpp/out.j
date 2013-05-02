.class public Spp
.super java/lang/Object
.method public <init>()V
aload_0
invokenonvirtual java/lang/Object/<init>()V
return
.end method

.method public static main([Ljava/lang/String;)V
.limit stack 10000
.limit locals 10000
ldc 0
istore 0
for_head_label_0:
iload 0
i2l
ldc 10
i2l
lcmp
ldc 1
iadd
i2l
ldc 0
i2l
lcmp
ldc 1
isub
dup
imul
ifeq for_end_label_0
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 0
invokevirtual java/io/PrintStream/println(I)V
iload 0
ldc 1
iadd
istore 0
goto for_head_label_0
for_end_label_0:
return
.end method
