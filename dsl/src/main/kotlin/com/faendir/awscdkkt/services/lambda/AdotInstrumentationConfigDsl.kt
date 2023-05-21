package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.AdotInstrumentationConfig

@Generated
public fun adotInstrumentationConfig(initializer: AdotInstrumentationConfig.Builder.() -> Unit =
    {}): AdotInstrumentationConfig = AdotInstrumentationConfig.builder().apply(initializer).build()
