@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.kinesisfirehose

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

public
    fun redshiftDestinationConfigurationProperty(initializer: CfnDeliveryStream.RedshiftDestinationConfigurationProperty.Builder.() -> Unit):
    CfnDeliveryStream.RedshiftDestinationConfigurationProperty =
    CfnDeliveryStream.RedshiftDestinationConfigurationProperty.builder().apply(initializer).build()
