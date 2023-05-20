@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.pipelines

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.pipelines.GitHubSourceOptions

public fun gitHubSourceOptions(initializer: GitHubSourceOptions.Builder.() -> Unit):
    GitHubSourceOptions = GitHubSourceOptions.builder().apply(initializer).build()
