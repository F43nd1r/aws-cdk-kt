package com.faendir.awscdkkt.generated.services.kinesisfirehose

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@Generated
public fun buildMSKSourceConfigurationProperty(initializer: @AwsCdkDsl
    CfnDeliveryStream.MSKSourceConfigurationProperty.Builder.() -> Unit = {}):
    CfnDeliveryStream.MSKSourceConfigurationProperty =
    CfnDeliveryStream.MSKSourceConfigurationProperty.Builder().apply(initializer).build()
