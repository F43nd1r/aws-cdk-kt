package com.faendir.awscdkkt.services.evidently

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.evidently.CfnExperiment

@Generated
public
    fun metricGoalObjectProperty(initializer: CfnExperiment.MetricGoalObjectProperty.Builder.() -> Unit
    = {}): CfnExperiment.MetricGoalObjectProperty =
    CfnExperiment.MetricGoalObjectProperty.builder().apply(initializer).build()
