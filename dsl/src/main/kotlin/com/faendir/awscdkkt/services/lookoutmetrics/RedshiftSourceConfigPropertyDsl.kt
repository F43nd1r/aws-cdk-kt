@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.lookoutmetrics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector

public
    fun redshiftSourceConfigProperty(initializer: CfnAnomalyDetector.RedshiftSourceConfigProperty.Builder.() -> Unit):
    CfnAnomalyDetector.RedshiftSourceConfigProperty =
    CfnAnomalyDetector.RedshiftSourceConfigProperty.builder().apply(initializer).build()
