package com.faendir.awscdkkt.services.kafkaconnect

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kafkaconnect.CfnConnectorProps

@Generated
public fun cfnConnectorProps(initializer: CfnConnectorProps.Builder.() -> Unit = {}):
    CfnConnectorProps = CfnConnectorProps.builder().apply(initializer).build()
