package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnSpotFleetProps

@Generated
public fun cfnSpotFleetProps(initializer: CfnSpotFleetProps.Builder.() -> Unit = {}):
    CfnSpotFleetProps = CfnSpotFleetProps.builder().apply(initializer).build()
