const modoDev = process.env.NODE_ENV !== 'production'
const webpack = require ('webpack')
const MiniCssExtractPlugin = require('mini-css-extract-plugin')
const TerserPlugin = require('terser-webpack-plugin')
const CSSMinimizerPlugin = require('css-minimizer-webpack-plugin')

module.exports = {
    mode: modoDev ? 'development' : 'production',
    entry: './src/principal.js',
    output: {
        filename: 'principal.js',
        path: __dirname + '/public'
    },
    devServer:{
        contentBase: "./public",
        port: 9000

    },
    optimization: {
        minimizer: [
            new TerserPlugin(),
            new CSSMinimizerPlugin(),
        ],
    },
    plugins: [
        new MiniCssExtractPlugin({
            filename: "estilo.css"
        })
    ],
    module:{
        rules: [{
            test: /.s?[ac]ss$/,
            use: [
                MiniCssExtractPlugin.loader,
                // 'style-loader', //Adiciona CSS a DOM injetando a tag <style>
                'css-loader', //interpreta @import, url()...
                'sass-loader'
            ]
        }, {
            test: /\.(png|svg|jpg|gif)$/,
            loader: 'file-loader',
            options:{
                
            }
        }
    ]}
}