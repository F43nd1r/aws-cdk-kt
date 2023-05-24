package com.faendir.awscdkkt.generated.services.codebuild

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.S3SourceProps

@Generated
public fun buildS3SourceProps(initializer: @AwsCdkDsl S3SourceProps.Builder.() -> Unit):
    S3SourceProps = S3SourceProps.Builder().apply(initializer).build()
