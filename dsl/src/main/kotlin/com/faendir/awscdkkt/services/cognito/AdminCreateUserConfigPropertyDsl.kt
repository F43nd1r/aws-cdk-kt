@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPool

public
    fun adminCreateUserConfigProperty(initializer: CfnUserPool.AdminCreateUserConfigProperty.Builder.() -> Unit):
    CfnUserPool.AdminCreateUserConfigProperty =
    CfnUserPool.AdminCreateUserConfigProperty.builder().apply(initializer).build()
