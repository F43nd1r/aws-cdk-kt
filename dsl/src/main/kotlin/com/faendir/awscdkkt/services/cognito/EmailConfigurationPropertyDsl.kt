@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPool

public
    fun emailConfigurationProperty(initializer: CfnUserPool.EmailConfigurationProperty.Builder.() -> Unit):
    CfnUserPool.EmailConfigurationProperty =
    CfnUserPool.EmailConfigurationProperty.builder().apply(initializer).build()
