package com.faendir.awscdkkt.services.codestar

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codestar.CfnGitHubRepository

@Generated
public fun s3Property(initializer: CfnGitHubRepository.S3Property.Builder.() -> Unit = {}):
    CfnGitHubRepository.S3Property =
    CfnGitHubRepository.S3Property.builder().apply(initializer).build()
