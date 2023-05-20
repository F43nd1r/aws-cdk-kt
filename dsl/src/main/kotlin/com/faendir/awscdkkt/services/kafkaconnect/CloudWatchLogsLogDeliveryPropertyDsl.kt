@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.kafkaconnect

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kafkaconnect.CfnConnector

public
    fun cloudWatchLogsLogDeliveryProperty(initializer: CfnConnector.CloudWatchLogsLogDeliveryProperty.Builder.() -> Unit):
    CfnConnector.CloudWatchLogsLogDeliveryProperty =
    CfnConnector.CloudWatchLogsLogDeliveryProperty.builder().apply(initializer).build()
