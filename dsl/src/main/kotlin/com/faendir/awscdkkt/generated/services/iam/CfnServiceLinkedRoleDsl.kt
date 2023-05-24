package com.faendir.awscdkkt.generated.services.iam

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.CfnServiceLinkedRole
import software.amazon.awscdk.services.iam.CfnServiceLinkedRoleProps
import software.constructs.Construct

@Generated
public fun Construct.cfnServiceLinkedRole(id: String, props: CfnServiceLinkedRoleProps):
    CfnServiceLinkedRole = CfnServiceLinkedRole(this, id, props)

@Generated
public fun Construct.cfnServiceLinkedRole(
  id: String,
  props: CfnServiceLinkedRoleProps,
  initializer: @AwsCdkDsl CfnServiceLinkedRole.() -> Unit,
): CfnServiceLinkedRole = CfnServiceLinkedRole(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnServiceLinkedRole(id: String, initializer: @AwsCdkDsl
    CfnServiceLinkedRole.Builder.() -> Unit): CfnServiceLinkedRole =
    CfnServiceLinkedRole.Builder.create(this, id).apply(initializer).build()
