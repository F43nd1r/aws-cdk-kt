package com.faendir.awscdkkt.services.pipes

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pipes.CfnPipe

@Generated
public
    fun ecsResourceRequirementProperty(initializer: CfnPipe.EcsResourceRequirementProperty.Builder.() -> Unit
    = {}): CfnPipe.EcsResourceRequirementProperty =
    CfnPipe.EcsResourceRequirementProperty.builder().apply(initializer).build()
