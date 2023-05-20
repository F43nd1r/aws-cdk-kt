@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.kinesisfirehose

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

public
    fun splunkRetryOptionsProperty(initializer: CfnDeliveryStream.SplunkRetryOptionsProperty.Builder.() -> Unit):
    CfnDeliveryStream.SplunkRetryOptionsProperty =
    CfnDeliveryStream.SplunkRetryOptionsProperty.builder().apply(initializer).build()
