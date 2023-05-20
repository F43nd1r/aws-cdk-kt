@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnSpotFleet

public
    fun acceleratorCountRequestProperty(initializer: CfnSpotFleet.AcceleratorCountRequestProperty.Builder.() -> Unit):
    CfnSpotFleet.AcceleratorCountRequestProperty =
    CfnSpotFleet.AcceleratorCountRequestProperty.builder().apply(initializer).build()
