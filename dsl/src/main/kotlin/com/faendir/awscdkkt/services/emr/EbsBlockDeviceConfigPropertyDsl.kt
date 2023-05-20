@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.emr

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.emr.CfnInstanceGroupConfig

public
    fun ebsBlockDeviceConfigProperty(initializer: CfnInstanceGroupConfig.EbsBlockDeviceConfigProperty.Builder.() -> Unit):
    CfnInstanceGroupConfig.EbsBlockDeviceConfigProperty =
    CfnInstanceGroupConfig.EbsBlockDeviceConfigProperty.builder().apply(initializer).build()
