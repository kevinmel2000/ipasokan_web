function linkMenu(id){
	switch(id){
		case 0: 
		loadPage("index");
		break;
		case 1: 
		loadPage("monitoring");
		break;
		case 2: 
		loadPage("secman");
		break;
		case 3: window.location = "../"; break;
		case 4:
		loadPage("produk");
		break;
		case 5:
		loadPage("user");
		break;
		case 6:
		loadPage("monitoring_user");
		break;
		default : console.log("error");break;
	}
}