@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.opsworks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.opsworks.CfnInstance

public
    fun ebsBlockDeviceProperty(initializer: CfnInstance.EbsBlockDeviceProperty.Builder.() -> Unit):
    CfnInstance.EbsBlockDeviceProperty =
    CfnInstance.EbsBlockDeviceProperty.builder().apply(initializer).build()
