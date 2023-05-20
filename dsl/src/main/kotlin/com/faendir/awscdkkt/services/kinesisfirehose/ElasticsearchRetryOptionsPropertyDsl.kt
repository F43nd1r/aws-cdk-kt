@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.kinesisfirehose

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

public
    fun elasticsearchRetryOptionsProperty(initializer: CfnDeliveryStream.ElasticsearchRetryOptionsProperty.Builder.() -> Unit):
    CfnDeliveryStream.ElasticsearchRetryOptionsProperty =
    CfnDeliveryStream.ElasticsearchRetryOptionsProperty.builder().apply(initializer).build()
