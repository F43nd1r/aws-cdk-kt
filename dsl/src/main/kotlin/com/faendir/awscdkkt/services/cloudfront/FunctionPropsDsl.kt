package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.FunctionProps

@Generated
public fun functionProps(initializer: FunctionProps.Builder.() -> Unit = {}): FunctionProps =
    FunctionProps.builder().apply(initializer).build()
