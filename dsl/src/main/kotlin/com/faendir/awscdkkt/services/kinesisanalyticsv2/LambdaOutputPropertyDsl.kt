@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.kinesisanalyticsv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutput

public
    fun lambdaOutputProperty(initializer: CfnApplicationOutput.LambdaOutputProperty.Builder.() -> Unit):
    CfnApplicationOutput.LambdaOutputProperty =
    CfnApplicationOutput.LambdaOutputProperty.builder().apply(initializer).build()
