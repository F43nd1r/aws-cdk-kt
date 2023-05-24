package com.faendir.awscdkkt.generated.services.kinesisfirehose

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@Generated
public fun buildDynamicPartitioningConfigurationProperty(initializer: @AwsCdkDsl
    CfnDeliveryStream.DynamicPartitioningConfigurationProperty.Builder.() -> Unit):
    CfnDeliveryStream.DynamicPartitioningConfigurationProperty =
    CfnDeliveryStream.DynamicPartitioningConfigurationProperty.Builder().apply(initializer).build()
