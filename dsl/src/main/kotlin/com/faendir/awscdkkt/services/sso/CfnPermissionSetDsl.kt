package com.faendir.awscdkkt.services.sso

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sso.CfnPermissionSet
import software.amazon.awscdk.services.sso.CfnPermissionSetProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPermissionSet(
  id: String,
  props: CfnPermissionSetProps,
  initializer: CfnPermissionSet.() -> Unit = {},
): CfnPermissionSet = CfnPermissionSet(this, id, props).apply(initializer)
