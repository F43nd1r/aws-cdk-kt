package com.faendir.awscdkkt.services.kinesisfirehose

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@Generated
public
    fun schemaConfigurationProperty(initializer: CfnDeliveryStream.SchemaConfigurationProperty.Builder.() -> Unit
    = {}): CfnDeliveryStream.SchemaConfigurationProperty =
    CfnDeliveryStream.SchemaConfigurationProperty.builder().apply(initializer).build()
