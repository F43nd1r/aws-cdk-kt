package com.faendir.awscdkkt.generated.services.codestar

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codestar.CfnGitHubRepository

@Generated
public fun buildS3Property(initializer: @AwsCdkDsl CfnGitHubRepository.S3Property.Builder.() -> Unit
    = {}): CfnGitHubRepository.S3Property =
    CfnGitHubRepository.S3Property.Builder().apply(initializer).build()
