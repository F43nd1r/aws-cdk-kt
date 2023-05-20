@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.lookoutmetrics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lookoutmetrics.CfnAlert

public
    fun sNSConfigurationProperty(initializer: CfnAlert.SNSConfigurationProperty.Builder.() -> Unit):
    CfnAlert.SNSConfigurationProperty =
    CfnAlert.SNSConfigurationProperty.builder().apply(initializer).build()
