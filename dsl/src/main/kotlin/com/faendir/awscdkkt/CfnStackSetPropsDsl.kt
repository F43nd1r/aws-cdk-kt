package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.CfnStackSetProps

@Generated
public fun cfnStackSetProps(initializer: CfnStackSetProps.Builder.() -> Unit = {}): CfnStackSetProps
    = CfnStackSetProps.builder().apply(initializer).build()
