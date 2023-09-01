package com.faendir.awscdkkt.generated.services.rds

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rds.CfnDBProxyTargetGroup
import software.amazon.awscdk.services.rds.CfnDBProxyTargetGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDBProxyTargetGroup(
  id: String,
  props: CfnDBProxyTargetGroupProps,
  initializer: @AwsCdkDsl CfnDBProxyTargetGroup.() -> Unit = {},
): CfnDBProxyTargetGroup = CfnDBProxyTargetGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDBProxyTargetGroup(id: String, initializer: @AwsCdkDsl
    CfnDBProxyTargetGroup.Builder.() -> Unit = {}): CfnDBProxyTargetGroup =
    CfnDBProxyTargetGroup.Builder.create(this, id).apply(initializer).build()
