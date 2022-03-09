const base = require("./snowpack-base.config");
const public = require("./out/chart/publicProd.json");

/** @type {import("snowpack").SnowpackUserConfig } */
module.exports = {
  mount: public.value,
  ...base
}
