const resultado = nota => nota >= 7 ? 'aprovado' : 'reprovado'
// operador ternário faz um teste (nota >= 7)
// e depois executa (?) uma ação ('aprovado') se Verdadeiro
// ou então ( : ) ('reprovado') se for Falso
console.log(resultado(7.1))
console.log(resultado(6.7))
