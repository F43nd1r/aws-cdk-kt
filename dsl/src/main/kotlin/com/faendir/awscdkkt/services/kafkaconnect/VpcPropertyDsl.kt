package com.faendir.awscdkkt.services.kafkaconnect

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kafkaconnect.CfnConnector

@Generated
public fun vpcProperty(initializer: CfnConnector.VpcProperty.Builder.() -> Unit = {}):
    CfnConnector.VpcProperty = CfnConnector.VpcProperty.builder().apply(initializer).build()
