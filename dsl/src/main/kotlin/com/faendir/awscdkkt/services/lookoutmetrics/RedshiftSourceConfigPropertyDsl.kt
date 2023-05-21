package com.faendir.awscdkkt.services.lookoutmetrics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector

@Generated
public
    fun redshiftSourceConfigProperty(initializer: CfnAnomalyDetector.RedshiftSourceConfigProperty.Builder.() -> Unit
    = {}): CfnAnomalyDetector.RedshiftSourceConfigProperty =
    CfnAnomalyDetector.RedshiftSourceConfigProperty.builder().apply(initializer).build()
