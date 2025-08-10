#target name : dependencies
#<tab> commands to generate target

object.o : main.c sum.c product.c diff.c division.c
	gcc main.c sum.c product.c diff.c division.c -c

all : main.o sum.o product.o diff.o division.o
	gcc main.o sum.o product.o diff.o division.o -o all.out

run : all
	 ./all.out