@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.emrserverless

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.emrserverless.CfnApplication

public
    fun networkConfigurationProperty(initializer: CfnApplication.NetworkConfigurationProperty.Builder.() -> Unit):
    CfnApplication.NetworkConfigurationProperty =
    CfnApplication.NetworkConfigurationProperty.builder().apply(initializer).build()
