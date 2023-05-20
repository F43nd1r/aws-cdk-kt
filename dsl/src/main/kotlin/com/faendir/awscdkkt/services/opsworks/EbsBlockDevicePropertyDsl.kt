@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.opsworks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.opsworks.CfnInstance

public
    fun ebsBlockDeviceProperty(initializer: CfnInstance.EbsBlockDeviceProperty.Builder.() -> Unit):
    CfnInstance.EbsBlockDeviceProperty =
    CfnInstance.EbsBlockDeviceProperty.builder().apply(initializer).build()
