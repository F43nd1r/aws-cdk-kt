@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.App
import software.amazon.awscdk.AppProps

public fun app(initializer: App.() -> Unit = {}): App = App().apply(initializer)

public fun app(props: AppProps, initializer: App.() -> Unit = {}): App =
    App(props).apply(initializer)
