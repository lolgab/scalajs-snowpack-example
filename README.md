# Scala.js and Snowpack example

This example project shows how to use [Snowpack](https://snowpack.dev) together
with [Scala.js](https://scala-js.org).

## Getting started

You need to:

- Install the javascript libraries:

  > npm install

- Create the bundle:

  > ./mill --no-server -j 0 -w chart.publicDev

- Run Snowpack dev server (in a separate terminal):

  > npm run start

## Production build

You need to run:

  > ./mill --no-server -j 0 chart.buildProd

Now you can find your production build in the `build` folder.
