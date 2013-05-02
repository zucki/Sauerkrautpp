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
.method public static legetest()I
.limit stack 10000
.limit locals 10000
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc 0
ldc 0
isub
ifge ge_label_0
ldc 0
goto ge_end_label_0
ge_label_0:
ldc 1
ge_end_label_0:
invokevirtual java/io/PrintStream/println(I)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc 1
ldc 0
isub
ifge ge_label_1
ldc 0
goto ge_end_label_1
ge_label_1:
ldc 1
ge_end_label_1:
invokevirtual java/io/PrintStream/println(I)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc 0
ldc 1
isub
ldc 0
isub
ifge ge_label_2
ldc 0
goto ge_end_label_2
ge_label_2:
ldc 1
ge_end_label_2:
invokevirtual java/io/PrintStream/println(I)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc 0
ldc 0
isub
ifle le_label_3
ldc 0
goto le_end_label_3
le_label_3:
ldc 1
le_end_label_3:
invokevirtual java/io/PrintStream/println(I)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc 1
ldc 0
isub
ifle le_label_4
ldc 0
goto le_end_label_4
le_label_4:
ldc 1
le_end_label_4:
invokevirtual java/io/PrintStream/println(I)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc 0
ldc 1
isub
ldc 0
isub
ifle le_label_5
ldc 0
goto le_end_label_5
le_label_5:
ldc 1
le_end_label_5:
invokevirtual java/io/PrintStream/println(I)V
ldc 1
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
invokestatic Spp/legetest()I
return
.end method
