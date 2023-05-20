@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.kinesisfirehose

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

public
    fun vpcConfigurationProperty(initializer: CfnDeliveryStream.VpcConfigurationProperty.Builder.() -> Unit):
    CfnDeliveryStream.VpcConfigurationProperty =
    CfnDeliveryStream.VpcConfigurationProperty.builder().apply(initializer).build()
