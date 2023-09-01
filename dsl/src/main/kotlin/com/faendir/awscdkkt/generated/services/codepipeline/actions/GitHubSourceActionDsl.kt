package com.faendir.awscdkkt.generated.services.codepipeline.actions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.actions.GitHubSourceAction

@Generated
public fun buildGitHubSourceAction(initializer: @AwsCdkDsl GitHubSourceAction.Builder.() -> Unit =
    {}): GitHubSourceAction = GitHubSourceAction.Builder.create().apply(initializer).build()
