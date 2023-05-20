@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.emrserverless

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.emrserverless.CfnApplication

public
    fun networkConfigurationProperty(initializer: CfnApplication.NetworkConfigurationProperty.Builder.() -> Unit):
    CfnApplication.NetworkConfigurationProperty =
    CfnApplication.NetworkConfigurationProperty.builder().apply(initializer).build()
