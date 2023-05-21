package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.FunctionAttributes

@Generated
public fun functionAttributes(initializer: FunctionAttributes.Builder.() -> Unit = {}):
    FunctionAttributes = FunctionAttributes.builder().apply(initializer).build()
