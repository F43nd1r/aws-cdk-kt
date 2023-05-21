package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnSpotFleet

@Generated
public
    fun targetGroupsConfigProperty(initializer: CfnSpotFleet.TargetGroupsConfigProperty.Builder.() -> Unit
    = {}): CfnSpotFleet.TargetGroupsConfigProperty =
    CfnSpotFleet.TargetGroupsConfigProperty.builder().apply(initializer).build()
