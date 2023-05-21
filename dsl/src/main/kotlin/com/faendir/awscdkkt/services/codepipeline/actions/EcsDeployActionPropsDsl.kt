package com.faendir.awscdkkt.services.codepipeline.actions

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.actions.EcsDeployActionProps

@Generated
public fun ecsDeployActionProps(initializer: EcsDeployActionProps.Builder.() -> Unit = {}):
    EcsDeployActionProps = EcsDeployActionProps.builder().apply(initializer).build()
