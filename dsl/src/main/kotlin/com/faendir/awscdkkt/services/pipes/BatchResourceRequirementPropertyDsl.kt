package com.faendir.awscdkkt.services.pipes

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pipes.CfnPipe

@Generated
public
    fun batchResourceRequirementProperty(initializer: CfnPipe.BatchResourceRequirementProperty.Builder.() -> Unit
    = {}): CfnPipe.BatchResourceRequirementProperty =
    CfnPipe.BatchResourceRequirementProperty.builder().apply(initializer).build()
