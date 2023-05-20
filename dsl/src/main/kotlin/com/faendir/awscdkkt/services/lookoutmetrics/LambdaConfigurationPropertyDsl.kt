@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.lookoutmetrics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lookoutmetrics.CfnAlert

public
    fun lambdaConfigurationProperty(initializer: CfnAlert.LambdaConfigurationProperty.Builder.() -> Unit):
    CfnAlert.LambdaConfigurationProperty =
    CfnAlert.LambdaConfigurationProperty.builder().apply(initializer).build()
