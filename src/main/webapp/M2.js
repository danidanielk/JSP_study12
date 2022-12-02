//M
// 유효성검사 = front-end개발자b (유효성 검사 보물도 front-end 개발자 a가 만듬)

function check(){
	let x = document.f.x;
	let y = document.f.y;
	
	if (isEmpty(x)||isNotNumber(x)||isEmpty(y)||isNotNumber(y)){
		alert("Ouch!");
		return false;
	}
	return true;
}