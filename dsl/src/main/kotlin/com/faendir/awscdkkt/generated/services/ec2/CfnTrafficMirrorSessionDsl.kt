package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnTrafficMirrorSession
import software.amazon.awscdk.services.ec2.CfnTrafficMirrorSessionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTrafficMirrorSession(
  id: String,
  props: CfnTrafficMirrorSessionProps,
  initializer: @AwsCdkDsl CfnTrafficMirrorSession.() -> Unit = {},
): CfnTrafficMirrorSession = CfnTrafficMirrorSession(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTrafficMirrorSession(id: String, initializer: @AwsCdkDsl
    CfnTrafficMirrorSession.Builder.() -> Unit = {}): CfnTrafficMirrorSession =
    CfnTrafficMirrorSession.Builder.create(this, id).apply(initializer).build()
