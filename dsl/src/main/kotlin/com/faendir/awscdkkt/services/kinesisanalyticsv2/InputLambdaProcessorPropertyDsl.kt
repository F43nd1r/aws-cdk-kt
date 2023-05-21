package com.faendir.awscdkkt.services.kinesisanalyticsv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication

@Generated
public
    fun inputLambdaProcessorProperty(initializer: CfnApplication.InputLambdaProcessorProperty.Builder.() -> Unit
    = {}): CfnApplication.InputLambdaProcessorProperty =
    CfnApplication.InputLambdaProcessorProperty.builder().apply(initializer).build()
