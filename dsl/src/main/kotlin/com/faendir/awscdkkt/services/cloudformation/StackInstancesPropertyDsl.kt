package com.faendir.awscdkkt.services.cloudformation

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudformation.CfnStackSet

@Generated
public fun stackInstancesProperty(initializer: CfnStackSet.StackInstancesProperty.Builder.() -> Unit
    = {}): CfnStackSet.StackInstancesProperty =
    CfnStackSet.StackInstancesProperty.builder().apply(initializer).build()
