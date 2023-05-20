@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.kinesisfirehose

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

public
    fun httpEndpointConfigurationProperty(initializer: CfnDeliveryStream.HttpEndpointConfigurationProperty.Builder.() -> Unit):
    CfnDeliveryStream.HttpEndpointConfigurationProperty =
    CfnDeliveryStream.HttpEndpointConfigurationProperty.builder().apply(initializer).build()
