@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.kafkaconnect

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kafkaconnect.CfnConnector

public
    fun s3LogDeliveryProperty(initializer: CfnConnector.S3LogDeliveryProperty.Builder.() -> Unit):
    CfnConnector.S3LogDeliveryProperty =
    CfnConnector.S3LogDeliveryProperty.builder().apply(initializer).build()
