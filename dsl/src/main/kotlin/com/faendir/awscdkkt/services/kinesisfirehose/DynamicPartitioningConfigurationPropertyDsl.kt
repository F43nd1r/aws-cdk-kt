package com.faendir.awscdkkt.services.kinesisfirehose

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@Generated
public
    fun dynamicPartitioningConfigurationProperty(initializer: CfnDeliveryStream.DynamicPartitioningConfigurationProperty.Builder.() -> Unit
    = {}): CfnDeliveryStream.DynamicPartitioningConfigurationProperty =
    CfnDeliveryStream.DynamicPartitioningConfigurationProperty.builder().apply(initializer).build()
