package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.FunctionProps

@Generated
public fun functionProps(initializer: FunctionProps.Builder.() -> Unit = {}): FunctionProps =
    FunctionProps.builder().apply(initializer).build()
