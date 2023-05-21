package com.faendir.awscdkkt.services.kinesisanalytics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2

@Generated
public
    fun kinesisFirehoseOutputProperty(initializer: CfnApplicationOutputV2.KinesisFirehoseOutputProperty.Builder.() -> Unit
    = {}): CfnApplicationOutputV2.KinesisFirehoseOutputProperty =
    CfnApplicationOutputV2.KinesisFirehoseOutputProperty.builder().apply(initializer).build()
