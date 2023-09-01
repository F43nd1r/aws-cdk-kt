package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnTrafficMirrorTarget
import software.amazon.awscdk.services.ec2.CfnTrafficMirrorTargetProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTrafficMirrorTarget(id: String, initializer: @AwsCdkDsl
    CfnTrafficMirrorTarget.() -> Unit = {}): CfnTrafficMirrorTarget = CfnTrafficMirrorTarget(this,
    id).apply(initializer)

@Generated
public fun Construct.cfnTrafficMirrorTarget(
  id: String,
  props: CfnTrafficMirrorTargetProps,
  initializer: @AwsCdkDsl CfnTrafficMirrorTarget.() -> Unit = {},
): CfnTrafficMirrorTarget = CfnTrafficMirrorTarget(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTrafficMirrorTarget(id: String, initializer: @AwsCdkDsl
    CfnTrafficMirrorTarget.Builder.() -> Unit = {}): CfnTrafficMirrorTarget =
    CfnTrafficMirrorTarget.Builder.create(this, id).apply(initializer).build()
