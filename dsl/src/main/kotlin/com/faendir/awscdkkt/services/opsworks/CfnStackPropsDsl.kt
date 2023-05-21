package com.faendir.awscdkkt.services.opsworks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.opsworks.CfnStackProps

@Generated
public fun cfnStackProps(initializer: CfnStackProps.Builder.() -> Unit = {}): CfnStackProps =
    CfnStackProps.builder().apply(initializer).build()
