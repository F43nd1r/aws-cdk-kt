package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.LayerVersionOptions

@Generated
public fun layerVersionOptions(initializer: LayerVersionOptions.Builder.() -> Unit = {}):
    LayerVersionOptions = LayerVersionOptions.builder().apply(initializer).build()
