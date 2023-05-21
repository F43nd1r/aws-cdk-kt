package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.GitHubEnterpriseSourceCredentials
import software.amazon.awscdk.services.codebuild.GitHubEnterpriseSourceCredentialsProps
import software.constructs.Construct

@Generated
public fun Construct.gitHubEnterpriseSourceCredentials(
  id: String,
  props: GitHubEnterpriseSourceCredentialsProps,
  initializer: GitHubEnterpriseSourceCredentials.() -> Unit = {},
): GitHubEnterpriseSourceCredentials = GitHubEnterpriseSourceCredentials(this, id,
    props).apply(initializer)
