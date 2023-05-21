package com.faendir.awscdkkt.services.kinesisanalyticsv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutput

@Generated
public
    fun kinesisStreamsOutputProperty(initializer: CfnApplicationOutput.KinesisStreamsOutputProperty.Builder.() -> Unit
    = {}): CfnApplicationOutput.KinesisStreamsOutputProperty =
    CfnApplicationOutput.KinesisStreamsOutputProperty.builder().apply(initializer).build()
