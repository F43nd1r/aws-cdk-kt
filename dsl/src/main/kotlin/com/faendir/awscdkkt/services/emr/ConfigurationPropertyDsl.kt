@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.emr

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.emr.CfnInstanceGroupConfig

public
    fun configurationProperty(initializer: CfnInstanceGroupConfig.ConfigurationProperty.Builder.() -> Unit):
    CfnInstanceGroupConfig.ConfigurationProperty =
    CfnInstanceGroupConfig.ConfigurationProperty.builder().apply(initializer).build()
