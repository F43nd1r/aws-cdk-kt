@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.dms

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dms.CfnEndpoint

public fun kafkaSettingsProperty(initializer: CfnEndpoint.KafkaSettingsProperty.Builder.() -> Unit):
    CfnEndpoint.KafkaSettingsProperty =
    CfnEndpoint.KafkaSettingsProperty.builder().apply(initializer).build()
