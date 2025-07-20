package com.faendir.awscdkkt.generated.services.codestar

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnGitHubRepository.() -> Unit = {},
): CfnGitHubRepository = CfnGitHubRepository(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnGitHubRepository(id: String, initializer: @AwsCdkDsl CfnGitHubRepository.Builder.() -> Unit = {}): CfnGitHubRepository = CfnGitHubRepository.Builder.create(this, id).apply(initializer).build()
