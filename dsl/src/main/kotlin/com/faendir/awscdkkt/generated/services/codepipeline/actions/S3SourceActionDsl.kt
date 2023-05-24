package com.faendir.awscdkkt.generated.services.codepipeline.actions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.actions.S3SourceAction

@Generated
public fun buildS3SourceAction(initializer: @AwsCdkDsl S3SourceAction.Builder.() -> Unit):
    S3SourceAction = S3SourceAction.Builder.create().apply(initializer).build()
