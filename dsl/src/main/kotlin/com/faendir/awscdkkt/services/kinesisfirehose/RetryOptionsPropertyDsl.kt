@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.kinesisfirehose

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

public
    fun retryOptionsProperty(initializer: CfnDeliveryStream.RetryOptionsProperty.Builder.() -> Unit):
    CfnDeliveryStream.RetryOptionsProperty =
    CfnDeliveryStream.RetryOptionsProperty.builder().apply(initializer).build()
