package com.faendir.awscdkkt.generated.services.iam

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.CfnRole
import software.amazon.awscdk.services.iam.CfnRoleProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRole(
  id: String,
  props: CfnRoleProps,
  initializer: @AwsCdkDsl CfnRole.() -> Unit = {},
): CfnRole = CfnRole(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnRole(id: String, initializer: @AwsCdkDsl CfnRole.Builder.() -> Unit = {}): CfnRole = CfnRole.Builder.create(this, id).apply(initializer).build()
