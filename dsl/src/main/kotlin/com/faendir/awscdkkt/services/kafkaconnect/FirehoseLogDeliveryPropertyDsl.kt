package com.faendir.awscdkkt.services.kafkaconnect

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kafkaconnect.CfnConnector

@Generated
public
    fun firehoseLogDeliveryProperty(initializer: CfnConnector.FirehoseLogDeliveryProperty.Builder.() -> Unit
    = {}): CfnConnector.FirehoseLogDeliveryProperty =
    CfnConnector.FirehoseLogDeliveryProperty.builder().apply(initializer).build()
