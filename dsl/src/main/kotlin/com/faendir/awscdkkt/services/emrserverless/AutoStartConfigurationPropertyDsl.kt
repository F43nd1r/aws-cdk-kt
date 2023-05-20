@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.emrserverless

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.emrserverless.CfnApplication

public
    fun autoStartConfigurationProperty(initializer: CfnApplication.AutoStartConfigurationProperty.Builder.() -> Unit):
    CfnApplication.AutoStartConfigurationProperty =
    CfnApplication.AutoStartConfigurationProperty.builder().apply(initializer).build()
