package com.faendir.awscdkkt.services.cloudformation

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudformation.CfnStackSetProps

@Generated
public fun cfnStackSetProps(initializer: CfnStackSetProps.Builder.() -> Unit = {}): CfnStackSetProps
    = CfnStackSetProps.builder().apply(initializer).build()
