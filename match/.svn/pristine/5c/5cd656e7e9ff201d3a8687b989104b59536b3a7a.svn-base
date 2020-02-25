var utils = require('./utils')
var webpack = require('webpack')
//express用户模拟后台数据
var express = require('express')
var config = require('../config')
var merge = require('webpack-merge')
var baseWebpackConfig = require('./webpack.base.conf')
// var HtmlWebpackPlugin = require('html-webpack-plugin')
var FriendlyErrorsPlugin = require('friendly-errors-webpack-plugin')

// copy from ./webpack.prod.conf.js
var path = require('path')
var ExtractTextPlugin = require('extract-text-webpack-plugin')
var CopyWebpackPlugin = require('copy-webpack-plugin')
var OptimizeCSSPlugin = require('optimize-css-assets-webpack-plugin')

// add hot-reload related code to entry chunks
// Object.keys(baseWebpackConfig.entry).forEach(function (name) {
//   baseWebpackConfig.entry[name] = ['./build/dev-client'].concat(baseWebpackConfig.entry[name])
// })

module.exports = merge(baseWebpackConfig, {
  module: {
    rules: utils.styleLoaders({
      sourceMap: config.dev.cssSourceMap,
      extract: true
    })
  },
  // cheap-module-eval-source-map is faster for development
  // devtool: '#cheap-module-eval-source-map',
  devtool: '#source-map',
  output: {
    path: config.build.assetsRoot,
    // filename: utils.assetsPath('js/[name].[chunkhash].js'),
    // chunkFilename: utils.assetsPath('js/[id].[chunkhash].js')
    filename: utils.assetsPath('js/[name].js'),
    chunkFilename: utils.assetsPath('js/[id].js')
  },
  plugins: [
    new webpack.DefinePlugin({
      'process.env': config.dev.env
    }),

    // copy from ./webpack.prod.conf.js
    // extract css into its own file
    new ExtractTextPlugin({
      // filename: utils.assetsPath('css/[name].[contenthash].css')
      filename: utils.assetsPath('css/[name].wxss')
    }),
    // Compress extracted CSS. We are using this plugin so that possible
    // duplicated CSS from different components can be deduped.
    new OptimizeCSSPlugin({
      cssProcessorOptions: {
        safe: true
      }
    }),
    new webpack.optimize.CommonsChunkPlugin({
      name: 'vendor',
      minChunks: function (module, count) {
        // any required modules inside node_modules are extracted to vendor
        return (
          module.resource &&
          /\.js$/.test(module.resource) &&
          module.resource.indexOf('node_modules') >= 0
        ) || count > 1
      }
    }),
    new webpack.optimize.CommonsChunkPlugin({
      name: 'manifest',
      chunks: ['vendor']
    }),
    // copy custom static assets
    new CopyWebpackPlugin([
      {
        from: path.resolve(__dirname, '../static'),
        to: config.build.assetsSubDirectory,
        ignore: ['.*']
      }
    ]),

    // https://github.com/glenjamin/webpack-hot-middleware#installation--usage
    // new webpack.HotModuleReplacementPlugin(),
    new webpack.NoEmitOnErrorsPlugin(),
    // https://github.com/ampedandwired/html-webpack-plugin
    // new HtmlWebpackPlugin({
    //   filename: 'index.html',
    //   template: 'index.html',
    //   inject: true
    // }),
    new FriendlyErrorsPlugin()
  ]
});

// //json-server的配置
// const jsonServer = require('json-server')
// const apiServer = jsonServer.create()
// const apiRouter = jsonServer.router('db.json')    //数据关联server，与index.html同级
// const middlewares = jsonServer.defaults()
//
// apiServer.use(middlewares)
// apiServer.use('/api',apiRouter)
// apiServer.listen(3000,()=>{
//   console.log('JSON server is running')
// })

//express配置server
var apiServer = express()
var bodyParser = require('body-parser')
apiServer.use(bodyParser.urlencoded({ extended: true }))
apiServer.use(bodyParser.json())
var apiRouter = express.Router()
var fs = require('fs')
apiRouter.route('/:apiName') //接口路径
  .all(function (req, res) {
    fs.readFile('./db.json', 'utf8', function (err, data) {  //读取接口文件
      if (err) throw err
      var data = JSON.parse(data)
      if (data[req.params.apiName]) {
        res.json(data[req.params.apiName])
      }
      else {
        res.send('no such api name')
      }

    })
  })


apiServer.use('/api', apiRouter);
apiServer.listen(3000, function (err) {
  if (err) {
    console.log(err)
    return
  }
  console.log('Listening at http://localhost:' + 3000 + '\n')
})

// module.exports = new Promise((resolve, reject) => {
//   portfinder.basePort = process.env.PORT || config.dev.port
//   portfinder.getPort((err, port) => {
//     if (err) {
//       reject(err)
//     } else {
//       // publish the new Port, necessary for e2e tests
//       process.env.PORT = port
//       // add port to devServer config
//       devWebpackConfig.devServer.port = port
 
//       // Add FriendlyErrorsPlugin
//       devWebpackConfig.plugins.push(new FriendlyErrorsPlugin({
//         compilationSuccessInfo: {
//           messages: [`Your application is running here: http://${config.dev.host}:${port}`],
//         },
//         onErrors: config.dev.notifyOnErrors
//         ? utils.createNotifierCallback()
//         : undefined
//       }))
 
//       resolve(devWebpackConfig)
//     }
//   })
// })
