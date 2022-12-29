console.log("Legal!!!")
let nome = "Carlos Henrique Matanó"
console.log(`Meu nome é ${nome}`)

let nota1 = 8.234;
let nota2 = 5.789;

var media = (nota1 + nota2) / 2

console.log(media.toFixed(2))

let escola = 'cod3r';
console.log(escola.charAt(2))

let nomes = 'Ana, Bianca, Carla, Debora'
console.log(nomes.split(','))
for (let i = 0; i < nomes.length; i++) {
    if (nomes.charAt(i) === ',' || nomes.charAt(i) === ' ') {
        continue
    } else {
        console.log(nomes.charAt(i))
    }
}