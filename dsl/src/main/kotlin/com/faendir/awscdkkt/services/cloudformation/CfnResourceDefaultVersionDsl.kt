@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.cloudformation

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudformation.CfnResourceDefaultVersion
import software.amazon.awscdk.services.cloudformation.CfnResourceDefaultVersionProps
import software.constructs.Construct

public fun Construct.cfnResourceDefaultVersion(id: String,
    initializer: CfnResourceDefaultVersion.() -> Unit = {}): CfnResourceDefaultVersion =
    CfnResourceDefaultVersion(this, id).apply(initializer)

public fun Construct.cfnResourceDefaultVersion(
  id: String,
  props: CfnResourceDefaultVersionProps,
  initializer: CfnResourceDefaultVersion.() -> Unit = {},
): CfnResourceDefaultVersion = CfnResourceDefaultVersion(this, id, props).apply(initializer)
