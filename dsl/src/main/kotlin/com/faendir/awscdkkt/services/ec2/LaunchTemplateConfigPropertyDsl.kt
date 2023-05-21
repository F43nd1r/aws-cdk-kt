package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnSpotFleet

@Generated
public
    fun launchTemplateConfigProperty(initializer: CfnSpotFleet.LaunchTemplateConfigProperty.Builder.() -> Unit
    = {}): CfnSpotFleet.LaunchTemplateConfigProperty =
    CfnSpotFleet.LaunchTemplateConfigProperty.builder().apply(initializer).build()
