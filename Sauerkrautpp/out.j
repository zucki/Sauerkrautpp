.class public Spp
.super java/lang/Object
.method public static hoch(II)I
.limit stack 10000
.limit locals 10000
ldc 1
istore 2
ldc 0
istore 3
for_head_label_0:
iload 3
i2l
iload 1
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
iload 2
iload 0
imul
istore 2
iload 3
ldc 1
iadd
istore 3
goto for_head_label_0
for_end_label_0:
iload 2
ireturn
.end method
.method public static fak(I)I
.limit stack 10000
.limit locals 10000
iload 0
i2l
ldc 0
i2l
lcmp
dup
imul
i2l
ldc 0
i2l
lcmp
dup
imul
ldc 1
isub
dup
imul
ifeq if_label_1
ldc 1
ireturn
if_label_1:
iload 0
iload 0
ldc 1
isub
invokestatic Spp/fak(I)I
imul
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
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc 2
ldc 10
invokestatic Spp/hoch(II)I
invokevirtual java/io/PrintStream/println(I)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc 5
invokestatic Spp/fak(I)I
invokevirtual java/io/PrintStream/println(I)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc 1
i2l
ldc 0
i2l
lcmp
dup
imul
ldc 1
isub
dup
imul
invokevirtual java/io/PrintStream/println(I)V
return
.end method
