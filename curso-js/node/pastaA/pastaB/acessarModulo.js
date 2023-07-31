const moduloA = require('../../moduloA') // pode ser usado o caminho absoluto, copiando o path diretamente da pasta
console.log(moduloA.ola)

const saudacao = require('saudacao') // não precisa do caminho pois esta localizado na pasta node_modules
console.log(saudacao.ola)            // usando o arquivo index.js

const c =require ('./pastaC') //não preciso referenciar o arquivo index.js
console.log(c.ola2)

const http = require('http') //modulos do proprio node não precisam do caminho
http.createServer((req, res) => {
    res.write('Bom dia!')
    res.end()
}).listen(8080)
