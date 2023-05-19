@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.emrserverless

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.emrserverless.CfnApplication

public
    fun autoStartConfigurationProperty(initializer: CfnApplication.AutoStartConfigurationProperty.Builder.() -> Unit):
    CfnApplication.AutoStartConfigurationProperty =
    CfnApplication.AutoStartConfigurationProperty.builder().apply(initializer).build()
