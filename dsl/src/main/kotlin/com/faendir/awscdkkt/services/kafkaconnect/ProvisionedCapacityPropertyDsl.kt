@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.kafkaconnect

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kafkaconnect.CfnConnector

public
    fun provisionedCapacityProperty(initializer: CfnConnector.ProvisionedCapacityProperty.Builder.() -> Unit):
    CfnConnector.ProvisionedCapacityProperty =
    CfnConnector.ProvisionedCapacityProperty.builder().apply(initializer).build()
