// cadeia de prototipos (Prototype chain)
const avo = { attr1: 'A' }
const pai = { __proto__: avo, attr2: 'B' }
const filho = { __proto__: pai, attr3: 'c' }

console.log(filho.attr1);

const carro = {
    velAtual: 0,
    velMax: 200,
    velMin: 0,
    aceleraMais(delta) {
        if (this.velAtual + delta <= this.velMax) {
            this.velAtual += delta;
        } else {
            this.velAtual = this.velMax;
        }
    },
    frear(delta) {
        if (this.velAtual - delta >= this.velMin) {
            this.velAtual -= delta;
        } else {
            this.velAtual = this.velMin;
        }
    },
    status() {
        return `${this.velAtual}km/h de ${this.velMax}Km/h`
    }
}

const ferrari = {
    modelo: 'f40',
    velMax: 324
}

const volvo = {
    modelo: 'v40',
    status() {
        return `${this.modelo}: ${super.status()}`
    }
}

Object.setPrototypeOf(ferrari, carro)
Object.setPrototypeOf(volvo, carro)

console.log(ferrari);
console.log(volvo);

volvo.aceleraMais(100)
console.log(volvo.status());

ferrari.aceleraMais(300);
ferrari.aceleraMais(25);
ferrari.frear(25);
console.log(ferrari.status());