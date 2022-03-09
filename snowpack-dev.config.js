const base = require("./snowpack-base.config");
const public = require("./out/chart/publicDev.json");

/** @type {import("snowpack").SnowpackUserConfig } */
module.exports = {
  mount: public.value,
  ...base
}
