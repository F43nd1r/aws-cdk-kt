@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.pipes

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pipes.CfnPipe

public
    fun pipeSourceDynamoDBStreamParametersProperty(initializer: CfnPipe.PipeSourceDynamoDBStreamParametersProperty.Builder.() -> Unit):
    CfnPipe.PipeSourceDynamoDBStreamParametersProperty =
    CfnPipe.PipeSourceDynamoDBStreamParametersProperty.builder().apply(initializer).build()
