@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.lookoutmetrics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lookoutmetrics.CfnAlert

public
    fun sNSConfigurationProperty(initializer: CfnAlert.SNSConfigurationProperty.Builder.() -> Unit):
    CfnAlert.SNSConfigurationProperty =
    CfnAlert.SNSConfigurationProperty.builder().apply(initializer).build()
