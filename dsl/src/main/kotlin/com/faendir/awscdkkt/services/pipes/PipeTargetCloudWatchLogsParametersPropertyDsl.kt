package com.faendir.awscdkkt.services.pipes

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pipes.CfnPipe

@Generated
public
    fun pipeTargetCloudWatchLogsParametersProperty(initializer: CfnPipe.PipeTargetCloudWatchLogsParametersProperty.Builder.() -> Unit
    = {}): CfnPipe.PipeTargetCloudWatchLogsParametersProperty =
    CfnPipe.PipeTargetCloudWatchLogsParametersProperty.builder().apply(initializer).build()
