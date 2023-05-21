package com.faendir.awscdkkt.pipelines

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.pipelines.StackDeploymentProps

@Generated
public fun stackDeploymentProps(initializer: StackDeploymentProps.Builder.() -> Unit = {}):
    StackDeploymentProps = StackDeploymentProps.builder().apply(initializer).build()
