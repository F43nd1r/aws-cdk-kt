package com.faendir.awscdkkt.generated.services.codebuild

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.GitHubEnterpriseSourceCredentials
import software.amazon.awscdk.services.codebuild.GitHubEnterpriseSourceCredentialsProps
import software.constructs.Construct

@Generated
public fun Construct.gitHubEnterpriseSourceCredentials(id: String,
    props: GitHubEnterpriseSourceCredentialsProps): GitHubEnterpriseSourceCredentials =
    GitHubEnterpriseSourceCredentials(this, id, props)

@Generated
public fun Construct.gitHubEnterpriseSourceCredentials(
  id: String,
  props: GitHubEnterpriseSourceCredentialsProps,
  initializer: @AwsCdkDsl GitHubEnterpriseSourceCredentials.() -> Unit,
): GitHubEnterpriseSourceCredentials = GitHubEnterpriseSourceCredentials(this, id,
    props).apply(initializer)

@Generated
public fun Construct.buildGitHubEnterpriseSourceCredentials(id: String, initializer: @AwsCdkDsl
    GitHubEnterpriseSourceCredentials.Builder.() -> Unit): GitHubEnterpriseSourceCredentials =
    GitHubEnterpriseSourceCredentials.Builder.create(this, id).apply(initializer).build()
