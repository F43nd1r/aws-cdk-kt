package com.faendir.awscdkkt.generated

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.App
import software.amazon.awscdk.AppProps

@Generated
public fun app(initializer: @AwsCdkDsl App.() -> Unit = {}): App = App().apply(initializer)

@Generated
public fun app(props: AppProps, initializer: @AwsCdkDsl App.() -> Unit = {}): App =
    App(props).apply(initializer)

@Generated
public fun buildApp(initializer: @AwsCdkDsl App.Builder.() -> Unit = {}): App =
    App.Builder.create().apply(initializer).build()
