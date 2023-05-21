package com.faendir.awscdkkt.services.cloudformation

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudformation.CfnStackProps

@Generated
public fun cfnStackProps(initializer: CfnStackProps.Builder.() -> Unit = {}): CfnStackProps =
    CfnStackProps.builder().apply(initializer).build()
