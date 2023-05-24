package com.faendir.awscdkkt.generated.services.codebuild

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.UntrustedCodeBoundaryPolicy
import software.amazon.awscdk.services.codebuild.UntrustedCodeBoundaryPolicyProps
import software.constructs.Construct

@Generated
public fun Construct.untrustedCodeBoundaryPolicy(id: String): UntrustedCodeBoundaryPolicy =
    UntrustedCodeBoundaryPolicy(this, id)

@Generated
public fun Construct.untrustedCodeBoundaryPolicy(id: String, initializer: @AwsCdkDsl
    UntrustedCodeBoundaryPolicy.() -> Unit): UntrustedCodeBoundaryPolicy =
    UntrustedCodeBoundaryPolicy(this, id).apply(initializer)

@Generated
public fun Construct.untrustedCodeBoundaryPolicy(id: String,
    props: UntrustedCodeBoundaryPolicyProps): UntrustedCodeBoundaryPolicy =
    UntrustedCodeBoundaryPolicy(this, id, props)

@Generated
public fun Construct.untrustedCodeBoundaryPolicy(
  id: String,
  props: UntrustedCodeBoundaryPolicyProps,
  initializer: @AwsCdkDsl UntrustedCodeBoundaryPolicy.() -> Unit,
): UntrustedCodeBoundaryPolicy = UntrustedCodeBoundaryPolicy(this, id, props).apply(initializer)

@Generated
public fun Construct.buildUntrustedCodeBoundaryPolicy(id: String, initializer: @AwsCdkDsl
    UntrustedCodeBoundaryPolicy.Builder.() -> Unit): UntrustedCodeBoundaryPolicy =
    UntrustedCodeBoundaryPolicy.Builder.create(this, id).apply(initializer).build()
