package com.faendir.awscdkkt.services.kinesisfirehose

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@Generated
public
    fun vpcConfigurationProperty(initializer: CfnDeliveryStream.VpcConfigurationProperty.Builder.() -> Unit
    = {}): CfnDeliveryStream.VpcConfigurationProperty =
    CfnDeliveryStream.VpcConfigurationProperty.builder().apply(initializer).build()
