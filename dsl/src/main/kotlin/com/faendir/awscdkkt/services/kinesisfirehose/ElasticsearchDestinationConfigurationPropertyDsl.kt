@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.kinesisfirehose

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

public
    fun elasticsearchDestinationConfigurationProperty(initializer: CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty.Builder.() -> Unit):
    CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty =
    CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty.builder().apply(initializer).build()
