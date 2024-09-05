grammar Trig;

expr: func '(' NUMBER ')';

func: 'Sin' | 'Cos' | 'Tan';

NUMBER: [0-9]+ ('.' [0-9]+)?;

WS: [ \t\r\n]+ -> skip;
