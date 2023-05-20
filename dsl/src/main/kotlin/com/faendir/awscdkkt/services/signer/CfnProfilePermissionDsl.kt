@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.signer

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.signer.CfnProfilePermission
import software.amazon.awscdk.services.signer.CfnProfilePermissionProps
import software.constructs.Construct

public fun Construct.cfnProfilePermission(
  id: String,
  props: CfnProfilePermissionProps,
  initializer: CfnProfilePermission.() -> Unit = {},
): CfnProfilePermission = CfnProfilePermission(this, id, props).apply(initializer)
