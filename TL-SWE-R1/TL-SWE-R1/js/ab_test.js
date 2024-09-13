function submitFeedback(variation) {
    fetch('/submitFeedback', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify({ variation: variation }),
    })
    .then(response => response.json())
    .then(data => {
        console.log('Success:', data);
        alert("Thank you for your feedback on variation " + variation);
    })
    .catch((error) => {
        console.error('Error:', error);
    });
}
