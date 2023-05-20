@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.lookoutmetrics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector

public
    fun timestampColumnProperty(initializer: CfnAnomalyDetector.TimestampColumnProperty.Builder.() -> Unit):
    CfnAnomalyDetector.TimestampColumnProperty =
    CfnAnomalyDetector.TimestampColumnProperty.builder().apply(initializer).build()
