@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.pipes

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pipes.CfnPipe

public
    fun pipeSourceDynamoDBStreamParametersProperty(initializer: CfnPipe.PipeSourceDynamoDBStreamParametersProperty.Builder.() -> Unit):
    CfnPipe.PipeSourceDynamoDBStreamParametersProperty =
    CfnPipe.PipeSourceDynamoDBStreamParametersProperty.builder().apply(initializer).build()
