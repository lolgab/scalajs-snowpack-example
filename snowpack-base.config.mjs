import { spawnSync } from "child_process";

export function mount(command) {
  const result = spawnSync("./mill", ["show", command], {
    stdio: [
      "pipe", // StdIn.
      "pipe", // StdOut.
      "inherit", // StdErr.
    ],
  });

  return JSON.parse(result.stdout);
}

// Base config shared between dev and prod
/** @type {import("snowpack").SnowpackUserConfig } */
export const baseConfig = {
  optimize: {
    bundle: true,
    minify: true,
    target: "es2017",
    treeshake: true,
  },
};
