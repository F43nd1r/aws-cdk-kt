@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.App
import software.amazon.awscdk.AppProps

public fun app(initializer: App.() -> Unit = {}): App = App().apply(initializer)

public fun app(props: AppProps, initializer: App.() -> Unit = {}): App =
    App(props).apply(initializer)
