package com.faendir.awscdkkt.services.kafkaconnect

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kafkaconnect.CfnConnector

@Generated
public
    fun workerLogDeliveryProperty(initializer: CfnConnector.WorkerLogDeliveryProperty.Builder.() -> Unit
    = {}): CfnConnector.WorkerLogDeliveryProperty =
    CfnConnector.WorkerLogDeliveryProperty.builder().apply(initializer).build()
