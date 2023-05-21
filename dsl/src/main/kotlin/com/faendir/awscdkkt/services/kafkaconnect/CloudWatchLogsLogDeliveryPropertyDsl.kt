package com.faendir.awscdkkt.services.kafkaconnect

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kafkaconnect.CfnConnector

@Generated
public
    fun cloudWatchLogsLogDeliveryProperty(initializer: CfnConnector.CloudWatchLogsLogDeliveryProperty.Builder.() -> Unit
    = {}): CfnConnector.CloudWatchLogsLogDeliveryProperty =
    CfnConnector.CloudWatchLogsLogDeliveryProperty.builder().apply(initializer).build()
