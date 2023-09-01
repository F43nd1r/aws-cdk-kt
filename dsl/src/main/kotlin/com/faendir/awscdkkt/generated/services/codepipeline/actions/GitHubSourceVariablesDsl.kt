package com.faendir.awscdkkt.generated.services.codepipeline.actions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.actions.GitHubSourceVariables

@Generated
public fun buildGitHubSourceVariables(initializer: @AwsCdkDsl
    GitHubSourceVariables.Builder.() -> Unit = {}): GitHubSourceVariables =
    GitHubSourceVariables.Builder().apply(initializer).build()
