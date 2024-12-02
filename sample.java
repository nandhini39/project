function calculateMultiplication() {
	const alphabetInput = document.getElementById('alphabet');
	const numberInput = document.getElementById('number');
	const resultDiv = document.getElementById('result');

	const alphabet = alphabetInput.value.trim().toUpperCase();
	const number = parseInt(numberInput.value);

	if (alphabet.length !== 1 || isNaN(number)) {
		resultDiv.innerHTML = 'Please enter a single alphabet and a valid number.';
		return;
	}

	const asciiValue = alphabet.charCodeAt(0);
	const result = '';

	for (let i = 0; i < number; i++) {
		result += String.fromCharCode(asciiValue + i);
	}

	resultDiv.innerHTML = `${alphabet} × ${number} = ${result}`;
