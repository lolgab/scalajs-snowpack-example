// Base config shared between dev and prod

/** @type {import("snowpack").SnowpackUserConfig } */
module.export = {
  optimize: {
    bundle: true,
    minify: true,
    target: "es2017",
    treeshake: true,
  },
};
