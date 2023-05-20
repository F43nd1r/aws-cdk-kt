@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.emr

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.emr.CfnInstanceGroupConfig

public
    fun ebsConfigurationProperty(initializer: CfnInstanceGroupConfig.EbsConfigurationProperty.Builder.() -> Unit):
    CfnInstanceGroupConfig.EbsConfigurationProperty =
    CfnInstanceGroupConfig.EbsConfigurationProperty.builder().apply(initializer).build()
