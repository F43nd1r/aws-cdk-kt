package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.AppProps

@Generated
public fun appProps(initializer: AppProps.Builder.() -> Unit = {}): AppProps =
    AppProps.builder().apply(initializer).build()
