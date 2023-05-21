package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.GitHubSourceProps

@Generated
public fun gitHubSourceProps(initializer: GitHubSourceProps.Builder.() -> Unit = {}):
    GitHubSourceProps = GitHubSourceProps.builder().apply(initializer).build()
