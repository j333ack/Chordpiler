/*
BSD License

Copyright (c) 2020, Tom Everett
All rights reserved.

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions
are met:

1. Redistributions of source code must retain the above copyright
   notice, this list of conditions and the following disclaimer.
2. Redistributions in binary form must reproduce the above copyright
   notice, this list of conditions and the following disclaimer in the
   documentation and/or other materials provided with the distribution.
3. Neither the name of Tom Everett nor the names of its contributors
   may be used to endorse or promote products derived from this software
   without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
"AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
(INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

// $antlr-format alignTrailingComments true, columnLimit 150, minEmptyLines 1, maxEmptyLinesToKeep 1, reflowComments false, useTab false
// $antlr-format allowShortRulesOnASingleLine false, allowShortBlocksOnASingleLine true, alignSemicolons hanging, alignColons hanging

grammar guitartab;

// Parser rules
song
	: 'BPM:' bpm tab+ EOF
	;
	
bpm
	: INTLITERAL
	|
	;

tab
    : 'Strums:' num_strums string+
	| string+
    ;
	
num_strums
	: INTLITERAL
	|
	;

string
    : note (position FRET)+
    ;

position
    : (finger | BARLNE)+
    ;
	
finger
	: FINGER
	;

note
    : BA
    | BB
    | BC
    | BD
    | BE
    | BF
    | BG
    | LA
    | LB
    | LC
    | LD
    | LE
    | LF
    | LG
    ;
	
// Lexer rules
BA
    : 'A'
    ;

BB
    : 'B'
    ;

BC
    : 'C'
    ;

BD
    : 'D'
    ;

BE
    : 'E'
    ;

BF
    : 'F'
    ;

BG
    : 'G'
    ;

LA
    : 'a'
    ;

LB
    : 'b'
    ;

LC
    : 'c'
    ;

LD
    : 'd'
    ;

LE
    : 'e'
    ;

LF
    : 'f'
    ;

LG
    : 'g'
    ;

FINGER
    : 'x'
    | 'o'
    ;

BARLNE
    : '-'
    ;

FRET
    : '|'
    ;	

fragment DIGIT
	: [0-9]
	;
	
INTLITERAL
	: DIGIT+
	;
	
WS
	: [ \n\r\t] -> skip
	;