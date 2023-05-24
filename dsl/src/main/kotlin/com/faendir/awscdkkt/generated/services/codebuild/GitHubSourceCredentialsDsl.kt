package com.faendir.awscdkkt.generated.services.codebuild

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.GitHubSourceCredentials
import software.amazon.awscdk.services.codebuild.GitHubSourceCredentialsProps
import software.constructs.Construct

@Generated
public fun Construct.gitHubSourceCredentials(id: String, props: GitHubSourceCredentialsProps):
    GitHubSourceCredentials = GitHubSourceCredentials(this, id, props)

@Generated
public fun Construct.gitHubSourceCredentials(
  id: String,
  props: GitHubSourceCredentialsProps,
  initializer: @AwsCdkDsl GitHubSourceCredentials.() -> Unit,
): GitHubSourceCredentials = GitHubSourceCredentials(this, id, props).apply(initializer)

@Generated
public fun Construct.buildGitHubSourceCredentials(id: String, initializer: @AwsCdkDsl
    GitHubSourceCredentials.Builder.() -> Unit): GitHubSourceCredentials =
    GitHubSourceCredentials.Builder.create(this, id).apply(initializer).build()
