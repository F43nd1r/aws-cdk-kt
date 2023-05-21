package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.ResourceBindOptions

@Generated
public fun resourceBindOptions(initializer: ResourceBindOptions.Builder.() -> Unit = {}):
    ResourceBindOptions = ResourceBindOptions.builder().apply(initializer).build()
