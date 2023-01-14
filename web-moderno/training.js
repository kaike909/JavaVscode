const aleatorio = (min = 10000000, max = 99999999) => `9${Math.floor(Math.random() * (max - min) + min)}`

console.log(aleatorio())