const verificaAnoBissexto = ano => (ano % 4 == 0) || (ano % 400 == 0) && (ano % 100 != 0)

console.log(verificaAnoBissexto(1996))