package com.faendir.awscdkkt.services.cloudwatch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector

@Generated
public
    fun configurationProperty(initializer: CfnAnomalyDetector.ConfigurationProperty.Builder.() -> Unit
    = {}): CfnAnomalyDetector.ConfigurationProperty =
    CfnAnomalyDetector.ConfigurationProperty.builder().apply(initializer).build()
