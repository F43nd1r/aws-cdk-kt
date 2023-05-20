@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.kinesisfirehose

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

public
    fun schemaConfigurationProperty(initializer: CfnDeliveryStream.SchemaConfigurationProperty.Builder.() -> Unit):
    CfnDeliveryStream.SchemaConfigurationProperty =
    CfnDeliveryStream.SchemaConfigurationProperty.builder().apply(initializer).build()
