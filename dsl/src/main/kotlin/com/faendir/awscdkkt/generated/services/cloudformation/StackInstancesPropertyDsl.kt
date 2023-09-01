package com.faendir.awscdkkt.generated.services.cloudformation

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudformation.CfnStackSet

@Generated
public fun buildStackInstancesProperty(initializer: @AwsCdkDsl
    CfnStackSet.StackInstancesProperty.Builder.() -> Unit = {}): CfnStackSet.StackInstancesProperty
    = CfnStackSet.StackInstancesProperty.Builder().apply(initializer).build()
