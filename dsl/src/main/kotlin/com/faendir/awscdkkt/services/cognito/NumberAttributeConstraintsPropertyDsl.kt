@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPool

public
    fun numberAttributeConstraintsProperty(initializer: CfnUserPool.NumberAttributeConstraintsProperty.Builder.() -> Unit):
    CfnUserPool.NumberAttributeConstraintsProperty =
    CfnUserPool.NumberAttributeConstraintsProperty.builder().apply(initializer).build()
