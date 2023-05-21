package com.faendir.awscdkkt.services.kafkaconnect

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kafkaconnect.CfnConnector

@Generated
public
    fun workerConfigurationProperty(initializer: CfnConnector.WorkerConfigurationProperty.Builder.() -> Unit
    = {}): CfnConnector.WorkerConfigurationProperty =
    CfnConnector.WorkerConfigurationProperty.builder().apply(initializer).build()
