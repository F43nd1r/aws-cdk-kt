package com.faendir.awscdkkt.services.codepipeline.actions

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.actions.GitHubSourceVariables

@Generated
public fun gitHubSourceVariables(initializer: GitHubSourceVariables.Builder.() -> Unit = {}):
    GitHubSourceVariables = GitHubSourceVariables.builder().apply(initializer).build()
