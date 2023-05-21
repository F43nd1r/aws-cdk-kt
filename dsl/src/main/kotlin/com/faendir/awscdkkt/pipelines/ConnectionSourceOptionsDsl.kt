package com.faendir.awscdkkt.pipelines

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.pipelines.ConnectionSourceOptions

@Generated
public fun connectionSourceOptions(initializer: ConnectionSourceOptions.Builder.() -> Unit = {}):
    ConnectionSourceOptions = ConnectionSourceOptions.builder().apply(initializer).build()
