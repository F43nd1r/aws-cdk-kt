package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.EnvironmentOptions

@Generated
public fun environmentOptions(initializer: EnvironmentOptions.Builder.() -> Unit = {}):
    EnvironmentOptions = EnvironmentOptions.builder().apply(initializer).build()
