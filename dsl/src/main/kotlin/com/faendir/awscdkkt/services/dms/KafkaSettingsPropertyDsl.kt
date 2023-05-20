@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.dms

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dms.CfnEndpoint

public fun kafkaSettingsProperty(initializer: CfnEndpoint.KafkaSettingsProperty.Builder.() -> Unit):
    CfnEndpoint.KafkaSettingsProperty =
    CfnEndpoint.KafkaSettingsProperty.builder().apply(initializer).build()
