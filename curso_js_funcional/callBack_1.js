function exec(fn, a, b) {
    return fn(a, b)
}

const somarNoTerminal = (x, y) => console.log(x + y)
const subtrairNoTerminal = (w, z) => console.log(w - z)
const subtrair = (w, z) => w - z

exec(somarNoTerminal, 56, 38)
exec(subtrairNoTerminal, 182, 27)

const r = exec(subtrair, 50, 25)
console.log(r)

const cb = () => console.log('Exec #01...')
setInterval(cb, 1000)

setInterval(() => console.log('Exec #02...'), 1000)

setInterval(function (){
    console.log('Exec #03...')
}, 1000)