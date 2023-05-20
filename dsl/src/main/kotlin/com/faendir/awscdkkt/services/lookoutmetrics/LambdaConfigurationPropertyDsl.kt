@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.lookoutmetrics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lookoutmetrics.CfnAlert

public
    fun lambdaConfigurationProperty(initializer: CfnAlert.LambdaConfigurationProperty.Builder.() -> Unit):
    CfnAlert.LambdaConfigurationProperty =
    CfnAlert.LambdaConfigurationProperty.builder().apply(initializer).build()
