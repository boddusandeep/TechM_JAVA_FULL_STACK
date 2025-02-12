var products=["./images/all_kinds.jpg","./images/burger.jpg","./images/drinks.jpg"];
function ProductChanged(){
    var product=document.getElementById("lstProducts").value;
    var pic=document.getElementById("pic");
    switch (product){
        case "Samsung Tv":
            pic.src=products[0];
            break;
        case "Mobile Phone":
            pic.src=products[1];
            break;
        case "Nike casuals":
            pic.src=products[2];
            break;
        
        default: document.write("not found");
    }
}