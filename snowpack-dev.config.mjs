import { baseConfig, mount } from "./snowpack-base.config.mjs";

/** @type {import("snowpack").SnowpackUserConfig } */
export default {
  mount: mount("chart.publicDev"),
  ...baseConfig,
};
