package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.FunctionAttributes

@Generated
public fun functionAttributes(initializer: FunctionAttributes.Builder.() -> Unit = {}):
    FunctionAttributes = FunctionAttributes.builder().apply(initializer).build()
