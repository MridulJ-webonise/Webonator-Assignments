let input = prompt("Enter input").split(",");

let obj={};
let min = Number.MAX_VALUE;
let max = Number.MIN_VALUE;
for( i of input )
{
    min = Math.min(min, i);
    max = Math.max(max, i);

    if( obj[i] == undefined )
    {
        obj[i] = 1;
    }
    else
        obj[i] += 1;

}

for( let i=min; i<=max; ++i)
{
    if( obj[i] != undefined )
        console.log(i + " :" + obj[i])
}
