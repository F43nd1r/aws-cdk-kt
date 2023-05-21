package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.LayerVersionPermission

@Generated
public fun layerVersionPermission(initializer: LayerVersionPermission.Builder.() -> Unit = {}):
    LayerVersionPermission = LayerVersionPermission.builder().apply(initializer).build()
