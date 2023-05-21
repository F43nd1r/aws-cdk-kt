package com.faendir.awscdkkt.services.pipes

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pipes.CfnPipe

@Generated
public
    fun batchJobDependencyProperty(initializer: CfnPipe.BatchJobDependencyProperty.Builder.() -> Unit
    = {}): CfnPipe.BatchJobDependencyProperty =
    CfnPipe.BatchJobDependencyProperty.builder().apply(initializer).build()
