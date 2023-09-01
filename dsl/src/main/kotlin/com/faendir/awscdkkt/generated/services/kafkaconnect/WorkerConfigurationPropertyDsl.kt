package com.faendir.awscdkkt.generated.services.kafkaconnect

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kafkaconnect.CfnConnector

@Generated
public fun buildWorkerConfigurationProperty(initializer: @AwsCdkDsl
    CfnConnector.WorkerConfigurationProperty.Builder.() -> Unit = {}):
    CfnConnector.WorkerConfigurationProperty =
    CfnConnector.WorkerConfigurationProperty.Builder().apply(initializer).build()
