package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

@Generated
public
    fun cloudWatchAlarmDefinitionProperty(initializer: EmrCreateCluster.CloudWatchAlarmDefinitionProperty.Builder.() -> Unit
    = {}): EmrCreateCluster.CloudWatchAlarmDefinitionProperty =
    EmrCreateCluster.CloudWatchAlarmDefinitionProperty.builder().apply(initializer).build()
