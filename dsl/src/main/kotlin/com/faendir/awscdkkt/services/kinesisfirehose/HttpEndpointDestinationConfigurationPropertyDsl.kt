@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.kinesisfirehose

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

public
    fun httpEndpointDestinationConfigurationProperty(initializer: CfnDeliveryStream.HttpEndpointDestinationConfigurationProperty.Builder.() -> Unit):
    CfnDeliveryStream.HttpEndpointDestinationConfigurationProperty =
    CfnDeliveryStream.HttpEndpointDestinationConfigurationProperty.builder().apply(initializer).build()
