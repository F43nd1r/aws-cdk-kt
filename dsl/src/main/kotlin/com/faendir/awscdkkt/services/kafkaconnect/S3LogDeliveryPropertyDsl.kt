package com.faendir.awscdkkt.services.kafkaconnect

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kafkaconnect.CfnConnector

@Generated
public fun s3LogDeliveryProperty(initializer: CfnConnector.S3LogDeliveryProperty.Builder.() -> Unit
    = {}): CfnConnector.S3LogDeliveryProperty =
    CfnConnector.S3LogDeliveryProperty.builder().apply(initializer).build()
