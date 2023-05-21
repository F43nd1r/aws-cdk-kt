package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.LayerVersionAttributes

@Generated
public fun layerVersionAttributes(initializer: LayerVersionAttributes.Builder.() -> Unit = {}):
    LayerVersionAttributes = LayerVersionAttributes.builder().apply(initializer).build()
