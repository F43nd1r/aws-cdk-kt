@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.UntrustedCodeBoundaryPolicy
import software.amazon.awscdk.services.codebuild.UntrustedCodeBoundaryPolicyProps
import software.constructs.Construct

public fun Construct.untrustedCodeBoundaryPolicy(id: String,
    initializer: UntrustedCodeBoundaryPolicy.() -> Unit = {}): UntrustedCodeBoundaryPolicy =
    UntrustedCodeBoundaryPolicy(this, id).apply(initializer)

public fun Construct.untrustedCodeBoundaryPolicy(
  id: String,
  props: UntrustedCodeBoundaryPolicyProps,
  initializer: UntrustedCodeBoundaryPolicy.() -> Unit = {},
): UntrustedCodeBoundaryPolicy = UntrustedCodeBoundaryPolicy(this, id, props).apply(initializer)
