// Anonymous function
// IIFE - Immediately Invoked Function Expression
(function (a, b, c) { // colocar entre parenteses torna a função anônima valida em JS
    let x = 3
    console.log(`Result: ${a + b + c}`)
    console.log(x)
})(1, 2, 3); // o uso do ; permite executar duas funções anônimas em sequencia sem apresentar erro

(function () { // colocar entre parenteses torna a função anônima valida em JS
    let x = 300
    console.log(x)
})();

(() => {
    console.log('arrow #01')
})();

(() => console.log('arrow #02'))();