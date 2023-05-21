package com.faendir.awscdkkt.services.codepipeline.actions

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.actions.S3SourceVariables

@Generated
public fun s3SourceVariables(initializer: S3SourceVariables.Builder.() -> Unit = {}):
    S3SourceVariables = S3SourceVariables.builder().apply(initializer).build()
