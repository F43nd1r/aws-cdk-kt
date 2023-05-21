package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

@Generated
public
    fun scriptBootstrapActionConfigProperty(initializer: EmrCreateCluster.ScriptBootstrapActionConfigProperty.Builder.() -> Unit
    = {}): EmrCreateCluster.ScriptBootstrapActionConfigProperty =
    EmrCreateCluster.ScriptBootstrapActionConfigProperty.builder().apply(initializer).build()
