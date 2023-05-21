package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.GitHubSourceCredentialsProps

@Generated
public fun gitHubSourceCredentialsProps(initializer: GitHubSourceCredentialsProps.Builder.() -> Unit
    = {}): GitHubSourceCredentialsProps =
    GitHubSourceCredentialsProps.builder().apply(initializer).build()
