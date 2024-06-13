let v = []
let u = []

v[1] = 2.0
v[2] = 3.0
v[3] = 4.0
v[4] = 5.0
v[5] = 6.0

let n = 5

for (i = 0; i <= n; i++) {
    u[i] = v[i] * i
}

console.log(u[2], u[4])