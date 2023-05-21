package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnFunctionProps

@Generated
public fun cfnFunctionProps(initializer: CfnFunctionProps.Builder.() -> Unit = {}): CfnFunctionProps
    = CfnFunctionProps.builder().apply(initializer).build()
