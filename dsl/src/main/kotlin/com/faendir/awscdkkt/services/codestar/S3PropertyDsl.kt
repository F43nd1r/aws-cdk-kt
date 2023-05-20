@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.codestar

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codestar.CfnGitHubRepository

public fun s3Property(initializer: CfnGitHubRepository.S3Property.Builder.() -> Unit):
    CfnGitHubRepository.S3Property =
    CfnGitHubRepository.S3Property.builder().apply(initializer).build()
