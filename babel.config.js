module.exports = function (api) {
  api && api.cache(false);
  return {
    presets: ['module:@react-native/babel-preset'],
    plugins: [
      '@babel/plugin-proposal-export-namespace-from',
      '@babel/plugin-proposal-export-default-from',
      'react-native-reanimated/plugin',
      '@babel/plugin-proposal-class-properties',
    ],
    overrides: [
      {
        plugins: [['@babel/plugin-transform-private-methods']],
      },
    ],
  };
};
