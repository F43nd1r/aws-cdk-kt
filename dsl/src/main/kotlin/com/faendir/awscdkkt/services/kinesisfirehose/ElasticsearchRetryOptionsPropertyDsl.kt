package com.faendir.awscdkkt.services.kinesisfirehose

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@Generated
public
    fun elasticsearchRetryOptionsProperty(initializer: CfnDeliveryStream.ElasticsearchRetryOptionsProperty.Builder.() -> Unit
    = {}): CfnDeliveryStream.ElasticsearchRetryOptionsProperty =
    CfnDeliveryStream.ElasticsearchRetryOptionsProperty.builder().apply(initializer).build()
