class Carro{
    constructor(velocidadeMaxima = 200, delta = 5){
        let velocidadeAtual = 0
        this.acelerar = () => {
            if(velocidadeAtual + delta <= velocidadeMaxima){
                velocidadeAtual += delta
            } else {
                velocidadeAtual = velocidadeMaxima
            }
        }
        this.getVelocidadeAtual = () => velocidadeAtual
    }
}

const uno = new Carro
uno.acelerar()
uno.acelerar()
uno.acelerar()
uno.acelerar()
console.log(uno.getVelocidadeAtual())

const ferrari = new Carro(350, 40)
ferrari.acelerar()
ferrari.acelerar()
ferrari.acelerar()
ferrari.acelerar()
ferrari.acelerar()
ferrari.acelerar()
ferrari.acelerar()
ferrari.acelerar()
ferrari.acelerar()
ferrari.acelerar()
console.log(ferrari.getVelocidadeAtual())