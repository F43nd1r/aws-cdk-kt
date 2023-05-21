package com.faendir.awscdkkt.services.kinesisfirehose

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@Generated
public
    fun hiveJsonSerDeProperty(initializer: CfnDeliveryStream.HiveJsonSerDeProperty.Builder.() -> Unit
    = {}): CfnDeliveryStream.HiveJsonSerDeProperty =
    CfnDeliveryStream.HiveJsonSerDeProperty.builder().apply(initializer).build()
