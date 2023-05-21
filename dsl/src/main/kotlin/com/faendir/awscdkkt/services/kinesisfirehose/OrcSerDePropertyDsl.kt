package com.faendir.awscdkkt.services.kinesisfirehose

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@Generated
public fun orcSerDeProperty(initializer: CfnDeliveryStream.OrcSerDeProperty.Builder.() -> Unit =
    {}): CfnDeliveryStream.OrcSerDeProperty =
    CfnDeliveryStream.OrcSerDeProperty.builder().apply(initializer).build()
