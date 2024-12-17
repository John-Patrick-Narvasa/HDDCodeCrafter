// the import thingy for initializing the user input
const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

// getWatts(scanner);
function getWatts() {
    rl.question('Number of watts used: ', (answer) => {
        let watts = parseFloat(answer);
        getHours(watts);
    });
}

// getVolts(scanner);
function getVolts() {
    rl.question('Number of volts: ', (answer) => {
        let volts = parseFloat(answer);
        getAmps(volts);
    });
}

// getAmps(scanner);
function getAmps(volts) {
    rl.question('Number of amps: ', (answer) => {
        let amps = parseFloat(answer);
        let watts = wattConvert(volts, amps);
        getHours(watts);
    });
}

// getHours(scanner);
function getHours(watts) {
    rl.question('Number of hours used: ', (answer) => {
        let hours = parseFloat(answer);
        getPrice(watts, hours);
    });
}

// getPrice(scanner);
function getPrice(watts, hours) {
    rl.question('Price per kWh: ', (answer) => {
        let price = parseFloat(answer);
        calculateAndPrintCost(calcWattCost(watts, hours, price));
    });
}

// wattConvert(volts, amps);
function wattConvert(volts, amps) {
    return volts * amps;
}

// calcWattCost(watts, hours, price);
function calcWattCost(watts, hours, price) {
    return watts * hours * price / 1000;
}

// calculateAndPrintCost(cost || calcWattCost(watts, hours, price));
function calculateAndPrintCost(cost) {
    console.log('The cost is: ' + cost);
    rl.close();
}

// Main logikk
rl.question('Watts or Volts and Amps? ', (answer) => {
    let input = answer.toLowerCase();

    if (input === 'watts') {
        getWatts();
    } else if (input === 'volts' || input === 'amps') {
        getVolts();
    } else {
        console.log('Invalid input');
        rl.close();
    }
});