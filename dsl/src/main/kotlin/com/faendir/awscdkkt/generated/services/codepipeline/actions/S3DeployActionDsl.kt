package com.faendir.awscdkkt.generated.services.codepipeline.actions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.actions.S3DeployAction

@Generated
public fun buildS3DeployAction(initializer: @AwsCdkDsl S3DeployAction.Builder.() -> Unit):
    S3DeployAction = S3DeployAction.Builder.create().apply(initializer).build()
