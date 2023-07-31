const a = 1
const b = 2
const c = 3

const obj1 = { a: a, b: b, c: c } //forma antiga, mas torna possível mudar o rótulo da variável
const obj2 = { a, b, c }
console.log(obj1, obj2)

const nomeAtrb = 'nota'
const valorAtrb = 7.87

const obj3 = {}
obj3[nomeAtrb] = valorAtrb
console.log(obj3)

const obj4 = {[nomeAtrb]: valorAtrb}

const obj5 = {
    funcao1: function () {
        //...
    },
    funcao2(){
        //...
    }
}
console.log(obj5)