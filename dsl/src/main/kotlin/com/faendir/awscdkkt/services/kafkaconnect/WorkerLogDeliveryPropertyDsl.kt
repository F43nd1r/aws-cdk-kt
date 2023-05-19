@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.kafkaconnect

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kafkaconnect.CfnConnector

public
    fun workerLogDeliveryProperty(initializer: CfnConnector.WorkerLogDeliveryProperty.Builder.() -> Unit):
    CfnConnector.WorkerLogDeliveryProperty =
    CfnConnector.WorkerLogDeliveryProperty.builder().apply(initializer).build()
