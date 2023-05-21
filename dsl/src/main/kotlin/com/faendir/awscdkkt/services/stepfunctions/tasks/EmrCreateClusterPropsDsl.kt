package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateClusterProps

@Generated
public fun emrCreateClusterProps(initializer: EmrCreateClusterProps.Builder.() -> Unit = {}):
    EmrCreateClusterProps = EmrCreateClusterProps.builder().apply(initializer).build()
