@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.CfnResourceVersion
import software.amazon.awscdk.CfnResourceVersionProps
import software.constructs.Construct

public fun Construct.cfnResourceVersion(
  id: String,
  props: CfnResourceVersionProps,
  initializer: CfnResourceVersion.() -> Unit = {},
): CfnResourceVersion = CfnResourceVersion(this, id, props).apply(initializer)
