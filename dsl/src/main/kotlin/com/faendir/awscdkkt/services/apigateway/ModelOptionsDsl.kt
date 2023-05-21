package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.ModelOptions

@Generated
public fun modelOptions(initializer: ModelOptions.Builder.() -> Unit = {}): ModelOptions =
    ModelOptions.builder().apply(initializer).build()
