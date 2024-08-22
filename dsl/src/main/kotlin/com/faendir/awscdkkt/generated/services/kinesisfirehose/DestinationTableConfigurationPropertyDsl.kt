package com.faendir.awscdkkt.generated.services.kinesisfirehose

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@Generated
public fun buildDestinationTableConfigurationProperty(initializer: @AwsCdkDsl
    CfnDeliveryStream.DestinationTableConfigurationProperty.Builder.() -> Unit = {}):
    CfnDeliveryStream.DestinationTableConfigurationProperty =
    CfnDeliveryStream.DestinationTableConfigurationProperty.Builder().apply(initializer).build()
