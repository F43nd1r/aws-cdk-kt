package com.faendir.awscdkkt.services.kinesisanalytics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2

@Generated
public
    fun lambdaOutputProperty(initializer: CfnApplicationOutputV2.LambdaOutputProperty.Builder.() -> Unit
    = {}): CfnApplicationOutputV2.LambdaOutputProperty =
    CfnApplicationOutputV2.LambdaOutputProperty.builder().apply(initializer).build()
