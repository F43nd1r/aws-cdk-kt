package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.UntrustedCodeBoundaryPolicy
import software.amazon.awscdk.services.codebuild.UntrustedCodeBoundaryPolicyProps
import software.constructs.Construct

@Generated
public fun Construct.untrustedCodeBoundaryPolicy(id: String,
    initializer: UntrustedCodeBoundaryPolicy.() -> Unit = {}): UntrustedCodeBoundaryPolicy =
    UntrustedCodeBoundaryPolicy(this, id).apply(initializer)

@Generated
public fun Construct.untrustedCodeBoundaryPolicy(
  id: String,
  props: UntrustedCodeBoundaryPolicyProps,
  initializer: UntrustedCodeBoundaryPolicy.() -> Unit = {},
): UntrustedCodeBoundaryPolicy = UntrustedCodeBoundaryPolicy(this, id, props).apply(initializer)
