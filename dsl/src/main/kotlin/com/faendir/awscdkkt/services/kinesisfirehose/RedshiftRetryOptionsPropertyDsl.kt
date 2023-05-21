package com.faendir.awscdkkt.services.kinesisfirehose

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@Generated
public
    fun redshiftRetryOptionsProperty(initializer: CfnDeliveryStream.RedshiftRetryOptionsProperty.Builder.() -> Unit
    = {}): CfnDeliveryStream.RedshiftRetryOptionsProperty =
    CfnDeliveryStream.RedshiftRetryOptionsProperty.builder().apply(initializer).build()
