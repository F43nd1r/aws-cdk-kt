package com.faendir.awscdkkt.pipelines

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.pipelines.GitHubSourceOptions

@Generated
public fun gitHubSourceOptions(initializer: GitHubSourceOptions.Builder.() -> Unit = {}):
    GitHubSourceOptions = GitHubSourceOptions.builder().apply(initializer).build()
