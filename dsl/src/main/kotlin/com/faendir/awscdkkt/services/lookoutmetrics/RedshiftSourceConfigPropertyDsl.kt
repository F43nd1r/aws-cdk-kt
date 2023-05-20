@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.lookoutmetrics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector

public
    fun redshiftSourceConfigProperty(initializer: CfnAnomalyDetector.RedshiftSourceConfigProperty.Builder.() -> Unit):
    CfnAnomalyDetector.RedshiftSourceConfigProperty =
    CfnAnomalyDetector.RedshiftSourceConfigProperty.builder().apply(initializer).build()
