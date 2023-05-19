@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnSpotFleet

public
    fun ebsBlockDeviceProperty(initializer: CfnSpotFleet.EbsBlockDeviceProperty.Builder.() -> Unit):
    CfnSpotFleet.EbsBlockDeviceProperty =
    CfnSpotFleet.EbsBlockDeviceProperty.builder().apply(initializer).build()
