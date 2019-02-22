const dev = {
  pokeContext: 'http://localhost:3000', // api url
  javaContext: 'http://localhost:5500'
}

const prod = {
  pokeContext: 'http://ec2-18-236-190-255.us-west-2.compute.amazonaws.com:3000',
  javaContext: 'http://localhost:5500'
}

export let environment = dev;

if (process.env.NODE_ENV === 'production') {
  environment = prod;
}