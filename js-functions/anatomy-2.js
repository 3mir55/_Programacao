// Anonymous function
(function (a, b, c) { // colocar entre parenteses torna a função anônima valida em JS
    return a + b + c
})

// Function expression

const sum = function (a, b) {
    return a + b
}

const result = sum (7, 59)
console.log(result)

const anotherSum = sum
console.log(anotherSum(5, 9))

