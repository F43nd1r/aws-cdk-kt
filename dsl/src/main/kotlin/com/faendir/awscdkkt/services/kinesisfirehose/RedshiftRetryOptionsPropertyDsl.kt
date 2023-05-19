@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.kinesisfirehose

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

public
    fun redshiftRetryOptionsProperty(initializer: CfnDeliveryStream.RedshiftRetryOptionsProperty.Builder.() -> Unit):
    CfnDeliveryStream.RedshiftRetryOptionsProperty =
    CfnDeliveryStream.RedshiftRetryOptionsProperty.builder().apply(initializer).build()
