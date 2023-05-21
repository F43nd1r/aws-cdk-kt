package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnEC2FleetProps

@Generated
public fun cfnEC2FleetProps(initializer: CfnEC2FleetProps.Builder.() -> Unit = {}): CfnEC2FleetProps
    = CfnEC2FleetProps.builder().apply(initializer).build()
