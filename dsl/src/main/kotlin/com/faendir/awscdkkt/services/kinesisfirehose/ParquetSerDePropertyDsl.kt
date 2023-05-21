package com.faendir.awscdkkt.services.kinesisfirehose

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@Generated
public
    fun parquetSerDeProperty(initializer: CfnDeliveryStream.ParquetSerDeProperty.Builder.() -> Unit
    = {}): CfnDeliveryStream.ParquetSerDeProperty =
    CfnDeliveryStream.ParquetSerDeProperty.builder().apply(initializer).build()
