package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.GitHubSourceCredentials
import software.amazon.awscdk.services.codebuild.GitHubSourceCredentialsProps
import software.constructs.Construct

@Generated
public fun Construct.gitHubSourceCredentials(
  id: String,
  props: GitHubSourceCredentialsProps,
  initializer: GitHubSourceCredentials.() -> Unit = {},
): GitHubSourceCredentials = GitHubSourceCredentials(this, id, props).apply(initializer)
