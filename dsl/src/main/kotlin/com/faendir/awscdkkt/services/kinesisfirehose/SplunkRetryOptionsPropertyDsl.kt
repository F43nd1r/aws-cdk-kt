package com.faendir.awscdkkt.services.kinesisfirehose

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@Generated
public
    fun splunkRetryOptionsProperty(initializer: CfnDeliveryStream.SplunkRetryOptionsProperty.Builder.() -> Unit
    = {}): CfnDeliveryStream.SplunkRetryOptionsProperty =
    CfnDeliveryStream.SplunkRetryOptionsProperty.builder().apply(initializer).build()
