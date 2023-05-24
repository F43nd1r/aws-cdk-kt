package com.faendir.awscdkkt.generated.services.kinesisfirehose

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@Generated
public fun buildProcessingConfigurationProperty(initializer: @AwsCdkDsl
    CfnDeliveryStream.ProcessingConfigurationProperty.Builder.() -> Unit):
    CfnDeliveryStream.ProcessingConfigurationProperty =
    CfnDeliveryStream.ProcessingConfigurationProperty.Builder().apply(initializer).build()
