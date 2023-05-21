package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnFunctionProps

@Generated
public fun cfnFunctionProps(initializer: CfnFunctionProps.Builder.() -> Unit = {}): CfnFunctionProps
    = CfnFunctionProps.builder().apply(initializer).build()
