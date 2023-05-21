package com.faendir.awscdkkt.services.kinesisanalytics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2

@Generated
public
    fun kinesisStreamsOutputProperty(initializer: CfnApplicationOutputV2.KinesisStreamsOutputProperty.Builder.() -> Unit
    = {}): CfnApplicationOutputV2.KinesisStreamsOutputProperty =
    CfnApplicationOutputV2.KinesisStreamsOutputProperty.builder().apply(initializer).build()
