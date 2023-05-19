@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.GitHubSourceCredentials
import software.amazon.awscdk.services.codebuild.GitHubSourceCredentialsProps
import software.constructs.Construct

public fun Construct.gitHubSourceCredentials(
  id: String,
  props: GitHubSourceCredentialsProps,
  initializer: GitHubSourceCredentials.() -> Unit = {},
): GitHubSourceCredentials = GitHubSourceCredentials(this, id, props).apply(initializer)
