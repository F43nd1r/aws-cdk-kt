package com.faendir.awscdkkt.services.codestar

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codestar.CfnGitHubRepository
import software.amazon.awscdk.services.codestar.CfnGitHubRepositoryProps
import software.constructs.Construct

@Generated
public fun Construct.cfnGitHubRepository(
  id: String,
  props: CfnGitHubRepositoryProps,
  initializer: CfnGitHubRepository.() -> Unit = {},
): CfnGitHubRepository = CfnGitHubRepository(this, id, props).apply(initializer)
