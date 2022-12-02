document.addEventListener("DOMContentLoand", data());





async function data(){
    let response = await fetch("http://localhost:3030/publicaciones/1", {
    method: "GET",
    headers: {
        "Content-Type": "application/json"
    }
});

let respuesta = await response.json();

console.log(respuesta);

}


