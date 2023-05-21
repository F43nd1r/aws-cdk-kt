package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnInstanceProps

@Generated
public fun cfnInstanceProps(initializer: CfnInstanceProps.Builder.() -> Unit = {}): CfnInstanceProps
    = CfnInstanceProps.builder().apply(initializer).build()
