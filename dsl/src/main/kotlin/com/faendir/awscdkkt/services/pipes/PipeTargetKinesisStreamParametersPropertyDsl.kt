@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.pipes

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pipes.CfnPipe

public
    fun pipeTargetKinesisStreamParametersProperty(initializer: CfnPipe.PipeTargetKinesisStreamParametersProperty.Builder.() -> Unit):
    CfnPipe.PipeTargetKinesisStreamParametersProperty =
    CfnPipe.PipeTargetKinesisStreamParametersProperty.builder().apply(initializer).build()
