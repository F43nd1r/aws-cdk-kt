@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.kinesisfirehose

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

public
    fun retryOptionsProperty(initializer: CfnDeliveryStream.RetryOptionsProperty.Builder.() -> Unit):
    CfnDeliveryStream.RetryOptionsProperty =
    CfnDeliveryStream.RetryOptionsProperty.builder().apply(initializer).build()
