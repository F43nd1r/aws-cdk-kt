package com.faendir.awscdkkt.services.kinesisfirehose

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@Generated
public
    fun cloudWatchLoggingOptionsProperty(initializer: CfnDeliveryStream.CloudWatchLoggingOptionsProperty.Builder.() -> Unit
    = {}): CfnDeliveryStream.CloudWatchLoggingOptionsProperty =
    CfnDeliveryStream.CloudWatchLoggingOptionsProperty.builder().apply(initializer).build()
