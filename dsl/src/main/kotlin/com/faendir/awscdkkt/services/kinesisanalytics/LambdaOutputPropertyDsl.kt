@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.kinesisanalytics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2

public
    fun lambdaOutputProperty(initializer: CfnApplicationOutputV2.LambdaOutputProperty.Builder.() -> Unit):
    CfnApplicationOutputV2.LambdaOutputProperty =
    CfnApplicationOutputV2.LambdaOutputProperty.builder().apply(initializer).build()
