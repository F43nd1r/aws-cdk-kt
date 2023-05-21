package com.faendir.awscdkkt.services.kinesisfirehose

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@Generated
public
    fun elasticsearchBufferingHintsProperty(initializer: CfnDeliveryStream.ElasticsearchBufferingHintsProperty.Builder.() -> Unit
    = {}): CfnDeliveryStream.ElasticsearchBufferingHintsProperty =
    CfnDeliveryStream.ElasticsearchBufferingHintsProperty.builder().apply(initializer).build()
