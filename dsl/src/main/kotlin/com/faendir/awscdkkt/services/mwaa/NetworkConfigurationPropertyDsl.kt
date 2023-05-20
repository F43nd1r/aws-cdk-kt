@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.mwaa

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.mwaa.CfnEnvironment

public
    fun networkConfigurationProperty(initializer: CfnEnvironment.NetworkConfigurationProperty.Builder.() -> Unit):
    CfnEnvironment.NetworkConfigurationProperty =
    CfnEnvironment.NetworkConfigurationProperty.builder().apply(initializer).build()
