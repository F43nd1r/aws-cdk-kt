package com.faendir.awscdkkt.generated.services.stepfunctions.tasks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

@Generated
public fun buildInstancesConfigProperty(initializer: @AwsCdkDsl
    EmrCreateCluster.InstancesConfigProperty.Builder.() -> Unit = {}):
    EmrCreateCluster.InstancesConfigProperty =
    EmrCreateCluster.InstancesConfigProperty.Builder().apply(initializer).build()
