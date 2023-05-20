@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.emr

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.emr.CfnInstanceGroupConfig

public
    fun configurationProperty(initializer: CfnInstanceGroupConfig.ConfigurationProperty.Builder.() -> Unit):
    CfnInstanceGroupConfig.ConfigurationProperty =
    CfnInstanceGroupConfig.ConfigurationProperty.builder().apply(initializer).build()
