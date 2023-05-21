package com.faendir.awscdkkt.services.codepipeline.actions

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.actions.SelfManagedDeploymentProps

@Generated
public fun selfManagedDeploymentProps(initializer: SelfManagedDeploymentProps.Builder.() -> Unit =
    {}): SelfManagedDeploymentProps =
    SelfManagedDeploymentProps.builder().apply(initializer).build()
