package com.faendir.awscdkkt.services.cloudformation

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudformation.CfnResourceDefaultVersion
import software.amazon.awscdk.services.cloudformation.CfnResourceDefaultVersionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnResourceDefaultVersion(id: String,
    initializer: CfnResourceDefaultVersion.() -> Unit = {}): CfnResourceDefaultVersion =
    CfnResourceDefaultVersion(this, id).apply(initializer)

@Generated
public fun Construct.cfnResourceDefaultVersion(
  id: String,
  props: CfnResourceDefaultVersionProps,
  initializer: CfnResourceDefaultVersion.() -> Unit = {},
): CfnResourceDefaultVersion = CfnResourceDefaultVersion(this, id, props).apply(initializer)
