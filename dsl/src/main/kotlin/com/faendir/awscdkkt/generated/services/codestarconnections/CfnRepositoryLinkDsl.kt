package com.faendir.awscdkkt.generated.services.codestarconnections

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codestarconnections.CfnRepositoryLink
import software.amazon.awscdk.services.codestarconnections.CfnRepositoryLinkProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRepositoryLink(
  id: String,
  props: CfnRepositoryLinkProps,
  initializer: @AwsCdkDsl CfnRepositoryLink.() -> Unit = {},
): CfnRepositoryLink = CfnRepositoryLink(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnRepositoryLink(id: String, initializer: @AwsCdkDsl
    CfnRepositoryLink.Builder.() -> Unit = {}): CfnRepositoryLink =
    CfnRepositoryLink.Builder.create(this, id).apply(initializer).build()
