const prod1 = {} // par de chaves é um objeto
prod1.nome = 'Celular Ultra Mega'
prod1.preco = 4998.90
prod1['Desconto legal'] = 0.40 //evitar atributos com espaço

console.log(prod1)

const prod2 = {
    nome:'Camisa Polo',
    preco: 79.90,
    obj:{
        blabla: 1,
        obj: 'teste'
    }

}
console.log(prod2)