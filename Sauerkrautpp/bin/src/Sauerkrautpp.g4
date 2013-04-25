grammar Sauerkrautpp;

start: statement;

deklaration: typ=TYP name=NAME
;

init: typ=TYP name=NAME 'ist' wert=ausdruck 			#Initialisierung
				| name=NAME 'ist' wert=ausdruck 		#Zuweisung
;

function_decl: 'funktion' name=NAME 'nimmt' arglist 'gibt' typ=TYP 'zurueck' statement
;

print_func: 'gib' ausdruck 'aus'
;

arg: typ=TYP name=NAME
;

arglist: LKLAMMER RKLAMMER								#EmptyArglist
				| LKLAMMER args RKLAMMER				#FullArglist
;

args: arg             									#Argument
				| left=arg '/' right=args   			#Arguments
;

function_call: name=NAME LKLAMMER ausdruecke RKLAMMER
;

ausdruecke: ausdruck
				| ausdruecke '/' ausdruecke
;

// punkt
lstatement: ausdruck '.'
				| init '.'
				| deklaration '.'
				| print_func '.'
				| function_call '.'
				;

statement: lstatement
				| '?' bstatement '!'
				| for_loop
				| while_loop
				| if_
				| function_decl
				;

bstatement: statement
				| bstatement bstatement
				;

ausdruck: links=ausdruck 'mal' rechts=ausdruck #Multiplikation
				| links=ausdruck 'minus' rechts=ausdruck #Minus
				| links=ausdruck 'plus' rechts=ausdruck #Plus
				| links=ausdruck 'geteiltdurch' rechts=ausdruck #Division
				| links=ausdruck 'oder' rechts=ausdruck #Oder
				| links=ausdruck 'und' rechts=ausdruck #Und
				| links=ausdruck 'gleich' rechts=ausdruck #Gleich
				| links=ausdruck 'kleiner' rechts=ausdruck #Kleiner
				| links=ausdruck 'kleinergleich' rechts=ausdruck #Kleinergleich
				| links=ausdruck 'groesser' rechts=ausdruck #Groesser
				| links=ausdruck 'groessergleich' rechts=ausdruck #Groessergleich
				| 'nicht' links=ausdruck #Nicht
				| links=ausdruck 'ungleich' rechts=ausdruck #Ungleich
                | LKLAMMER inKlammer=ausdruck RKLAMMER #Klammer
                | ZAHL #Zahl
                | NAME #Variable
                | BOOL #Wahrheitswert
                ;

// For-Schleife
for_loop: 'fuer'^ for_cntrl statement
  ;

for_cntrl: LKLAMMER! init SEMICOLON! ausdruck SEMICOLON! init RKLAMMER!
  ;

// While-Schleife
while_loop: 'solange'^ while_cntrl statement
  ;

while_cntrl: LKLAMMER! ausdruck RKLAMMER!
  ;

// if-else
if_: 'wenn' if_cntrl then=statement
				| 'wenn' if_cntrl then_body=statement else_
;

if_cntrl: LKLAMMER! ausdruck RKLAMMER!
;

else_: 'ansonsten' else_body=statement
				| 'ansonsten wenn' elif_body=statement
				| 'ansonsten wenn' elif_body=statement else_
;

ZAHL: [0-9]+;
BOOL: ('wahr'|'falsch');
WHITE: [\r\n\t ]+ -> skip ;
LKLAMMER: '<';
RKLAMMER: '>';
SEMICOLON: '/';
TYP: ('zahl'|'wahrheitswert');
NAME: [a-zA-Z_]+;