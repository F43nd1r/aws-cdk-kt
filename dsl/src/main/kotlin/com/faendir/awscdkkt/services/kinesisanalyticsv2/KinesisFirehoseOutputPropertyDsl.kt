package com.faendir.awscdkkt.services.kinesisanalyticsv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutput

@Generated
public
    fun kinesisFirehoseOutputProperty(initializer: CfnApplicationOutput.KinesisFirehoseOutputProperty.Builder.() -> Unit
    = {}): CfnApplicationOutput.KinesisFirehoseOutputProperty =
    CfnApplicationOutput.KinesisFirehoseOutputProperty.builder().apply(initializer).build()
