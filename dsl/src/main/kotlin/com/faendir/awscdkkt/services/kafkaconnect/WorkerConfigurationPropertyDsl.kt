@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.kafkaconnect

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kafkaconnect.CfnConnector

public
    fun workerConfigurationProperty(initializer: CfnConnector.WorkerConfigurationProperty.Builder.() -> Unit):
    CfnConnector.WorkerConfigurationProperty =
    CfnConnector.WorkerConfigurationProperty.builder().apply(initializer).build()
