@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.kinesisfirehose

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

public
    fun httpEndpointConfigurationProperty(initializer: CfnDeliveryStream.HttpEndpointConfigurationProperty.Builder.() -> Unit):
    CfnDeliveryStream.HttpEndpointConfigurationProperty =
    CfnDeliveryStream.HttpEndpointConfigurationProperty.builder().apply(initializer).build()
