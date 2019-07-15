"use strict";
function add(){
    var r = Number(document.getElementById('r').value);
    document.getElementById('result').innerHTML = (2 * 3.1416 * r);
    return false;	
}
document.getElementById('go').addEventListener('click',add);