@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPool

public
    fun emailConfigurationProperty(initializer: CfnUserPool.EmailConfigurationProperty.Builder.() -> Unit):
    CfnUserPool.EmailConfigurationProperty =
    CfnUserPool.EmailConfigurationProperty.builder().apply(initializer).build()
