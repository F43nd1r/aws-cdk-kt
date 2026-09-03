package com.faendir.awscdkkt.generated.services.securityagent

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.securityagent.CfnArtifact
import software.amazon.awscdk.services.securityagent.CfnArtifactProps
import software.constructs.Construct

@Generated
public fun Construct.cfnArtifact(
  id: String,
  props: CfnArtifactProps,
  initializer: @AwsCdkDsl CfnArtifact.() -> Unit = {},
): CfnArtifact = CfnArtifact(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnArtifact(id: String, initializer: @AwsCdkDsl CfnArtifact.Builder.() -> Unit = {}): CfnArtifact = CfnArtifact.Builder.create(this, id).apply(initializer).build()
