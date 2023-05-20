@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPool

public
    fun smsConfigurationProperty(initializer: CfnUserPool.SmsConfigurationProperty.Builder.() -> Unit):
    CfnUserPool.SmsConfigurationProperty =
    CfnUserPool.SmsConfigurationProperty.builder().apply(initializer).build()
