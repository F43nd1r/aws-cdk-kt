@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.CfnResourceDefaultVersion
import software.amazon.awscdk.CfnResourceDefaultVersionProps
import software.constructs.Construct

public fun Construct.cfnResourceDefaultVersion(id: String,
    initializer: CfnResourceDefaultVersion.() -> Unit = {}): CfnResourceDefaultVersion =
    CfnResourceDefaultVersion(this, id).apply(initializer)

public fun Construct.cfnResourceDefaultVersion(
  id: String,
  props: CfnResourceDefaultVersionProps,
  initializer: CfnResourceDefaultVersion.() -> Unit = {},
): CfnResourceDefaultVersion = CfnResourceDefaultVersion(this, id, props).apply(initializer)
