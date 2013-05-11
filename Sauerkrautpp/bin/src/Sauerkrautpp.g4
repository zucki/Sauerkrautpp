grammar Sauerkrautpp;

start: 'Programm<>' content=statement											#Program
				| declarations=function_decls 'Programm<>' content=statement	#ProgramWithDeclarations
;

function_decls: declaration=function_decl 								#FunctionDeclaration
				| declaration=function_decl rest=function_decls			#FunctionDeclarations
;

deklaration: typ=TYP name=NAME
;

init: typ=TYP name=NAME 'ist' wert=ausdruck 			#Initialisierung
				| name=NAME 'ist' wert=ausdruck 		#Zuweisung
;

function_decl: 'funktion' name=NAME 'nimmt' argumentlist=arglist 'gibt' typ=TYP 'zurueck' body=statement
;

print_func: 'gib' wert=ausdruck 'aus'
;

arg: typ=TYP name=NAME
;

arglist: LKLAMMER RKLAMMER								#EmptyArglist
				| LKLAMMER content=args RKLAMMER		#FullArglist
;

args: content=arg             							#Argument
				| left=arg '/' right=args   			#Arguments
;

function_call: name=NAME LKLAMMER RKLAMMER							#FunctionCallWithoutArgs
				| name=NAME LKLAMMER arguments=ausdruecke RKLAMMER	#FunctionCallWithArgs
;

ausdruecke: expr=ausdruck                              #EinzelAusdruck
				| expr=ausdruck '/' rest=ausdruecke    #MultiAusdruck
;

// punkt
lstatement: ausdruck '.'
				| init '.'
				| deklaration '.'
				| print_func '.'
				| function_call '.'
				| rueckgabe '.'
				;

rueckgabe: 'gib' expr=ausdruck 'zurueck'
;

statement: lstatement
				| klammerstatement
				| for_loop
				| while_loop
				| if_
				;

klammerstatement: '?' content=bstatement '!'
;

bstatement: statement
				| bstatement bstatement
				;

ausdruck: 'nicht' links=ausdruck 									#Nicht
				| links=ausdruck 'geteiltdurch' rechts=ausdruck 	#Division
				| links=ausdruck 'mal' rechts=ausdruck 				#Multiplikation
				| links=ausdruck 'minus' rechts=ausdruck 			#Minus
				| links=ausdruck 'plus' rechts=ausdruck 			#Plus
				| links=ausdruck 'oder' rechts=ausdruck 			#Oder
				| links=ausdruck 'und' rechts=ausdruck 				#Und
				| links=ausdruck 'gleich' rechts=ausdruck 			#Gleich
				| links=ausdruck 'kleiner' rechts=ausdruck 			#Kleiner
				| links=ausdruck 'kleinergleich' rechts=ausdruck 	#Kleinergleich
				| links=ausdruck 'groesser' rechts=ausdruck 		#Groesser
				| links=ausdruck 'groessergleich' rechts=ausdruck 	#Groessergleich
				| links=ausdruck 'ungleich' rechts=ausdruck 		#Ungleich
                | LKLAMMER inKlammer=ausdruck RKLAMMER 				#Klammer
                | ZAHL 	#Zahl
                | NAME #Variable
                | BOOL #Wahrheitswert
                | call=function_call #FunktionsAufruf
                ;

// For-Schleife
for_loop: 'fuer'^ LKLAMMER! initialization=init SEMICOLON! condition=ausdruck SEMICOLON! afterthought=init RKLAMMER! body=statement
  ;

// While-Schleife
while_loop: 'solange'^ control=while_cntrl body=statement
  ;

while_cntrl: LKLAMMER! condition=ausdruck RKLAMMER!
  ;

// if-else
if_: 'wenn' if_cntrl then=statement							#if_then
				| 'wenn' if_cntrl then_body=statement else_ #if_then_else
;

if_cntrl: LKLAMMER! expr=ausdruck RKLAMMER!
;

else_: 'ansonsten' else_body=statement
;

ZAHL: [0-9]+;
BOOL: ('wahr'|'falsch');
WHITE: [\r\n\t ]+ -> skip ;
LKLAMMER: '<';
RKLAMMER: '>';
SEMICOLON: '/';
TYP: ('zahl'|'wahrheitswert');
NAME: [a-zA-Z_]+;