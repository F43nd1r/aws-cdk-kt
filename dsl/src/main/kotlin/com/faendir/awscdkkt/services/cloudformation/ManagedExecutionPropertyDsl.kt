package com.faendir.awscdkkt.services.cloudformation

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudformation.CfnStackSet

@Generated
public
    fun managedExecutionProperty(initializer: CfnStackSet.ManagedExecutionProperty.Builder.() -> Unit
    = {}): CfnStackSet.ManagedExecutionProperty =
    CfnStackSet.ManagedExecutionProperty.builder().apply(initializer).build()
