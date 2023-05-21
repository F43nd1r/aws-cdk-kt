package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnFunctionProps

@Generated
public fun cfnFunctionProps(initializer: CfnFunctionProps.Builder.() -> Unit = {}): CfnFunctionProps
    = CfnFunctionProps.builder().apply(initializer).build()
