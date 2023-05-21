package com.faendir.awscdkkt.services.kinesisanalytics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

@Generated
public
    fun inputLambdaProcessorProperty(initializer: CfnApplicationV2.InputLambdaProcessorProperty.Builder.() -> Unit
    = {}): CfnApplicationV2.InputLambdaProcessorProperty =
    CfnApplicationV2.InputLambdaProcessorProperty.builder().apply(initializer).build()
