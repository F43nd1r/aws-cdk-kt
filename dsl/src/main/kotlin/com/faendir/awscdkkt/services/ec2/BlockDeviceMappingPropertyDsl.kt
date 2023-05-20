@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnSpotFleet

public
    fun blockDeviceMappingProperty(initializer: CfnSpotFleet.BlockDeviceMappingProperty.Builder.() -> Unit):
    CfnSpotFleet.BlockDeviceMappingProperty =
    CfnSpotFleet.BlockDeviceMappingProperty.builder().apply(initializer).build()
