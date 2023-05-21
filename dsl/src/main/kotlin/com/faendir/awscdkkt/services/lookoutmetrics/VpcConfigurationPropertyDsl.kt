package com.faendir.awscdkkt.services.lookoutmetrics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector

@Generated
public
    fun vpcConfigurationProperty(initializer: CfnAnomalyDetector.VpcConfigurationProperty.Builder.() -> Unit
    = {}): CfnAnomalyDetector.VpcConfigurationProperty =
    CfnAnomalyDetector.VpcConfigurationProperty.builder().apply(initializer).build()
