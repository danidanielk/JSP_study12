//�߸������� true �� �������̸� false�� ����

//<input> �� �־����� 
//	�ƹ��͵� ���� �ʾҴٸ� true, ���� �� ������ false.
function isEmpty(input){
	return(!input.value);
}

//<input>�� �־��� ��
//	�ѱ��̳� Ư�����ڰ� �����մٸ� true, ���ٸ� false.
function containsAnother(input){
	let pass ="1234567890qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM_";
	
	let iv= input.value;
	for (let i = 0; i < lv.length; i++) {
		if (pass.indexOF(iv[i]) == -1){
			return true;
		}
	}
	return false;
}
//<input>,���� ���� �־��� ��
// �� ���� �� ���� ������ true, �� ���ڼ� �̻��̸� false
function atLeastLetter(input,len){
	return(input.value.length < len);
	
}

//<input> 2���� �־����� (pw, pwȮ��)
//������ �ٸ��� true ������ false
function notEqualPw(input1,input2){
	return(input1.value != input2.value);
	
}

//<input> , ���ڿ���Ʈ�� �־�����
// ������ true, ������ false (�Է��� pw �� ������ ���ڿ��� ���°��)
function notContain(input,passSet){
	let iv = input.value;
	for (let i = 0; i < passSet.length; i++) {
		if(iv.indexOF(passSet[i]) != -1){
			return false;
		}
	}
	return true;
}

//<input> �־��� ��
// ���� �ƴѰ� ������ true, ���ڸ� ������ false
function isNotNumber(input){
	return isNaN(input.value);
}

//<input> , Ȯ���� �־��� ��
// Ȯ���� ���� �ƴϸ� true, ������ false
function isNotType(input,type){
	//.gif   .png .....
	type= "." + type;
	return(input.value.indexOF(type) == -1);
}