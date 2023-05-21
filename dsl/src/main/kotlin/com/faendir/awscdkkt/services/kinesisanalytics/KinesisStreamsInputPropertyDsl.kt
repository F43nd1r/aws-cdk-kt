package com.faendir.awscdkkt.services.kinesisanalytics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

@Generated
public
    fun kinesisStreamsInputProperty(initializer: CfnApplicationV2.KinesisStreamsInputProperty.Builder.() -> Unit
    = {}): CfnApplicationV2.KinesisStreamsInputProperty =
    CfnApplicationV2.KinesisStreamsInputProperty.builder().apply(initializer).build()
