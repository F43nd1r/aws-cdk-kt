package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.FunctionUrlProps

@Generated
public fun functionUrlProps(initializer: FunctionUrlProps.Builder.() -> Unit = {}): FunctionUrlProps
    = FunctionUrlProps.builder().apply(initializer).build()
