@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.codestar

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codestar.CfnGitHubRepository
import software.amazon.awscdk.services.codestar.CfnGitHubRepositoryProps
import software.constructs.Construct

public fun Construct.cfnGitHubRepository(
  id: String,
  props: CfnGitHubRepositoryProps,
  initializer: CfnGitHubRepository.() -> Unit = {},
): CfnGitHubRepository = CfnGitHubRepository(this, id, props).apply(initializer)
