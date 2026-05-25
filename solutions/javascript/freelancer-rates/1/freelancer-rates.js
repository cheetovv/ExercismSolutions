
export function dayRate(ratePerHour) {
  return ratePerHour * 8;
}

export function daysInBudget(budget, ratePerHour) {
  return  Math.floor(budget / (ratePerHour * 8));
}

export function priceWithMonthlyDiscount(ratePerHour, numDays, discount) {
 return Math.ceil((((ratePerHour * 8) * ((Math.floor(numDays/22)) * 22)) - ((ratePerHour * 8) * ((Math.floor(numDays/22)) * 22)) * discount ) + ((ratePerHour * 8) * ((numDays %= 22))))
}
