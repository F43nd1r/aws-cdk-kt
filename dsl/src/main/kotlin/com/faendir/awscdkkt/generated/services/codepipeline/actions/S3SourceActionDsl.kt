package com.faendir.awscdkkt.generated.services.codepipeline.actions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.actions.S3SourceAction
import software.amazon.awscdk.services.codepipeline.actions.S3SourceActionProps

@Generated
public fun s3SourceAction(props: S3SourceActionProps): S3SourceAction = S3SourceAction(props)

@Generated
public fun buildS3SourceAction(initializer: @AwsCdkDsl S3SourceAction.Builder.() -> Unit):
    S3SourceAction = S3SourceAction.Builder.create().apply(initializer).build()
