package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appsync.CfnResolver

@Generated
public fun pipelineConfigProperty(initializer: CfnResolver.PipelineConfigProperty.Builder.() -> Unit
    = {}): CfnResolver.PipelineConfigProperty =
    CfnResolver.PipelineConfigProperty.builder().apply(initializer).build()
