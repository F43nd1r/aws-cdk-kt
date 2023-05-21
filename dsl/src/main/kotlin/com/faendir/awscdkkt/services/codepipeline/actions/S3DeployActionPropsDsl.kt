package com.faendir.awscdkkt.services.codepipeline.actions

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.actions.S3DeployActionProps

@Generated
public fun s3DeployActionProps(initializer: S3DeployActionProps.Builder.() -> Unit = {}):
    S3DeployActionProps = S3DeployActionProps.builder().apply(initializer).build()
