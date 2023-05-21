package com.faendir.awscdkkt.services.codepipeline.actions

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.actions.S3SourceActionProps

@Generated
public fun s3SourceActionProps(initializer: S3SourceActionProps.Builder.() -> Unit = {}):
    S3SourceActionProps = S3SourceActionProps.builder().apply(initializer).build()
