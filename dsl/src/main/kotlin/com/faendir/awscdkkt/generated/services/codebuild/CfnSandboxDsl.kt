package com.faendir.awscdkkt.generated.services.codebuild

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.CfnSandbox
import software.amazon.awscdk.services.codebuild.CfnSandboxProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSandbox(id: String, initializer: @AwsCdkDsl CfnSandbox.() -> Unit = {}): CfnSandbox = CfnSandbox(this, id).apply(initializer)

@Generated
public fun Construct.cfnSandbox(
  id: String,
  props: CfnSandboxProps,
  initializer: @AwsCdkDsl CfnSandbox.() -> Unit = {},
): CfnSandbox = CfnSandbox(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSandbox(id: String, initializer: @AwsCdkDsl CfnSandbox.Builder.() -> Unit = {}): CfnSandbox = CfnSandbox.Builder.create(this, id).apply(initializer).build()
